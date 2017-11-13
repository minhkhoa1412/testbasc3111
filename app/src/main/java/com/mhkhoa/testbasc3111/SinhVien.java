package com.mhkhoa.testbasc3111;

import java.io.Serializable;

/**
 * Created by thaim on 13/11/2017.
 */

public class SinhVien implements Serializable
{
    private String masosv;
    private String hotensv;

    public SinhVien()
    {
    }

    public SinhVien(String masosv, String hotensv)
    {
        this.masosv = masosv;
        this.hotensv = hotensv;
    }

    public String getMasosv()
    {
        return masosv;
    }

    public void setMasosv(String masosv)
    {
        this.masosv = masosv;
    }

    public String getHotensv()
    {
        return hotensv;
    }

    public void setHotensv(String hotensv)
    {
        this.hotensv = hotensv;
    }
}
