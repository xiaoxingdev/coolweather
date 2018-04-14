package com.xiao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Administrator
 * @version $Rev$
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDes ${TODO}
 */

public class Basic
{
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    @SerializedName("update")
    public Update update;

    public class Update
    {
        @SerializedName("loc")
        public String updateTime;
    }
}
