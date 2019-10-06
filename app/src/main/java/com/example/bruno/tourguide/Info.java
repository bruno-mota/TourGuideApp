package com.example.bruno.tourguide;
public class Info {
    private String mName;
    private String mAddress;
    private String mInfo;
    private String mMoreInfo;
    private int mImageResourceId = NO_IMAGE;
    private static final int NO_IMAGE = -1;
    public Info(String Name, String Address, String Info, String moreInfo) {
        mName = Name;
        mAddress = Address;
        mInfo = Info;
        mMoreInfo = moreInfo;
    }
    public Info(String Name, String Address, String Info, String moreInfo, int ImageResourceId) {
        mName = Name;
        mAddress = Address;
        mInfo = Info;
        mMoreInfo = moreInfo;
        mImageResourceId = ImageResourceId;
    }
    public String getName() {
        return mName;
    }
    public String getAddress() {
        return mAddress;
    }
    public String getInfo() {
        return mInfo;
    }
    public String getMoreInfo() {
        return mMoreInfo;
    }
    public int getImageResourceId() {
        return mImageResourceId;
    }
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE;
    }
}
