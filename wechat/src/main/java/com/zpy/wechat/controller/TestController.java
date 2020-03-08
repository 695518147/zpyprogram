package com.zpy.wechat.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
public class TestController {


    /**
     * 微信支付通知回调
     * @param xmlRequest
     * @return
     */
    @PostMapping(value = "receiveNotify", consumes = {MediaType.TEXT_XML_VALUE}, produces = {MediaType.TEXT_XML_VALUE})
    public String receiveResult(@NotNull @RequestBody String xmlRequest) {
        //TODO ....
        return null;
    }
}
