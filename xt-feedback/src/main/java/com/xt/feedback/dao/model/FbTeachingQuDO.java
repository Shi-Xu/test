package com.xt.feedback.dao.model;

import java.io.Serializable;

public class FbTeachingQuDO implements Serializable {
    /**
     * 字段：tch_qu_id
     * 
     *
     * @mbg.generated
     */
    private Integer tchQuId;

    /**
     * 字段：teaching_id
     * 
     *
     * @mbg.generated
     */
    private Integer teachingId;

    /**
     * 字段：questionnaire_id
     * 
     *
     * @mbg.generated
     */
    private Integer questionnaireId;

    /**
     * 字段：active
     * 是否激活问卷，激活后学生可以填写
     *
     * @mbg.generated
     */
    private Byte active;

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

    public Integer getTchQuId() {
        return tchQuId;
    }

    public FbTeachingQuDO withTchQuId(Integer tchQuId) {
        this.setTchQuId(tchQuId);
        return this;
    }

    public void setTchQuId(Integer tchQuId) {
        this.tchQuId = tchQuId;
    }

    public Integer getTeachingId() {
        return teachingId;
    }

    public FbTeachingQuDO withTeachingId(Integer teachingId) {
        this.setTeachingId(teachingId);
        return this;
    }

    public void setTeachingId(Integer teachingId) {
        this.teachingId = teachingId;
    }

    public Integer getQuestionnaireId() {
        return questionnaireId;
    }

    public FbTeachingQuDO withQuestionnaireId(Integer questionnaireId) {
        this.setQuestionnaireId(questionnaireId);
        return this;
    }

    public void setQuestionnaireId(Integer questionnaireId) {
        this.questionnaireId = questionnaireId;
    }

    public Byte getActive() {
        return active;
    }

    public FbTeachingQuDO withActive(Byte active) {
        this.setActive(active);
        return this;
    }

    public void setActive(Byte active) {
        this.active = active;
    }

    public Long getOrders() {
        return orders;
    }

    public FbTeachingQuDO withOrders(Long orders) {
        this.setOrders(orders);
        return this;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }

    public Long getCtime() {
        return ctime;
    }

    public FbTeachingQuDO withCtime(Long ctime) {
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
        sb.append(", tchQuId=").append(tchQuId);
        sb.append(", teachingId=").append(teachingId);
        sb.append(", questionnaireId=").append(questionnaireId);
        sb.append(", active=").append(active);
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
        FbTeachingQuDO other = (FbTeachingQuDO) that;
        return (this.getTchQuId() == null ? other.getTchQuId() == null : this.getTchQuId().equals(other.getTchQuId()))
            && (this.getTeachingId() == null ? other.getTeachingId() == null : this.getTeachingId().equals(other.getTeachingId()))
            && (this.getQuestionnaireId() == null ? other.getQuestionnaireId() == null : this.getQuestionnaireId().equals(other.getQuestionnaireId()))
            && (this.getActive() == null ? other.getActive() == null : this.getActive().equals(other.getActive()))
            && (this.getOrders() == null ? other.getOrders() == null : this.getOrders().equals(other.getOrders()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTchQuId() == null) ? 0 : getTchQuId().hashCode());
        result = prime * result + ((getTeachingId() == null) ? 0 : getTeachingId().hashCode());
        result = prime * result + ((getQuestionnaireId() == null) ? 0 : getQuestionnaireId().hashCode());
        result = prime * result + ((getActive() == null) ? 0 : getActive().hashCode());
        result = prime * result + ((getOrders() == null) ? 0 : getOrders().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        return result;
    }
}