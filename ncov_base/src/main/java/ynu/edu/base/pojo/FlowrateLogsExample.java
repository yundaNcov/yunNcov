package ynu.edu.base.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlowrateLogsExample {
    /**
     * 分页参数：起始行
     */
    private Integer startRow;

    /**
     * 分页参数：分页大小
     */
    private Integer pageSize;

    public Integer getStartRow() {
        return startRow;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlowrateLogsExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andOpeIdIsNull() {
            addCriterion("ope_id is null");
            return (Criteria) this;
        }

        public Criteria andOpeIdIsNotNull() {
            addCriterion("ope_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpeIdEqualTo(Integer value) {
            addCriterion("ope_id =", value, "opeId");
            return (Criteria) this;
        }

        public Criteria andOpeIdNotEqualTo(Integer value) {
            addCriterion("ope_id <>", value, "opeId");
            return (Criteria) this;
        }

        public Criteria andOpeIdGreaterThan(Integer value) {
            addCriterion("ope_id >", value, "opeId");
            return (Criteria) this;
        }

        public Criteria andOpeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ope_id >=", value, "opeId");
            return (Criteria) this;
        }

        public Criteria andOpeIdLessThan(Integer value) {
            addCriterion("ope_id <", value, "opeId");
            return (Criteria) this;
        }

        public Criteria andOpeIdLessThanOrEqualTo(Integer value) {
            addCriterion("ope_id <=", value, "opeId");
            return (Criteria) this;
        }

        public Criteria andOpeIdIn(List<Integer> values) {
            addCriterion("ope_id in", values, "opeId");
            return (Criteria) this;
        }

        public Criteria andOpeIdNotIn(List<Integer> values) {
            addCriterion("ope_id not in", values, "opeId");
            return (Criteria) this;
        }

        public Criteria andOpeIdBetween(Integer value1, Integer value2) {
            addCriterion("ope_id between", value1, value2, "opeId");
            return (Criteria) this;
        }

        public Criteria andOpeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ope_id not between", value1, value2, "opeId");
            return (Criteria) this;
        }

        public Criteria andOpeNameIsNull() {
            addCriterion("ope_name is null");
            return (Criteria) this;
        }

        public Criteria andOpeNameIsNotNull() {
            addCriterion("ope_name is not null");
            return (Criteria) this;
        }

        public Criteria andOpeNameEqualTo(String value) {
            addCriterion("ope_name =", value, "opeName");
            return (Criteria) this;
        }

        public Criteria andOpeNameNotEqualTo(String value) {
            addCriterion("ope_name <>", value, "opeName");
            return (Criteria) this;
        }

        public Criteria andOpeNameGreaterThan(String value) {
            addCriterion("ope_name >", value, "opeName");
            return (Criteria) this;
        }

        public Criteria andOpeNameGreaterThanOrEqualTo(String value) {
            addCriterion("ope_name >=", value, "opeName");
            return (Criteria) this;
        }

        public Criteria andOpeNameLessThan(String value) {
            addCriterion("ope_name <", value, "opeName");
            return (Criteria) this;
        }

        public Criteria andOpeNameLessThanOrEqualTo(String value) {
            addCriterion("ope_name <=", value, "opeName");
            return (Criteria) this;
        }

        public Criteria andOpeNameLike(String value) {
            addCriterion("ope_name like", value, "opeName");
            return (Criteria) this;
        }

        public Criteria andOpeNameNotLike(String value) {
            addCriterion("ope_name not like", value, "opeName");
            return (Criteria) this;
        }

        public Criteria andOpeNameIn(List<String> values) {
            addCriterion("ope_name in", values, "opeName");
            return (Criteria) this;
        }

        public Criteria andOpeNameNotIn(List<String> values) {
            addCriterion("ope_name not in", values, "opeName");
            return (Criteria) this;
        }

        public Criteria andOpeNameBetween(String value1, String value2) {
            addCriterion("ope_name between", value1, value2, "opeName");
            return (Criteria) this;
        }

        public Criteria andOpeNameNotBetween(String value1, String value2) {
            addCriterion("ope_name not between", value1, value2, "opeName");
            return (Criteria) this;
        }

        public Criteria andOpeTimeIsNull() {
            addCriterion("ope_time is null");
            return (Criteria) this;
        }

        public Criteria andOpeTimeIsNotNull() {
            addCriterion("ope_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpeTimeEqualTo(Date value) {
            addCriterion("ope_time =", value, "opeTime");
            return (Criteria) this;
        }

        public Criteria andOpeTimeNotEqualTo(Date value) {
            addCriterion("ope_time <>", value, "opeTime");
            return (Criteria) this;
        }

        public Criteria andOpeTimeGreaterThan(Date value) {
            addCriterion("ope_time >", value, "opeTime");
            return (Criteria) this;
        }

        public Criteria andOpeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ope_time >=", value, "opeTime");
            return (Criteria) this;
        }

        public Criteria andOpeTimeLessThan(Date value) {
            addCriterion("ope_time <", value, "opeTime");
            return (Criteria) this;
        }

        public Criteria andOpeTimeLessThanOrEqualTo(Date value) {
            addCriterion("ope_time <=", value, "opeTime");
            return (Criteria) this;
        }

        public Criteria andOpeTimeIn(List<Date> values) {
            addCriterion("ope_time in", values, "opeTime");
            return (Criteria) this;
        }

        public Criteria andOpeTimeNotIn(List<Date> values) {
            addCriterion("ope_time not in", values, "opeTime");
            return (Criteria) this;
        }

        public Criteria andOpeTimeBetween(Date value1, Date value2) {
            addCriterion("ope_time between", value1, value2, "opeTime");
            return (Criteria) this;
        }

        public Criteria andOpeTimeNotBetween(Date value1, Date value2) {
            addCriterion("ope_time not between", value1, value2, "opeTime");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("detail is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("detail is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("detail =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("detail <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("detail >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("detail >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("detail <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("detail <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("detail like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("detail not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("detail in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("detail not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("detail between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("detail not between", value1, value2, "detail");
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