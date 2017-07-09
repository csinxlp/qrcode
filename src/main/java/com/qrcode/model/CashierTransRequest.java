/**
 * eigpay.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.qrcode.model;

import java.io.Serializable;

/**
 * 交易申请
 * @version $Id: CashierTransRequest.java, v 0.1 2016年9月19日 下午6:14:59 wb-xiaoyanhong Exp $
 */
public class CashierTransRequest implements Serializable {
    
    /**  */
    private static final long serialVersionUID = 206672216909074612L;
    /**
     * 应用编号（必填）
     */
    private String appId;
    /**
     * 服务id
     */
    private String serviceId;
    /**
     * JSON或者XML或者FORM（必填）
     */
    private String format;
    /**
     *字符编码（必填）
     */
    private String charset;
    /**
     * 签名方式（必填）
     */
    private String signType;
    /**
     * 签名（必填）
     */
    private String sign;
    /**
     * 版本（必填）
     */
    private String version;
    /**
     * 请求发起时间（必填）
     */
    private String sendTime;
    /**
     * 同步跳转url
     */
    private String returnUrl;
    /**
     * 异步通知url（必填）
     */
    private String notifyUrl;
    /**
     * 订单号（必填）
     */
    private String orderId;
    /**
     * 原订单号
     */
    private String orgOrderId;
    /**
     * 支付方式
     */
    private String payType;
    /**
     * 业务类型（必填）
     */
    private String bizType;
    /**
     * 交易金额，元为单位，精确到小数点2位
     * （必填）
     */
    private String amt;
    /**
     * 币种（必填）
     */
    private String currencyCode;
    /**
     * 商品名称/订单描述
     */
    private String prodNm;

    /**
     * 商品详情
     */
    private String prodInfo;
    /**
     * 交易超时时间（必填）
     */
    private String timeOut;
    /**
     * 受理渠道类型（必填）
     */
    private String acqType;
    /**
     * 终端IP
     */
    private String termIp;
    /**
     * 终端id
     */
    private String termId;
    /**
     * 借贷标识
     */
    private String cardType;
    /**
     * 支付渠道 就是原来的channelId
     */
    private String mop;
    /**
     * 收款方用户名
     */
    private String payeeId;
    /**
     * 收款方名称
     */
    private String payeeNm;
    /**e
     * 收款方账号
     */
    private String payeeAcctId;
    /**
     * 付款方用户名
     */
    private String payerId;
    /**
     * 付款方名称
     */
    private String payerName;

    /**
     * 付款方账号
     */
    private String payerAcctId;
    /**
     * 付款方机构
     */
    private String payerAcctInst;
    /**
     * 商户保留域
     */
    private String reserve;
    /**
     * 扩展参数
     */
    private String extraParam;
    /**
     * 支付渠道特征参数
     */
    private String mopParam;

    /**
     * 授权码
     */
    private String tokenCd;

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getProdNm() {
        return prodNm;
    }

    public void setProdNm(String prodNm) {
        this.prodNm = prodNm;
    }

    public String getProdInfo() {
        return prodInfo;
    }

    public void setProdInfo(String prodInfo) {
        this.prodInfo = prodInfo;
    }

    public String getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }

    public String getAcqType() {
        return acqType;
    }

    public void setAcqType(String acqType) {
        this.acqType = acqType;
    }

    public String getTermIp() {
        return termIp;
    }

    public void setTermIp(String termIp) {
        this.termIp = termIp;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getMop() {
        return mop;
    }

    public void setMop(String mop) {
        this.mop = mop;
    }

    public String getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(String payeeId) {
        this.payeeId = payeeId;
    }

    public String getPayeeAcctId() {
        return payeeAcctId;
    }

    public void setPayeeAcctId(String payeeAcctId) {
        this.payeeAcctId = payeeAcctId;
    }

    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    public String getPayerAcctId() {
        return payerAcctId;
    }

    public void setPayerAcctId(String payerAcctId) {
        this.payerAcctId = payerAcctId;
    }

    public String getPayerAcctInst() {
        return payerAcctInst;
    }

    public void setPayerAcctInst(String payerAcctInst) {
        this.payerAcctInst = payerAcctInst;
    }

    public String getReserve() {
        return reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    public String getExtraParam() {
        return extraParam;
    }

    public void setExtraParam(String extraParam) {
        this.extraParam = extraParam;
    }

    public String getMopParam() {
        return mopParam;
    }

    public void setMopParam(String mopParam) {
        this.mopParam = mopParam;
    }

    public String getTokenCd() {
        return tokenCd;
    }

    public void setTokenCd(String tokenCd) {
        this.tokenCd = tokenCd;
    }

    public String getTermId() {
        return termId;
    }

    public void setTermId(String termId) {
        this.termId = termId;
    }

    public String getOrgOrderId() {
        return orgOrderId;
    }

    public void setOrgOrderId(String orgOrderId) {
        this.orgOrderId = orgOrderId;
    }

    public String getPayeeNm() {
        return payeeNm;
    }

    public void setPayeeNm(String payeeNm) {
        this.payeeNm = payeeNm;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

	@Override
	public String toString() {
		return "CashierTransRequest [appId=" + appId + ", serviceId="
				+ serviceId + ", format=" + format + ", charset=" + charset
				+ ", signType=" + signType + ", sign=" + sign + ", version="
				+ version + ", sendTime=" + sendTime + ", returnUrl="
				+ returnUrl + ", notifyUrl=" + notifyUrl + ", orderId="
				+ orderId + ", orgOrderId=" + orgOrderId + ", payType="
				+ payType + ", bizType=" + bizType + ", amt=" + amt
				+ ", currencyCode=" + currencyCode + ", prodNm=" + prodNm
				+ ", prodInfo=" + prodInfo + ", timeOut=" + timeOut
				+ ", acqType=" + acqType + ", termIp=" + termIp + ", termId="
				+ termId + ", cardType=" + cardType + ", mop=" + mop
				+ ", payeeId=" + payeeId + ", payeeNm=" + payeeNm
				+ ", payeeAcctId=" + payeeAcctId + ", payerId=" + payerId
				+ ", payerName=" + payerName + ", payerAcctId=" + payerAcctId
				+ ", payerAcctInst=" + payerAcctInst + ", reserve=" + reserve
				+ ", extraParam=" + extraParam + ", mopParam=" + mopParam
				+ ", tokenCd=" + tokenCd + "]";
	}

}
