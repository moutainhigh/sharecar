package com.dower.sharerideapp.core.serverdb.model;

import java.util.ArrayList;
import java.util.List;

public class NntUsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NntUsersExample() {
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

        public Criteria andNumIdIsNull() {
            addCriterion("NUM_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumIdIsNotNull() {
            addCriterion("NUM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumIdEqualTo(Integer value) {
            addCriterion("NUM_ID =", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdNotEqualTo(Integer value) {
            addCriterion("NUM_ID <>", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdGreaterThan(Integer value) {
            addCriterion("NUM_ID >", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_ID >=", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdLessThan(Integer value) {
            addCriterion("NUM_ID <", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_ID <=", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdIn(List<Integer> values) {
            addCriterion("NUM_ID in", values, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdNotIn(List<Integer> values) {
            addCriterion("NUM_ID not in", values, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ID between", value1, value2, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ID not between", value1, value2, "numId");
            return (Criteria) this;
        }

        public Criteria andVcNicknameIsNull() {
            addCriterion("VC_NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andVcNicknameIsNotNull() {
            addCriterion("VC_NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andVcNicknameEqualTo(String value) {
            addCriterion("VC_NICKNAME =", value, "vcNickname");
            return (Criteria) this;
        }

        public Criteria andVcNicknameNotEqualTo(String value) {
            addCriterion("VC_NICKNAME <>", value, "vcNickname");
            return (Criteria) this;
        }

        public Criteria andVcNicknameGreaterThan(String value) {
            addCriterion("VC_NICKNAME >", value, "vcNickname");
            return (Criteria) this;
        }

        public Criteria andVcNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("VC_NICKNAME >=", value, "vcNickname");
            return (Criteria) this;
        }

        public Criteria andVcNicknameLessThan(String value) {
            addCriterion("VC_NICKNAME <", value, "vcNickname");
            return (Criteria) this;
        }

        public Criteria andVcNicknameLessThanOrEqualTo(String value) {
            addCriterion("VC_NICKNAME <=", value, "vcNickname");
            return (Criteria) this;
        }

        public Criteria andVcNicknameLike(String value) {
            addCriterion("VC_NICKNAME like", value, "vcNickname");
            return (Criteria) this;
        }

        public Criteria andVcNicknameNotLike(String value) {
            addCriterion("VC_NICKNAME not like", value, "vcNickname");
            return (Criteria) this;
        }

        public Criteria andVcNicknameIn(List<String> values) {
            addCriterion("VC_NICKNAME in", values, "vcNickname");
            return (Criteria) this;
        }

        public Criteria andVcNicknameNotIn(List<String> values) {
            addCriterion("VC_NICKNAME not in", values, "vcNickname");
            return (Criteria) this;
        }

        public Criteria andVcNicknameBetween(String value1, String value2) {
            addCriterion("VC_NICKNAME between", value1, value2, "vcNickname");
            return (Criteria) this;
        }

        public Criteria andVcNicknameNotBetween(String value1, String value2) {
            addCriterion("VC_NICKNAME not between", value1, value2, "vcNickname");
            return (Criteria) this;
        }

        public Criteria andVcOpenidIsNull() {
            addCriterion("VC_OPENID is null");
            return (Criteria) this;
        }

        public Criteria andVcOpenidIsNotNull() {
            addCriterion("VC_OPENID is not null");
            return (Criteria) this;
        }

        public Criteria andVcOpenidEqualTo(String value) {
            addCriterion("VC_OPENID =", value, "vcOpenid");
            return (Criteria) this;
        }

        public Criteria andVcOpenidNotEqualTo(String value) {
            addCriterion("VC_OPENID <>", value, "vcOpenid");
            return (Criteria) this;
        }

        public Criteria andVcOpenidGreaterThan(String value) {
            addCriterion("VC_OPENID >", value, "vcOpenid");
            return (Criteria) this;
        }

        public Criteria andVcOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("VC_OPENID >=", value, "vcOpenid");
            return (Criteria) this;
        }

        public Criteria andVcOpenidLessThan(String value) {
            addCriterion("VC_OPENID <", value, "vcOpenid");
            return (Criteria) this;
        }

        public Criteria andVcOpenidLessThanOrEqualTo(String value) {
            addCriterion("VC_OPENID <=", value, "vcOpenid");
            return (Criteria) this;
        }

        public Criteria andVcOpenidLike(String value) {
            addCriterion("VC_OPENID like", value, "vcOpenid");
            return (Criteria) this;
        }

        public Criteria andVcOpenidNotLike(String value) {
            addCriterion("VC_OPENID not like", value, "vcOpenid");
            return (Criteria) this;
        }

        public Criteria andVcOpenidIn(List<String> values) {
            addCriterion("VC_OPENID in", values, "vcOpenid");
            return (Criteria) this;
        }

        public Criteria andVcOpenidNotIn(List<String> values) {
            addCriterion("VC_OPENID not in", values, "vcOpenid");
            return (Criteria) this;
        }

        public Criteria andVcOpenidBetween(String value1, String value2) {
            addCriterion("VC_OPENID between", value1, value2, "vcOpenid");
            return (Criteria) this;
        }

        public Criteria andVcOpenidNotBetween(String value1, String value2) {
            addCriterion("VC_OPENID not between", value1, value2, "vcOpenid");
            return (Criteria) this;
        }

        public Criteria andVcPhoneIsNull() {
            addCriterion("VC_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andVcPhoneIsNotNull() {
            addCriterion("VC_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andVcPhoneEqualTo(String value) {
            addCriterion("VC_PHONE =", value, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneNotEqualTo(String value) {
            addCriterion("VC_PHONE <>", value, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneGreaterThan(String value) {
            addCriterion("VC_PHONE >", value, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("VC_PHONE >=", value, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneLessThan(String value) {
            addCriterion("VC_PHONE <", value, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneLessThanOrEqualTo(String value) {
            addCriterion("VC_PHONE <=", value, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneLike(String value) {
            addCriterion("VC_PHONE like", value, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneNotLike(String value) {
            addCriterion("VC_PHONE not like", value, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneIn(List<String> values) {
            addCriterion("VC_PHONE in", values, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneNotIn(List<String> values) {
            addCriterion("VC_PHONE not in", values, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneBetween(String value1, String value2) {
            addCriterion("VC_PHONE between", value1, value2, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneNotBetween(String value1, String value2) {
            addCriterion("VC_PHONE not between", value1, value2, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcRemarkIsNull() {
            addCriterion("VC_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andVcRemarkIsNotNull() {
            addCriterion("VC_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andVcRemarkEqualTo(String value) {
            addCriterion("VC_REMARK =", value, "vcRemark");
            return (Criteria) this;
        }

        public Criteria andVcRemarkNotEqualTo(String value) {
            addCriterion("VC_REMARK <>", value, "vcRemark");
            return (Criteria) this;
        }

        public Criteria andVcRemarkGreaterThan(String value) {
            addCriterion("VC_REMARK >", value, "vcRemark");
            return (Criteria) this;
        }

        public Criteria andVcRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("VC_REMARK >=", value, "vcRemark");
            return (Criteria) this;
        }

        public Criteria andVcRemarkLessThan(String value) {
            addCriterion("VC_REMARK <", value, "vcRemark");
            return (Criteria) this;
        }

        public Criteria andVcRemarkLessThanOrEqualTo(String value) {
            addCriterion("VC_REMARK <=", value, "vcRemark");
            return (Criteria) this;
        }

        public Criteria andVcRemarkLike(String value) {
            addCriterion("VC_REMARK like", value, "vcRemark");
            return (Criteria) this;
        }

        public Criteria andVcRemarkNotLike(String value) {
            addCriterion("VC_REMARK not like", value, "vcRemark");
            return (Criteria) this;
        }

        public Criteria andVcRemarkIn(List<String> values) {
            addCriterion("VC_REMARK in", values, "vcRemark");
            return (Criteria) this;
        }

        public Criteria andVcRemarkNotIn(List<String> values) {
            addCriterion("VC_REMARK not in", values, "vcRemark");
            return (Criteria) this;
        }

        public Criteria andVcRemarkBetween(String value1, String value2) {
            addCriterion("VC_REMARK between", value1, value2, "vcRemark");
            return (Criteria) this;
        }

        public Criteria andVcRemarkNotBetween(String value1, String value2) {
            addCriterion("VC_REMARK not between", value1, value2, "vcRemark");
            return (Criteria) this;
        }

        public Criteria andNumLevelIsNull() {
            addCriterion("NUM_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andNumLevelIsNotNull() {
            addCriterion("NUM_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andNumLevelEqualTo(Integer value) {
            addCriterion("NUM_LEVEL =", value, "numLevel");
            return (Criteria) this;
        }

        public Criteria andNumLevelNotEqualTo(Integer value) {
            addCriterion("NUM_LEVEL <>", value, "numLevel");
            return (Criteria) this;
        }

        public Criteria andNumLevelGreaterThan(Integer value) {
            addCriterion("NUM_LEVEL >", value, "numLevel");
            return (Criteria) this;
        }

        public Criteria andNumLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_LEVEL >=", value, "numLevel");
            return (Criteria) this;
        }

        public Criteria andNumLevelLessThan(Integer value) {
            addCriterion("NUM_LEVEL <", value, "numLevel");
            return (Criteria) this;
        }

        public Criteria andNumLevelLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_LEVEL <=", value, "numLevel");
            return (Criteria) this;
        }

        public Criteria andNumLevelIn(List<Integer> values) {
            addCriterion("NUM_LEVEL in", values, "numLevel");
            return (Criteria) this;
        }

        public Criteria andNumLevelNotIn(List<Integer> values) {
            addCriterion("NUM_LEVEL not in", values, "numLevel");
            return (Criteria) this;
        }

        public Criteria andNumLevelBetween(Integer value1, Integer value2) {
            addCriterion("NUM_LEVEL between", value1, value2, "numLevel");
            return (Criteria) this;
        }

        public Criteria andNumLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_LEVEL not between", value1, value2, "numLevel");
            return (Criteria) this;
        }

        public Criteria andVcRealNameIsNull() {
            addCriterion("VC_REAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVcRealNameIsNotNull() {
            addCriterion("VC_REAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVcRealNameEqualTo(String value) {
            addCriterion("VC_REAL_NAME =", value, "vcRealName");
            return (Criteria) this;
        }

        public Criteria andVcRealNameNotEqualTo(String value) {
            addCriterion("VC_REAL_NAME <>", value, "vcRealName");
            return (Criteria) this;
        }

        public Criteria andVcRealNameGreaterThan(String value) {
            addCriterion("VC_REAL_NAME >", value, "vcRealName");
            return (Criteria) this;
        }

        public Criteria andVcRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("VC_REAL_NAME >=", value, "vcRealName");
            return (Criteria) this;
        }

        public Criteria andVcRealNameLessThan(String value) {
            addCriterion("VC_REAL_NAME <", value, "vcRealName");
            return (Criteria) this;
        }

        public Criteria andVcRealNameLessThanOrEqualTo(String value) {
            addCriterion("VC_REAL_NAME <=", value, "vcRealName");
            return (Criteria) this;
        }

        public Criteria andVcRealNameLike(String value) {
            addCriterion("VC_REAL_NAME like", value, "vcRealName");
            return (Criteria) this;
        }

        public Criteria andVcRealNameNotLike(String value) {
            addCriterion("VC_REAL_NAME not like", value, "vcRealName");
            return (Criteria) this;
        }

        public Criteria andVcRealNameIn(List<String> values) {
            addCriterion("VC_REAL_NAME in", values, "vcRealName");
            return (Criteria) this;
        }

        public Criteria andVcRealNameNotIn(List<String> values) {
            addCriterion("VC_REAL_NAME not in", values, "vcRealName");
            return (Criteria) this;
        }

        public Criteria andVcRealNameBetween(String value1, String value2) {
            addCriterion("VC_REAL_NAME between", value1, value2, "vcRealName");
            return (Criteria) this;
        }

        public Criteria andVcRealNameNotBetween(String value1, String value2) {
            addCriterion("VC_REAL_NAME not between", value1, value2, "vcRealName");
            return (Criteria) this;
        }

        public Criteria andNumStateIsNull() {
            addCriterion("NUM_STATE is null");
            return (Criteria) this;
        }

        public Criteria andNumStateIsNotNull() {
            addCriterion("NUM_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andNumStateEqualTo(Integer value) {
            addCriterion("NUM_STATE =", value, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateNotEqualTo(Integer value) {
            addCriterion("NUM_STATE <>", value, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateGreaterThan(Integer value) {
            addCriterion("NUM_STATE >", value, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_STATE >=", value, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateLessThan(Integer value) {
            addCriterion("NUM_STATE <", value, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_STATE <=", value, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateIn(List<Integer> values) {
            addCriterion("NUM_STATE in", values, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateNotIn(List<Integer> values) {
            addCriterion("NUM_STATE not in", values, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateBetween(Integer value1, Integer value2) {
            addCriterion("NUM_STATE between", value1, value2, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_STATE not between", value1, value2, "numState");
            return (Criteria) this;
        }

        public Criteria andVcHeadImgUrlIsNull() {
            addCriterion("VC_HEAD_IMG_URL is null");
            return (Criteria) this;
        }

        public Criteria andVcHeadImgUrlIsNotNull() {
            addCriterion("VC_HEAD_IMG_URL is not null");
            return (Criteria) this;
        }

        public Criteria andVcHeadImgUrlEqualTo(String value) {
            addCriterion("VC_HEAD_IMG_URL =", value, "vcHeadImgUrl");
            return (Criteria) this;
        }

        public Criteria andVcHeadImgUrlNotEqualTo(String value) {
            addCriterion("VC_HEAD_IMG_URL <>", value, "vcHeadImgUrl");
            return (Criteria) this;
        }

        public Criteria andVcHeadImgUrlGreaterThan(String value) {
            addCriterion("VC_HEAD_IMG_URL >", value, "vcHeadImgUrl");
            return (Criteria) this;
        }

        public Criteria andVcHeadImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("VC_HEAD_IMG_URL >=", value, "vcHeadImgUrl");
            return (Criteria) this;
        }

        public Criteria andVcHeadImgUrlLessThan(String value) {
            addCriterion("VC_HEAD_IMG_URL <", value, "vcHeadImgUrl");
            return (Criteria) this;
        }

        public Criteria andVcHeadImgUrlLessThanOrEqualTo(String value) {
            addCriterion("VC_HEAD_IMG_URL <=", value, "vcHeadImgUrl");
            return (Criteria) this;
        }

        public Criteria andVcHeadImgUrlLike(String value) {
            addCriterion("VC_HEAD_IMG_URL like", value, "vcHeadImgUrl");
            return (Criteria) this;
        }

        public Criteria andVcHeadImgUrlNotLike(String value) {
            addCriterion("VC_HEAD_IMG_URL not like", value, "vcHeadImgUrl");
            return (Criteria) this;
        }

        public Criteria andVcHeadImgUrlIn(List<String> values) {
            addCriterion("VC_HEAD_IMG_URL in", values, "vcHeadImgUrl");
            return (Criteria) this;
        }

        public Criteria andVcHeadImgUrlNotIn(List<String> values) {
            addCriterion("VC_HEAD_IMG_URL not in", values, "vcHeadImgUrl");
            return (Criteria) this;
        }

        public Criteria andVcHeadImgUrlBetween(String value1, String value2) {
            addCriterion("VC_HEAD_IMG_URL between", value1, value2, "vcHeadImgUrl");
            return (Criteria) this;
        }

        public Criteria andVcHeadImgUrlNotBetween(String value1, String value2) {
            addCriterion("VC_HEAD_IMG_URL not between", value1, value2, "vcHeadImgUrl");
            return (Criteria) this;
        }

        public Criteria andVcUnionidIsNull() {
            addCriterion("VC_UNIONID is null");
            return (Criteria) this;
        }

        public Criteria andVcUnionidIsNotNull() {
            addCriterion("VC_UNIONID is not null");
            return (Criteria) this;
        }

        public Criteria andVcUnionidEqualTo(String value) {
            addCriterion("VC_UNIONID =", value, "vcUnionid");
            return (Criteria) this;
        }

        public Criteria andVcUnionidNotEqualTo(String value) {
            addCriterion("VC_UNIONID <>", value, "vcUnionid");
            return (Criteria) this;
        }

        public Criteria andVcUnionidGreaterThan(String value) {
            addCriterion("VC_UNIONID >", value, "vcUnionid");
            return (Criteria) this;
        }

        public Criteria andVcUnionidGreaterThanOrEqualTo(String value) {
            addCriterion("VC_UNIONID >=", value, "vcUnionid");
            return (Criteria) this;
        }

        public Criteria andVcUnionidLessThan(String value) {
            addCriterion("VC_UNIONID <", value, "vcUnionid");
            return (Criteria) this;
        }

        public Criteria andVcUnionidLessThanOrEqualTo(String value) {
            addCriterion("VC_UNIONID <=", value, "vcUnionid");
            return (Criteria) this;
        }

        public Criteria andVcUnionidLike(String value) {
            addCriterion("VC_UNIONID like", value, "vcUnionid");
            return (Criteria) this;
        }

        public Criteria andVcUnionidNotLike(String value) {
            addCriterion("VC_UNIONID not like", value, "vcUnionid");
            return (Criteria) this;
        }

        public Criteria andVcUnionidIn(List<String> values) {
            addCriterion("VC_UNIONID in", values, "vcUnionid");
            return (Criteria) this;
        }

        public Criteria andVcUnionidNotIn(List<String> values) {
            addCriterion("VC_UNIONID not in", values, "vcUnionid");
            return (Criteria) this;
        }

        public Criteria andVcUnionidBetween(String value1, String value2) {
            addCriterion("VC_UNIONID between", value1, value2, "vcUnionid");
            return (Criteria) this;
        }

        public Criteria andVcUnionidNotBetween(String value1, String value2) {
            addCriterion("VC_UNIONID not between", value1, value2, "vcUnionid");
            return (Criteria) this;
        }

        public Criteria andVcSubscribeSceneIsNull() {
            addCriterion("VC_SUBSCRIBE_SCENE is null");
            return (Criteria) this;
        }

        public Criteria andVcSubscribeSceneIsNotNull() {
            addCriterion("VC_SUBSCRIBE_SCENE is not null");
            return (Criteria) this;
        }

        public Criteria andVcSubscribeSceneEqualTo(String value) {
            addCriterion("VC_SUBSCRIBE_SCENE =", value, "vcSubscribeScene");
            return (Criteria) this;
        }

        public Criteria andVcSubscribeSceneNotEqualTo(String value) {
            addCriterion("VC_SUBSCRIBE_SCENE <>", value, "vcSubscribeScene");
            return (Criteria) this;
        }

        public Criteria andVcSubscribeSceneGreaterThan(String value) {
            addCriterion("VC_SUBSCRIBE_SCENE >", value, "vcSubscribeScene");
            return (Criteria) this;
        }

        public Criteria andVcSubscribeSceneGreaterThanOrEqualTo(String value) {
            addCriterion("VC_SUBSCRIBE_SCENE >=", value, "vcSubscribeScene");
            return (Criteria) this;
        }

        public Criteria andVcSubscribeSceneLessThan(String value) {
            addCriterion("VC_SUBSCRIBE_SCENE <", value, "vcSubscribeScene");
            return (Criteria) this;
        }

        public Criteria andVcSubscribeSceneLessThanOrEqualTo(String value) {
            addCriterion("VC_SUBSCRIBE_SCENE <=", value, "vcSubscribeScene");
            return (Criteria) this;
        }

        public Criteria andVcSubscribeSceneLike(String value) {
            addCriterion("VC_SUBSCRIBE_SCENE like", value, "vcSubscribeScene");
            return (Criteria) this;
        }

        public Criteria andVcSubscribeSceneNotLike(String value) {
            addCriterion("VC_SUBSCRIBE_SCENE not like", value, "vcSubscribeScene");
            return (Criteria) this;
        }

        public Criteria andVcSubscribeSceneIn(List<String> values) {
            addCriterion("VC_SUBSCRIBE_SCENE in", values, "vcSubscribeScene");
            return (Criteria) this;
        }

        public Criteria andVcSubscribeSceneNotIn(List<String> values) {
            addCriterion("VC_SUBSCRIBE_SCENE not in", values, "vcSubscribeScene");
            return (Criteria) this;
        }

        public Criteria andVcSubscribeSceneBetween(String value1, String value2) {
            addCriterion("VC_SUBSCRIBE_SCENE between", value1, value2, "vcSubscribeScene");
            return (Criteria) this;
        }

        public Criteria andVcSubscribeSceneNotBetween(String value1, String value2) {
            addCriterion("VC_SUBSCRIBE_SCENE not between", value1, value2, "vcSubscribeScene");
            return (Criteria) this;
        }

        public Criteria andNumUserIdIsNull() {
            addCriterion("NUM_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumUserIdIsNotNull() {
            addCriterion("NUM_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumUserIdEqualTo(String value) {
            addCriterion("NUM_USER_ID =", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdNotEqualTo(String value) {
            addCriterion("NUM_USER_ID <>", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdGreaterThan(String value) {
            addCriterion("NUM_USER_ID >", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("NUM_USER_ID >=", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdLessThan(String value) {
            addCriterion("NUM_USER_ID <", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdLessThanOrEqualTo(String value) {
            addCriterion("NUM_USER_ID <=", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdLike(String value) {
            addCriterion("NUM_USER_ID like", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdNotLike(String value) {
            addCriterion("NUM_USER_ID not like", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdIn(List<String> values) {
            addCriterion("NUM_USER_ID in", values, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdNotIn(List<String> values) {
            addCriterion("NUM_USER_ID not in", values, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdBetween(String value1, String value2) {
            addCriterion("NUM_USER_ID between", value1, value2, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdNotBetween(String value1, String value2) {
            addCriterion("NUM_USER_ID not between", value1, value2, "numUserId");
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