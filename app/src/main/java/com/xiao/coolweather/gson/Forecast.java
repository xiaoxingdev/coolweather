package com.xiao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Administrator
 * @version $Rev$
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDes ${TODO}
 */

public class Forecast
{
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature
    {
        public String max;
        public String mix;
    }

    public class More
    {
        @SerializedName("txt_d")
        public String info;
    }
}
