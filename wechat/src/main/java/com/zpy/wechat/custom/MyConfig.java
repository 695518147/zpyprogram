package com.zpy.wechat.custom;


import com.zpy.wechat.wxpay.sdk.WXPayConfig;
import com.zpy.wechat.wxpay.sdk.IWXPayDomain;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import static com.zpy.wechat.wxpay.sdk.WXPayConstants.DOMAIN_API;

public class MyConfig extends WXPayConfig {

    private byte[] certData;

    public MyConfig() throws Exception {
        String certPath = "/Users/zhangpeiyu/zhangp/idea/zpyprogram/wechat/apiclient_cert.p12";
        File file = new File(certPath);
        InputStream certStream = new FileInputStream(file);
        this.certData = new byte[(int) file.length()];
        certStream.read(this.certData);
        certStream.close();
    }

    public String getAppID() {
        return "wx8888888888888888";
    }

    /**
     * 获取 domain
     *
     * @return domain
     */
    @Override
    public String getDomain() {
        return DOMAIN_API;
    }

    public String getMchID() {
        return "12888888";
    }

    public String getKey() {
        return "88888888888888888888888888888888";
    }

    public InputStream getCertStream() {
        ByteArrayInputStream certBis = new ByteArrayInputStream(this.certData);
        return certBis;
    }

    public int getHttpConnectTimeoutMs() {
        return 8000;
    }

    public int getHttpReadTimeoutMs() {
        return 10000;
    }

    /**
     * 获取WXPayDomain, 用于多域名容灾自动切换
     *
     * @return
     */
    @Override
    public IWXPayDomain getWXPayDomain() {
        return new WXPayDomain();
    }
}
