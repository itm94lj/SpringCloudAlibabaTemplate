package org.itm94lj.template.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsProductExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andProductidIsNull() {
            addCriterion("ProductId is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("ProductId is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Long value) {
            addCriterion("ProductId =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Long value) {
            addCriterion("ProductId <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Long value) {
            addCriterion("ProductId >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Long value) {
            addCriterion("ProductId >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Long value) {
            addCriterion("ProductId <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Long value) {
            addCriterion("ProductId <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Long> values) {
            addCriterion("ProductId in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Long> values) {
            addCriterion("ProductId not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Long value1, Long value2) {
            addCriterion("ProductId between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Long value1, Long value2) {
            addCriterion("ProductId not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("PRODUCT_NAME =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("PRODUCT_NAME <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("PRODUCT_NAME >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("PRODUCT_NAME <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("PRODUCT_NAME like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("PRODUCT_NAME not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("PRODUCT_NAME in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("PRODUCT_NAME not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductPicIsNull() {
            addCriterion("PRODUCT_PIC is null");
            return (Criteria) this;
        }

        public Criteria andProductPicIsNotNull() {
            addCriterion("PRODUCT_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andProductPicEqualTo(String value) {
            addCriterion("PRODUCT_PIC =", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicNotEqualTo(String value) {
            addCriterion("PRODUCT_PIC <>", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicGreaterThan(String value) {
            addCriterion("PRODUCT_PIC >", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PIC >=", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicLessThan(String value) {
            addCriterion("PRODUCT_PIC <", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_PIC <=", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicLike(String value) {
            addCriterion("PRODUCT_PIC like", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicNotLike(String value) {
            addCriterion("PRODUCT_PIC not like", value, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicIn(List<String> values) {
            addCriterion("PRODUCT_PIC in", values, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicNotIn(List<String> values) {
            addCriterion("PRODUCT_PIC not in", values, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicBetween(String value1, String value2) {
            addCriterion("PRODUCT_PIC between", value1, value2, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductPicNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_PIC not between", value1, value2, "productPic");
            return (Criteria) this;
        }

        public Criteria andProductSnIsNull() {
            addCriterion("PRODUCT_SN is null");
            return (Criteria) this;
        }

        public Criteria andProductSnIsNotNull() {
            addCriterion("PRODUCT_SN is not null");
            return (Criteria) this;
        }

        public Criteria andProductSnEqualTo(String value) {
            addCriterion("PRODUCT_SN =", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotEqualTo(String value) {
            addCriterion("PRODUCT_SN <>", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnGreaterThan(String value) {
            addCriterion("PRODUCT_SN >", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SN >=", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnLessThan(String value) {
            addCriterion("PRODUCT_SN <", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SN <=", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnLike(String value) {
            addCriterion("PRODUCT_SN like", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotLike(String value) {
            addCriterion("PRODUCT_SN not like", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnIn(List<String> values) {
            addCriterion("PRODUCT_SN in", values, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotIn(List<String> values) {
            addCriterion("PRODUCT_SN not in", values, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnBetween(String value1, String value2) {
            addCriterion("PRODUCT_SN between", value1, value2, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_SN not between", value1, value2, "productSn");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIsNull() {
            addCriterion("DELETE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIsNotNull() {
            addCriterion("DELETE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusEqualTo(Integer value) {
            addCriterion("DELETE_STATUS =", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotEqualTo(Integer value) {
            addCriterion("DELETE_STATUS <>", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusGreaterThan(Integer value) {
            addCriterion("DELETE_STATUS >", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("DELETE_STATUS >=", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLessThan(Integer value) {
            addCriterion("DELETE_STATUS <", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLessThanOrEqualTo(Integer value) {
            addCriterion("DELETE_STATUS <=", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIn(List<Integer> values) {
            addCriterion("DELETE_STATUS in", values, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotIn(List<Integer> values) {
            addCriterion("DELETE_STATUS not in", values, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusBetween(Integer value1, Integer value2) {
            addCriterion("DELETE_STATUS between", value1, value2, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("DELETE_STATUS not between", value1, value2, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusIsNull() {
            addCriterion("PUBLISH_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPublishStatusIsNotNull() {
            addCriterion("PUBLISH_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPublishStatusEqualTo(Integer value) {
            addCriterion("PUBLISH_STATUS =", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusNotEqualTo(Integer value) {
            addCriterion("PUBLISH_STATUS <>", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusGreaterThan(Integer value) {
            addCriterion("PUBLISH_STATUS >", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("PUBLISH_STATUS >=", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusLessThan(Integer value) {
            addCriterion("PUBLISH_STATUS <", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusLessThanOrEqualTo(Integer value) {
            addCriterion("PUBLISH_STATUS <=", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusIn(List<Integer> values) {
            addCriterion("PUBLISH_STATUS in", values, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusNotIn(List<Integer> values) {
            addCriterion("PUBLISH_STATUS not in", values, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusBetween(Integer value1, Integer value2) {
            addCriterion("PUBLISH_STATUS between", value1, value2, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("PUBLISH_STATUS not between", value1, value2, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusIsNull() {
            addCriterion("NEW_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andNewStatusIsNotNull() {
            addCriterion("NEW_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andNewStatusEqualTo(Integer value) {
            addCriterion("NEW_STATUS =", value, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusNotEqualTo(Integer value) {
            addCriterion("NEW_STATUS <>", value, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusGreaterThan(Integer value) {
            addCriterion("NEW_STATUS >", value, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("NEW_STATUS >=", value, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusLessThan(Integer value) {
            addCriterion("NEW_STATUS <", value, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusLessThanOrEqualTo(Integer value) {
            addCriterion("NEW_STATUS <=", value, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusIn(List<Integer> values) {
            addCriterion("NEW_STATUS in", values, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusNotIn(List<Integer> values) {
            addCriterion("NEW_STATUS not in", values, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusBetween(Integer value1, Integer value2) {
            addCriterion("NEW_STATUS between", value1, value2, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("NEW_STATUS not between", value1, value2, "newStatus");
            return (Criteria) this;
        }

        public Criteria andRecommandStatusIsNull() {
            addCriterion("RECOMMAND_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andRecommandStatusIsNotNull() {
            addCriterion("RECOMMAND_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRecommandStatusEqualTo(Integer value) {
            addCriterion("RECOMMAND_STATUS =", value, "recommandStatus");
            return (Criteria) this;
        }

        public Criteria andRecommandStatusNotEqualTo(Integer value) {
            addCriterion("RECOMMAND_STATUS <>", value, "recommandStatus");
            return (Criteria) this;
        }

        public Criteria andRecommandStatusGreaterThan(Integer value) {
            addCriterion("RECOMMAND_STATUS >", value, "recommandStatus");
            return (Criteria) this;
        }

        public Criteria andRecommandStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("RECOMMAND_STATUS >=", value, "recommandStatus");
            return (Criteria) this;
        }

        public Criteria andRecommandStatusLessThan(Integer value) {
            addCriterion("RECOMMAND_STATUS <", value, "recommandStatus");
            return (Criteria) this;
        }

        public Criteria andRecommandStatusLessThanOrEqualTo(Integer value) {
            addCriterion("RECOMMAND_STATUS <=", value, "recommandStatus");
            return (Criteria) this;
        }

        public Criteria andRecommandStatusIn(List<Integer> values) {
            addCriterion("RECOMMAND_STATUS in", values, "recommandStatus");
            return (Criteria) this;
        }

        public Criteria andRecommandStatusNotIn(List<Integer> values) {
            addCriterion("RECOMMAND_STATUS not in", values, "recommandStatus");
            return (Criteria) this;
        }

        public Criteria andRecommandStatusBetween(Integer value1, Integer value2) {
            addCriterion("RECOMMAND_STATUS between", value1, value2, "recommandStatus");
            return (Criteria) this;
        }

        public Criteria andRecommandStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("RECOMMAND_STATUS not between", value1, value2, "recommandStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIsNull() {
            addCriterion("VERIFY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIsNotNull() {
            addCriterion("VERIFY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusEqualTo(Integer value) {
            addCriterion("VERIFY_STATUS =", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotEqualTo(Integer value) {
            addCriterion("VERIFY_STATUS <>", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusGreaterThan(Integer value) {
            addCriterion("VERIFY_STATUS >", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("VERIFY_STATUS >=", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusLessThan(Integer value) {
            addCriterion("VERIFY_STATUS <", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("VERIFY_STATUS <=", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIn(List<Integer> values) {
            addCriterion("VERIFY_STATUS in", values, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotIn(List<Integer> values) {
            addCriterion("VERIFY_STATUS not in", values, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusBetween(Integer value1, Integer value2) {
            addCriterion("VERIFY_STATUS between", value1, value2, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("VERIFY_STATUS not between", value1, value2, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andSaleIsNull() {
            addCriterion("Sale is null");
            return (Criteria) this;
        }

        public Criteria andSaleIsNotNull() {
            addCriterion("Sale is not null");
            return (Criteria) this;
        }

        public Criteria andSaleEqualTo(Integer value) {
            addCriterion("Sale =", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotEqualTo(Integer value) {
            addCriterion("Sale <>", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleGreaterThan(Integer value) {
            addCriterion("Sale >", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sale >=", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleLessThan(Integer value) {
            addCriterion("Sale <", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleLessThanOrEqualTo(Integer value) {
            addCriterion("Sale <=", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleIn(List<Integer> values) {
            addCriterion("Sale in", values, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotIn(List<Integer> values) {
            addCriterion("Sale not in", values, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleBetween(Integer value1, Integer value2) {
            addCriterion("Sale between", value1, value2, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotBetween(Integer value1, Integer value2) {
            addCriterion("Sale not between", value1, value2, "sale");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Short value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Short value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Short value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Short value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Short value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Short value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Short> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Short> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Short value1, Short value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Short value1, Short value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPromotionpriceIsNull() {
            addCriterion("PromotionPrice is null");
            return (Criteria) this;
        }

        public Criteria andPromotionpriceIsNotNull() {
            addCriterion("PromotionPrice is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionpriceEqualTo(Short value) {
            addCriterion("PromotionPrice =", value, "promotionprice");
            return (Criteria) this;
        }

        public Criteria andPromotionpriceNotEqualTo(Short value) {
            addCriterion("PromotionPrice <>", value, "promotionprice");
            return (Criteria) this;
        }

        public Criteria andPromotionpriceGreaterThan(Short value) {
            addCriterion("PromotionPrice >", value, "promotionprice");
            return (Criteria) this;
        }

        public Criteria andPromotionpriceGreaterThanOrEqualTo(Short value) {
            addCriterion("PromotionPrice >=", value, "promotionprice");
            return (Criteria) this;
        }

        public Criteria andPromotionpriceLessThan(Short value) {
            addCriterion("PromotionPrice <", value, "promotionprice");
            return (Criteria) this;
        }

        public Criteria andPromotionpriceLessThanOrEqualTo(Short value) {
            addCriterion("PromotionPrice <=", value, "promotionprice");
            return (Criteria) this;
        }

        public Criteria andPromotionpriceIn(List<Short> values) {
            addCriterion("PromotionPrice in", values, "promotionprice");
            return (Criteria) this;
        }

        public Criteria andPromotionpriceNotIn(List<Short> values) {
            addCriterion("PromotionPrice not in", values, "promotionprice");
            return (Criteria) this;
        }

        public Criteria andPromotionpriceBetween(Short value1, Short value2) {
            addCriterion("PromotionPrice between", value1, value2, "promotionprice");
            return (Criteria) this;
        }

        public Criteria andPromotionpriceNotBetween(Short value1, Short value2) {
            addCriterion("PromotionPrice not between", value1, value2, "promotionprice");
            return (Criteria) this;
        }

        public Criteria andGiftgrowthIsNull() {
            addCriterion("GiftGrowth is null");
            return (Criteria) this;
        }

        public Criteria andGiftgrowthIsNotNull() {
            addCriterion("GiftGrowth is not null");
            return (Criteria) this;
        }

        public Criteria andGiftgrowthEqualTo(Integer value) {
            addCriterion("GiftGrowth =", value, "giftgrowth");
            return (Criteria) this;
        }

        public Criteria andGiftgrowthNotEqualTo(Integer value) {
            addCriterion("GiftGrowth <>", value, "giftgrowth");
            return (Criteria) this;
        }

        public Criteria andGiftgrowthGreaterThan(Integer value) {
            addCriterion("GiftGrowth >", value, "giftgrowth");
            return (Criteria) this;
        }

        public Criteria andGiftgrowthGreaterThanOrEqualTo(Integer value) {
            addCriterion("GiftGrowth >=", value, "giftgrowth");
            return (Criteria) this;
        }

        public Criteria andGiftgrowthLessThan(Integer value) {
            addCriterion("GiftGrowth <", value, "giftgrowth");
            return (Criteria) this;
        }

        public Criteria andGiftgrowthLessThanOrEqualTo(Integer value) {
            addCriterion("GiftGrowth <=", value, "giftgrowth");
            return (Criteria) this;
        }

        public Criteria andGiftgrowthIn(List<Integer> values) {
            addCriterion("GiftGrowth in", values, "giftgrowth");
            return (Criteria) this;
        }

        public Criteria andGiftgrowthNotIn(List<Integer> values) {
            addCriterion("GiftGrowth not in", values, "giftgrowth");
            return (Criteria) this;
        }

        public Criteria andGiftgrowthBetween(Integer value1, Integer value2) {
            addCriterion("GiftGrowth between", value1, value2, "giftgrowth");
            return (Criteria) this;
        }

        public Criteria andGiftgrowthNotBetween(Integer value1, Integer value2) {
            addCriterion("GiftGrowth not between", value1, value2, "giftgrowth");
            return (Criteria) this;
        }

        public Criteria andGiftpointIsNull() {
            addCriterion("GiftPoint is null");
            return (Criteria) this;
        }

        public Criteria andGiftpointIsNotNull() {
            addCriterion("GiftPoint is not null");
            return (Criteria) this;
        }

        public Criteria andGiftpointEqualTo(Integer value) {
            addCriterion("GiftPoint =", value, "giftpoint");
            return (Criteria) this;
        }

        public Criteria andGiftpointNotEqualTo(Integer value) {
            addCriterion("GiftPoint <>", value, "giftpoint");
            return (Criteria) this;
        }

        public Criteria andGiftpointGreaterThan(Integer value) {
            addCriterion("GiftPoint >", value, "giftpoint");
            return (Criteria) this;
        }

        public Criteria andGiftpointGreaterThanOrEqualTo(Integer value) {
            addCriterion("GiftPoint >=", value, "giftpoint");
            return (Criteria) this;
        }

        public Criteria andGiftpointLessThan(Integer value) {
            addCriterion("GiftPoint <", value, "giftpoint");
            return (Criteria) this;
        }

        public Criteria andGiftpointLessThanOrEqualTo(Integer value) {
            addCriterion("GiftPoint <=", value, "giftpoint");
            return (Criteria) this;
        }

        public Criteria andGiftpointIn(List<Integer> values) {
            addCriterion("GiftPoint in", values, "giftpoint");
            return (Criteria) this;
        }

        public Criteria andGiftpointNotIn(List<Integer> values) {
            addCriterion("GiftPoint not in", values, "giftpoint");
            return (Criteria) this;
        }

        public Criteria andGiftpointBetween(Integer value1, Integer value2) {
            addCriterion("GiftPoint between", value1, value2, "giftpoint");
            return (Criteria) this;
        }

        public Criteria andGiftpointNotBetween(Integer value1, Integer value2) {
            addCriterion("GiftPoint not between", value1, value2, "giftpoint");
            return (Criteria) this;
        }

        public Criteria andUsepointlimitIsNull() {
            addCriterion("UsePointLimit is null");
            return (Criteria) this;
        }

        public Criteria andUsepointlimitIsNotNull() {
            addCriterion("UsePointLimit is not null");
            return (Criteria) this;
        }

        public Criteria andUsepointlimitEqualTo(Integer value) {
            addCriterion("UsePointLimit =", value, "usepointlimit");
            return (Criteria) this;
        }

        public Criteria andUsepointlimitNotEqualTo(Integer value) {
            addCriterion("UsePointLimit <>", value, "usepointlimit");
            return (Criteria) this;
        }

        public Criteria andUsepointlimitGreaterThan(Integer value) {
            addCriterion("UsePointLimit >", value, "usepointlimit");
            return (Criteria) this;
        }

        public Criteria andUsepointlimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("UsePointLimit >=", value, "usepointlimit");
            return (Criteria) this;
        }

        public Criteria andUsepointlimitLessThan(Integer value) {
            addCriterion("UsePointLimit <", value, "usepointlimit");
            return (Criteria) this;
        }

        public Criteria andUsepointlimitLessThanOrEqualTo(Integer value) {
            addCriterion("UsePointLimit <=", value, "usepointlimit");
            return (Criteria) this;
        }

        public Criteria andUsepointlimitIn(List<Integer> values) {
            addCriterion("UsePointLimit in", values, "usepointlimit");
            return (Criteria) this;
        }

        public Criteria andUsepointlimitNotIn(List<Integer> values) {
            addCriterion("UsePointLimit not in", values, "usepointlimit");
            return (Criteria) this;
        }

        public Criteria andUsepointlimitBetween(Integer value1, Integer value2) {
            addCriterion("UsePointLimit between", value1, value2, "usepointlimit");
            return (Criteria) this;
        }

        public Criteria andUsepointlimitNotBetween(Integer value1, Integer value2) {
            addCriterion("UsePointLimit not between", value1, value2, "usepointlimit");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNull() {
            addCriterion("SubTitle is null");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNotNull() {
            addCriterion("SubTitle is not null");
            return (Criteria) this;
        }

        public Criteria andSubtitleEqualTo(String value) {
            addCriterion("SubTitle =", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotEqualTo(String value) {
            addCriterion("SubTitle <>", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThan(String value) {
            addCriterion("SubTitle >", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("SubTitle >=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThan(String value) {
            addCriterion("SubTitle <", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThanOrEqualTo(String value) {
            addCriterion("SubTitle <=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLike(String value) {
            addCriterion("SubTitle like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotLike(String value) {
            addCriterion("SubTitle not like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleIn(List<String> values) {
            addCriterion("SubTitle in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotIn(List<String> values) {
            addCriterion("SubTitle not in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleBetween(String value1, String value2) {
            addCriterion("SubTitle between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotBetween(String value1, String value2) {
            addCriterion("SubTitle not between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceIsNull() {
            addCriterion("OriginalPrice is null");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceIsNotNull() {
            addCriterion("OriginalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceEqualTo(Short value) {
            addCriterion("OriginalPrice =", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceNotEqualTo(Short value) {
            addCriterion("OriginalPrice <>", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceGreaterThan(Short value) {
            addCriterion("OriginalPrice >", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceGreaterThanOrEqualTo(Short value) {
            addCriterion("OriginalPrice >=", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceLessThan(Short value) {
            addCriterion("OriginalPrice <", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceLessThanOrEqualTo(Short value) {
            addCriterion("OriginalPrice <=", value, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceIn(List<Short> values) {
            addCriterion("OriginalPrice in", values, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceNotIn(List<Short> values) {
            addCriterion("OriginalPrice not in", values, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceBetween(Short value1, Short value2) {
            addCriterion("OriginalPrice between", value1, value2, "originalprice");
            return (Criteria) this;
        }

        public Criteria andOriginalpriceNotBetween(Short value1, Short value2) {
            addCriterion("OriginalPrice not between", value1, value2, "originalprice");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("Stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("Stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("Stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("Stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("Stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("Stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("Stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("Stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("Stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("Stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("Stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("Stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andLowstockIsNull() {
            addCriterion("LowStock is null");
            return (Criteria) this;
        }

        public Criteria andLowstockIsNotNull() {
            addCriterion("LowStock is not null");
            return (Criteria) this;
        }

        public Criteria andLowstockEqualTo(Integer value) {
            addCriterion("LowStock =", value, "lowstock");
            return (Criteria) this;
        }

        public Criteria andLowstockNotEqualTo(Integer value) {
            addCriterion("LowStock <>", value, "lowstock");
            return (Criteria) this;
        }

        public Criteria andLowstockGreaterThan(Integer value) {
            addCriterion("LowStock >", value, "lowstock");
            return (Criteria) this;
        }

        public Criteria andLowstockGreaterThanOrEqualTo(Integer value) {
            addCriterion("LowStock >=", value, "lowstock");
            return (Criteria) this;
        }

        public Criteria andLowstockLessThan(Integer value) {
            addCriterion("LowStock <", value, "lowstock");
            return (Criteria) this;
        }

        public Criteria andLowstockLessThanOrEqualTo(Integer value) {
            addCriterion("LowStock <=", value, "lowstock");
            return (Criteria) this;
        }

        public Criteria andLowstockIn(List<Integer> values) {
            addCriterion("LowStock in", values, "lowstock");
            return (Criteria) this;
        }

        public Criteria andLowstockNotIn(List<Integer> values) {
            addCriterion("LowStock not in", values, "lowstock");
            return (Criteria) this;
        }

        public Criteria andLowstockBetween(Integer value1, Integer value2) {
            addCriterion("LowStock between", value1, value2, "lowstock");
            return (Criteria) this;
        }

        public Criteria andLowstockNotBetween(Integer value1, Integer value2) {
            addCriterion("LowStock not between", value1, value2, "lowstock");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("Unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("Unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("Unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("Unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("Unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("Unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("Unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("Unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("Unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("Unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("Unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("Unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("Unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("Unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("Weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("Weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Short value) {
            addCriterion("Weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Short value) {
            addCriterion("Weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Short value) {
            addCriterion("Weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Short value) {
            addCriterion("Weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Short value) {
            addCriterion("Weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Short value) {
            addCriterion("Weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Short> values) {
            addCriterion("Weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Short> values) {
            addCriterion("Weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Short value1, Short value2) {
            addCriterion("Weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Short value1, Short value2) {
            addCriterion("Weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andPreviewstatusIsNull() {
            addCriterion("PreviewStatus is null");
            return (Criteria) this;
        }

        public Criteria andPreviewstatusIsNotNull() {
            addCriterion("PreviewStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPreviewstatusEqualTo(Integer value) {
            addCriterion("PreviewStatus =", value, "previewstatus");
            return (Criteria) this;
        }

        public Criteria andPreviewstatusNotEqualTo(Integer value) {
            addCriterion("PreviewStatus <>", value, "previewstatus");
            return (Criteria) this;
        }

        public Criteria andPreviewstatusGreaterThan(Integer value) {
            addCriterion("PreviewStatus >", value, "previewstatus");
            return (Criteria) this;
        }

        public Criteria andPreviewstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("PreviewStatus >=", value, "previewstatus");
            return (Criteria) this;
        }

        public Criteria andPreviewstatusLessThan(Integer value) {
            addCriterion("PreviewStatus <", value, "previewstatus");
            return (Criteria) this;
        }

        public Criteria andPreviewstatusLessThanOrEqualTo(Integer value) {
            addCriterion("PreviewStatus <=", value, "previewstatus");
            return (Criteria) this;
        }

        public Criteria andPreviewstatusIn(List<Integer> values) {
            addCriterion("PreviewStatus in", values, "previewstatus");
            return (Criteria) this;
        }

        public Criteria andPreviewstatusNotIn(List<Integer> values) {
            addCriterion("PreviewStatus not in", values, "previewstatus");
            return (Criteria) this;
        }

        public Criteria andPreviewstatusBetween(Integer value1, Integer value2) {
            addCriterion("PreviewStatus between", value1, value2, "previewstatus");
            return (Criteria) this;
        }

        public Criteria andPreviewstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("PreviewStatus not between", value1, value2, "previewstatus");
            return (Criteria) this;
        }

        public Criteria andServiceidsIsNull() {
            addCriterion("ServiceIds is null");
            return (Criteria) this;
        }

        public Criteria andServiceidsIsNotNull() {
            addCriterion("ServiceIds is not null");
            return (Criteria) this;
        }

        public Criteria andServiceidsEqualTo(String value) {
            addCriterion("ServiceIds =", value, "serviceids");
            return (Criteria) this;
        }

        public Criteria andServiceidsNotEqualTo(String value) {
            addCriterion("ServiceIds <>", value, "serviceids");
            return (Criteria) this;
        }

        public Criteria andServiceidsGreaterThan(String value) {
            addCriterion("ServiceIds >", value, "serviceids");
            return (Criteria) this;
        }

        public Criteria andServiceidsGreaterThanOrEqualTo(String value) {
            addCriterion("ServiceIds >=", value, "serviceids");
            return (Criteria) this;
        }

        public Criteria andServiceidsLessThan(String value) {
            addCriterion("ServiceIds <", value, "serviceids");
            return (Criteria) this;
        }

        public Criteria andServiceidsLessThanOrEqualTo(String value) {
            addCriterion("ServiceIds <=", value, "serviceids");
            return (Criteria) this;
        }

        public Criteria andServiceidsLike(String value) {
            addCriterion("ServiceIds like", value, "serviceids");
            return (Criteria) this;
        }

        public Criteria andServiceidsNotLike(String value) {
            addCriterion("ServiceIds not like", value, "serviceids");
            return (Criteria) this;
        }

        public Criteria andServiceidsIn(List<String> values) {
            addCriterion("ServiceIds in", values, "serviceids");
            return (Criteria) this;
        }

        public Criteria andServiceidsNotIn(List<String> values) {
            addCriterion("ServiceIds not in", values, "serviceids");
            return (Criteria) this;
        }

        public Criteria andServiceidsBetween(String value1, String value2) {
            addCriterion("ServiceIds between", value1, value2, "serviceids");
            return (Criteria) this;
        }

        public Criteria andServiceidsNotBetween(String value1, String value2) {
            addCriterion("ServiceIds not between", value1, value2, "serviceids");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNull() {
            addCriterion("Keywords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("Keywords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("Keywords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("Keywords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("Keywords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("Keywords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("Keywords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("Keywords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("Keywords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("Keywords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("Keywords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("Keywords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("Keywords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("Keywords not between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("Note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("Note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("Note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("Note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("Note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("Note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("Note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("Note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("Note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("Note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("Note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("Note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("Note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("Note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andAlbumpicsIsNull() {
            addCriterion("AlbumPics is null");
            return (Criteria) this;
        }

        public Criteria andAlbumpicsIsNotNull() {
            addCriterion("AlbumPics is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumpicsEqualTo(String value) {
            addCriterion("AlbumPics =", value, "albumpics");
            return (Criteria) this;
        }

        public Criteria andAlbumpicsNotEqualTo(String value) {
            addCriterion("AlbumPics <>", value, "albumpics");
            return (Criteria) this;
        }

        public Criteria andAlbumpicsGreaterThan(String value) {
            addCriterion("AlbumPics >", value, "albumpics");
            return (Criteria) this;
        }

        public Criteria andAlbumpicsGreaterThanOrEqualTo(String value) {
            addCriterion("AlbumPics >=", value, "albumpics");
            return (Criteria) this;
        }

        public Criteria andAlbumpicsLessThan(String value) {
            addCriterion("AlbumPics <", value, "albumpics");
            return (Criteria) this;
        }

        public Criteria andAlbumpicsLessThanOrEqualTo(String value) {
            addCriterion("AlbumPics <=", value, "albumpics");
            return (Criteria) this;
        }

        public Criteria andAlbumpicsLike(String value) {
            addCriterion("AlbumPics like", value, "albumpics");
            return (Criteria) this;
        }

        public Criteria andAlbumpicsNotLike(String value) {
            addCriterion("AlbumPics not like", value, "albumpics");
            return (Criteria) this;
        }

        public Criteria andAlbumpicsIn(List<String> values) {
            addCriterion("AlbumPics in", values, "albumpics");
            return (Criteria) this;
        }

        public Criteria andAlbumpicsNotIn(List<String> values) {
            addCriterion("AlbumPics not in", values, "albumpics");
            return (Criteria) this;
        }

        public Criteria andAlbumpicsBetween(String value1, String value2) {
            addCriterion("AlbumPics between", value1, value2, "albumpics");
            return (Criteria) this;
        }

        public Criteria andAlbumpicsNotBetween(String value1, String value2) {
            addCriterion("AlbumPics not between", value1, value2, "albumpics");
            return (Criteria) this;
        }

        public Criteria andDetailtitleIsNull() {
            addCriterion("DetailTitle is null");
            return (Criteria) this;
        }

        public Criteria andDetailtitleIsNotNull() {
            addCriterion("DetailTitle is not null");
            return (Criteria) this;
        }

        public Criteria andDetailtitleEqualTo(String value) {
            addCriterion("DetailTitle =", value, "detailtitle");
            return (Criteria) this;
        }

        public Criteria andDetailtitleNotEqualTo(String value) {
            addCriterion("DetailTitle <>", value, "detailtitle");
            return (Criteria) this;
        }

        public Criteria andDetailtitleGreaterThan(String value) {
            addCriterion("DetailTitle >", value, "detailtitle");
            return (Criteria) this;
        }

        public Criteria andDetailtitleGreaterThanOrEqualTo(String value) {
            addCriterion("DetailTitle >=", value, "detailtitle");
            return (Criteria) this;
        }

        public Criteria andDetailtitleLessThan(String value) {
            addCriterion("DetailTitle <", value, "detailtitle");
            return (Criteria) this;
        }

        public Criteria andDetailtitleLessThanOrEqualTo(String value) {
            addCriterion("DetailTitle <=", value, "detailtitle");
            return (Criteria) this;
        }

        public Criteria andDetailtitleLike(String value) {
            addCriterion("DetailTitle like", value, "detailtitle");
            return (Criteria) this;
        }

        public Criteria andDetailtitleNotLike(String value) {
            addCriterion("DetailTitle not like", value, "detailtitle");
            return (Criteria) this;
        }

        public Criteria andDetailtitleIn(List<String> values) {
            addCriterion("DetailTitle in", values, "detailtitle");
            return (Criteria) this;
        }

        public Criteria andDetailtitleNotIn(List<String> values) {
            addCriterion("DetailTitle not in", values, "detailtitle");
            return (Criteria) this;
        }

        public Criteria andDetailtitleBetween(String value1, String value2) {
            addCriterion("DetailTitle between", value1, value2, "detailtitle");
            return (Criteria) this;
        }

        public Criteria andDetailtitleNotBetween(String value1, String value2) {
            addCriterion("DetailTitle not between", value1, value2, "detailtitle");
            return (Criteria) this;
        }

        public Criteria andPromotionstarttimeIsNull() {
            addCriterion("PromotionStartTime is null");
            return (Criteria) this;
        }

        public Criteria andPromotionstarttimeIsNotNull() {
            addCriterion("PromotionStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionstarttimeEqualTo(Date value) {
            addCriterion("PromotionStartTime =", value, "promotionstarttime");
            return (Criteria) this;
        }

        public Criteria andPromotionstarttimeNotEqualTo(Date value) {
            addCriterion("PromotionStartTime <>", value, "promotionstarttime");
            return (Criteria) this;
        }

        public Criteria andPromotionstarttimeGreaterThan(Date value) {
            addCriterion("PromotionStartTime >", value, "promotionstarttime");
            return (Criteria) this;
        }

        public Criteria andPromotionstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PromotionStartTime >=", value, "promotionstarttime");
            return (Criteria) this;
        }

        public Criteria andPromotionstarttimeLessThan(Date value) {
            addCriterion("PromotionStartTime <", value, "promotionstarttime");
            return (Criteria) this;
        }

        public Criteria andPromotionstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("PromotionStartTime <=", value, "promotionstarttime");
            return (Criteria) this;
        }

        public Criteria andPromotionstarttimeIn(List<Date> values) {
            addCriterion("PromotionStartTime in", values, "promotionstarttime");
            return (Criteria) this;
        }

        public Criteria andPromotionstarttimeNotIn(List<Date> values) {
            addCriterion("PromotionStartTime not in", values, "promotionstarttime");
            return (Criteria) this;
        }

        public Criteria andPromotionstarttimeBetween(Date value1, Date value2) {
            addCriterion("PromotionStartTime between", value1, value2, "promotionstarttime");
            return (Criteria) this;
        }

        public Criteria andPromotionstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("PromotionStartTime not between", value1, value2, "promotionstarttime");
            return (Criteria) this;
        }

        public Criteria andPromotionendtimeIsNull() {
            addCriterion("PromotionEndTime is null");
            return (Criteria) this;
        }

        public Criteria andPromotionendtimeIsNotNull() {
            addCriterion("PromotionEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionendtimeEqualTo(Date value) {
            addCriterion("PromotionEndTime =", value, "promotionendtime");
            return (Criteria) this;
        }

        public Criteria andPromotionendtimeNotEqualTo(Date value) {
            addCriterion("PromotionEndTime <>", value, "promotionendtime");
            return (Criteria) this;
        }

        public Criteria andPromotionendtimeGreaterThan(Date value) {
            addCriterion("PromotionEndTime >", value, "promotionendtime");
            return (Criteria) this;
        }

        public Criteria andPromotionendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PromotionEndTime >=", value, "promotionendtime");
            return (Criteria) this;
        }

        public Criteria andPromotionendtimeLessThan(Date value) {
            addCriterion("PromotionEndTime <", value, "promotionendtime");
            return (Criteria) this;
        }

        public Criteria andPromotionendtimeLessThanOrEqualTo(Date value) {
            addCriterion("PromotionEndTime <=", value, "promotionendtime");
            return (Criteria) this;
        }

        public Criteria andPromotionendtimeIn(List<Date> values) {
            addCriterion("PromotionEndTime in", values, "promotionendtime");
            return (Criteria) this;
        }

        public Criteria andPromotionendtimeNotIn(List<Date> values) {
            addCriterion("PromotionEndTime not in", values, "promotionendtime");
            return (Criteria) this;
        }

        public Criteria andPromotionendtimeBetween(Date value1, Date value2) {
            addCriterion("PromotionEndTime between", value1, value2, "promotionendtime");
            return (Criteria) this;
        }

        public Criteria andPromotionendtimeNotBetween(Date value1, Date value2) {
            addCriterion("PromotionEndTime not between", value1, value2, "promotionendtime");
            return (Criteria) this;
        }

        public Criteria andPromotionperlimitIsNull() {
            addCriterion("PromotionPerLimit is null");
            return (Criteria) this;
        }

        public Criteria andPromotionperlimitIsNotNull() {
            addCriterion("PromotionPerLimit is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionperlimitEqualTo(Integer value) {
            addCriterion("PromotionPerLimit =", value, "promotionperlimit");
            return (Criteria) this;
        }

        public Criteria andPromotionperlimitNotEqualTo(Integer value) {
            addCriterion("PromotionPerLimit <>", value, "promotionperlimit");
            return (Criteria) this;
        }

        public Criteria andPromotionperlimitGreaterThan(Integer value) {
            addCriterion("PromotionPerLimit >", value, "promotionperlimit");
            return (Criteria) this;
        }

        public Criteria andPromotionperlimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("PromotionPerLimit >=", value, "promotionperlimit");
            return (Criteria) this;
        }

        public Criteria andPromotionperlimitLessThan(Integer value) {
            addCriterion("PromotionPerLimit <", value, "promotionperlimit");
            return (Criteria) this;
        }

        public Criteria andPromotionperlimitLessThanOrEqualTo(Integer value) {
            addCriterion("PromotionPerLimit <=", value, "promotionperlimit");
            return (Criteria) this;
        }

        public Criteria andPromotionperlimitIn(List<Integer> values) {
            addCriterion("PromotionPerLimit in", values, "promotionperlimit");
            return (Criteria) this;
        }

        public Criteria andPromotionperlimitNotIn(List<Integer> values) {
            addCriterion("PromotionPerLimit not in", values, "promotionperlimit");
            return (Criteria) this;
        }

        public Criteria andPromotionperlimitBetween(Integer value1, Integer value2) {
            addCriterion("PromotionPerLimit between", value1, value2, "promotionperlimit");
            return (Criteria) this;
        }

        public Criteria andPromotionperlimitNotBetween(Integer value1, Integer value2) {
            addCriterion("PromotionPerLimit not between", value1, value2, "promotionperlimit");
            return (Criteria) this;
        }

        public Criteria andProductcategorynameIsNull() {
            addCriterion("ProductCategoryName is null");
            return (Criteria) this;
        }

        public Criteria andProductcategorynameIsNotNull() {
            addCriterion("ProductCategoryName is not null");
            return (Criteria) this;
        }

        public Criteria andProductcategorynameEqualTo(String value) {
            addCriterion("ProductCategoryName =", value, "productcategoryname");
            return (Criteria) this;
        }

        public Criteria andProductcategorynameNotEqualTo(String value) {
            addCriterion("ProductCategoryName <>", value, "productcategoryname");
            return (Criteria) this;
        }

        public Criteria andProductcategorynameGreaterThan(String value) {
            addCriterion("ProductCategoryName >", value, "productcategoryname");
            return (Criteria) this;
        }

        public Criteria andProductcategorynameGreaterThanOrEqualTo(String value) {
            addCriterion("ProductCategoryName >=", value, "productcategoryname");
            return (Criteria) this;
        }

        public Criteria andProductcategorynameLessThan(String value) {
            addCriterion("ProductCategoryName <", value, "productcategoryname");
            return (Criteria) this;
        }

        public Criteria andProductcategorynameLessThanOrEqualTo(String value) {
            addCriterion("ProductCategoryName <=", value, "productcategoryname");
            return (Criteria) this;
        }

        public Criteria andProductcategorynameLike(String value) {
            addCriterion("ProductCategoryName like", value, "productcategoryname");
            return (Criteria) this;
        }

        public Criteria andProductcategorynameNotLike(String value) {
            addCriterion("ProductCategoryName not like", value, "productcategoryname");
            return (Criteria) this;
        }

        public Criteria andProductcategorynameIn(List<String> values) {
            addCriterion("ProductCategoryName in", values, "productcategoryname");
            return (Criteria) this;
        }

        public Criteria andProductcategorynameNotIn(List<String> values) {
            addCriterion("ProductCategoryName not in", values, "productcategoryname");
            return (Criteria) this;
        }

        public Criteria andProductcategorynameBetween(String value1, String value2) {
            addCriterion("ProductCategoryName between", value1, value2, "productcategoryname");
            return (Criteria) this;
        }

        public Criteria andProductcategorynameNotBetween(String value1, String value2) {
            addCriterion("ProductCategoryName not between", value1, value2, "productcategoryname");
            return (Criteria) this;
        }

        public Criteria andBrandnameIsNull() {
            addCriterion("BrandName is null");
            return (Criteria) this;
        }

        public Criteria andBrandnameIsNotNull() {
            addCriterion("BrandName is not null");
            return (Criteria) this;
        }

        public Criteria andBrandnameEqualTo(String value) {
            addCriterion("BrandName =", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotEqualTo(String value) {
            addCriterion("BrandName <>", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameGreaterThan(String value) {
            addCriterion("BrandName >", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameGreaterThanOrEqualTo(String value) {
            addCriterion("BrandName >=", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLessThan(String value) {
            addCriterion("BrandName <", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLessThanOrEqualTo(String value) {
            addCriterion("BrandName <=", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameLike(String value) {
            addCriterion("BrandName like", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotLike(String value) {
            addCriterion("BrandName not like", value, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameIn(List<String> values) {
            addCriterion("BrandName in", values, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotIn(List<String> values) {
            addCriterion("BrandName not in", values, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameBetween(String value1, String value2) {
            addCriterion("BrandName between", value1, value2, "brandname");
            return (Criteria) this;
        }

        public Criteria andBrandnameNotBetween(String value1, String value2) {
            addCriterion("BrandName not between", value1, value2, "brandname");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
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