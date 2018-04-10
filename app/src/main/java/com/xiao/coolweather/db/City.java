package com.xiao.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @author Administrator
 * @version $Rev$
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDes ${TODO}
 */

public class City extends DataSupport
{
    private int id;
    private String name;
    private int code;
    private int provinceId;

    public int getProvinceId()
    {
        return provinceId;
    }
    public void setProvinceId(int provinceId)
    {
        this.provinceId = provinceId;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getCode()
    {
        return code;
    }
    public void setCode(int code)
    {
        this.code = code;
    }
}
