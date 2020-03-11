package com.zpy.wechat.bean;

import lombok.Data;

@Data
public class BaseRequest {

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
     * 1.签名类型
     * 2.是否必传：否
     * 3.备注：MD5	签名类型，默认为MD5，支持HMAC-SHA256和MD5。
     */
    private String sign_type;
}
