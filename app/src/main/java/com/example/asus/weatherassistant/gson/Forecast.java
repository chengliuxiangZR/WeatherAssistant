package com.example.asus.weatherassistant.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temprature;
    @SerializedName("cond")
    public More more;
    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
//    public String sr;
//    public String ss;
//    public String mr;
//    public String ms;
//    public String tmp_max;
//    public String tmp_min;
//    public String cond_code_d;
//    public String cond_code_n;
//    public String cond_txt_d;
//    public String cond_txt_n;
//    public String wind_deg;
//    public String wind_dir;
//    public String wind_sc;
//    public String wind_spd;
//    public String hum;
//    public String pcpn;
//    public String pop;
//    public String pres;
//    public String uv_index;
//    public String vis;
}
