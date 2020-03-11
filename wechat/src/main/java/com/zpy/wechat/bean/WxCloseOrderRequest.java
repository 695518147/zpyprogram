package com.zpy.wechat.bean;

import lombok.Data;

@Data
public class WxCloseOrderRequest extends BaseRequest {

    /**
     * 1.商户订单号
     * 2.是否必传：是
     * 3.备注：商户系统内部订单号
     */
    private String out_trade_no;

}
