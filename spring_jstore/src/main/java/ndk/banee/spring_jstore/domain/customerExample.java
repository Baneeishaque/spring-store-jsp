package ndk.banee.spring_jstore.domain;

import java.util.ArrayList;
import java.util.List;

public class customerExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public customerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table customer
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
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

        public Criteria andCustomeriidIsNull() {
            addCriterion("CUSTOMERIID is null");
            return (Criteria) this;
        }

        public Criteria andCustomeriidIsNotNull() {
            addCriterion("CUSTOMERIID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeriidEqualTo(Integer value) {
            addCriterion("CUSTOMERIID =", value, "customeriid");
            return (Criteria) this;
        }

        public Criteria andCustomeriidNotEqualTo(Integer value) {
            addCriterion("CUSTOMERIID <>", value, "customeriid");
            return (Criteria) this;
        }

        public Criteria andCustomeriidGreaterThan(Integer value) {
            addCriterion("CUSTOMERIID >", value, "customeriid");
            return (Criteria) this;
        }

        public Criteria andCustomeriidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMERIID >=", value, "customeriid");
            return (Criteria) this;
        }

        public Criteria andCustomeriidLessThan(Integer value) {
            addCriterion("CUSTOMERIID <", value, "customeriid");
            return (Criteria) this;
        }

        public Criteria andCustomeriidLessThanOrEqualTo(Integer value) {
            addCriterion("CUSTOMERIID <=", value, "customeriid");
            return (Criteria) this;
        }

        public Criteria andCustomeriidIn(List<Integer> values) {
            addCriterion("CUSTOMERIID in", values, "customeriid");
            return (Criteria) this;
        }

        public Criteria andCustomeriidNotIn(List<Integer> values) {
            addCriterion("CUSTOMERIID not in", values, "customeriid");
            return (Criteria) this;
        }

        public Criteria andCustomeriidBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMERIID between", value1, value2, "customeriid");
            return (Criteria) this;
        }

        public Criteria andCustomeriidNotBetween(Integer value1, Integer value2) {
            addCriterion("CUSTOMERIID not between", value1, value2, "customeriid");
            return (Criteria) this;
        }

        public Criteria andPaymentidIsNull() {
            addCriterion("PAYMENTID is null");
            return (Criteria) this;
        }

        public Criteria andPaymentidIsNotNull() {
            addCriterion("PAYMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentidEqualTo(Integer value) {
            addCriterion("PAYMENTID =", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidNotEqualTo(Integer value) {
            addCriterion("PAYMENTID <>", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidGreaterThan(Integer value) {
            addCriterion("PAYMENTID >", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAYMENTID >=", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidLessThan(Integer value) {
            addCriterion("PAYMENTID <", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidLessThanOrEqualTo(Integer value) {
            addCriterion("PAYMENTID <=", value, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidIn(List<Integer> values) {
            addCriterion("PAYMENTID in", values, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidNotIn(List<Integer> values) {
            addCriterion("PAYMENTID not in", values, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENTID between", value1, value2, "paymentid");
            return (Criteria) this;
        }

        public Criteria andPaymentidNotBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENTID not between", value1, value2, "paymentid");
            return (Criteria) this;
        }

        public Criteria andWishlistidIsNull() {
            addCriterion("WISHLISTID is null");
            return (Criteria) this;
        }

        public Criteria andWishlistidIsNotNull() {
            addCriterion("WISHLISTID is not null");
            return (Criteria) this;
        }

        public Criteria andWishlistidEqualTo(Integer value) {
            addCriterion("WISHLISTID =", value, "wishlistid");
            return (Criteria) this;
        }

        public Criteria andWishlistidNotEqualTo(Integer value) {
            addCriterion("WISHLISTID <>", value, "wishlistid");
            return (Criteria) this;
        }

        public Criteria andWishlistidGreaterThan(Integer value) {
            addCriterion("WISHLISTID >", value, "wishlistid");
            return (Criteria) this;
        }

        public Criteria andWishlistidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WISHLISTID >=", value, "wishlistid");
            return (Criteria) this;
        }

        public Criteria andWishlistidLessThan(Integer value) {
            addCriterion("WISHLISTID <", value, "wishlistid");
            return (Criteria) this;
        }

        public Criteria andWishlistidLessThanOrEqualTo(Integer value) {
            addCriterion("WISHLISTID <=", value, "wishlistid");
            return (Criteria) this;
        }

        public Criteria andWishlistidIn(List<Integer> values) {
            addCriterion("WISHLISTID in", values, "wishlistid");
            return (Criteria) this;
        }

        public Criteria andWishlistidNotIn(List<Integer> values) {
            addCriterion("WISHLISTID not in", values, "wishlistid");
            return (Criteria) this;
        }

        public Criteria andWishlistidBetween(Integer value1, Integer value2) {
            addCriterion("WISHLISTID between", value1, value2, "wishlistid");
            return (Criteria) this;
        }

        public Criteria andWishlistidNotBetween(Integer value1, Integer value2) {
            addCriterion("WISHLISTID not between", value1, value2, "wishlistid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordsIsNull() {
            addCriterion("PASSWORDS is null");
            return (Criteria) this;
        }

        public Criteria andPasswordsIsNotNull() {
            addCriterion("PASSWORDS is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordsEqualTo(String value) {
            addCriterion("PASSWORDS =", value, "passwords");
            return (Criteria) this;
        }

        public Criteria andPasswordsNotEqualTo(String value) {
            addCriterion("PASSWORDS <>", value, "passwords");
            return (Criteria) this;
        }

        public Criteria andPasswordsGreaterThan(String value) {
            addCriterion("PASSWORDS >", value, "passwords");
            return (Criteria) this;
        }

        public Criteria andPasswordsGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORDS >=", value, "passwords");
            return (Criteria) this;
        }

        public Criteria andPasswordsLessThan(String value) {
            addCriterion("PASSWORDS <", value, "passwords");
            return (Criteria) this;
        }

        public Criteria andPasswordsLessThanOrEqualTo(String value) {
            addCriterion("PASSWORDS <=", value, "passwords");
            return (Criteria) this;
        }

        public Criteria andPasswordsLike(String value) {
            addCriterion("PASSWORDS like", value, "passwords");
            return (Criteria) this;
        }

        public Criteria andPasswordsNotLike(String value) {
            addCriterion("PASSWORDS not like", value, "passwords");
            return (Criteria) this;
        }

        public Criteria andPasswordsIn(List<String> values) {
            addCriterion("PASSWORDS in", values, "passwords");
            return (Criteria) this;
        }

        public Criteria andPasswordsNotIn(List<String> values) {
            addCriterion("PASSWORDS not in", values, "passwords");
            return (Criteria) this;
        }

        public Criteria andPasswordsBetween(String value1, String value2) {
            addCriterion("PASSWORDS between", value1, value2, "passwords");
            return (Criteria) this;
        }

        public Criteria andPasswordsNotBetween(String value1, String value2) {
            addCriterion("PASSWORDS not between", value1, value2, "passwords");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNull() {
            addCriterion("FULL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNotNull() {
            addCriterion("FULL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFullNameEqualTo(String value) {
            addCriterion("FULL_NAME =", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotEqualTo(String value) {
            addCriterion("FULL_NAME <>", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThan(String value) {
            addCriterion("FULL_NAME >", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("FULL_NAME >=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThan(String value) {
            addCriterion("FULL_NAME <", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThanOrEqualTo(String value) {
            addCriterion("FULL_NAME <=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLike(String value) {
            addCriterion("FULL_NAME like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotLike(String value) {
            addCriterion("FULL_NAME not like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameIn(List<String> values) {
            addCriterion("FULL_NAME in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotIn(List<String> values) {
            addCriterion("FULL_NAME not in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameBetween(String value1, String value2) {
            addCriterion("FULL_NAME between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotBetween(String value1, String value2) {
            addCriterion("FULL_NAME not between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("GENDER like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("GENDER not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(Long value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(Long value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(Long value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(Long value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(Long value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(Long value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<Long> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<Long> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(Long value1, Long value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(Long value1, Long value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table customer
     *
     * @mbg.generated do_not_delete_during_merge Sun May 24 14:31:24 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table customer
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public static class Criterion {
        private final String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private final String typeHandler;

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
    }
}
