package com.amapp.thakorjitoday;

import android.content.ContentValues;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;

import com.amapp.AMAppMasterActivity;
import com.amapp.R;
import com.amapp.common.AMConstants;
import com.amapp.common.AMServiceRequest;
import com.amapp.common.events.EventBus;
import com.amapp.common.events.ThakorjiTodayUpdateFailedEvent;
import com.amapp.common.events.ThakorjiTodayUpdateSuccessEvent;
import com.smart.caching.SmartCaching;
import com.smart.framework.SmartUtils;
import com.smart.weservice.SmartWebManager;
import com.squareup.otto.Subscribe;
import java.util.ArrayList;

/**
 * Created by tasol on 16/7/15.
 */

public class TempleListActivity extends AMAppMasterActivity {

    private static final String TAG = "TempleListActivity";
    private FrameLayout frmListFragmentContainer;
    private TempleListFragment templeListFragment;
    private ArrayList<ContentValues> temples = new ArrayList<>();
    private SmartCaching smartCaching;
    private boolean isCachedDataDisplayed = false;

    private void registerForEvents() {
        EventBus.getInstance().register(this);
    }

    private void unregisterForEvents() {
        EventBus.getInstance().unregister(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterForEvents();
    }

    @Override
    public View getLayoutView() {
        return null;
    }

    @Override
    public int getLayoutID() {
        return R.layout.temples_activity;
    }

    @Override
    public View getFooterLayoutView() {
        return null;
    }

    @Override
    public int getFooterLayoutID() {
        return 0;
    }

    @Override
    public View getHeaderLayoutView() {
        return null;
    }

    @Override
    public int getHeaderLayoutID() {
        return 0;
    }

    @Override
    public void setAnimations() {
        super.setAnimations();
        getWindow().setEnterTransition(new Slide(Gravity.RIGHT));
        getWindow().setReturnTransition(new Slide(Gravity.BOTTOM));
    }

    @Override
    public void preOnCreate() {

    }

    @Override
    public void initComponents() {
        super.initComponents();

        frmListFragmentContainer = (FrameLayout) findViewById(R.id.frmListFragmentContainer);
        templeListFragment = new TempleListFragment();
        smartCaching = new SmartCaching(this);
    }

    @Override
    public void prepareViews() {
        getSupportFragmentManager().beginTransaction().add(R.id.frmListFragmentContainer, templeListFragment).commit();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                getCachedTemples();
            }
        }, 500);
    }

    @Override
    public void setActionListeners() {
        super.setActionListeners();
    }

    @Override
    protected void onResume() {
        super.onResume();
        selectDrawerItem(NAVIGATION_ITEMS.THAKORJI_TODAY);
        registerForEvents();
    }

    @Override
    public void manageAppBar(ActionBar actionBar, Toolbar toolbar, ActionBarDrawerToggle actionBarDrawerToggle) {
        toolbar.setTitle(getString(R.string.nav_thakorji_today_title));
        SpannableString spannableString=new SpannableString(getString(R.string.app_subtitle));
        spannableString.setSpan(new StyleSpan(Typeface.ITALIC), 0, spannableString.length(), 0);
        toolbar.setSubtitle(spannableString);
    }

    @Override
    public boolean shouldKeyboardHideOnOutsideTouch() {
        return false;
    }

    @Subscribe
    public void onThakorjiTodayUpdated(ThakorjiTodayUpdateSuccessEvent event) {
        getCachedTemples();
    }

    @Subscribe
    public void onThakorjiTodayUpdated(ThakorjiTodayUpdateFailedEvent event) {
        if(temples == null || temples.size() <= 0) {
            SmartUtils.showSnackBar(TempleListActivity.this, getString(R.string.generic_error), Snackbar.LENGTH_LONG);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();

        SmartWebManager.getInstance(this).getRequestQueue().cancelAll(AMConstants.AMS_Request_Get_Temples_Tag);
    }

    private void getCachedTemples() {
        ArrayList<ContentValues> temples = smartCaching.getDataFromCache("temples");
        if (temples == null || temples.size() <= 0) {
            AMServiceRequest.getInstance().startThakorjiTodayUpdatesFromServer();
            isCachedDataDisplayed = false;
        } else {
            this.temples = temples;
            setTempleDataInFragments(temples, isCachedDataDisplayed);
            isCachedDataDisplayed = true;
        }
    }

    private void setTempleDataInFragments(ArrayList<ContentValues> temples, boolean isCachedDataDisplayed) {
        templeListFragment.setTemples(temples, isCachedDataDisplayed);
    }
}