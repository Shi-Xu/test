package com.xt.feedback.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FbResultDOExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public static final String TALIAS = "rs";

    private Integer limit;

    private Integer offset;

    private Object resultColumns;

    public FbResultDOExample() {
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

        public Criteria andRIdIsNull() {
            addCriterion("rs.r_id is null");
            return (Criteria) this;
        }

        public Criteria andRIdIsNotNull() {
            addCriterion("rs.r_id is not null");
            return (Criteria) this;
        }

        public Criteria andRIdEqualTo(Integer value) {
            addCriterion("rs.r_id =", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotEqualTo(Integer value) {
            addCriterion("rs.r_id <>", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThan(Integer value) {
            addCriterion("rs.r_id >", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rs.r_id >=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThan(Integer value) {
            addCriterion("rs.r_id <", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThanOrEqualTo(Integer value) {
            addCriterion("rs.r_id <=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdIn(List<Integer> values) {
            addCriterion("rs.r_id in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotIn(List<Integer> values) {
            addCriterion("rs.r_id not in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdBetween(Integer value1, Integer value2) {
            addCriterion("rs.r_id between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rs.r_id not between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andTchQuIdIsNull() {
            addCriterion("rs.tch_qu_id is null");
            return (Criteria) this;
        }

        public Criteria andTchQuIdIsNotNull() {
            addCriterion("rs.tch_qu_id is not null");
            return (Criteria) this;
        }

        public Criteria andTchQuIdEqualTo(Integer value) {
            addCriterion("rs.tch_qu_id =", value, "tchQuId");
            return (Criteria) this;
        }

        public Criteria andTchQuIdNotEqualTo(Integer value) {
            addCriterion("rs.tch_qu_id <>", value, "tchQuId");
            return (Criteria) this;
        }

        public Criteria andTchQuIdGreaterThan(Integer value) {
            addCriterion("rs.tch_qu_id >", value, "tchQuId");
            return (Criteria) this;
        }

        public Criteria andTchQuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rs.tch_qu_id >=", value, "tchQuId");
            return (Criteria) this;
        }

        public Criteria andTchQuIdLessThan(Integer value) {
            addCriterion("rs.tch_qu_id <", value, "tchQuId");
            return (Criteria) this;
        }

        public Criteria andTchQuIdLessThanOrEqualTo(Integer value) {
            addCriterion("rs.tch_qu_id <=", value, "tchQuId");
            return (Criteria) this;
        }

        public Criteria andTchQuIdIn(List<Integer> values) {
            addCriterion("rs.tch_qu_id in", values, "tchQuId");
            return (Criteria) this;
        }

        public Criteria andTchQuIdNotIn(List<Integer> values) {
            addCriterion("rs.tch_qu_id not in", values, "tchQuId");
            return (Criteria) this;
        }

        public Criteria andTchQuIdBetween(Integer value1, Integer value2) {
            addCriterion("rs.tch_qu_id between", value1, value2, "tchQuId");
            return (Criteria) this;
        }

        public Criteria andTchQuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rs.tch_qu_id not between", value1, value2, "tchQuId");
            return (Criteria) this;
        }

        public Criteria andFixResultIsNull() {
            addCriterion("rs.fix_result is null");
            return (Criteria) this;
        }

        public Criteria andFixResultIsNotNull() {
            addCriterion("rs.fix_result is not null");
            return (Criteria) this;
        }

        public Criteria andFixResultEqualTo(String value) {
            addCriterion("rs.fix_result =", value, "fixResult");
            return (Criteria) this;
        }

        public Criteria andFixResultNotEqualTo(String value) {
            addCriterion("rs.fix_result <>", value, "fixResult");
            return (Criteria) this;
        }

        public Criteria andFixResultGreaterThan(String value) {
            addCriterion("rs.fix_result >", value, "fixResult");
            return (Criteria) this;
        }

        public Criteria andFixResultGreaterThanOrEqualTo(String value) {
            addCriterion("rs.fix_result >=", value, "fixResult");
            return (Criteria) this;
        }

        public Criteria andFixResultLessThan(String value) {
            addCriterion("rs.fix_result <", value, "fixResult");
            return (Criteria) this;
        }

        public Criteria andFixResultLessThanOrEqualTo(String value) {
            addCriterion("rs.fix_result <=", value, "fixResult");
            return (Criteria) this;
        }

        public Criteria andFixResultLike(String value) {
            addCriterion("rs.fix_result like", value, "fixResult");
            return (Criteria) this;
        }

        public Criteria andFixResultNotLike(String value) {
            addCriterion("rs.fix_result not like", value, "fixResult");
            return (Criteria) this;
        }

        public Criteria andFixResultIn(List<String> values) {
            addCriterion("rs.fix_result in", values, "fixResult");
            return (Criteria) this;
        }

        public Criteria andFixResultNotIn(List<String> values) {
            addCriterion("rs.fix_result not in", values, "fixResult");
            return (Criteria) this;
        }

        public Criteria andFixResultBetween(String value1, String value2) {
            addCriterion("rs.fix_result between", value1, value2, "fixResult");
            return (Criteria) this;
        }

        public Criteria andFixResultNotBetween(String value1, String value2) {
            addCriterion("rs.fix_result not between", value1, value2, "fixResult");
            return (Criteria) this;
        }

        public Criteria andFreeResultIsNull() {
            addCriterion("rs.free_result is null");
            return (Criteria) this;
        }

        public Criteria andFreeResultIsNotNull() {
            addCriterion("rs.free_result is not null");
            return (Criteria) this;
        }

        public Criteria andFreeResultEqualTo(String value) {
            addCriterion("rs.free_result =", value, "freeResult");
            return (Criteria) this;
        }

        public Criteria andFreeResultNotEqualTo(String value) {
            addCriterion("rs.free_result <>", value, "freeResult");
            return (Criteria) this;
        }

        public Criteria andFreeResultGreaterThan(String value) {
            addCriterion("rs.free_result >", value, "freeResult");
            return (Criteria) this;
        }

        public Criteria andFreeResultGreaterThanOrEqualTo(String value) {
            addCriterion("rs.free_result >=", value, "freeResult");
            return (Criteria) this;
        }

        public Criteria andFreeResultLessThan(String value) {
            addCriterion("rs.free_result <", value, "freeResult");
            return (Criteria) this;
        }

        public Criteria andFreeResultLessThanOrEqualTo(String value) {
            addCriterion("rs.free_result <=", value, "freeResult");
            return (Criteria) this;
        }

        public Criteria andFreeResultLike(String value) {
            addCriterion("rs.free_result like", value, "freeResult");
            return (Criteria) this;
        }

        public Criteria andFreeResultNotLike(String value) {
            addCriterion("rs.free_result not like", value, "freeResult");
            return (Criteria) this;
        }

        public Criteria andFreeResultIn(List<String> values) {
            addCriterion("rs.free_result in", values, "freeResult");
            return (Criteria) this;
        }

        public Criteria andFreeResultNotIn(List<String> values) {
            addCriterion("rs.free_result not in", values, "freeResult");
            return (Criteria) this;
        }

        public Criteria andFreeResultBetween(String value1, String value2) {
            addCriterion("rs.free_result between", value1, value2, "freeResult");
            return (Criteria) this;
        }

        public Criteria andFreeResultNotBetween(String value1, String value2) {
            addCriterion("rs.free_result not between", value1, value2, "freeResult");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("rs.ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("rs.ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("rs.ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("rs.ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("rs.ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("rs.ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("rs.ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("rs.ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("rs.ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("rs.ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("rs.ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("rs.ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("rs.ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("rs.ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNull() {
            addCriterion("rs.orders is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNotNull() {
            addCriterion("rs.orders is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersEqualTo(Long value) {
            addCriterion("rs.orders =", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotEqualTo(Long value) {
            addCriterion("rs.orders <>", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThan(Long value) {
            addCriterion("rs.orders >", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThanOrEqualTo(Long value) {
            addCriterion("rs.orders >=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThan(Long value) {
            addCriterion("rs.orders <", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThanOrEqualTo(Long value) {
            addCriterion("rs.orders <=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersIn(List<Long> values) {
            addCriterion("rs.orders in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotIn(List<Long> values) {
            addCriterion("rs.orders not in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersBetween(Long value1, Long value2) {
            addCriterion("rs.orders between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotBetween(Long value1, Long value2) {
            addCriterion("rs.orders not between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("rs.ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("rs.ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Long value) {
            addCriterion("rs.ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Long value) {
            addCriterion("rs.ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Long value) {
            addCriterion("rs.ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Long value) {
            addCriterion("rs.ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Long value) {
            addCriterion("rs.ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Long value) {
            addCriterion("rs.ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Long> values) {
            addCriterion("rs.ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Long> values) {
            addCriterion("rs.ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Long value1, Long value2) {
            addCriterion("rs.ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Long value1, Long value2) {
            addCriterion("rs.ctime not between", value1, value2, "ctime");
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