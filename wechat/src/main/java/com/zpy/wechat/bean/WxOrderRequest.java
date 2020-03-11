package com.zpy.wechat.bean;

import lombok.Data;

@Data
public class WxOrderRequest extends BaseRequest {


    /**
     * 1.通知地址
     * 2.是否必传：是
     * 3.备注：异步接收微信支付结果通知的回调地址，通知url必须为外网可访问的url，不允许带query参数
     */
    private String notify_url;

    /**
     * 1.交易类型
     * 2.是否必传：是
     * 3.备注：小程序取值如下：JSAPI
     */
    private String trade_type;

    /**
     * 1.用户标识
     * 2.是否必传：是
     * 3.备注：trade_type=JSAPI，此参数必传，用户在商户appid下的唯一标识。
     */
    private String openid;

    /**
     * 1.商品描述
     * 2.是否必传：是
     * 3.备注：商品简单描述，该字段请按照规范传递
     */
    private String body;

    /**
     * 1.商户订单号
     * 2.是否必传：是
     * 3.备注：商户系统内部订单号，要求32个字符内
     */
    private String out_trade_no;

    /**
     * 1.标价金额
     * 2.是否必传：是
     * 3.备注：订单总金额，单位为分
     */
    private String total_fee;

    /**
     * 1.终端IP
     * 2.是否必传：是
     * 3.备注：订单总金额，单位为分
     */
    private String spbill_create_ip;

    /**
     * 1.设备号
     * 2.是否必传：否
     * 3.备注：自定义参数，可以为终端设备号(门店号或收银设备ID)，PC网页或公众号内支付可以传"WEB"
     */
    private String device_info;

    /**
     * 1.商品详情
     * 2.是否必传：否
     * 3.备注：商品详细描述，对于使用单品优惠的商户，该字段必须按照规范上传
     */
    private String detail;

    /**
     * 1.附加数据
     * 2.是否必传：否
     * 3.备注：支付通知中原样返回，可作为自定义参数使用。
     */
    private String attach;

    /**
     * 1.标价币种
     * 2.是否必传：否
     * 3.备注：默认人民币：CNY
     */
    private Integer fee_type;

    /**
     * 1.交易起始时间
     * 2.是否必传：否
     * 3.备注：订单生成时间，格式为yyyyMMddHHmmss
     */
    private String time_start;

    /**
     * 1.交易结束时间
     * 2.是否必传：否
     * 3.备注： 订单失效时间，格式为yyyyMMddHHmmss （建议：最短失效时间间隔大于1分钟）
     */
    private String time_expire;

    /**
     * 1.订单优惠标记
     * 2.是否必传：否
     * 3.备注：订单优惠标记，使用代金券或立减优惠功能时需要的参数
     */
    private String goods_tag;

    /**
     * 1.商品ID
     * 2.是否必传：否
     * 3.备注：trade_type=NATIVE时，此参数必传。此参数为二维码中包含的商品ID，商户自行定义。
     */
    private String product_id;

    /**
     * 1.指定支付方式
     * 2.是否必传：否
     * 3.备注：no_credit	上传此参数no_credit--可限制用户不能使用信用卡支付
     */
    private String limit_pay;

    /**
     * 1.电子发票入口开放标识
     * 2.是否必传：否
     * 3.备注：Y，传入Y时，支付成功消息和支付详情页将出现开票入口。需要在微信支付商户平台或微信公众平台开通电子发票功能，传此字段才可生效
     */
    private String receipt;

}
