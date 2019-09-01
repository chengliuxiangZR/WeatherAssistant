package com.example.asus.weatherassistant.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    //城市名
    @SerializedName("location")
    public String cityname;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
    //城市ID
    @SerializedName("cid")
    public String weatherId;
//    public String lat;
//    public String lon;
//    public String parent_city;
//    public String admin_area;
//    public String cnty;
//    public String tz;
}
