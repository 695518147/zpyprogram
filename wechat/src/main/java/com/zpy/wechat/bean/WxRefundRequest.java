package com.zpy.wechat.bean;

import lombok.Data;

@Data
public class WxRefundRequest extends BaseRequest {

    /**
     * 1.商户订单号
     * 2.是否必传：是
     * 3.备注：同一个商户号下唯一。transaction_id、out_trade_no二选一，如果同时存在优先级：transaction_id> out_trade_no
     */
    private String out_trade_no;

    /**
     * 1.商户退款单号
     * 2.是否必传：是
     * 3.备注：商户系统内部的退款单号，商户系统内部唯一
     */
    private String out_refund_no;

    /**
     * 1.订单金额
     * 2.是否必传：是
     * 3.备注：订单总金额，单位为分
     */
    private Integer total_fee;

    /**
     * 1.退款金额
     * 2.是否必传：是
     * 3.备注：退款总金额，订单总金额，单位为分
     */
    private Integer refund_fee;

    /**
     * 1.货币种类
     * 2.是否必传：否
     * 3.备注：CNY	货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY，
     */
    private String refund_fee_type;

    /**
     * 1.退款原因
     * 2.是否必传：否
     * 3.备注：若商户传入，会在下发给用户的退款消息中体现退款原因
     */
    private String refund_desc;

    /**
     * 1.退款资金来源
     * 2.是否必传：否
     * 3.备注：退款总金额，订单总金额，单位为分
     */
    private String refund_account;

    /**
     * 1.退款结果通知url
     * 2.是否必传：是
     * 3.备注：异步接收微信支付退款结果通知的回调地址，通知URL必须为外网可访问的url，不允许带query参数，
     *        如果参数中传了notify_url，则商户平台上配置的回调地址将不会生效。
     */
    private String notify_url;

}
