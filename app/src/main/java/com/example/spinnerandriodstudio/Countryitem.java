package com.example.spinnerandriodstudio;

public class Countryitem {
    private String mCOuntryname;

    public Countryitem(String mCOuntryname, int mFLagimage) {
        this.mCOuntryname = mCOuntryname;
        this.mFLagimage = mFLagimage;
    }

    public String getmCOuntryname() {
        return mCOuntryname;
    }

    public int getmFLagimage() {
        return mFLagimage;
    }

    private int mFLagimage;

}
