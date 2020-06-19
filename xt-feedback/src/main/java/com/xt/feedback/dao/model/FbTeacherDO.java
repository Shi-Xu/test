package com.xt.feedback.dao.model;

import java.io.Serializable;
import java.util.Date;

public class FbTeacherDO implements Serializable {
    /**
     * 字段：teacher_id
     * 编号
     *
     * @mbg.generated
     */
    private Integer teacherId;

    /**
     * 字段：job_number
     * 教师工号
     *
     * @mbg.generated
     */
    private String jobNumber;

    /**
     * 字段：tch_name
     * 姓名
     *
     * @mbg.generated
     */
    private String tchName;

    /**
     * 字段：age
     * 年龄
     *
     * @mbg.generated
     */
    private Byte age;

    /**
     * 字段：degree
     * 学位
     *
     * @mbg.generated
     */
    private String degree;

    /**
     * 字段：title
     * 职称
     *
     * @mbg.generated
     */
    private String title;

    /**
     * 字段：grad_university
     * 毕业学校
     *
     * @mbg.generated
     */
    private String gradUniversity;

    /**
     * 字段：grad_major
     * 毕业专业
     *
     * @mbg.generated
     */
    private String gradMajor;

    /**
     * 字段：experience
     * 专业工作经历
     *
     * @mbg.generated
     */
    private String experience;

    /**
     * 字段：entry_date
     * 入职时间
     *
     * @mbg.generated
     */
    private Date entryDate;

    /**
     * 字段：political_affiliation
     * 政治面貌
     *
     * @mbg.generated
     */
    private String politicalAffiliation;

    /**
     * 字段：department
     * 学院部门
     *
     * @mbg.generated
     */
    private String department;

    /**
     * 字段：native_place
     * 籍贯
     *
     * @mbg.generated
     */
    private String nativePlace;

    /**
     * 字段：nation
     * 民族
     *
     * @mbg.generated
     */
    private String nation;

    /**
     * 字段：remark
     * 备注
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * 字段：locked
     * 类型（0：正常，1：锁定）
     *
     * @mbg.generated
     */
    private Byte locked;

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

    public Integer getTeacherId() {
        return teacherId;
    }

    public FbTeacherDO withTeacherId(Integer teacherId) {
        this.setTeacherId(teacherId);
        return this;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public FbTeacherDO withJobNumber(String jobNumber) {
        this.setJobNumber(jobNumber);
        return this;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getTchName() {
        return tchName;
    }

    public FbTeacherDO withTchName(String tchName) {
        this.setTchName(tchName);
        return this;
    }

    public void setTchName(String tchName) {
        this.tchName = tchName;
    }

    public Byte getAge() {
        return age;
    }

    public FbTeacherDO withAge(Byte age) {
        this.setAge(age);
        return this;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getDegree() {
        return degree;
    }

    public FbTeacherDO withDegree(String degree) {
        this.setDegree(degree);
        return this;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getTitle() {
        return title;
    }

    public FbTeacherDO withTitle(String title) {
        this.setTitle(title);
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGradUniversity() {
        return gradUniversity;
    }

    public FbTeacherDO withGradUniversity(String gradUniversity) {
        this.setGradUniversity(gradUniversity);
        return this;
    }

    public void setGradUniversity(String gradUniversity) {
        this.gradUniversity = gradUniversity;
    }

    public String getGradMajor() {
        return gradMajor;
    }

    public FbTeacherDO withGradMajor(String gradMajor) {
        this.setGradMajor(gradMajor);
        return this;
    }

    public void setGradMajor(String gradMajor) {
        this.gradMajor = gradMajor;
    }

    public String getExperience() {
        return experience;
    }

    public FbTeacherDO withExperience(String experience) {
        this.setExperience(experience);
        return this;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public FbTeacherDO withEntryDate(Date entryDate) {
        this.setEntryDate(entryDate);
        return this;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getPoliticalAffiliation() {
        return politicalAffiliation;
    }

    public FbTeacherDO withPoliticalAffiliation(String politicalAffiliation) {
        this.setPoliticalAffiliation(politicalAffiliation);
        return this;
    }

    public void setPoliticalAffiliation(String politicalAffiliation) {
        this.politicalAffiliation = politicalAffiliation;
    }

    public String getDepartment() {
        return department;
    }

    public FbTeacherDO withDepartment(String department) {
        this.setDepartment(department);
        return this;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public FbTeacherDO withNativePlace(String nativePlace) {
        this.setNativePlace(nativePlace);
        return this;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getNation() {
        return nation;
    }

    public FbTeacherDO withNation(String nation) {
        this.setNation(nation);
        return this;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getRemark() {
        return remark;
    }

    public FbTeacherDO withRemark(String remark) {
        this.setRemark(remark);
        return this;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Byte getLocked() {
        return locked;
    }

    public FbTeacherDO withLocked(Byte locked) {
        this.setLocked(locked);
        return this;
    }

    public void setLocked(Byte locked) {
        this.locked = locked;
    }

    public Long getOrders() {
        return orders;
    }

    public FbTeacherDO withOrders(Long orders) {
        this.setOrders(orders);
        return this;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }

    public Long getCtime() {
        return ctime;
    }

    public FbTeacherDO withCtime(Long ctime) {
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
        sb.append(", teacherId=").append(teacherId);
        sb.append(", jobNumber=").append(jobNumber);
        sb.append(", tchName=").append(tchName);
        sb.append(", age=").append(age);
        sb.append(", degree=").append(degree);
        sb.append(", title=").append(title);
        sb.append(", gradUniversity=").append(gradUniversity);
        sb.append(", gradMajor=").append(gradMajor);
        sb.append(", experience=").append(experience);
        sb.append(", entryDate=").append(entryDate);
        sb.append(", politicalAffiliation=").append(politicalAffiliation);
        sb.append(", department=").append(department);
        sb.append(", nativePlace=").append(nativePlace);
        sb.append(", nation=").append(nation);
        sb.append(", remark=").append(remark);
        sb.append(", locked=").append(locked);
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
        FbTeacherDO other = (FbTeacherDO) that;
        return (this.getTeacherId() == null ? other.getTeacherId() == null : this.getTeacherId().equals(other.getTeacherId()))
            && (this.getJobNumber() == null ? other.getJobNumber() == null : this.getJobNumber().equals(other.getJobNumber()))
            && (this.getTchName() == null ? other.getTchName() == null : this.getTchName().equals(other.getTchName()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getDegree() == null ? other.getDegree() == null : this.getDegree().equals(other.getDegree()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getGradUniversity() == null ? other.getGradUniversity() == null : this.getGradUniversity().equals(other.getGradUniversity()))
            && (this.getGradMajor() == null ? other.getGradMajor() == null : this.getGradMajor().equals(other.getGradMajor()))
            && (this.getExperience() == null ? other.getExperience() == null : this.getExperience().equals(other.getExperience()))
            && (this.getEntryDate() == null ? other.getEntryDate() == null : this.getEntryDate().equals(other.getEntryDate()))
            && (this.getPoliticalAffiliation() == null ? other.getPoliticalAffiliation() == null : this.getPoliticalAffiliation().equals(other.getPoliticalAffiliation()))
            && (this.getDepartment() == null ? other.getDepartment() == null : this.getDepartment().equals(other.getDepartment()))
            && (this.getNativePlace() == null ? other.getNativePlace() == null : this.getNativePlace().equals(other.getNativePlace()))
            && (this.getNation() == null ? other.getNation() == null : this.getNation().equals(other.getNation()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getLocked() == null ? other.getLocked() == null : this.getLocked().equals(other.getLocked()))
            && (this.getOrders() == null ? other.getOrders() == null : this.getOrders().equals(other.getOrders()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTeacherId() == null) ? 0 : getTeacherId().hashCode());
        result = prime * result + ((getJobNumber() == null) ? 0 : getJobNumber().hashCode());
        result = prime * result + ((getTchName() == null) ? 0 : getTchName().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getDegree() == null) ? 0 : getDegree().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getGradUniversity() == null) ? 0 : getGradUniversity().hashCode());
        result = prime * result + ((getGradMajor() == null) ? 0 : getGradMajor().hashCode());
        result = prime * result + ((getExperience() == null) ? 0 : getExperience().hashCode());
        result = prime * result + ((getEntryDate() == null) ? 0 : getEntryDate().hashCode());
        result = prime * result + ((getPoliticalAffiliation() == null) ? 0 : getPoliticalAffiliation().hashCode());
        result = prime * result + ((getDepartment() == null) ? 0 : getDepartment().hashCode());
        result = prime * result + ((getNativePlace() == null) ? 0 : getNativePlace().hashCode());
        result = prime * result + ((getNation() == null) ? 0 : getNation().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getLocked() == null) ? 0 : getLocked().hashCode());
        result = prime * result + ((getOrders() == null) ? 0 : getOrders().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        return result;
    }
}