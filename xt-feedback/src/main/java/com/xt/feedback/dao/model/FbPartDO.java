package com.xt.feedback.dao.model;

import java.io.Serializable;

public class FbPartDO implements Serializable {
    /**
     * 字段：part_id
     * 
     *
     * @mbg.generated
     */
    private Integer partId;

    /**
     * 字段：questionnaire_id
     * 
     *
     * @mbg.generated
     */
    private Integer questionnaireId;

    /**
     * 字段：name
     * 
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 字段：note
     * 
     *
     * @mbg.generated
     */
    private String note;

    /**
     * 字段：sort
     * 排序
     *
     * @mbg.generated
     */
    private Integer sort;

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

    public Integer getPartId() {
        return partId;
    }

    public FbPartDO withPartId(Integer partId) {
        this.setPartId(partId);
        return this;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
    }

    public Integer getQuestionnaireId() {
        return questionnaireId;
    }

    public FbPartDO withQuestionnaireId(Integer questionnaireId) {
        this.setQuestionnaireId(questionnaireId);
        return this;
    }

    public void setQuestionnaireId(Integer questionnaireId) {
        this.questionnaireId = questionnaireId;
    }

    public String getName() {
        return name;
    }

    public FbPartDO withName(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public FbPartDO withNote(String note) {
        this.setNote(note);
        return this;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getSort() {
        return sort;
    }

    public FbPartDO withSort(Integer sort) {
        this.setSort(sort);
        return this;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Long getOrders() {
        return orders;
    }

    public FbPartDO withOrders(Long orders) {
        this.setOrders(orders);
        return this;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }

    public Long getCtime() {
        return ctime;
    }

    public FbPartDO withCtime(Long ctime) {
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
        sb.append(", partId=").append(partId);
        sb.append(", questionnaireId=").append(questionnaireId);
        sb.append(", name=").append(name);
        sb.append(", note=").append(note);
        sb.append(", sort=").append(sort);
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
        FbPartDO other = (FbPartDO) that;
        return (this.getPartId() == null ? other.getPartId() == null : this.getPartId().equals(other.getPartId()))
            && (this.getQuestionnaireId() == null ? other.getQuestionnaireId() == null : this.getQuestionnaireId().equals(other.getQuestionnaireId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getOrders() == null ? other.getOrders() == null : this.getOrders().equals(other.getOrders()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPartId() == null) ? 0 : getPartId().hashCode());
        result = prime * result + ((getQuestionnaireId() == null) ? 0 : getQuestionnaireId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getOrders() == null) ? 0 : getOrders().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        return result;
    }
}