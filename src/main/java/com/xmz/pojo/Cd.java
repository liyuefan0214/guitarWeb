package com.xmz.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Cd {
    private Integer cid;

    private String cdNumber;

    private String cdName;

    private BigDecimal cdPrice;

    private Integer cdReserve;

    private Date updateTime;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCdNumber() {
        return cdNumber;
    }

    public void setCdNumber(String cdNumber) {
        this.cdNumber = cdNumber == null ? null : cdNumber.trim();
    }

    public String getCdName() {
        return cdName;
    }

    public void setCdName(String cdName) {
        this.cdName = cdName == null ? null : cdName.trim();
    }

    public BigDecimal getCdPrice() {
        return cdPrice;
    }

    public void setCdPrice(BigDecimal cdPrice) {
        this.cdPrice = cdPrice;
    }

    public Integer getCdReserve() {
        return cdReserve;
    }

    public void setCdReserve(Integer cdReserve) {
        this.cdReserve = cdReserve;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}