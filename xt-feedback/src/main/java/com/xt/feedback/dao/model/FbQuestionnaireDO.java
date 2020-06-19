package com.xt.feedback.dao.model;

import java.io.Serializable;

public class FbQuestionnaireDO implements Serializable {
    /**
     * 字段：questionnaire_id
     * 
     *
     * @mbg.generated
     */
    private Integer questionnaireId;

    /**
     * 字段：title
     * 
     *
     * @mbg.generated
     */
    private String title;

    /**
     * 字段：lock
     * 0:正常，1:锁定（学生答题后锁定，无法修改）
     *
     * @mbg.generated
     */
    private Byte lock;

    /**
     * 字段：note
     * 问卷注释
     *
     * @mbg.generated
     */
    private String note;

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

    public Integer getQuestionnaireId() {
        return questionnaireId;
    }

    public FbQuestionnaireDO withQuestionnaireId(Integer questionnaireId) {
        this.setQuestionnaireId(questionnaireId);
        return this;
    }

    public void setQuestionnaireId(Integer questionnaireId) {
        this.questionnaireId = questionnaireId;
    }

    public String getTitle() {
        return title;
    }

    public FbQuestionnaireDO withTitle(String title) {
        this.setTitle(title);
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Byte getLock() {
        return lock;
    }

    public FbQuestionnaireDO withLock(Byte lock) {
        this.setLock(lock);
        return this;
    }

    public void setLock(Byte lock) {
        this.lock = lock;
    }

    public String getNote() {
        return note;
    }

    public FbQuestionnaireDO withNote(String note) {
        this.setNote(note);
        return this;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getOrders() {
        return orders;
    }

    public FbQuestionnaireDO withOrders(Long orders) {
        this.setOrders(orders);
        return this;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }

    public Long getCtime() {
        return ctime;
    }

    public FbQuestionnaireDO withCtime(Long ctime) {
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
        sb.append(", questionnaireId=").append(questionnaireId);
        sb.append(", title=").append(title);
        sb.append(", lock=").append(lock);
        sb.append(", note=").append(note);
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
        FbQuestionnaireDO other = (FbQuestionnaireDO) that;
        return (this.getQuestionnaireId() == null ? other.getQuestionnaireId() == null : this.getQuestionnaireId().equals(other.getQuestionnaireId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getLock() == null ? other.getLock() == null : this.getLock().equals(other.getLock()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getOrders() == null ? other.getOrders() == null : this.getOrders().equals(other.getOrders()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQuestionnaireId() == null) ? 0 : getQuestionnaireId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getLock() == null) ? 0 : getLock().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getOrders() == null) ? 0 : getOrders().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        return result;
    }
}