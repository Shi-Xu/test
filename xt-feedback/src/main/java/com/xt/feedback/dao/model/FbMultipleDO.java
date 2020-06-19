package com.xt.feedback.dao.model;

import java.io.Serializable;

public class FbMultipleDO implements Serializable {
    /**
     * 字段：multiple_id
     * 
     *
     * @mbg.generated
     */
    private Integer multipleId;

    /**
     * 字段：uuid
     * UUID,唯一标识
     *
     * @mbg.generated
     */
    private String uuid;

    /**
     * 字段：part_id
     * 
     *
     * @mbg.generated
     */
    private Integer partId;

    /**
     * 字段：content
     * {"stem":"请选择","option":{"A":"这是A","B":"这是B"}}
     *
     * @mbg.generated
     */
    private String content;

    /**
     * 字段：sort
     * 排序
     *
     * @mbg.generated
     */
    private Integer sort;

    /**
     * 字段：qtype
     * 试题类型
     *
     * @mbg.generated
     */
    private Byte qtype;

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

    /**
     * 字段：teaching_id
     * 存储自定义多选题
     *
     * @mbg.generated
     */
    private Integer teachingId;

    private static final long serialVersionUID = 1L;

    public Integer getMultipleId() {
        return multipleId;
    }

    public FbMultipleDO withMultipleId(Integer multipleId) {
        this.setMultipleId(multipleId);
        return this;
    }

    public void setMultipleId(Integer multipleId) {
        this.multipleId = multipleId;
    }

    public String getUuid() {
        return uuid;
    }

    public FbMultipleDO withUuid(String uuid) {
        this.setUuid(uuid);
        return this;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getPartId() {
        return partId;
    }

    public FbMultipleDO withPartId(Integer partId) {
        this.setPartId(partId);
        return this;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
    }

    public String getContent() {
        return content;
    }

    public FbMultipleDO withContent(String content) {
        this.setContent(content);
        return this;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getSort() {
        return sort;
    }

    public FbMultipleDO withSort(Integer sort) {
        this.setSort(sort);
        return this;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Byte getQtype() {
        return qtype;
    }

    public FbMultipleDO withQtype(Byte qtype) {
        this.setQtype(qtype);
        return this;
    }

    public void setQtype(Byte qtype) {
        this.qtype = qtype;
    }

    public Long getOrders() {
        return orders;
    }

    public FbMultipleDO withOrders(Long orders) {
        this.setOrders(orders);
        return this;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }

    public Long getCtime() {
        return ctime;
    }

    public FbMultipleDO withCtime(Long ctime) {
        this.setCtime(ctime);
        return this;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    public Integer getTeachingId() {
        return teachingId;
    }

    public FbMultipleDO withTeachingId(Integer teachingId) {
        this.setTeachingId(teachingId);
        return this;
    }

    public void setTeachingId(Integer teachingId) {
        this.teachingId = teachingId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", multipleId=").append(multipleId);
        sb.append(", uuid=").append(uuid);
        sb.append(", partId=").append(partId);
        sb.append(", content=").append(content);
        sb.append(", sort=").append(sort);
        sb.append(", qtype=").append(qtype);
        sb.append(", orders=").append(orders);
        sb.append(", ctime=").append(ctime);
        sb.append(", teachingId=").append(teachingId);
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
        FbMultipleDO other = (FbMultipleDO) that;
        return (this.getMultipleId() == null ? other.getMultipleId() == null : this.getMultipleId().equals(other.getMultipleId()))
            && (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getPartId() == null ? other.getPartId() == null : this.getPartId().equals(other.getPartId()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getQtype() == null ? other.getQtype() == null : this.getQtype().equals(other.getQtype()))
            && (this.getOrders() == null ? other.getOrders() == null : this.getOrders().equals(other.getOrders()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()))
            && (this.getTeachingId() == null ? other.getTeachingId() == null : this.getTeachingId().equals(other.getTeachingId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMultipleId() == null) ? 0 : getMultipleId().hashCode());
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getPartId() == null) ? 0 : getPartId().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getQtype() == null) ? 0 : getQtype().hashCode());
        result = prime * result + ((getOrders() == null) ? 0 : getOrders().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getTeachingId() == null) ? 0 : getTeachingId().hashCode());
        return result;
    }
}