package com.xmz.pojo;

public class CdWithBLOBs extends Cd {
    private String cdInfo;

    private String picture;

    public String getCdInfo() {
        return cdInfo;
    }

    public void setCdInfo(String cdInfo) {
        this.cdInfo = cdInfo == null ? null : cdInfo.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }
}