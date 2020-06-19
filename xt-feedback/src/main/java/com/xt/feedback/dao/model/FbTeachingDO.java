package com.xt.feedback.dao.model;

import java.io.Serializable;

public class FbTeachingDO implements Serializable {
    /**
     * 字段：teaching_id
     * 编号
     *
     * @mbg.generated
     */
    private Integer teachingId;

    /**
     * 字段：tch_name
     * 教师姓名
     *
     * @mbg.generated
     */
    private String tchName;

    /**
     * 字段：start_year
     * 开始学年
     *
     * @mbg.generated
     */
    private String startYear;

    /**
     * 字段：end_year
     * 结束学年
     *
     * @mbg.generated
     */
    private String endYear;

    /**
     * 字段：term
     * 学期
     *
     * @mbg.generated
     */
    private Byte term;

    /**
     * 字段：course
     * 课程名称
     *
     * @mbg.generated
     */
    private String course;

    /**
     * 字段：course_no
     * 课程号
     *
     * @mbg.generated
     */
    private String courseNo;

    /**
     * 字段：course_order
     * 课序号
     *
     * @mbg.generated
     */
    private String courseOrder;

    /**
     * 字段：major
     * 学生专业
     *
     * @mbg.generated
     */
    private String major;

    /**
     * 字段：classes
     * 学生班级
     *
     * @mbg.generated
     */
    private String classes;

    /**
     * 字段：number
     * 学生人数
     *
     * @mbg.generated
     */
    private Integer number;

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

    public Integer getTeachingId() {
        return teachingId;
    }

    public FbTeachingDO withTeachingId(Integer teachingId) {
        this.setTeachingId(teachingId);
        return this;
    }

    public void setTeachingId(Integer teachingId) {
        this.teachingId = teachingId;
    }

    public String getTchName() {
        return tchName;
    }

    public FbTeachingDO withTchName(String tchName) {
        this.setTchName(tchName);
        return this;
    }

    public void setTchName(String tchName) {
        this.tchName = tchName;
    }

    public String getStartYear() {
        return startYear;
    }

    public FbTeachingDO withStartYear(String startYear) {
        this.setStartYear(startYear);
        return this;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public FbTeachingDO withEndYear(String endYear) {
        this.setEndYear(endYear);
        return this;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public Byte getTerm() {
        return term;
    }

    public FbTeachingDO withTerm(Byte term) {
        this.setTerm(term);
        return this;
    }

    public void setTerm(Byte term) {
        this.term = term;
    }

    public String getCourse() {
        return course;
    }

    public FbTeachingDO withCourse(String course) {
        this.setCourse(course);
        return this;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourseNo() {
        return courseNo;
    }

    public FbTeachingDO withCourseNo(String courseNo) {
        this.setCourseNo(courseNo);
        return this;
    }

    public void setCourseNo(String courseNo) {
        this.courseNo = courseNo;
    }

    public String getCourseOrder() {
        return courseOrder;
    }

    public FbTeachingDO withCourseOrder(String courseOrder) {
        this.setCourseOrder(courseOrder);
        return this;
    }

    public void setCourseOrder(String courseOrder) {
        this.courseOrder = courseOrder;
    }

    public String getMajor() {
        return major;
    }

    public FbTeachingDO withMajor(String major) {
        this.setMajor(major);
        return this;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClasses() {
        return classes;
    }

    public FbTeachingDO withClasses(String classes) {
        this.setClasses(classes);
        return this;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Integer getNumber() {
        return number;
    }

    public FbTeachingDO withNumber(Integer number) {
        this.setNumber(number);
        return this;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getOrders() {
        return orders;
    }

    public FbTeachingDO withOrders(Long orders) {
        this.setOrders(orders);
        return this;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }

    public Long getCtime() {
        return ctime;
    }

    public FbTeachingDO withCtime(Long ctime) {
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
        sb.append(", teachingId=").append(teachingId);
        sb.append(", tchName=").append(tchName);
        sb.append(", startYear=").append(startYear);
        sb.append(", endYear=").append(endYear);
        sb.append(", term=").append(term);
        sb.append(", course=").append(course);
        sb.append(", courseNo=").append(courseNo);
        sb.append(", courseOrder=").append(courseOrder);
        sb.append(", major=").append(major);
        sb.append(", classes=").append(classes);
        sb.append(", number=").append(number);
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
        FbTeachingDO other = (FbTeachingDO) that;
        return (this.getTeachingId() == null ? other.getTeachingId() == null : this.getTeachingId().equals(other.getTeachingId()))
            && (this.getTchName() == null ? other.getTchName() == null : this.getTchName().equals(other.getTchName()))
            && (this.getStartYear() == null ? other.getStartYear() == null : this.getStartYear().equals(other.getStartYear()))
            && (this.getEndYear() == null ? other.getEndYear() == null : this.getEndYear().equals(other.getEndYear()))
            && (this.getTerm() == null ? other.getTerm() == null : this.getTerm().equals(other.getTerm()))
            && (this.getCourse() == null ? other.getCourse() == null : this.getCourse().equals(other.getCourse()))
            && (this.getCourseNo() == null ? other.getCourseNo() == null : this.getCourseNo().equals(other.getCourseNo()))
            && (this.getCourseOrder() == null ? other.getCourseOrder() == null : this.getCourseOrder().equals(other.getCourseOrder()))
            && (this.getMajor() == null ? other.getMajor() == null : this.getMajor().equals(other.getMajor()))
            && (this.getClasses() == null ? other.getClasses() == null : this.getClasses().equals(other.getClasses()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getOrders() == null ? other.getOrders() == null : this.getOrders().equals(other.getOrders()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTeachingId() == null) ? 0 : getTeachingId().hashCode());
        result = prime * result + ((getTchName() == null) ? 0 : getTchName().hashCode());
        result = prime * result + ((getStartYear() == null) ? 0 : getStartYear().hashCode());
        result = prime * result + ((getEndYear() == null) ? 0 : getEndYear().hashCode());
        result = prime * result + ((getTerm() == null) ? 0 : getTerm().hashCode());
        result = prime * result + ((getCourse() == null) ? 0 : getCourse().hashCode());
        result = prime * result + ((getCourseNo() == null) ? 0 : getCourseNo().hashCode());
        result = prime * result + ((getCourseOrder() == null) ? 0 : getCourseOrder().hashCode());
        result = prime * result + ((getMajor() == null) ? 0 : getMajor().hashCode());
        result = prime * result + ((getClasses() == null) ? 0 : getClasses().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getOrders() == null) ? 0 : getOrders().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        return result;
    }
}