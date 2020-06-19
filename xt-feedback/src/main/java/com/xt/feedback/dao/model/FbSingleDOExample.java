package com.xt.feedback.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FbSingleDOExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public static final String TALIAS = "sg";

    private Integer limit;

    private Integer offset;

    private Object resultColumns;

    public FbSingleDOExample() {
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

        public Criteria andSingleIdIsNull() {
            addCriterion("sg.single_id is null");
            return (Criteria) this;
        }

        public Criteria andSingleIdIsNotNull() {
            addCriterion("sg.single_id is not null");
            return (Criteria) this;
        }

        public Criteria andSingleIdEqualTo(Integer value) {
            addCriterion("sg.single_id =", value, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdNotEqualTo(Integer value) {
            addCriterion("sg.single_id <>", value, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdGreaterThan(Integer value) {
            addCriterion("sg.single_id >", value, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sg.single_id >=", value, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdLessThan(Integer value) {
            addCriterion("sg.single_id <", value, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdLessThanOrEqualTo(Integer value) {
            addCriterion("sg.single_id <=", value, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdIn(List<Integer> values) {
            addCriterion("sg.single_id in", values, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdNotIn(List<Integer> values) {
            addCriterion("sg.single_id not in", values, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdBetween(Integer value1, Integer value2) {
            addCriterion("sg.single_id between", value1, value2, "singleId");
            return (Criteria) this;
        }

        public Criteria andSingleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sg.single_id not between", value1, value2, "singleId");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("sg.uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("sg.uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("sg.uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("sg.uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("sg.uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("sg.uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("sg.uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("sg.uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("sg.uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("sg.uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("sg.uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("sg.uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("sg.uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("sg.uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andPartIdIsNull() {
            addCriterion("sg.part_id is null");
            return (Criteria) this;
        }

        public Criteria andPartIdIsNotNull() {
            addCriterion("sg.part_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartIdEqualTo(Integer value) {
            addCriterion("sg.part_id =", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotEqualTo(Integer value) {
            addCriterion("sg.part_id <>", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdGreaterThan(Integer value) {
            addCriterion("sg.part_id >", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sg.part_id >=", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdLessThan(Integer value) {
            addCriterion("sg.part_id <", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdLessThanOrEqualTo(Integer value) {
            addCriterion("sg.part_id <=", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdIn(List<Integer> values) {
            addCriterion("sg.part_id in", values, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotIn(List<Integer> values) {
            addCriterion("sg.part_id not in", values, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdBetween(Integer value1, Integer value2) {
            addCriterion("sg.part_id between", value1, value2, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sg.part_id not between", value1, value2, "partId");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("sg.content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("sg.content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("sg.content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("sg.content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("sg.content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("sg.content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("sg.content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("sg.content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("sg.content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("sg.content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("sg.content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("sg.content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("sg.content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("sg.content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sg.sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sg.sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sg.sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sg.sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sg.sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sg.sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sg.sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sg.sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sg.sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sg.sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sg.sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sg.sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andQtypeIsNull() {
            addCriterion("sg.qtype is null");
            return (Criteria) this;
        }

        public Criteria andQtypeIsNotNull() {
            addCriterion("sg.qtype is not null");
            return (Criteria) this;
        }

        public Criteria andQtypeEqualTo(Byte value) {
            addCriterion("sg.qtype =", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeNotEqualTo(Byte value) {
            addCriterion("sg.qtype <>", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeGreaterThan(Byte value) {
            addCriterion("sg.qtype >", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("sg.qtype >=", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeLessThan(Byte value) {
            addCriterion("sg.qtype <", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeLessThanOrEqualTo(Byte value) {
            addCriterion("sg.qtype <=", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeIn(List<Byte> values) {
            addCriterion("sg.qtype in", values, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeNotIn(List<Byte> values) {
            addCriterion("sg.qtype not in", values, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeBetween(Byte value1, Byte value2) {
            addCriterion("sg.qtype between", value1, value2, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeNotBetween(Byte value1, Byte value2) {
            addCriterion("sg.qtype not between", value1, value2, "qtype");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNull() {
            addCriterion("sg.orders is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNotNull() {
            addCriterion("sg.orders is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersEqualTo(Long value) {
            addCriterion("sg.orders =", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotEqualTo(Long value) {
            addCriterion("sg.orders <>", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThan(Long value) {
            addCriterion("sg.orders >", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThanOrEqualTo(Long value) {
            addCriterion("sg.orders >=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThan(Long value) {
            addCriterion("sg.orders <", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThanOrEqualTo(Long value) {
            addCriterion("sg.orders <=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersIn(List<Long> values) {
            addCriterion("sg.orders in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotIn(List<Long> values) {
            addCriterion("sg.orders not in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersBetween(Long value1, Long value2) {
            addCriterion("sg.orders between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotBetween(Long value1, Long value2) {
            addCriterion("sg.orders not between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("sg.ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("sg.ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Long value) {
            addCriterion("sg.ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Long value) {
            addCriterion("sg.ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Long value) {
            addCriterion("sg.ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Long value) {
            addCriterion("sg.ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Long value) {
            addCriterion("sg.ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Long value) {
            addCriterion("sg.ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Long> values) {
            addCriterion("sg.ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Long> values) {
            addCriterion("sg.ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Long value1, Long value2) {
            addCriterion("sg.ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Long value1, Long value2) {
            addCriterion("sg.ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andTeachingIdIsNull() {
            addCriterion("sg.teaching_id is null");
            return (Criteria) this;
        }

        public Criteria andTeachingIdIsNotNull() {
            addCriterion("sg.teaching_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingIdEqualTo(Integer value) {
            addCriterion("sg.teaching_id =", value, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdNotEqualTo(Integer value) {
            addCriterion("sg.teaching_id <>", value, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdGreaterThan(Integer value) {
            addCriterion("sg.teaching_id >", value, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sg.teaching_id >=", value, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdLessThan(Integer value) {
            addCriterion("sg.teaching_id <", value, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdLessThanOrEqualTo(Integer value) {
            addCriterion("sg.teaching_id <=", value, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdIn(List<Integer> values) {
            addCriterion("sg.teaching_id in", values, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdNotIn(List<Integer> values) {
            addCriterion("sg.teaching_id not in", values, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdBetween(Integer value1, Integer value2) {
            addCriterion("sg.teaching_id between", value1, value2, "teachingId");
            return (Criteria) this;
        }

        public Criteria andTeachingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sg.teaching_id not between", value1, value2, "teachingId");
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