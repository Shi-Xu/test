package com.xt.feedback.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FbTeachingQuDOExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public static final String TALIAS = "tq";

    private Integer limit;

    private Integer offset;

    private Object resultColumns;

    public FbTeachingQuDOExample() {
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

        public Criteria andTchQuIdIsNull() {
            addCriterion("tq.tch_qu_id is null");
            return (Criteria) this;
        }

        public Criteria andTchQuIdIsNotNull() {
            addCriterion("tq.tch_qu_id is not null");
            return (Criteria) this;
        }

        public Criteria andTchQuIdEqualTo(Integer value) {
            addCriterion("tq.tch_qu_id =", value, "tchQuId");
            return (Criteria) this;
        }

        public Criteria andTchQuIdNotEqualTo(Integer value) {
            addCriterion("tq.tch_qu_id <>", value, "tchQuId");
            return (Criteria) this;
        }

        public Criteria andTchQuIdGreaterThan(Integer value) {
            addCriterion("tq.tch_qu_id >", value, "tchQuId");
            return (Criteria) this;
        }

        public Criteria andTchQuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tq.tch_qu_id >=", value, "tchQuId");
            return (Criteria) this;
        }

        public Criteria andTchQuIdLessThan(Integer value) {
            addCriterion("tq.tch_qu_id <", value, "tchQuId");
            return (Criteria) this;
        }

        public Criteria andTchQuIdLessThanOrEqualTo(Integer value) {
            addCriterion("tq.tch_qu_id <=", value, "tchQuId");
            return (Criteria) this;
        }

        public Criteria andTchQuIdIn(List<Integer> values) {
            addCriterion("tq.tch_qu_id in", values, "tchQuId");
            return (Criteria) this;
        }

        public Criteria andTchQuIdNotIn(List<Integer> values) {
            addCriterion("tq.tch_qu_id not in", values, "tchQuId");
            return (Criteria) this;
        }

        public Criteria andTchQuIdBetween(Integer value1, Integer value2) {
            addCriterion("tq.tch_qu_id between", value1, value2, "tchQuId");
            return (Criteria) this;
        }

        public Criteria andTchQuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tq.tch_qu_id not between", value1, value2, "tchQuId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdIsNull() {
            addCriterion("tq.teaching_id is null");
            return (Criteria) this;
        }

        public Criteria andTeachingIdIsNotNull() {
            addCriterion("tq.teaching_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingIdEqualTo(Integer value) {
            addCriterion("tq.teaching_id =", value, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdNotEqualTo(Integer value) {
            addCriterion("tq.teaching_id <>", value, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdGreaterThan(Integer value) {
            addCriterion("tq.teaching_id >", value, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tq.teaching_id >=", value, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdLessThan(Integer value) {
            addCriterion("tq.teaching_id <", value, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdLessThanOrEqualTo(Integer value) {
            addCriterion("tq.teaching_id <=", value, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdIn(List<Integer> values) {
            addCriterion("tq.teaching_id in", values, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdNotIn(List<Integer> values) {
            addCriterion("tq.teaching_id not in", values, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdBetween(Integer value1, Integer value2) {
            addCriterion("tq.teaching_id between", value1, value2, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tq.teaching_id not between", value1, value2, "teachingId");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireIdIsNull() {
            addCriterion("tq.questionnaire_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireIdIsNotNull() {
            addCriterion("tq.questionnaire_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireIdEqualTo(Integer value) {
            addCriterion("tq.questionnaire_id =", value, "questionnaireId");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireIdNotEqualTo(Integer value) {
            addCriterion("tq.questionnaire_id <>", value, "questionnaireId");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireIdGreaterThan(Integer value) {
            addCriterion("tq.questionnaire_id >", value, "questionnaireId");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tq.questionnaire_id >=", value, "questionnaireId");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireIdLessThan(Integer value) {
            addCriterion("tq.questionnaire_id <", value, "questionnaireId");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireIdLessThanOrEqualTo(Integer value) {
            addCriterion("tq.questionnaire_id <=", value, "questionnaireId");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireIdIn(List<Integer> values) {
            addCriterion("tq.questionnaire_id in", values, "questionnaireId");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireIdNotIn(List<Integer> values) {
            addCriterion("tq.questionnaire_id not in", values, "questionnaireId");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireIdBetween(Integer value1, Integer value2) {
            addCriterion("tq.questionnaire_id between", value1, value2, "questionnaireId");
            return (Criteria) this;
        }

        public Criteria andQuestionnaireIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tq.questionnaire_id not between", value1, value2, "questionnaireId");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("tq.active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("tq.active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Byte value) {
            addCriterion("tq.active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Byte value) {
            addCriterion("tq.active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Byte value) {
            addCriterion("tq.active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Byte value) {
            addCriterion("tq.active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Byte value) {
            addCriterion("tq.active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Byte value) {
            addCriterion("tq.active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Byte> values) {
            addCriterion("tq.active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Byte> values) {
            addCriterion("tq.active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Byte value1, Byte value2) {
            addCriterion("tq.active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Byte value1, Byte value2) {
            addCriterion("tq.active not between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNull() {
            addCriterion("tq.orders is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNotNull() {
            addCriterion("tq.orders is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersEqualTo(Long value) {
            addCriterion("tq.orders =", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotEqualTo(Long value) {
            addCriterion("tq.orders <>", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThan(Long value) {
            addCriterion("tq.orders >", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThanOrEqualTo(Long value) {
            addCriterion("tq.orders >=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThan(Long value) {
            addCriterion("tq.orders <", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThanOrEqualTo(Long value) {
            addCriterion("tq.orders <=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersIn(List<Long> values) {
            addCriterion("tq.orders in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotIn(List<Long> values) {
            addCriterion("tq.orders not in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersBetween(Long value1, Long value2) {
            addCriterion("tq.orders between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotBetween(Long value1, Long value2) {
            addCriterion("tq.orders not between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("tq.ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("tq.ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Long value) {
            addCriterion("tq.ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Long value) {
            addCriterion("tq.ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Long value) {
            addCriterion("tq.ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Long value) {
            addCriterion("tq.ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Long value) {
            addCriterion("tq.ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Long value) {
            addCriterion("tq.ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Long> values) {
            addCriterion("tq.ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Long> values) {
            addCriterion("tq.ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Long value1, Long value2) {
            addCriterion("tq.ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Long value1, Long value2) {
            addCriterion("tq.ctime not between", value1, value2, "ctime");
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