package com.zpy.wechat.bean;

import lombok.Data;

@Data
public class WxOrderReponse extends BaseReponse {

    // 以下字段在return_code为SUCCESS的时候有返回
    /**
     * 1.小程序ID
     * 2.是否必传：是
     * 3.备注：调用接口提交的小程序ID
     */
    private String appid;

    /**
     * 1.商户号
     * 2.是否必传：是
     * 3.备注：调用接口提交的商户号
     */
    private String mch_id;

    /**
     * 1.设备号
     * 2.是否必传：否
     * 3.备注：自定义参数，可以为请求支付的终端设备号等
     */
    private String device_info;

    /**
     * 1.随机字符串
     * 2.是否必传：是
     * 3.备注：
     */
    private String nonce_str;

    /**
     * 1.签名
     * 2.是否必传：是
     * 3.备注：微信返回的签名值
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

    // 以下字段在return_code 和result_code都为SUCCESS的时候有返回

    /**
     * 1.交易类型：取值为：JSAPI，NATIVE，APP等
     * 2.是否必传：是
     * 3.备注：系统错误	错误信息描述
     */
    private String trade_type;

    /**
     * 1.预支付交易会话标识
     * 2.是否必传：是
     * 3.备注：微信生成的预支付会话标识，用于后续接口调用中使用，该值有效期为2小时
     */
    private String prepay_id;

    /**
     * 1.二维码链接
     * 2.是否必传：否
     * 3.备注：trade_type=NATIVE时有返回，此url用于生成支付二维码，然后提供给用户进行扫码支付。
     */
    private String code_url;

}
