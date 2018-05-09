package com.coolweather.android.gson;

/**
 * Created by ZouBW on 2018/5/8.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
