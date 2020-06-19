package com.xt.feedback.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FbTeacherDOExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public static final String TALIAS = "tch";

    private Integer limit;

    private Integer offset;

    private Object resultColumns;

    public FbTeacherDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public static String addAliasByComma(String columns) {
        if (columns == null) return null;
        String[] columnList=columns.split(",");
        columns="";
        for (int i=0;i< columnList.length;i++) {
            String string=TALIAS+"."+columnList[i].trim();
            if (i!=0) { string=","+string; }
            columns=columns+string;
        }
        return columns;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setResultColumns(Object resultColumns) {
        this.resultColumns = resultColumns;
    }

    public Object getResultColumns() {
        return resultColumns;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("tch.teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("tch.teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("tch.teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("tch.teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("tch.teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tch.teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("tch.teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("tch.teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("tch.teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("tch.teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("tch.teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tch.teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andJobNumberIsNull() {
            addCriterion("tch.job_number is null");
            return (Criteria) this;
        }

        public Criteria andJobNumberIsNotNull() {
            addCriterion("tch.job_number is not null");
            return (Criteria) this;
        }

        public Criteria andJobNumberEqualTo(String value) {
            addCriterion("tch.job_number =", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotEqualTo(String value) {
            addCriterion("tch.job_number <>", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberGreaterThan(String value) {
            addCriterion("tch.job_number >", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberGreaterThanOrEqualTo(String value) {
            addCriterion("tch.job_number >=", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLessThan(String value) {
            addCriterion("tch.job_number <", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLessThanOrEqualTo(String value) {
            addCriterion("tch.job_number <=", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLike(String value) {
            addCriterion("tch.job_number like", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotLike(String value) {
            addCriterion("tch.job_number not like", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberIn(List<String> values) {
            addCriterion("tch.job_number in", values, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotIn(List<String> values) {
            addCriterion("tch.job_number not in", values, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberBetween(String value1, String value2) {
            addCriterion("tch.job_number between", value1, value2, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotBetween(String value1, String value2) {
            addCriterion("tch.job_number not between", value1, value2, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andTchNameIsNull() {
            addCriterion("tch.tch_name is null");
            return (Criteria) this;
        }

        public Criteria andTchNameIsNotNull() {
            addCriterion("tch.tch_name is not null");
            return (Criteria) this;
        }

        public Criteria andTchNameEqualTo(String value) {
            addCriterion("tch.tch_name =", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameNotEqualTo(String value) {
            addCriterion("tch.tch_name <>", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameGreaterThan(String value) {
            addCriterion("tch.tch_name >", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameGreaterThanOrEqualTo(String value) {
            addCriterion("tch.tch_name >=", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameLessThan(String value) {
            addCriterion("tch.tch_name <", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameLessThanOrEqualTo(String value) {
            addCriterion("tch.tch_name <=", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameLike(String value) {
            addCriterion("tch.tch_name like", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameNotLike(String value) {
            addCriterion("tch.tch_name not like", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameIn(List<String> values) {
            addCriterion("tch.tch_name in", values, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameNotIn(List<String> values) {
            addCriterion("tch.tch_name not in", values, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameBetween(String value1, String value2) {
            addCriterion("tch.tch_name between", value1, value2, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameNotBetween(String value1, String value2) {
            addCriterion("tch.tch_name not between", value1, value2, "tchName");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("tch.age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("tch.age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Byte value) {
            addCriterion("tch.age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Byte value) {
            addCriterion("tch.age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Byte value) {
            addCriterion("tch.age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tch.age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Byte value) {
            addCriterion("tch.age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Byte value) {
            addCriterion("tch.age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Byte> values) {
            addCriterion("tch.age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Byte> values) {
            addCriterion("tch.age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Byte value1, Byte value2) {
            addCriterion("tch.age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Byte value1, Byte value2) {
            addCriterion("tch.age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("tch.degree is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("tch.degree is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("tch.degree =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("tch.degree <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("tch.degree >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("tch.degree >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("tch.degree <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("tch.degree <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("tch.degree like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("tch.degree not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("tch.degree in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("tch.degree not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("tch.degree between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("tch.degree not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("tch.title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("tch.title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("tch.title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("tch.title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("tch.title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("tch.title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("tch.title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("tch.title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("tch.title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("tch.title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("tch.title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("tch.title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("tch.title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("tch.title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andGradUniversityIsNull() {
            addCriterion("tch.grad_university is null");
            return (Criteria) this;
        }

        public Criteria andGradUniversityIsNotNull() {
            addCriterion("tch.grad_university is not null");
            return (Criteria) this;
        }

        public Criteria andGradUniversityEqualTo(String value) {
            addCriterion("tch.grad_university =", value, "gradUniversity");
            return (Criteria) this;
        }

        public Criteria andGradUniversityNotEqualTo(String value) {
            addCriterion("tch.grad_university <>", value, "gradUniversity");
            return (Criteria) this;
        }

        public Criteria andGradUniversityGreaterThan(String value) {
            addCriterion("tch.grad_university >", value, "gradUniversity");
            return (Criteria) this;
        }

        public Criteria andGradUniversityGreaterThanOrEqualTo(String value) {
            addCriterion("tch.grad_university >=", value, "gradUniversity");
            return (Criteria) this;
        }

        public Criteria andGradUniversityLessThan(String value) {
            addCriterion("tch.grad_university <", value, "gradUniversity");
            return (Criteria) this;
        }

        public Criteria andGradUniversityLessThanOrEqualTo(String value) {
            addCriterion("tch.grad_university <=", value, "gradUniversity");
            return (Criteria) this;
        }

        public Criteria andGradUniversityLike(String value) {
            addCriterion("tch.grad_university like", value, "gradUniversity");
            return (Criteria) this;
        }

        public Criteria andGradUniversityNotLike(String value) {
            addCriterion("tch.grad_university not like", value, "gradUniversity");
            return (Criteria) this;
        }

        public Criteria andGradUniversityIn(List<String> values) {
            addCriterion("tch.grad_university in", values, "gradUniversity");
            return (Criteria) this;
        }

        public Criteria andGradUniversityNotIn(List<String> values) {
            addCriterion("tch.grad_university not in", values, "gradUniversity");
            return (Criteria) this;
        }

        public Criteria andGradUniversityBetween(String value1, String value2) {
            addCriterion("tch.grad_university between", value1, value2, "gradUniversity");
            return (Criteria) this;
        }

        public Criteria andGradUniversityNotBetween(String value1, String value2) {
            addCriterion("tch.grad_university not between", value1, value2, "gradUniversity");
            return (Criteria) this;
        }

        public Criteria andGradMajorIsNull() {
            addCriterion("tch.grad_major is null");
            return (Criteria) this;
        }

        public Criteria andGradMajorIsNotNull() {
            addCriterion("tch.grad_major is not null");
            return (Criteria) this;
        }

        public Criteria andGradMajorEqualTo(String value) {
            addCriterion("tch.grad_major =", value, "gradMajor");
            return (Criteria) this;
        }

        public Criteria andGradMajorNotEqualTo(String value) {
            addCriterion("tch.grad_major <>", value, "gradMajor");
            return (Criteria) this;
        }

        public Criteria andGradMajorGreaterThan(String value) {
            addCriterion("tch.grad_major >", value, "gradMajor");
            return (Criteria) this;
        }

        public Criteria andGradMajorGreaterThanOrEqualTo(String value) {
            addCriterion("tch.grad_major >=", value, "gradMajor");
            return (Criteria) this;
        }

        public Criteria andGradMajorLessThan(String value) {
            addCriterion("tch.grad_major <", value, "gradMajor");
            return (Criteria) this;
        }

        public Criteria andGradMajorLessThanOrEqualTo(String value) {
            addCriterion("tch.grad_major <=", value, "gradMajor");
            return (Criteria) this;
        }

        public Criteria andGradMajorLike(String value) {
            addCriterion("tch.grad_major like", value, "gradMajor");
            return (Criteria) this;
        }

        public Criteria andGradMajorNotLike(String value) {
            addCriterion("tch.grad_major not like", value, "gradMajor");
            return (Criteria) this;
        }

        public Criteria andGradMajorIn(List<String> values) {
            addCriterion("tch.grad_major in", values, "gradMajor");
            return (Criteria) this;
        }

        public Criteria andGradMajorNotIn(List<String> values) {
            addCriterion("tch.grad_major not in", values, "gradMajor");
            return (Criteria) this;
        }

        public Criteria andGradMajorBetween(String value1, String value2) {
            addCriterion("tch.grad_major between", value1, value2, "gradMajor");
            return (Criteria) this;
        }

        public Criteria andGradMajorNotBetween(String value1, String value2) {
            addCriterion("tch.grad_major not between", value1, value2, "gradMajor");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNull() {
            addCriterion("tch.experience is null");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNotNull() {
            addCriterion("tch.experience is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceEqualTo(String value) {
            addCriterion("tch.experience =", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotEqualTo(String value) {
            addCriterion("tch.experience <>", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThan(String value) {
            addCriterion("tch.experience >", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("tch.experience >=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThan(String value) {
            addCriterion("tch.experience <", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThanOrEqualTo(String value) {
            addCriterion("tch.experience <=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLike(String value) {
            addCriterion("tch.experience like", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotLike(String value) {
            addCriterion("tch.experience not like", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceIn(List<String> values) {
            addCriterion("tch.experience in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotIn(List<String> values) {
            addCriterion("tch.experience not in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceBetween(String value1, String value2) {
            addCriterion("tch.experience between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotBetween(String value1, String value2) {
            addCriterion("tch.experience not between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andEntryDateIsNull() {
            addCriterion("tch.entry_date is null");
            return (Criteria) this;
        }

        public Criteria andEntryDateIsNotNull() {
            addCriterion("tch.entry_date is not null");
            return (Criteria) this;
        }

        public Criteria andEntryDateEqualTo(Date value) {
            addCriterionForJDBCDate("tch.entry_date =", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("tch.entry_date <>", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("tch.entry_date >", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tch.entry_date >=", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLessThan(Date value) {
            addCriterionForJDBCDate("tch.entry_date <", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tch.entry_date <=", value, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateIn(List<Date> values) {
            addCriterionForJDBCDate("tch.entry_date in", values, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("tch.entry_date not in", values, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tch.entry_date between", value1, value2, "entryDate");
            return (Criteria) this;
        }

        public Criteria andEntryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tch.entry_date not between", value1, value2, "entryDate");
            return (Criteria) this;
        }

        public Criteria andPoliticalAffiliationIsNull() {
            addCriterion("tch.political_affiliation is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalAffiliationIsNotNull() {
            addCriterion("tch.political_affiliation is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalAffiliationEqualTo(String value) {
            addCriterion("tch.political_affiliation =", value, "politicalAffiliation");
            return (Criteria) this;
        }

        public Criteria andPoliticalAffiliationNotEqualTo(String value) {
            addCriterion("tch.political_affiliation <>", value, "politicalAffiliation");
            return (Criteria) this;
        }

        public Criteria andPoliticalAffiliationGreaterThan(String value) {
            addCriterion("tch.political_affiliation >", value, "politicalAffiliation");
            return (Criteria) this;
        }

        public Criteria andPoliticalAffiliationGreaterThanOrEqualTo(String value) {
            addCriterion("tch.political_affiliation >=", value, "politicalAffiliation");
            return (Criteria) this;
        }

        public Criteria andPoliticalAffiliationLessThan(String value) {
            addCriterion("tch.political_affiliation <", value, "politicalAffiliation");
            return (Criteria) this;
        }

        public Criteria andPoliticalAffiliationLessThanOrEqualTo(String value) {
            addCriterion("tch.political_affiliation <=", value, "politicalAffiliation");
            return (Criteria) this;
        }

        public Criteria andPoliticalAffiliationLike(String value) {
            addCriterion("tch.political_affiliation like", value, "politicalAffiliation");
            return (Criteria) this;
        }

        public Criteria andPoliticalAffiliationNotLike(String value) {
            addCriterion("tch.political_affiliation not like", value, "politicalAffiliation");
            return (Criteria) this;
        }

        public Criteria andPoliticalAffiliationIn(List<String> values) {
            addCriterion("tch.political_affiliation in", values, "politicalAffiliation");
            return (Criteria) this;
        }

        public Criteria andPoliticalAffiliationNotIn(List<String> values) {
            addCriterion("tch.political_affiliation not in", values, "politicalAffiliation");
            return (Criteria) this;
        }

        public Criteria andPoliticalAffiliationBetween(String value1, String value2) {
            addCriterion("tch.political_affiliation between", value1, value2, "politicalAffiliation");
            return (Criteria) this;
        }

        public Criteria andPoliticalAffiliationNotBetween(String value1, String value2) {
            addCriterion("tch.political_affiliation not between", value1, value2, "politicalAffiliation");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("tch.department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("tch.department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("tch.department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("tch.department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("tch.department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("tch.department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("tch.department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("tch.department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("tch.department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("tch.department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("tch.department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("tch.department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("tch.department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("tch.department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNull() {
            addCriterion("tch.native_place is null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNotNull() {
            addCriterion("tch.native_place is not null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceEqualTo(String value) {
            addCriterion("tch.native_place =", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotEqualTo(String value) {
            addCriterion("tch.native_place <>", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThan(String value) {
            addCriterion("tch.native_place >", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("tch.native_place >=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThan(String value) {
            addCriterion("tch.native_place <", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThanOrEqualTo(String value) {
            addCriterion("tch.native_place <=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLike(String value) {
            addCriterion("tch.native_place like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotLike(String value) {
            addCriterion("tch.native_place not like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIn(List<String> values) {
            addCriterion("tch.native_place in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotIn(List<String> values) {
            addCriterion("tch.native_place not in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceBetween(String value1, String value2) {
            addCriterion("tch.native_place between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotBetween(String value1, String value2) {
            addCriterion("tch.native_place not between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("tch.nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("tch.nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("tch.nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("tch.nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("tch.nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("tch.nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("tch.nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("tch.nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("tch.nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("tch.nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("tch.nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("tch.nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("tch.nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("tch.nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("tch.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("tch.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("tch.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("tch.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("tch.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tch.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("tch.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("tch.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("tch.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("tch.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("tch.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("tch.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("tch.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("tch.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andLockedIsNull() {
            addCriterion("tch.locked is null");
            return (Criteria) this;
        }

        public Criteria andLockedIsNotNull() {
            addCriterion("tch.locked is not null");
            return (Criteria) this;
        }

        public Criteria andLockedEqualTo(Byte value) {
            addCriterion("tch.locked =", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotEqualTo(Byte value) {
            addCriterion("tch.locked <>", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThan(Byte value) {
            addCriterion("tch.locked >", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThanOrEqualTo(Byte value) {
            addCriterion("tch.locked >=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThan(Byte value) {
            addCriterion("tch.locked <", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThanOrEqualTo(Byte value) {
            addCriterion("tch.locked <=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedIn(List<Byte> values) {
            addCriterion("tch.locked in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotIn(List<Byte> values) {
            addCriterion("tch.locked not in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedBetween(Byte value1, Byte value2) {
            addCriterion("tch.locked between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotBetween(Byte value1, Byte value2) {
            addCriterion("tch.locked not between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNull() {
            addCriterion("tch.orders is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNotNull() {
            addCriterion("tch.orders is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersEqualTo(Long value) {
            addCriterion("tch.orders =", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotEqualTo(Long value) {
            addCriterion("tch.orders <>", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThan(Long value) {
            addCriterion("tch.orders >", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThanOrEqualTo(Long value) {
            addCriterion("tch.orders >=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThan(Long value) {
            addCriterion("tch.orders <", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThanOrEqualTo(Long value) {
            addCriterion("tch.orders <=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersIn(List<Long> values) {
            addCriterion("tch.orders in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotIn(List<Long> values) {
            addCriterion("tch.orders not in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersBetween(Long value1, Long value2) {
            addCriterion("tch.orders between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotBetween(Long value1, Long value2) {
            addCriterion("tch.orders not between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("tch.ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("tch.ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Long value) {
            addCriterion("tch.ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Long value) {
            addCriterion("tch.ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Long value) {
            addCriterion("tch.ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Long value) {
            addCriterion("tch.ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Long value) {
            addCriterion("tch.ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Long value) {
            addCriterion("tch.ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Long> values) {
            addCriterion("tch.ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Long> values) {
            addCriterion("tch.ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Long value1, Long value2) {
            addCriterion("tch.ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Long value1, Long value2) {
            addCriterion("tch.ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}