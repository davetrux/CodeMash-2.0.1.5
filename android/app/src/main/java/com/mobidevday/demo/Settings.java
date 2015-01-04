package com.mobidevday.demo;

/**
 * Created by david on 1/3/15.
 */
public class Settings {

    public static final String WINDOWS_BASE = "192.168.0.130";

    public static final String FORM_URL = "http://" + WINDOWS_BASE + "/mddf/api/names/11";
    public static final String WINDOWS_URL = "http://" + WINDOWS_BASE + "/mddw/api/names/11";

    public static final String BASIC_URL = "http://codemash-basic.appspot.com/api/names/11";

    public static final int OAUTH_REFRESH_TIMEOUT = 300;
    public static final int OAUTH_TOKEN_TIMEOUT = 60;

    public static final String OAUTH_BASE = "http://codemash-oauth.appspot.com";
    public static final String OAUTH_LOGIN = OAUTH_BASE + "/oauth/token?grant_type=password&client_id=codemash-client&username=%s&password=%s";
    public static final String OAUTH_REFRESH = OAUTH_BASE + "/oauth/token?client_id=codemash-client&grant_type=refresh_token&refresh_token=%s";

    public static final String OAUTH_URL = OAUTH_BASE + "/api/names/11";
}