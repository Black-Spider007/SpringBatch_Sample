package jp.co.example.DbMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseSummaryExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table purchase_summary
	 * @mbg.generated  Wed Aug 29 23:48:34 JST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table purchase_summary
	 * @mbg.generated  Wed Aug 29 23:48:34 JST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table purchase_summary
	 * @mbg.generated  Wed Aug 29 23:48:34 JST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table purchase_summary
	 * @mbg.generated  Wed Aug 29 23:48:34 JST 2018
	 */
	public PurchaseSummaryExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table purchase_summary
	 * @mbg.generated  Wed Aug 29 23:48:34 JST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table purchase_summary
	 * @mbg.generated  Wed Aug 29 23:48:34 JST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table purchase_summary
	 * @mbg.generated  Wed Aug 29 23:48:34 JST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table purchase_summary
	 * @mbg.generated  Wed Aug 29 23:48:34 JST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table purchase_summary
	 * @mbg.generated  Wed Aug 29 23:48:34 JST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table purchase_summary
	 * @mbg.generated  Wed Aug 29 23:48:34 JST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table purchase_summary
	 * @mbg.generated  Wed Aug 29 23:48:34 JST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table purchase_summary
	 * @mbg.generated  Wed Aug 29 23:48:34 JST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table purchase_summary
	 * @mbg.generated  Wed Aug 29 23:48:34 JST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table purchase_summary
	 * @mbg.generated  Wed Aug 29 23:48:34 JST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table purchase_summary
	 * @mbg.generated  Wed Aug 29 23:48:34 JST 2018
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

		public Criteria andCustomerIdIsNull() {
			addCriterion("customer_id is null");
			return (Criteria) this;
		}

		public Criteria andCustomerIdIsNotNull() {
			addCriterion("customer_id is not null");
			return (Criteria) this;
		}

		public Criteria andCustomerIdEqualTo(Integer value) {
			addCriterion("customer_id =", value, "customerId");
			return (Criteria) this;
		}

		public Criteria andCustomerIdNotEqualTo(Integer value) {
			addCriterion("customer_id <>", value, "customerId");
			return (Criteria) this;
		}

		public Criteria andCustomerIdGreaterThan(Integer value) {
			addCriterion("customer_id >", value, "customerId");
			return (Criteria) this;
		}

		public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("customer_id >=", value, "customerId");
			return (Criteria) this;
		}

		public Criteria andCustomerIdLessThan(Integer value) {
			addCriterion("customer_id <", value, "customerId");
			return (Criteria) this;
		}

		public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
			addCriterion("customer_id <=", value, "customerId");
			return (Criteria) this;
		}

		public Criteria andCustomerIdIn(List<Integer> values) {
			addCriterion("customer_id in", values, "customerId");
			return (Criteria) this;
		}

		public Criteria andCustomerIdNotIn(List<Integer> values) {
			addCriterion("customer_id not in", values, "customerId");
			return (Criteria) this;
		}

		public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
			addCriterion("customer_id between", value1, value2, "customerId");
			return (Criteria) this;
		}

		public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
			addCriterion("customer_id not between", value1, value2, "customerId");
			return (Criteria) this;
		}

		public Criteria andPurchaseNumberIsNull() {
			addCriterion("purchase_number is null");
			return (Criteria) this;
		}

		public Criteria andPurchaseNumberIsNotNull() {
			addCriterion("purchase_number is not null");
			return (Criteria) this;
		}

		public Criteria andPurchaseNumberEqualTo(String value) {
			addCriterion("purchase_number =", value, "purchaseNumber");
			return (Criteria) this;
		}

		public Criteria andPurchaseNumberNotEqualTo(String value) {
			addCriterion("purchase_number <>", value, "purchaseNumber");
			return (Criteria) this;
		}

		public Criteria andPurchaseNumberGreaterThan(String value) {
			addCriterion("purchase_number >", value, "purchaseNumber");
			return (Criteria) this;
		}

		public Criteria andPurchaseNumberGreaterThanOrEqualTo(String value) {
			addCriterion("purchase_number >=", value, "purchaseNumber");
			return (Criteria) this;
		}

		public Criteria andPurchaseNumberLessThan(String value) {
			addCriterion("purchase_number <", value, "purchaseNumber");
			return (Criteria) this;
		}

		public Criteria andPurchaseNumberLessThanOrEqualTo(String value) {
			addCriterion("purchase_number <=", value, "purchaseNumber");
			return (Criteria) this;
		}

		public Criteria andPurchaseNumberLike(String value) {
			addCriterion("purchase_number like", value, "purchaseNumber");
			return (Criteria) this;
		}

		public Criteria andPurchaseNumberNotLike(String value) {
			addCriterion("purchase_number not like", value, "purchaseNumber");
			return (Criteria) this;
		}

		public Criteria andPurchaseNumberIn(List<String> values) {
			addCriterion("purchase_number in", values, "purchaseNumber");
			return (Criteria) this;
		}

		public Criteria andPurchaseNumberNotIn(List<String> values) {
			addCriterion("purchase_number not in", values, "purchaseNumber");
			return (Criteria) this;
		}

		public Criteria andPurchaseNumberBetween(String value1, String value2) {
			addCriterion("purchase_number between", value1, value2, "purchaseNumber");
			return (Criteria) this;
		}

		public Criteria andPurchaseNumberNotBetween(String value1, String value2) {
			addCriterion("purchase_number not between", value1, value2, "purchaseNumber");
			return (Criteria) this;
		}

		public Criteria andTotalPriceIsNull() {
			addCriterion("total_price is null");
			return (Criteria) this;
		}

		public Criteria andTotalPriceIsNotNull() {
			addCriterion("total_price is not null");
			return (Criteria) this;
		}

		public Criteria andTotalPriceEqualTo(Integer value) {
			addCriterion("total_price =", value, "totalPrice");
			return (Criteria) this;
		}

		public Criteria andTotalPriceNotEqualTo(Integer value) {
			addCriterion("total_price <>", value, "totalPrice");
			return (Criteria) this;
		}

		public Criteria andTotalPriceGreaterThan(Integer value) {
			addCriterion("total_price >", value, "totalPrice");
			return (Criteria) this;
		}

		public Criteria andTotalPriceGreaterThanOrEqualTo(Integer value) {
			addCriterion("total_price >=", value, "totalPrice");
			return (Criteria) this;
		}

		public Criteria andTotalPriceLessThan(Integer value) {
			addCriterion("total_price <", value, "totalPrice");
			return (Criteria) this;
		}

		public Criteria andTotalPriceLessThanOrEqualTo(Integer value) {
			addCriterion("total_price <=", value, "totalPrice");
			return (Criteria) this;
		}

		public Criteria andTotalPriceIn(List<Integer> values) {
			addCriterion("total_price in", values, "totalPrice");
			return (Criteria) this;
		}

		public Criteria andTotalPriceNotIn(List<Integer> values) {
			addCriterion("total_price not in", values, "totalPrice");
			return (Criteria) this;
		}

		public Criteria andTotalPriceBetween(Integer value1, Integer value2) {
			addCriterion("total_price between", value1, value2, "totalPrice");
			return (Criteria) this;
		}

		public Criteria andTotalPriceNotBetween(Integer value1, Integer value2) {
			addCriterion("total_price not between", value1, value2, "totalPrice");
			return (Criteria) this;
		}

		public Criteria andPurchaseAtIsNull() {
			addCriterion("purchase_at is null");
			return (Criteria) this;
		}

		public Criteria andPurchaseAtIsNotNull() {
			addCriterion("purchase_at is not null");
			return (Criteria) this;
		}

		public Criteria andPurchaseAtEqualTo(Date value) {
			addCriterion("purchase_at =", value, "purchaseAt");
			return (Criteria) this;
		}

		public Criteria andPurchaseAtNotEqualTo(Date value) {
			addCriterion("purchase_at <>", value, "purchaseAt");
			return (Criteria) this;
		}

		public Criteria andPurchaseAtGreaterThan(Date value) {
			addCriterion("purchase_at >", value, "purchaseAt");
			return (Criteria) this;
		}

		public Criteria andPurchaseAtGreaterThanOrEqualTo(Date value) {
			addCriterion("purchase_at >=", value, "purchaseAt");
			return (Criteria) this;
		}

		public Criteria andPurchaseAtLessThan(Date value) {
			addCriterion("purchase_at <", value, "purchaseAt");
			return (Criteria) this;
		}

		public Criteria andPurchaseAtLessThanOrEqualTo(Date value) {
			addCriterion("purchase_at <=", value, "purchaseAt");
			return (Criteria) this;
		}

		public Criteria andPurchaseAtIn(List<Date> values) {
			addCriterion("purchase_at in", values, "purchaseAt");
			return (Criteria) this;
		}

		public Criteria andPurchaseAtNotIn(List<Date> values) {
			addCriterion("purchase_at not in", values, "purchaseAt");
			return (Criteria) this;
		}

		public Criteria andPurchaseAtBetween(Date value1, Date value2) {
			addCriterion("purchase_at between", value1, value2, "purchaseAt");
			return (Criteria) this;
		}

		public Criteria andPurchaseAtNotBetween(Date value1, Date value2) {
			addCriterion("purchase_at not between", value1, value2, "purchaseAt");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table purchase_summary
	 * @mbg.generated  Wed Aug 29 23:48:34 JST 2018
	 */
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table purchase_summary
     *
     * @mbg.generated do_not_delete_during_merge Sat Dec 16 18:34:48 JST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}