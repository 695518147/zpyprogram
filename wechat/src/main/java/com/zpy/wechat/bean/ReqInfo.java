package com.zpy.wechat.bean;

import lombok.Data;

@Data
public class ReqInfo {

    /**
     * 1.微信订单号
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
     * 1.商户退款单号
     * 2.是否必传：是
     * 3.备注：
     */
    private String out_refund_no;

    /**
     * 1.微信退款单号
     * 2.是否必传：是
     * 3.备注：
     */
    private String refund_id;

    /**
     * 1.退款金额
     * 2.是否必传：是
     * 3.备注：
     */
    private Integer refund_fee;

    /**
     * 1.应结退款金额
     * 2.是否必传：否
     * 3.备注：
     */
    private Integer settlement_refund_fee;

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
     * 1.退款状态
     * 2.是否必传：是
     * 3.备注：SUCCESS-退款成功 CHANGE-退款异常 REFUNDCLOSE—退款关闭
     */
    private Integer refund_status;

    /**
     * 1.退款成功时间
     * 2.是否必传：是
     * 3.备注：资金退款至用户帐号的时间，格式2017-12-15 09:46:01
     */
    private String success_time;

    /**
     * 1.退款入账账户
     * 2.是否必传：是
     * 3.备注：
     */
    private Integer refund_recv_accout;

    /**
     * 1.退款资金来源
     * 2.是否必传：是
     * 3.备注：
     */
    private Integer refund_account;

    /**
     * 1.退款发起来源
     * 2.是否必传：是
     * 3.备注：
     */
    private Integer refund_request_source;

}
