package com.cpb.example.R04;

import java.util.Date;

/**
 * 配置品牌的定金，关联品牌，备货日期
 */

public class BrandConf {
     private Long brandConfKey;
     private Long brandKey;
     private String confId;
     private String confValue;
     private String creater;
     private Date createTime;
     private String dealerId;

    public Long getBrandConfKey() {
        return brandConfKey;
    }

    public void setBrandConfKey(Long brandConfKey) {
        this.brandConfKey = brandConfKey;
    }

    public Long getBrandKey() {
        return brandKey;
    }

    public void setBrandKey(Long brandKey) {
        this.brandKey = brandKey;
    }

    public String getConfId() {
        return confId;
    }

    public void setConfId(String confId) {
        this.confId = confId;
    }

    public String getConfValue() {
        return confValue;
    }

    public void setConfValue(String confValue) {
        this.confValue = confValue;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    @Override
    public String toString() {
        return "BrandConf{" +
                "brandConfKey=" + brandConfKey +
                ", brandKey=" + brandKey +
                ", confId='" + confId + '\'' +
                ", confValue='" + confValue + '\'' +
                ", creater='" + creater + '\'' +
                ", createTime=" + createTime +
                ", dealerId='" + dealerId + '\'' +
                '}';
    }

}
