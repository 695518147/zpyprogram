package com.zpy.wechat.bean;

import lombok.Data;

@Data
public class WxOrderQueryReqonse extends BaseReponse {

    // 以下字段在return_code为SUCCESS的时候有返回
    /**
     * 1.小程序ID
     * 2.是否必传：是
     * 3.备注：微信分配的小程序ID
     */
    private String appid;

    /**
     * 1.商户号
     * 2.是否必传：是
     * 3.备注：微信支付分配的商户号
     */
    private String mch_id;

    /**
     * 1.随机字符串
     * 2.是否必传：是
     * 3.备注：随机字符串，长度要求在32位以内。
     */
    private String nonce_str;

    /**
     * 1.签名
     * 2.是否必传：是
     * 3.备注：通过签名算法计算得出的签名值
     */
    private String sign;

    /**
     * 1.业务结果：SUCCESS/FAIL
     * 2.是否必传：是
     * 3.备注：
     */
    private String result_code;

    /**
     * 1.错误代码
     * 2.是否必传：否
     * 3.备注：
     */
    private String err_code;

    /**
     * 1.错误代码描述
     * 2.是否必传：否
     * 3.备注：系统错误	错误信息描述
     */
    private String err_code_des;

    // 以下字段在return_code 、result_code、trade_state都为SUCCESS时有返回 ，
    // 如trade_state不为 SUCCESS，则只返回out_trade_no（必传）和attach（选传）。

    /**
     * 1.设备号
     * 2.是否必传：否
     * 3.备注：自定义参数，可以为请求支付的终端设备号等
     */
    private String device_info;

    /**
     * 1.用户标识
     * 2.是否必传：是
     * 3.备注：用户在商户appid下的唯一标识
     */
    private String openid;

    /**
     * 1.交易类型：取值为：JSAPI，NATIVE，APP等
     * 2.是否必传：是
     * 3.备注：
     */
    private String trade_type;

    /**
     * 1.交易状态
     * 2.是否必传：是
     * 3.备注： SUCCESS—支付成功 REFUND—转入退款 NOTPAY—未支付 CLOSED—已关闭 REVOKED—已撤销（刷卡支付） USERPAYING--用户支付中 PAYERROR--支付失败(其他原因，如银行返回失败)
     */
    private String trade_state;

    /**
     * 1.是否关注公众账号
     * 2.是否必传：是
     * 3.备注：系统错误	错误信息描述
     */
    private String is_subscribe;

    /**
     * 1.标价金额
     * 2.是否必传：是
     * 3.备注：
     */
    private String total_fee;

    /**
     * 1.付款银行
     * 2.是否必传：是
     * 3.备注：
     */
    private Integer bank_type;

    /**
     * 1.应结订单金额
     * 2.是否必传：否
     * 3.备注：
     */
    private Integer settlement_total_fee;

    /**
     * 1.标价币种
     * 2.是否必传：否
     * 3.备注：
     */
    private String fee_type;

    /**
     * 1.现金支付金额
     * 2.是否必传：是
     * 3.备注：
     */
    private Integer cash_fee;

    /**
     * 1.现金支付币种
     * 2.是否必传：否
     * 3.备注：
     */
    private String cash_fee_type;

    /**
     * 1.代金券金额
     * 2.是否必传：否
     * 3.备注：
     */
    private Integer coupon_fee;

    /**
     * 1.代金券使用数量
     * 2.是否必传：否
     * 3.备注：
     */
    private Integer coupon_count;

    /**
     * 1.代金券类型
     * 2.是否必传：否
     * 3.备注：
     */
    private String coupon_type_$n;

    /**
     * 1.微信支付订单号
     * 2.是否必传：是
     * 3.备注：
     */
    private String transaction_id;

    /**
     * 1.商户订单号
     * 2.是否必传：是
     * 3.备注：
     */
    private String out_trade_no;

    /**
     * 1.附加数据
     * 2.是否必传：否
     * 3.备注：
     */
    private String attach;

    /**
     * 1.支付完成时间
     * 2.是否必传：是
     * 3.备注：
     */
    private String time_end;

    /**
     * 1.交易状态描述
     * 2.是否必传：是
     * 3.备注：支付失败，请重新下单支付
     */
    private String trade_state_desc;

}
