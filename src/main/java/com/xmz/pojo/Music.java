package com.xmz.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Music {
    private Integer mid;

    private String musicName;

    private Byte role;

    private BigDecimal scorePrice;

    private Integer scoreReserve;

    private Date updateTime;

    private Integer cid;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName == null ? null : musicName.trim();
    }

    public Byte getRole() {
        return role;
    }

    public void setRole(Byte role) {
        this.role = role;
    }

    public BigDecimal getScorePrice() {
        return scorePrice;
    }

    public void setScorePrice(BigDecimal scorePrice) {
        this.scorePrice = scorePrice;
    }

    public Integer getScoreReserve() {
        return scoreReserve;
    }

    public void setScoreReserve(Integer scoreReserve) {
        this.scoreReserve = scoreReserve;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}