package com.xt.feedback.dao.model;

import java.io.Serializable;

public class FbTchCustomDO implements Serializable {
    /**
     * 字段：fb_tch_custom
     * 自定义问卷id
     *
     * @mbg.generated
     */
    private Integer fbTchCustom;

    /**
     * 字段：single
     * 单选题
     *
     * @mbg.generated
     */
    private String single;

    /**
     * 字段：mutiple
     * 多选题
     *
     * @mbg.generated
     */
    private String mutiple;

    /**
     * 字段：fb_teacher_id
     * teacher id
     *
     * @mbg.generated
     */
    private Integer fbTeacherId;

    /**
     * 字段：fb_tch_id
     * teaching id
     *
     * @mbg.generated
     */
    private Integer fbTchId;

    /**
     * 字段：coures_order
     * 课程号
     *
     * @mbg.generated
     */
    private String couresOrder;

    private static final long serialVersionUID = 1L;

    public Integer getFbTchCustom() {
        return fbTchCustom;
    }

    public FbTchCustomDO withFbTchCustom(Integer fbTchCustom) {
        this.setFbTchCustom(fbTchCustom);
        return this;
    }

    public void setFbTchCustom(Integer fbTchCustom) {
        this.fbTchCustom = fbTchCustom;
    }

    public String getSingle() {
        return single;
    }

    public FbTchCustomDO withSingle(String single) {
        this.setSingle(single);
        return this;
    }

    public void setSingle(String single) {
        this.single = single;
    }

    public String getMutiple() {
        return mutiple;
    }

    public FbTchCustomDO withMutiple(String mutiple) {
        this.setMutiple(mutiple);
        return this;
    }

    public void setMutiple(String mutiple) {
        this.mutiple = mutiple;
    }

    public Integer getFbTeacherId() {
        return fbTeacherId;
    }

    public FbTchCustomDO withFbTeacherId(Integer fbTeacherId) {
        this.setFbTeacherId(fbTeacherId);
        return this;
    }

    public void setFbTeacherId(Integer fbTeacherId) {
        this.fbTeacherId = fbTeacherId;
    }

    public Integer getFbTchId() {
        return fbTchId;
    }

    public FbTchCustomDO withFbTchId(Integer fbTchId) {
        this.setFbTchId(fbTchId);
        return this;
    }

    public void setFbTchId(Integer fbTchId) {
        this.fbTchId = fbTchId;
    }

    public String getCouresOrder() {
        return couresOrder;
    }

    public FbTchCustomDO withCouresOrder(String couresOrder) {
        this.setCouresOrder(couresOrder);
        return this;
    }

    public void setCouresOrder(String couresOrder) {
        this.couresOrder = couresOrder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fbTchCustom=").append(fbTchCustom);
        sb.append(", single=").append(single);
        sb.append(", mutiple=").append(mutiple);
        sb.append(", fbTeacherId=").append(fbTeacherId);
        sb.append(", fbTchId=").append(fbTchId);
        sb.append(", couresOrder=").append(couresOrder);
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
        FbTchCustomDO other = (FbTchCustomDO) that;
        return (this.getFbTchCustom() == null ? other.getFbTchCustom() == null : this.getFbTchCustom().equals(other.getFbTchCustom()))
            && (this.getSingle() == null ? other.getSingle() == null : this.getSingle().equals(other.getSingle()))
            && (this.getMutiple() == null ? other.getMutiple() == null : this.getMutiple().equals(other.getMutiple()))
            && (this.getFbTeacherId() == null ? other.getFbTeacherId() == null : this.getFbTeacherId().equals(other.getFbTeacherId()))
            && (this.getFbTchId() == null ? other.getFbTchId() == null : this.getFbTchId().equals(other.getFbTchId()))
            && (this.getCouresOrder() == null ? other.getCouresOrder() == null : this.getCouresOrder().equals(other.getCouresOrder()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFbTchCustom() == null) ? 0 : getFbTchCustom().hashCode());
        result = prime * result + ((getSingle() == null) ? 0 : getSingle().hashCode());
        result = prime * result + ((getMutiple() == null) ? 0 : getMutiple().hashCode());
        result = prime * result + ((getFbTeacherId() == null) ? 0 : getFbTeacherId().hashCode());
        result = prime * result + ((getFbTchId() == null) ? 0 : getFbTchId().hashCode());
        result = prime * result + ((getCouresOrder() == null) ? 0 : getCouresOrder().hashCode());
        return result;
    }
}