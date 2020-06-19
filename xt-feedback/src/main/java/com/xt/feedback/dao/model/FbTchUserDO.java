package com.xt.feedback.dao.model;

import java.io.Serializable;
import java.util.Date;

public class FbTchUserDO implements Serializable {
    /**
     * 字段：tch_user_id
     * 
     *
     * @mbg.generated
     */
    private Integer tchUserId;

    /**
     * 字段：teacher_id
     * 
     *
     * @mbg.generated
     */
    private Integer teacherId;

    /**
     * 字段：uname
     * 
     *
     * @mbg.generated
     */
    private String uname;

    /**
     * 字段：passwd
     * 
     *
     * @mbg.generated
     */
    private String passwd;

    /**
     * 字段：last_time
     * 
     *
     * @mbg.generated
     */
    private Date lastTime;

    /**
     * 字段：last_ip
     * 
     *
     * @mbg.generated
     */
    private String lastIp;

    /**
     * 字段：orders
     * 排序（修改时间）
     *
     * @mbg.generated
     */
    private Long orders;

    /**
     * 字段：ctime
     * 创建时间
     *
     * @mbg.generated
     */
    private Long ctime;

    private static final long serialVersionUID = 1L;

    public Integer getTchUserId() {
        return tchUserId;
    }

    public FbTchUserDO withTchUserId(Integer tchUserId) {
        this.setTchUserId(tchUserId);
        return this;
    }

    public void setTchUserId(Integer tchUserId) {
        this.tchUserId = tchUserId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public FbTchUserDO withTeacherId(Integer teacherId) {
        this.setTeacherId(teacherId);
        return this;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getUname() {
        return uname;
    }

    public FbTchUserDO withUname(String uname) {
        this.setUname(uname);
        return this;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPasswd() {
        return passwd;
    }

    public FbTchUserDO withPasswd(String passwd) {
        this.setPasswd(passwd);
        return this;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public FbTchUserDO withLastTime(Date lastTime) {
        this.setLastTime(lastTime);
        return this;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public String getLastIp() {
        return lastIp;
    }

    public FbTchUserDO withLastIp(String lastIp) {
        this.setLastIp(lastIp);
        return this;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public Long getOrders() {
        return orders;
    }

    public FbTchUserDO withOrders(Long orders) {
        this.setOrders(orders);
        return this;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }

    public Long getCtime() {
        return ctime;
    }

    public FbTchUserDO withCtime(Long ctime) {
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
        sb.append(", tchUserId=").append(tchUserId);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", uname=").append(uname);
        sb.append(", passwd=").append(passwd);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", lastIp=").append(lastIp);
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
        FbTchUserDO other = (FbTchUserDO) that;
        return (this.getTchUserId() == null ? other.getTchUserId() == null : this.getTchUserId().equals(other.getTchUserId()))
            && (this.getTeacherId() == null ? other.getTeacherId() == null : this.getTeacherId().equals(other.getTeacherId()))
            && (this.getUname() == null ? other.getUname() == null : this.getUname().equals(other.getUname()))
            && (this.getPasswd() == null ? other.getPasswd() == null : this.getPasswd().equals(other.getPasswd()))
            && (this.getLastTime() == null ? other.getLastTime() == null : this.getLastTime().equals(other.getLastTime()))
            && (this.getLastIp() == null ? other.getLastIp() == null : this.getLastIp().equals(other.getLastIp()))
            && (this.getOrders() == null ? other.getOrders() == null : this.getOrders().equals(other.getOrders()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTchUserId() == null) ? 0 : getTchUserId().hashCode());
        result = prime * result + ((getTeacherId() == null) ? 0 : getTeacherId().hashCode());
        result = prime * result + ((getUname() == null) ? 0 : getUname().hashCode());
        result = prime * result + ((getPasswd() == null) ? 0 : getPasswd().hashCode());
        result = prime * result + ((getLastTime() == null) ? 0 : getLastTime().hashCode());
        result = prime * result + ((getLastIp() == null) ? 0 : getLastIp().hashCode());
        result = prime * result + ((getOrders() == null) ? 0 : getOrders().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        return result;
    }
}