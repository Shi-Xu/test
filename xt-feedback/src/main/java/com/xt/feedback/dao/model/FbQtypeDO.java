package com.xt.feedback.dao.model;

import java.io.Serializable;

public class FbQtypeDO implements Serializable {
    /**
     * 字段：qtype_id
     * 
     *
     * @mbg.generated
     */
    private Byte qtypeId;

    /**
     * 字段：name
     * 
     *
     * @mbg.generated
     */
    private String name;

    private static final long serialVersionUID = 1L;

    public Byte getQtypeId() {
        return qtypeId;
    }

    public FbQtypeDO withQtypeId(Byte qtypeId) {
        this.setQtypeId(qtypeId);
        return this;
    }

    public void setQtypeId(Byte qtypeId) {
        this.qtypeId = qtypeId;
    }

    public String getName() {
        return name;
    }

    public FbQtypeDO withName(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", qtypeId=").append(qtypeId);
        sb.append(", name=").append(name);
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
        FbQtypeDO other = (FbQtypeDO) that;
        return (this.getQtypeId() == null ? other.getQtypeId() == null : this.getQtypeId().equals(other.getQtypeId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQtypeId() == null) ? 0 : getQtypeId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }
}