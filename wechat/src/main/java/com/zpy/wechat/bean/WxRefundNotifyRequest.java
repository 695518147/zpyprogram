package com.zpy.wechat.bean;

import lombok.Data;

@Data
public class WxRefundNotifyRequest extends BaseReponse {

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
     * 1.加密信息
     * 2.是否必传：是
     * 3.备注：
     */
    private String req_info;

}
