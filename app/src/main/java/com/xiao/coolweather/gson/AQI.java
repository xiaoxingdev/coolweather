package com.xiao.coolweather.gson;

/**
 * @author Administrator
 * @version $Rev$
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDes ${TODO}
 */

public class AQI
{
    public AQICity city;

    public class AQICity
    {
        public String aqi;

        public String pm25;
    }
}
