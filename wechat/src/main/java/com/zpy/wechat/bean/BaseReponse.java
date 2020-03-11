package com.zpy.wechat.bean;

import lombok.Data;

@Data
public class BaseReponse {

    /**
     * 1.返回状态码: SUCCESS/FAIL
     * 2.是否必传：是
     * 3.备注：此字段是通信标识，非交易标识，交易是否成功需要查看result_code来判断
     */
    private String return_code;

    /**
     * 1.返回信息
     * 2.是否必传：否
     * 3.备注：如非空，为错误原因
     */
    private String return_msg;

}
