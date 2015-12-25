package com.amapp;

import com.amapp.common.AMServiceRequest;
import com.smart.framework.SmartApplication;

/**
 * Created by dadesai on 12/23/15.
 */
public class AMApplication extends SmartApplication {

    // change this to MOCK or LIVE to change all service calls
    private Environment mEnvironment;

    /**
     * returns the Environment
     * @return Environment
     */
    public Environment getEnv() {
        return mEnvironment;
    }

    public static AMApplication getInstance() {
        return (AMApplication) REF_SMART_APPLICATION;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mEnvironment = Environment.ENV_LIVE;
        //TODO: Optimize these calls to get the data in one server request
        AMServiceRequest.getInstance().startThakorjiTodayUpdatesFromServer();
        AMServiceRequest.getInstance().startHomeScreenTilesUpdatesFromServer();
    }
}
