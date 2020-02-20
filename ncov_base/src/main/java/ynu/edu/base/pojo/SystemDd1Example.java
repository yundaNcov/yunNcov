package ynu.edu.base.pojo;

import java.util.ArrayList;
import java.util.List;

public class SystemDd1Example {
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

    public SystemDd1Example() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("keyword is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("keyword is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("keyword =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("keyword <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("keyword >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("keyword >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("keyword <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("keyword <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("keyword like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("keyword not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("keyword in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("keyword not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("keyword between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("keyword not between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andDdlCodeIsNull() {
            addCriterion("ddl_code is null");
            return (Criteria) this;
        }

        public Criteria andDdlCodeIsNotNull() {
            addCriterion("ddl_code is not null");
            return (Criteria) this;
        }

        public Criteria andDdlCodeEqualTo(String value) {
            addCriterion("ddl_code =", value, "ddlCode");
            return (Criteria) this;
        }

        public Criteria andDdlCodeNotEqualTo(String value) {
            addCriterion("ddl_code <>", value, "ddlCode");
            return (Criteria) this;
        }

        public Criteria andDdlCodeGreaterThan(String value) {
            addCriterion("ddl_code >", value, "ddlCode");
            return (Criteria) this;
        }

        public Criteria andDdlCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ddl_code >=", value, "ddlCode");
            return (Criteria) this;
        }

        public Criteria andDdlCodeLessThan(String value) {
            addCriterion("ddl_code <", value, "ddlCode");
            return (Criteria) this;
        }

        public Criteria andDdlCodeLessThanOrEqualTo(String value) {
            addCriterion("ddl_code <=", value, "ddlCode");
            return (Criteria) this;
        }

        public Criteria andDdlCodeLike(String value) {
            addCriterion("ddl_code like", value, "ddlCode");
            return (Criteria) this;
        }

        public Criteria andDdlCodeNotLike(String value) {
            addCriterion("ddl_code not like", value, "ddlCode");
            return (Criteria) this;
        }

        public Criteria andDdlCodeIn(List<String> values) {
            addCriterion("ddl_code in", values, "ddlCode");
            return (Criteria) this;
        }

        public Criteria andDdlCodeNotIn(List<String> values) {
            addCriterion("ddl_code not in", values, "ddlCode");
            return (Criteria) this;
        }

        public Criteria andDdlCodeBetween(String value1, String value2) {
            addCriterion("ddl_code between", value1, value2, "ddlCode");
            return (Criteria) this;
        }

        public Criteria andDdlCodeNotBetween(String value1, String value2) {
            addCriterion("ddl_code not between", value1, value2, "ddlCode");
            return (Criteria) this;
        }

        public Criteria andDdlNameIsNull() {
            addCriterion("ddl_name is null");
            return (Criteria) this;
        }

        public Criteria andDdlNameIsNotNull() {
            addCriterion("ddl_name is not null");
            return (Criteria) this;
        }

        public Criteria andDdlNameEqualTo(String value) {
            addCriterion("ddl_name =", value, "ddlName");
            return (Criteria) this;
        }

        public Criteria andDdlNameNotEqualTo(String value) {
            addCriterion("ddl_name <>", value, "ddlName");
            return (Criteria) this;
        }

        public Criteria andDdlNameGreaterThan(String value) {
            addCriterion("ddl_name >", value, "ddlName");
            return (Criteria) this;
        }

        public Criteria andDdlNameGreaterThanOrEqualTo(String value) {
            addCriterion("ddl_name >=", value, "ddlName");
            return (Criteria) this;
        }

        public Criteria andDdlNameLessThan(String value) {
            addCriterion("ddl_name <", value, "ddlName");
            return (Criteria) this;
        }

        public Criteria andDdlNameLessThanOrEqualTo(String value) {
            addCriterion("ddl_name <=", value, "ddlName");
            return (Criteria) this;
        }

        public Criteria andDdlNameLike(String value) {
            addCriterion("ddl_name like", value, "ddlName");
            return (Criteria) this;
        }

        public Criteria andDdlNameNotLike(String value) {
            addCriterion("ddl_name not like", value, "ddlName");
            return (Criteria) this;
        }

        public Criteria andDdlNameIn(List<String> values) {
            addCriterion("ddl_name in", values, "ddlName");
            return (Criteria) this;
        }

        public Criteria andDdlNameNotIn(List<String> values) {
            addCriterion("ddl_name not in", values, "ddlName");
            return (Criteria) this;
        }

        public Criteria andDdlNameBetween(String value1, String value2) {
            addCriterion("ddl_name between", value1, value2, "ddlName");
            return (Criteria) this;
        }

        public Criteria andDdlNameNotBetween(String value1, String value2) {
            addCriterion("ddl_name not between", value1, value2, "ddlName");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Byte value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Byte value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Byte value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Byte value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Byte value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Byte> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Byte> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Byte value1, Byte value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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