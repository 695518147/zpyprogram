package com.zpy.wechat.bean;

import lombok.Data;

@Data
public class WxPayNotifyRequest extends BaseReponse {

    // 以下字段在return_code为SUCCESS的时候有返回
    /**
     * 1.小程序ID
     * 2.是否必传：是
     * 3.备注：
     */
    private String appid;

    /**
     * 1.商户号
     * 2.是否必传：是
     * 3.备注：
     */
    private String mch_id;

    /**
     * 1.随机字符串
     * 2.是否必传：是
     * 3.备注：
     */
    private String nonce_str;

    /**
     * 1.签名
     * 2.是否必传：是
     * 3.备注：
     */
    private String sign;

    /**
     * 1.签名类型
     * 2.是否必传：否
     * 3.备注：
     */
    private String sign_type;

    /**
     * 1.业务结果：SUCCESS/FAIL
     * 2.是否必传：是
     * 3.备注：SUCCESS退款申请接收成功，结果通过退款查询接口查询
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
     * 3.备注：
     */
    private String err_code_des;

    /**
     * 1.用户标识
     * 2.是否必传：是
     * 3.备注：
     */
    private String openid;

    /**
     * 1.是否关注公众账号
     * 2.是否必传：是
     * 3.备注：用户是否关注公众账号，Y-关注，N-未关注
     */
    private String is_subscribe;

    /**
     * 1.付款银行
     * 2.是否必传：是
     * 3.备注：
     */
    private String bank_type;

    /**
     * 1.标价金额
     * 2.是否必传：是
     * 3.备注：
     */
    private Integer total_fee;

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
     * 1.现金退款金额
     * 2.是否必传：否
     * 3.备注：
     */
    private Integer cash_refund_fee;

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
     * 1.商家数据包，原样返回
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

}
