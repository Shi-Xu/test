package com.xt.feedback.dao.model;

import java.io.Serializable;

public class FbResultDO implements Serializable {
    /**
     * 字段：r_id
     * 
     *
     * @mbg.generated
     */
    private Integer rId;

    /**
     * 字段：tch_qu_id
     * 
     *
     * @mbg.generated
     */
    private Integer tchQuId;

    /**
     * 字段：fix_result
     * {'uuid':'选项key’，‘uuid’:true}
固定选项题目答案
     *
     * @mbg.generated
     */
    private String fixResult;

    /**
     * 字段：free_result
     * {'uuid':'选项答案’}
     *
     * @mbg.generated
     */
    private String freeResult;

    /**
     * 字段：ip
     * 
     *
     * @mbg.generated
     */
    private String ip;

    /**
     * 字段：orders
     * 
     *
     * @mbg.generated
     */
    private Long orders;

    /**
     * 字段：ctime
     * 
     *
     * @mbg.generated
     */
    private Long ctime;

    private static final long serialVersionUID = 1L;

    public Integer getrId() {
        return rId;
    }

    public FbResultDO withrId(Integer rId) {
        this.setrId(rId);
        return this;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Integer getTchQuId() {
        return tchQuId;
    }

    public FbResultDO withTchQuId(Integer tchQuId) {
        this.setTchQuId(tchQuId);
        return this;
    }

    public void setTchQuId(Integer tchQuId) {
        this.tchQuId = tchQuId;
    }

    public String getFixResult() {
        return fixResult;
    }

    public FbResultDO withFixResult(String fixResult) {
        this.setFixResult(fixResult);
        return this;
    }

    public void setFixResult(String fixResult) {
        this.fixResult = fixResult;
    }

    public String getFreeResult() {
        return freeResult;
    }

    public FbResultDO withFreeResult(String freeResult) {
        this.setFreeResult(freeResult);
        return this;
    }

    public void setFreeResult(String freeResult) {
        this.freeResult = freeResult;
    }

    public String getIp() {
        return ip;
    }

    public FbResultDO withIp(String ip) {
        this.setIp(ip);
        return this;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Long getOrders() {
        return orders;
    }

    public FbResultDO withOrders(Long orders) {
        this.setOrders(orders);
        return this;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }

    public Long getCtime() {
        return ctime;
    }

    public FbResultDO withCtime(Long ctime) {
        this.setCtime(ctime);
        return this;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rId=").append(rId);
        sb.append(", tchQuId=").append(tchQuId);
        sb.append(", fixResult=").append(fixResult);
        sb.append(", freeResult=").append(freeResult);
        sb.append(", ip=").append(ip);
        sb.append(", orders=").append(orders);
        sb.append(", ctime=").append(ctime);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        FbResultDO other = (FbResultDO) that;
        return (this.getrId() == null ? other.getrId() == null : this.getrId().equals(other.getrId()))
            && (this.getTchQuId() == null ? other.getTchQuId() == null : this.getTchQuId().equals(other.getTchQuId()))
            && (this.getFixResult() == null ? other.getFixResult() == null : this.getFixResult().equals(other.getFixResult()))
            && (this.getFreeResult() == null ? other.getFreeResult() == null : this.getFreeResult().equals(other.getFreeResult()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getOrders() == null ? other.getOrders() == null : this.getOrders().equals(other.getOrders()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getrId() == null) ? 0 : getrId().hashCode());
        result = prime * result + ((getTchQuId() == null) ? 0 : getTchQuId().hashCode());
        result = prime * result + ((getFixResult() == null) ? 0 : getFixResult().hashCode());
        result = prime * result + ((getFreeResult() == null) ? 0 : getFreeResult().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getOrders() == null) ? 0 : getOrders().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        return result;
    }
}