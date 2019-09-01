package com.example.asus.weatherassistant.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    //当前温度
    @SerializedName("tmp")
    public String temperature;
    //当前天气状况描述
    @SerializedName("cond_txt")
    public String info;
//    public String fl;
//    public String cond_code;
//    public String cond_txt;
//    public String wind_deg;
//    public String wind_dir;
//    public String wind_sc;
//    public String wind_spd;
//    public String hum;
//    public String pcpn;
//    public String pres;
//    public String vis;
//    public String cloud;
}
