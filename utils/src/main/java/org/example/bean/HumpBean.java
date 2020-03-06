package org.example.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class HumpBean {

    @JSONField(name = "return_code")
    private String returnCode;
    @JSONField(name = "return_message")
    private String returnMessage;

}
