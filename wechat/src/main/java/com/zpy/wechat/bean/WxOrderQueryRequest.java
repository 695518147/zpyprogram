package com.zpy.wechat.bean;

import lombok.Data;

@Data
public class WxOrderQueryRequest extends BaseRequest {

    /**
     * 1.业务结果：SUCCESS/FAIL
     * 2.是否必传：是
     * 3.备注：商户系统内部订单号（transaction_id	二选一）
     */
    private String out_trade_no;

}
