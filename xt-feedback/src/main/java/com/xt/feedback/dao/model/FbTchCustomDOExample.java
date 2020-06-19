package com.xt.feedback.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FbTchCustomDOExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public static final String TALIAS = "null";

    private Integer limit;

    private Integer offset;

    private Object resultColumns;

    public FbTchCustomDOExample() {
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

        public Criteria andFbTchCustomIsNull() {
            addCriterion("fb_tch_custom is null");
            return (Criteria) this;
        }

        public Criteria andFbTchCustomIsNotNull() {
            addCriterion("fb_tch_custom is not null");
            return (Criteria) this;
        }

        public Criteria andFbTchCustomEqualTo(Integer value) {
            addCriterion("fb_tch_custom =", value, "fbTchCustom");
            return (Criteria) this;
        }

        public Criteria andFbTchCustomNotEqualTo(Integer value) {
            addCriterion("fb_tch_custom <>", value, "fbTchCustom");
            return (Criteria) this;
        }

        public Criteria andFbTchCustomGreaterThan(Integer value) {
            addCriterion("fb_tch_custom >", value, "fbTchCustom");
            return (Criteria) this;
        }

        public Criteria andFbTchCustomGreaterThanOrEqualTo(Integer value) {
            addCriterion("fb_tch_custom >=", value, "fbTchCustom");
            return (Criteria) this;
        }

        public Criteria andFbTchCustomLessThan(Integer value) {
            addCriterion("fb_tch_custom <", value, "fbTchCustom");
            return (Criteria) this;
        }

        public Criteria andFbTchCustomLessThanOrEqualTo(Integer value) {
            addCriterion("fb_tch_custom <=", value, "fbTchCustom");
            return (Criteria) this;
        }

        public Criteria andFbTchCustomIn(List<Integer> values) {
            addCriterion("fb_tch_custom in", values, "fbTchCustom");
            return (Criteria) this;
        }

        public Criteria andFbTchCustomNotIn(List<Integer> values) {
            addCriterion("fb_tch_custom not in", values, "fbTchCustom");
            return (Criteria) this;
        }

        public Criteria andFbTchCustomBetween(Integer value1, Integer value2) {
            addCriterion("fb_tch_custom between", value1, value2, "fbTchCustom");
            return (Criteria) this;
        }

        public Criteria andFbTchCustomNotBetween(Integer value1, Integer value2) {
            addCriterion("fb_tch_custom not between", value1, value2, "fbTchCustom");
            return (Criteria) this;
        }

        public Criteria andSingleIsNull() {
            addCriterion("single is null");
            return (Criteria) this;
        }

        public Criteria andSingleIsNotNull() {
            addCriterion("single is not null");
            return (Criteria) this;
        }

        public Criteria andSingleEqualTo(String value) {
            addCriterion("single =", value, "single");
            return (Criteria) this;
        }

        public Criteria andSingleNotEqualTo(String value) {
            addCriterion("single <>", value, "single");
            return (Criteria) this;
        }

        public Criteria andSingleGreaterThan(String value) {
            addCriterion("single >", value, "single");
            return (Criteria) this;
        }

        public Criteria andSingleGreaterThanOrEqualTo(String value) {
            addCriterion("single >=", value, "single");
            return (Criteria) this;
        }

        public Criteria andSingleLessThan(String value) {
            addCriterion("single <", value, "single");
            return (Criteria) this;
        }

        public Criteria andSingleLessThanOrEqualTo(String value) {
            addCriterion("single <=", value, "single");
            return (Criteria) this;
        }

        public Criteria andSingleLike(String value) {
            addCriterion("single like", value, "single");
            return (Criteria) this;
        }

        public Criteria andSingleNotLike(String value) {
            addCriterion("single not like", value, "single");
            return (Criteria) this;
        }

        public Criteria andSingleIn(List<String> values) {
            addCriterion("single in", values, "single");
            return (Criteria) this;
        }

        public Criteria andSingleNotIn(List<String> values) {
            addCriterion("single not in", values, "single");
            return (Criteria) this;
        }

        public Criteria andSingleBetween(String value1, String value2) {
            addCriterion("single between", value1, value2, "single");
            return (Criteria) this;
        }

        public Criteria andSingleNotBetween(String value1, String value2) {
            addCriterion("single not between", value1, value2, "single");
            return (Criteria) this;
        }

        public Criteria andMutipleIsNull() {
            addCriterion("mutiple is null");
            return (Criteria) this;
        }

        public Criteria andMutipleIsNotNull() {
            addCriterion("mutiple is not null");
            return (Criteria) this;
        }

        public Criteria andMutipleEqualTo(String value) {
            addCriterion("mutiple =", value, "mutiple");
            return (Criteria) this;
        }

        public Criteria andMutipleNotEqualTo(String value) {
            addCriterion("mutiple <>", value, "mutiple");
            return (Criteria) this;
        }

        public Criteria andMutipleGreaterThan(String value) {
            addCriterion("mutiple >", value, "mutiple");
            return (Criteria) this;
        }

        public Criteria andMutipleGreaterThanOrEqualTo(String value) {
            addCriterion("mutiple >=", value, "mutiple");
            return (Criteria) this;
        }

        public Criteria andMutipleLessThan(String value) {
            addCriterion("mutiple <", value, "mutiple");
            return (Criteria) this;
        }

        public Criteria andMutipleLessThanOrEqualTo(String value) {
            addCriterion("mutiple <=", value, "mutiple");
            return (Criteria) this;
        }

        public Criteria andMutipleLike(String value) {
            addCriterion("mutiple like", value, "mutiple");
            return (Criteria) this;
        }

        public Criteria andMutipleNotLike(String value) {
            addCriterion("mutiple not like", value, "mutiple");
            return (Criteria) this;
        }

        public Criteria andMutipleIn(List<String> values) {
            addCriterion("mutiple in", values, "mutiple");
            return (Criteria) this;
        }

        public Criteria andMutipleNotIn(List<String> values) {
            addCriterion("mutiple not in", values, "mutiple");
            return (Criteria) this;
        }

        public Criteria andMutipleBetween(String value1, String value2) {
            addCriterion("mutiple between", value1, value2, "mutiple");
            return (Criteria) this;
        }

        public Criteria andMutipleNotBetween(String value1, String value2) {
            addCriterion("mutiple not between", value1, value2, "mutiple");
            return (Criteria) this;
        }

        public Criteria andFbTeacherIdIsNull() {
            addCriterion("fb_teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andFbTeacherIdIsNotNull() {
            addCriterion("fb_teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andFbTeacherIdEqualTo(Integer value) {
            addCriterion("fb_teacher_id =", value, "fbTeacherId");
            return (Criteria) this;
        }

        public Criteria andFbTeacherIdNotEqualTo(Integer value) {
            addCriterion("fb_teacher_id <>", value, "fbTeacherId");
            return (Criteria) this;
        }

        public Criteria andFbTeacherIdGreaterThan(Integer value) {
            addCriterion("fb_teacher_id >", value, "fbTeacherId");
            return (Criteria) this;
        }

        public Criteria andFbTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fb_teacher_id >=", value, "fbTeacherId");
            return (Criteria) this;
        }

        public Criteria andFbTeacherIdLessThan(Integer value) {
            addCriterion("fb_teacher_id <", value, "fbTeacherId");
            return (Criteria) this;
        }

        public Criteria andFbTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("fb_teacher_id <=", value, "fbTeacherId");
            return (Criteria) this;
        }

        public Criteria andFbTeacherIdIn(List<Integer> values) {
            addCriterion("fb_teacher_id in", values, "fbTeacherId");
            return (Criteria) this;
        }

        public Criteria andFbTeacherIdNotIn(List<Integer> values) {
            addCriterion("fb_teacher_id not in", values, "fbTeacherId");
            return (Criteria) this;
        }

        public Criteria andFbTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("fb_teacher_id between", value1, value2, "fbTeacherId");
            return (Criteria) this;
        }

        public Criteria andFbTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fb_teacher_id not between", value1, value2, "fbTeacherId");
            return (Criteria) this;
        }

        public Criteria andFbTchIdIsNull() {
            addCriterion("fb_tch_id is null");
            return (Criteria) this;
        }

        public Criteria andFbTchIdIsNotNull() {
            addCriterion("fb_tch_id is not null");
            return (Criteria) this;
        }

        public Criteria andFbTchIdEqualTo(Integer value) {
            addCriterion("fb_tch_id =", value, "fbTchId");
            return (Criteria) this;
        }

        public Criteria andFbTchIdNotEqualTo(Integer value) {
            addCriterion("fb_tch_id <>", value, "fbTchId");
            return (Criteria) this;
        }

        public Criteria andFbTchIdGreaterThan(Integer value) {
            addCriterion("fb_tch_id >", value, "fbTchId");
            return (Criteria) this;
        }

        public Criteria andFbTchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fb_tch_id >=", value, "fbTchId");
            return (Criteria) this;
        }

        public Criteria andFbTchIdLessThan(Integer value) {
            addCriterion("fb_tch_id <", value, "fbTchId");
            return (Criteria) this;
        }

        public Criteria andFbTchIdLessThanOrEqualTo(Integer value) {
            addCriterion("fb_tch_id <=", value, "fbTchId");
            return (Criteria) this;
        }

        public Criteria andFbTchIdIn(List<Integer> values) {
            addCriterion("fb_tch_id in", values, "fbTchId");
            return (Criteria) this;
        }

        public Criteria andFbTchIdNotIn(List<Integer> values) {
            addCriterion("fb_tch_id not in", values, "fbTchId");
            return (Criteria) this;
        }

        public Criteria andFbTchIdBetween(Integer value1, Integer value2) {
            addCriterion("fb_tch_id between", value1, value2, "fbTchId");
            return (Criteria) this;
        }

        public Criteria andFbTchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fb_tch_id not between", value1, value2, "fbTchId");
            return (Criteria) this;
        }

        public Criteria andCouresOrderIsNull() {
            addCriterion("coures_order is null");
            return (Criteria) this;
        }

        public Criteria andCouresOrderIsNotNull() {
            addCriterion("coures_order is not null");
            return (Criteria) this;
        }

        public Criteria andCouresOrderEqualTo(String value) {
            addCriterion("coures_order =", value, "couresOrder");
            return (Criteria) this;
        }

        public Criteria andCouresOrderNotEqualTo(String value) {
            addCriterion("coures_order <>", value, "couresOrder");
            return (Criteria) this;
        }

        public Criteria andCouresOrderGreaterThan(String value) {
            addCriterion("coures_order >", value, "couresOrder");
            return (Criteria) this;
        }

        public Criteria andCouresOrderGreaterThanOrEqualTo(String value) {
            addCriterion("coures_order >=", value, "couresOrder");
            return (Criteria) this;
        }

        public Criteria andCouresOrderLessThan(String value) {
            addCriterion("coures_order <", value, "couresOrder");
            return (Criteria) this;
        }

        public Criteria andCouresOrderLessThanOrEqualTo(String value) {
            addCriterion("coures_order <=", value, "couresOrder");
            return (Criteria) this;
        }

        public Criteria andCouresOrderLike(String value) {
            addCriterion("coures_order like", value, "couresOrder");
            return (Criteria) this;
        }

        public Criteria andCouresOrderNotLike(String value) {
            addCriterion("coures_order not like", value, "couresOrder");
            return (Criteria) this;
        }

        public Criteria andCouresOrderIn(List<String> values) {
            addCriterion("coures_order in", values, "couresOrder");
            return (Criteria) this;
        }

        public Criteria andCouresOrderNotIn(List<String> values) {
            addCriterion("coures_order not in", values, "couresOrder");
            return (Criteria) this;
        }

        public Criteria andCouresOrderBetween(String value1, String value2) {
            addCriterion("coures_order between", value1, value2, "couresOrder");
            return (Criteria) this;
        }

        public Criteria andCouresOrderNotBetween(String value1, String value2) {
            addCriterion("coures_order not between", value1, value2, "couresOrder");
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