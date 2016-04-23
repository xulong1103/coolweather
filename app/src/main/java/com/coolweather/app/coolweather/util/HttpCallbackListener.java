package com.coolweather.app.coolweather.util;

/**
 * Created by lenovo on 2016/4/20.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);

}
