package com.xmz.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CdExample() {
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

    protected abstract static class GeneratedCriteria {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCdNumberIsNull() {
            addCriterion("cd_number is null");
            return (Criteria) this;
        }

        public Criteria andCdNumberIsNotNull() {
            addCriterion("cd_number is not null");
            return (Criteria) this;
        }

        public Criteria andCdNumberEqualTo(String value) {
            addCriterion("cd_number =", value, "cdNumber");
            return (Criteria) this;
        }

        public Criteria andCdNumberNotEqualTo(String value) {
            addCriterion("cd_number <>", value, "cdNumber");
            return (Criteria) this;
        }

        public Criteria andCdNumberGreaterThan(String value) {
            addCriterion("cd_number >", value, "cdNumber");
            return (Criteria) this;
        }

        public Criteria andCdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("cd_number >=", value, "cdNumber");
            return (Criteria) this;
        }

        public Criteria andCdNumberLessThan(String value) {
            addCriterion("cd_number <", value, "cdNumber");
            return (Criteria) this;
        }

        public Criteria andCdNumberLessThanOrEqualTo(String value) {
            addCriterion("cd_number <=", value, "cdNumber");
            return (Criteria) this;
        }

        public Criteria andCdNumberLike(String value) {
            addCriterion("cd_number like", value, "cdNumber");
            return (Criteria) this;
        }

        public Criteria andCdNumberNotLike(String value) {
            addCriterion("cd_number not like", value, "cdNumber");
            return (Criteria) this;
        }

        public Criteria andCdNumberIn(List<String> values) {
            addCriterion("cd_number in", values, "cdNumber");
            return (Criteria) this;
        }

        public Criteria andCdNumberNotIn(List<String> values) {
            addCriterion("cd_number not in", values, "cdNumber");
            return (Criteria) this;
        }

        public Criteria andCdNumberBetween(String value1, String value2) {
            addCriterion("cd_number between", value1, value2, "cdNumber");
            return (Criteria) this;
        }

        public Criteria andCdNumberNotBetween(String value1, String value2) {
            addCriterion("cd_number not between", value1, value2, "cdNumber");
            return (Criteria) this;
        }

        public Criteria andCdNameIsNull() {
            addCriterion("cd_name is null");
            return (Criteria) this;
        }

        public Criteria andCdNameIsNotNull() {
            addCriterion("cd_name is not null");
            return (Criteria) this;
        }

        public Criteria andCdNameEqualTo(String value) {
            addCriterion("cd_name =", value, "cdName");
            return (Criteria) this;
        }

        public Criteria andCdNameNotEqualTo(String value) {
            addCriterion("cd_name <>", value, "cdName");
            return (Criteria) this;
        }

        public Criteria andCdNameGreaterThan(String value) {
            addCriterion("cd_name >", value, "cdName");
            return (Criteria) this;
        }

        public Criteria andCdNameGreaterThanOrEqualTo(String value) {
            addCriterion("cd_name >=", value, "cdName");
            return (Criteria) this;
        }

        public Criteria andCdNameLessThan(String value) {
            addCriterion("cd_name <", value, "cdName");
            return (Criteria) this;
        }

        public Criteria andCdNameLessThanOrEqualTo(String value) {
            addCriterion("cd_name <=", value, "cdName");
            return (Criteria) this;
        }

        public Criteria andCdNameLike(String value) {
            addCriterion("cd_name like", value, "cdName");
            return (Criteria) this;
        }

        public Criteria andCdNameNotLike(String value) {
            addCriterion("cd_name not like", value, "cdName");
            return (Criteria) this;
        }

        public Criteria andCdNameIn(List<String> values) {
            addCriterion("cd_name in", values, "cdName");
            return (Criteria) this;
        }

        public Criteria andCdNameNotIn(List<String> values) {
            addCriterion("cd_name not in", values, "cdName");
            return (Criteria) this;
        }

        public Criteria andCdNameBetween(String value1, String value2) {
            addCriterion("cd_name between", value1, value2, "cdName");
            return (Criteria) this;
        }

        public Criteria andCdNameNotBetween(String value1, String value2) {
            addCriterion("cd_name not between", value1, value2, "cdName");
            return (Criteria) this;
        }

        public Criteria andCdPriceIsNull() {
            addCriterion("cd_price is null");
            return (Criteria) this;
        }

        public Criteria andCdPriceIsNotNull() {
            addCriterion("cd_price is not null");
            return (Criteria) this;
        }

        public Criteria andCdPriceEqualTo(BigDecimal value) {
            addCriterion("cd_price =", value, "cdPrice");
            return (Criteria) this;
        }

        public Criteria andCdPriceNotEqualTo(BigDecimal value) {
            addCriterion("cd_price <>", value, "cdPrice");
            return (Criteria) this;
        }

        public Criteria andCdPriceGreaterThan(BigDecimal value) {
            addCriterion("cd_price >", value, "cdPrice");
            return (Criteria) this;
        }

        public Criteria andCdPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cd_price >=", value, "cdPrice");
            return (Criteria) this;
        }

        public Criteria andCdPriceLessThan(BigDecimal value) {
            addCriterion("cd_price <", value, "cdPrice");
            return (Criteria) this;
        }

        public Criteria andCdPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cd_price <=", value, "cdPrice");
            return (Criteria) this;
        }

        public Criteria andCdPriceIn(List<BigDecimal> values) {
            addCriterion("cd_price in", values, "cdPrice");
            return (Criteria) this;
        }

        public Criteria andCdPriceNotIn(List<BigDecimal> values) {
            addCriterion("cd_price not in", values, "cdPrice");
            return (Criteria) this;
        }

        public Criteria andCdPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cd_price between", value1, value2, "cdPrice");
            return (Criteria) this;
        }

        public Criteria andCdPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cd_price not between", value1, value2, "cdPrice");
            return (Criteria) this;
        }

        public Criteria andCdReserveIsNull() {
            addCriterion("cd_reserve is null");
            return (Criteria) this;
        }

        public Criteria andCdReserveIsNotNull() {
            addCriterion("cd_reserve is not null");
            return (Criteria) this;
        }

        public Criteria andCdReserveEqualTo(Integer value) {
            addCriterion("cd_reserve =", value, "cdReserve");
            return (Criteria) this;
        }

        public Criteria andCdReserveNotEqualTo(Integer value) {
            addCriterion("cd_reserve <>", value, "cdReserve");
            return (Criteria) this;
        }

        public Criteria andCdReserveGreaterThan(Integer value) {
            addCriterion("cd_reserve >", value, "cdReserve");
            return (Criteria) this;
        }

        public Criteria andCdReserveGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_reserve >=", value, "cdReserve");
            return (Criteria) this;
        }

        public Criteria andCdReserveLessThan(Integer value) {
            addCriterion("cd_reserve <", value, "cdReserve");
            return (Criteria) this;
        }

        public Criteria andCdReserveLessThanOrEqualTo(Integer value) {
            addCriterion("cd_reserve <=", value, "cdReserve");
            return (Criteria) this;
        }

        public Criteria andCdReserveIn(List<Integer> values) {
            addCriterion("cd_reserve in", values, "cdReserve");
            return (Criteria) this;
        }

        public Criteria andCdReserveNotIn(List<Integer> values) {
            addCriterion("cd_reserve not in", values, "cdReserve");
            return (Criteria) this;
        }

        public Criteria andCdReserveBetween(Integer value1, Integer value2) {
            addCriterion("cd_reserve between", value1, value2, "cdReserve");
            return (Criteria) this;
        }

        public Criteria andCdReserveNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_reserve not between", value1, value2, "cdReserve");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
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