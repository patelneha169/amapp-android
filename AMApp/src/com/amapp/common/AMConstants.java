package com.amapp.common;

/**
 * Created by dadesai on 12/7/15.
 */
public class AMConstants {

    //MOCK MOCKY
    public static final String MOCK_MOCKY_Domain_Url = "http://www.mocky.io";
    public static final String MOCK_MOCKY_SplashScreen_Endpoint_Suffix = "/v2/56814e3b1200005a0c93a253?feature=splash&lastUpdatedTimestamp=%s&network=%s";
    public static final String MOCK_MOCKY_HomeScreen_Endpoint_Suffix = "/v2/56721972400000c74ad62bb6?lastUpdatedTimestamp=%s";
    public static final String MOCK_MOCKY_ThakorjiToday_Endpoint_Suffix = "/v2/565320442400005027629a41?lastUpdatedTimestamp=%s";
    public static final String MOCK_MOCKY_QuoteOfTheWeek_Endpoint_Suffix = "/v2/5665890a250000602c996e79";
    public static final String MOCK_MOCKY_SahebjiDarshan_Endpoint_Suffix = "/v2/566c23a11100006c1ec6a010";
    public static final String MOCK_MOCKY_AnoopamAudio_Endpoint_Suffix = "/v2/56698805250000a0291bdf21";
    public static final String MOCK_MOCKY_News_Endpoint_Suffix = "/v2/5686d01b130000ff1930ff63?feature=news&lastUpdatedTimestamp=%s&network=%s";

    //MOCK APIARY
    public static final String MOCK_APIARY_Domain_Url = "http://www.mocky.io";
    public static final String MOCK_APIARY_ThakorjiToday_Endpoint_Suffix = "/api/ams/v1/thakorji.php?lastUpdatedTimestamp=%s";
    public static final String MOCK_APIARY_QuoteOfTheWeek_Endpoint_Suffix = "/v2/5665890a250000602c996e79";
    public static final String MOCK_APIARY_SahebjiDarshan_Endpoint_Suffix = "/v2/566c23a11100006c1ec6a010";
    public static final String MOCK_APIARY_AnoopamAudio_Endpoint_Suffix = "/v2/56698805250000a0291bdf21";

    //LIVE
    public static final String LIVE_Domain_Url = "http://anoopam.org";
    public static final String LIVE_SplashScreen_Endpoint_Suffix = "/api/ams/v1/fetch_images.php?feature=splash&lastUpdatedTimestamp=%s&network=%s";
    public static final String LIVE_HomeScreen_Endpoint_Suffix = "/api/ams/v1/fetch_images.php?feature=hometiles&lastUpdatedTimestamp=%s&network=%s";
    public static final String LIVE_ThakorjiToday_Endpoint_Suffix = "/api/ams/v1/thakorji.php?lastUpdatedTimestamp=%s&network=%s";
    public static final String LIVE_QuoteOfTheWeek_Endpoint_Suffix = "/api/ams/v1/fetch_images.php?feature=qow&lastUpdatedTimestamp=%s&network=%s";
    public static final String LIVE_SahebjiDarshan_Endpoint_Suffix = "/api/ams/v1/fetch_images.php?feature=sahebjidarshan&lastUpdatedTimestamp=%s&network=%s";
    public static final String LIVE_AnoopamAudioCategory_Endpoint_Suffix = "/api/ams/v1/fetch_images.php?feature=audiocategory";
    public static final String LIVE_AnoopamAudioList_Endpoint_Suffix = "/api/ams/v1/fetch_images.php?feature=audio&catid=%s";
    public static final String LIVE_News_Endpoint_Suffix = "/v2/5686d01b130000ff1930ff63?feature=news&lastUpdatedTimestamp=%s&network=%s";

    // other AMS constants
    public static final String AM_Application_Title = "Anoopam Mission";
    public static final String AMS_Request_Get_Temples_Tag = "ams_get_temples";
    public static final String AMS_Request_Get_Sahebji_Tag = "ams_get_sahebji";
    public static final String AMS_Request_Get_Audio_Cat_Tag = "ams_get_audio_cat";
    public static final String AMS_Request_Get_Audio_List_Tag = "ams_get_audio_list";
    public static final String AMS_Request_Get_Quotes_Tag = "ams_get_quotes";
    public static final String AMS_Request_Get_HomeScreen_List_Tag = "ams_get_home_screen_list";
    public static final String AMS_Request_Get_SplashScreen_Tag = "ams_get_splash_screen";
    public static final String AMS_Request_Get_News_Tag = "ams_get_news";

    // AMS params
    public static final String AMS_RequestParam_ThakorjiToday_LastUpdatedTimestamp = "lastUpdatedTimestamp";
    public static final String AMS_RequestParam_SahebjiDarshan_LastUpdatedTimestamp = "lastUpdatedTimestamp";
    public static final String AMS_RequestParam_HomeScreen_LastUpdatedTimestamp = "lastUpdatedTimestamp";
    public static final String AMS_RequestParam_SplashScreen_LastUpdatedTimestamp = "lastUpdatedTimestamp";
    public static final String AMS_RequestParam_QuoteOfTheWeek_LastUpdatedTimestamp = "lastUpdatedTimestamp";
    public static final String AMS_RequestParam_News_LastUpdatedTimestamp = "lastUpdatedTimestamp";


    // Shared Prefs KEYS
    public static final String KEY_ThakorjiTodayLastUpdatedTimestamp = "thakorjiTodayLastUpdatedTimestamp";
    public static final String KEY_SahebjiDarshanLastUpdatedTimestamp = "sahebjiDarshanLastUpdatedTimestamp";
    public static final String KEY_HomeScreenLastUpdatedTimestamp = "homeScreenLastUpdatedTimestamp";
    public static final String KEY_SplashScreenLastUpdatedTimestamp = "splashScreenLastUpdatedTimestamp";
    public static final String KEY_QuoteOfTheWeekLastUpdatedTimestamp = "quoteOfTheWeekLastUpdatedTimestamp";
    public static final String KEY_NewsLastUpdatedTimestamp = "newsLastUpdatedTimestamp";
    public static final String KEY_CURRENT_AUDIO_LIST = "current_audio_list";
    public static final String KEY_CURRENT_AUDIO = "currentAudio";

    // other URL Constants
    public static final String URL_AboutUs = "http://anoopam.org/aboutus/aboutus.php";
    public static final String URL_ContactUs = "http://anoopam.org/contactus/contactus.php";
    public static final String URL_Events = "http://www.anoopam.org/events/indexevents.php";
}
