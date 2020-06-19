package com.xt.feedback.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FbTeachingDOExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public static final String TALIAS = "tc";

    private Integer limit;

    private Integer offset;

    private Object resultColumns;

    public FbTeachingDOExample() {
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

        public Criteria andTeachingIdIsNull() {
            addCriterion("tc.teaching_id is null");
            return (Criteria) this;
        }

        public Criteria andTeachingIdIsNotNull() {
            addCriterion("tc.teaching_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingIdEqualTo(Integer value) {
            addCriterion("tc.teaching_id =", value, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdNotEqualTo(Integer value) {
            addCriterion("tc.teaching_id <>", value, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdGreaterThan(Integer value) {
            addCriterion("tc.teaching_id >", value, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tc.teaching_id >=", value, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdLessThan(Integer value) {
            addCriterion("tc.teaching_id <", value, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdLessThanOrEqualTo(Integer value) {
            addCriterion("tc.teaching_id <=", value, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdIn(List<Integer> values) {
            addCriterion("tc.teaching_id in", values, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdNotIn(List<Integer> values) {
            addCriterion("tc.teaching_id not in", values, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdBetween(Integer value1, Integer value2) {
            addCriterion("tc.teaching_id between", value1, value2, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tc.teaching_id not between", value1, value2, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTchNameIsNull() {
            addCriterion("tc.tch_name is null");
            return (Criteria) this;
        }

        public Criteria andTchNameIsNotNull() {
            addCriterion("tc.tch_name is not null");
            return (Criteria) this;
        }

        public Criteria andTchNameEqualTo(String value) {
            addCriterion("tc.tch_name =", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameNotEqualTo(String value) {
            addCriterion("tc.tch_name <>", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameGreaterThan(String value) {
            addCriterion("tc.tch_name >", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameGreaterThanOrEqualTo(String value) {
            addCriterion("tc.tch_name >=", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameLessThan(String value) {
            addCriterion("tc.tch_name <", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameLessThanOrEqualTo(String value) {
            addCriterion("tc.tch_name <=", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameLike(String value) {
            addCriterion("tc.tch_name like", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameNotLike(String value) {
            addCriterion("tc.tch_name not like", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameIn(List<String> values) {
            addCriterion("tc.tch_name in", values, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameNotIn(List<String> values) {
            addCriterion("tc.tch_name not in", values, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameBetween(String value1, String value2) {
            addCriterion("tc.tch_name between", value1, value2, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameNotBetween(String value1, String value2) {
            addCriterion("tc.tch_name not between", value1, value2, "tchName");
            return (Criteria) this;
        }

        public Criteria andStartYearIsNull() {
            addCriterion("tc.start_year is null");
            return (Criteria) this;
        }

        public Criteria andStartYearIsNotNull() {
            addCriterion("tc.start_year is not null");
            return (Criteria) this;
        }

        public Criteria andStartYearEqualTo(String value) {
            addCriterion("tc.start_year =", value, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearNotEqualTo(String value) {
            addCriterion("tc.start_year <>", value, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearGreaterThan(String value) {
            addCriterion("tc.start_year >", value, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearGreaterThanOrEqualTo(String value) {
            addCriterion("tc.start_year >=", value, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearLessThan(String value) {
            addCriterion("tc.start_year <", value, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearLessThanOrEqualTo(String value) {
            addCriterion("tc.start_year <=", value, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearLike(String value) {
            addCriterion("tc.start_year like", value, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearNotLike(String value) {
            addCriterion("tc.start_year not like", value, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearIn(List<String> values) {
            addCriterion("tc.start_year in", values, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearNotIn(List<String> values) {
            addCriterion("tc.start_year not in", values, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearBetween(String value1, String value2) {
            addCriterion("tc.start_year between", value1, value2, "startYear");
            return (Criteria) this;
        }

        public Criteria andStartYearNotBetween(String value1, String value2) {
            addCriterion("tc.start_year not between", value1, value2, "startYear");
            return (Criteria) this;
        }

        public Criteria andEndYearIsNull() {
            addCriterion("tc.end_year is null");
            return (Criteria) this;
        }

        public Criteria andEndYearIsNotNull() {
            addCriterion("tc.end_year is not null");
            return (Criteria) this;
        }

        public Criteria andEndYearEqualTo(String value) {
            addCriterion("tc.end_year =", value, "endYear");
            return (Criteria) this;
        }

        public Criteria andEndYearNotEqualTo(String value) {
            addCriterion("tc.end_year <>", value, "endYear");
            return (Criteria) this;
        }

        public Criteria andEndYearGreaterThan(String value) {
            addCriterion("tc.end_year >", value, "endYear");
            return (Criteria) this;
        }

        public Criteria andEndYearGreaterThanOrEqualTo(String value) {
            addCriterion("tc.end_year >=", value, "endYear");
            return (Criteria) this;
        }

        public Criteria andEndYearLessThan(String value) {
            addCriterion("tc.end_year <", value, "endYear");
            return (Criteria) this;
        }

        public Criteria andEndYearLessThanOrEqualTo(String value) {
            addCriterion("tc.end_year <=", value, "endYear");
            return (Criteria) this;
        }

        public Criteria andEndYearLike(String value) {
            addCriterion("tc.end_year like", value, "endYear");
            return (Criteria) this;
        }

        public Criteria andEndYearNotLike(String value) {
            addCriterion("tc.end_year not like", value, "endYear");
            return (Criteria) this;
        }

        public Criteria andEndYearIn(List<String> values) {
            addCriterion("tc.end_year in", values, "endYear");
            return (Criteria) this;
        }

        public Criteria andEndYearNotIn(List<String> values) {
            addCriterion("tc.end_year not in", values, "endYear");
            return (Criteria) this;
        }

        public Criteria andEndYearBetween(String value1, String value2) {
            addCriterion("tc.end_year between", value1, value2, "endYear");
            return (Criteria) this;
        }

        public Criteria andEndYearNotBetween(String value1, String value2) {
            addCriterion("tc.end_year not between", value1, value2, "endYear");
            return (Criteria) this;
        }

        public Criteria andTermIsNull() {
            addCriterion("tc.term is null");
            return (Criteria) this;
        }

        public Criteria andTermIsNotNull() {
            addCriterion("tc.term is not null");
            return (Criteria) this;
        }

        public Criteria andTermEqualTo(Byte value) {
            addCriterion("tc.term =", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotEqualTo(Byte value) {
            addCriterion("tc.term <>", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThan(Byte value) {
            addCriterion("tc.term >", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThanOrEqualTo(Byte value) {
            addCriterion("tc.term >=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThan(Byte value) {
            addCriterion("tc.term <", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThanOrEqualTo(Byte value) {
            addCriterion("tc.term <=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermIn(List<Byte> values) {
            addCriterion("tc.term in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotIn(List<Byte> values) {
            addCriterion("tc.term not in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermBetween(Byte value1, Byte value2) {
            addCriterion("tc.term between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotBetween(Byte value1, Byte value2) {
            addCriterion("tc.term not between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andCourseIsNull() {
            addCriterion("tc.course is null");
            return (Criteria) this;
        }

        public Criteria andCourseIsNotNull() {
            addCriterion("tc.course is not null");
            return (Criteria) this;
        }

        public Criteria andCourseEqualTo(String value) {
            addCriterion("tc.course =", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotEqualTo(String value) {
            addCriterion("tc.course <>", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseGreaterThan(String value) {
            addCriterion("tc.course >", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseGreaterThanOrEqualTo(String value) {
            addCriterion("tc.course >=", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLessThan(String value) {
            addCriterion("tc.course <", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLessThanOrEqualTo(String value) {
            addCriterion("tc.course <=", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLike(String value) {
            addCriterion("tc.course like", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotLike(String value) {
            addCriterion("tc.course not like", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseIn(List<String> values) {
            addCriterion("tc.course in", values, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotIn(List<String> values) {
            addCriterion("tc.course not in", values, "course");
            return (Criteria) this;
        }

        public Criteria andCourseBetween(String value1, String value2) {
            addCriterion("tc.course between", value1, value2, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotBetween(String value1, String value2) {
            addCriterion("tc.course not between", value1, value2, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNoIsNull() {
            addCriterion("tc.course_no is null");
            return (Criteria) this;
        }

        public Criteria andCourseNoIsNotNull() {
            addCriterion("tc.course_no is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNoEqualTo(String value) {
            addCriterion("tc.course_no =", value, "courseNo");
            return (Criteria) this;
        }

        public Criteria andCourseNoNotEqualTo(String value) {
            addCriterion("tc.course_no <>", value, "courseNo");
            return (Criteria) this;
        }

        public Criteria andCourseNoGreaterThan(String value) {
            addCriterion("tc.course_no >", value, "courseNo");
            return (Criteria) this;
        }

        public Criteria andCourseNoGreaterThanOrEqualTo(String value) {
            addCriterion("tc.course_no >=", value, "courseNo");
            return (Criteria) this;
        }

        public Criteria andCourseNoLessThan(String value) {
            addCriterion("tc.course_no <", value, "courseNo");
            return (Criteria) this;
        }

        public Criteria andCourseNoLessThanOrEqualTo(String value) {
            addCriterion("tc.course_no <=", value, "courseNo");
            return (Criteria) this;
        }

        public Criteria andCourseNoLike(String value) {
            addCriterion("tc.course_no like", value, "courseNo");
            return (Criteria) this;
        }

        public Criteria andCourseNoNotLike(String value) {
            addCriterion("tc.course_no not like", value, "courseNo");
            return (Criteria) this;
        }

        public Criteria andCourseNoIn(List<String> values) {
            addCriterion("tc.course_no in", values, "courseNo");
            return (Criteria) this;
        }

        public Criteria andCourseNoNotIn(List<String> values) {
            addCriterion("tc.course_no not in", values, "courseNo");
            return (Criteria) this;
        }

        public Criteria andCourseNoBetween(String value1, String value2) {
            addCriterion("tc.course_no between", value1, value2, "courseNo");
            return (Criteria) this;
        }

        public Criteria andCourseNoNotBetween(String value1, String value2) {
            addCriterion("tc.course_no not between", value1, value2, "courseNo");
            return (Criteria) this;
        }

        public Criteria andCourseOrderIsNull() {
            addCriterion("tc.course_order is null");
            return (Criteria) this;
        }

        public Criteria andCourseOrderIsNotNull() {
            addCriterion("tc.course_order is not null");
            return (Criteria) this;
        }

        public Criteria andCourseOrderEqualTo(String value) {
            addCriterion("tc.course_order =", value, "courseOrder");
            return (Criteria) this;
        }

        public Criteria andCourseOrderNotEqualTo(String value) {
            addCriterion("tc.course_order <>", value, "courseOrder");
            return (Criteria) this;
        }

        public Criteria andCourseOrderGreaterThan(String value) {
            addCriterion("tc.course_order >", value, "courseOrder");
            return (Criteria) this;
        }

        public Criteria andCourseOrderGreaterThanOrEqualTo(String value) {
            addCriterion("tc.course_order >=", value, "courseOrder");
            return (Criteria) this;
        }

        public Criteria andCourseOrderLessThan(String value) {
            addCriterion("tc.course_order <", value, "courseOrder");
            return (Criteria) this;
        }

        public Criteria andCourseOrderLessThanOrEqualTo(String value) {
            addCriterion("tc.course_order <=", value, "courseOrder");
            return (Criteria) this;
        }

        public Criteria andCourseOrderLike(String value) {
            addCriterion("tc.course_order like", value, "courseOrder");
            return (Criteria) this;
        }

        public Criteria andCourseOrderNotLike(String value) {
            addCriterion("tc.course_order not like", value, "courseOrder");
            return (Criteria) this;
        }

        public Criteria andCourseOrderIn(List<String> values) {
            addCriterion("tc.course_order in", values, "courseOrder");
            return (Criteria) this;
        }

        public Criteria andCourseOrderNotIn(List<String> values) {
            addCriterion("tc.course_order not in", values, "courseOrder");
            return (Criteria) this;
        }

        public Criteria andCourseOrderBetween(String value1, String value2) {
            addCriterion("tc.course_order between", value1, value2, "courseOrder");
            return (Criteria) this;
        }

        public Criteria andCourseOrderNotBetween(String value1, String value2) {
            addCriterion("tc.course_order not between", value1, value2, "courseOrder");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("tc.major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("tc.major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("tc.major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("tc.major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("tc.major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("tc.major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("tc.major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("tc.major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("tc.major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("tc.major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("tc.major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("tc.major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("tc.major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("tc.major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andClassesIsNull() {
            addCriterion("tc.classes is null");
            return (Criteria) this;
        }

        public Criteria andClassesIsNotNull() {
            addCriterion("tc.classes is not null");
            return (Criteria) this;
        }

        public Criteria andClassesEqualTo(String value) {
            addCriterion("tc.classes =", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotEqualTo(String value) {
            addCriterion("tc.classes <>", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThan(String value) {
            addCriterion("tc.classes >", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThanOrEqualTo(String value) {
            addCriterion("tc.classes >=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThan(String value) {
            addCriterion("tc.classes <", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThanOrEqualTo(String value) {
            addCriterion("tc.classes <=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLike(String value) {
            addCriterion("tc.classes like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotLike(String value) {
            addCriterion("tc.classes not like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesIn(List<String> values) {
            addCriterion("tc.classes in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotIn(List<String> values) {
            addCriterion("tc.classes not in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesBetween(String value1, String value2) {
            addCriterion("tc.classes between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotBetween(String value1, String value2) {
            addCriterion("tc.classes not between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("tc.number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("tc.number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("tc.number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("tc.number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("tc.number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("tc.number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("tc.number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("tc.number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("tc.number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("tc.number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("tc.number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("tc.number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNull() {
            addCriterion("tc.orders is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNotNull() {
            addCriterion("tc.orders is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersEqualTo(Long value) {
            addCriterion("tc.orders =", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotEqualTo(Long value) {
            addCriterion("tc.orders <>", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThan(Long value) {
            addCriterion("tc.orders >", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThanOrEqualTo(Long value) {
            addCriterion("tc.orders >=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThan(Long value) {
            addCriterion("tc.orders <", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThanOrEqualTo(Long value) {
            addCriterion("tc.orders <=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersIn(List<Long> values) {
            addCriterion("tc.orders in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotIn(List<Long> values) {
            addCriterion("tc.orders not in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersBetween(Long value1, Long value2) {
            addCriterion("tc.orders between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotBetween(Long value1, Long value2) {
            addCriterion("tc.orders not between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("tc.ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("tc.ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Long value) {
            addCriterion("tc.ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Long value) {
            addCriterion("tc.ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Long value) {
            addCriterion("tc.ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Long value) {
            addCriterion("tc.ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Long value) {
            addCriterion("tc.ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Long value) {
            addCriterion("tc.ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Long> values) {
            addCriterion("tc.ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Long> values) {
            addCriterion("tc.ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Long value1, Long value2) {
            addCriterion("tc.ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Long value1, Long value2) {
            addCriterion("tc.ctime not between", value1, value2, "ctime");
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