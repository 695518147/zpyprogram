package com.zpy.wechat.custom;

import com.zpy.wechat.wxpay.sdk.IWXPayDomain;
import com.zpy.wechat.wxpay.sdk.WXPayConfig;

public class WXPayDomain extends IWXPayDomain {
    /**
     * 上报域名网络状况（自定义）
     *
     * @param domain            域名。 比如：api.mch.weixin.qq.com
     * @param elapsedTimeMillis 耗时
     * @param ex                网络请求中出现的异常。
     *                          null表示没有异常
     *                          ConnectTimeoutException，表示建立网络连接异常
     */
    @Override
    public void report(String domain, long elapsedTimeMillis, Exception ex) {

    }

    /**
     * 获取域名
     *
     * @param config 配置
     * @return 域名
     */
    @Override
    public DomainInfo getDomain(WXPayConfig config) {
        DomainInfo domainInfo = new DomainInfo(config.getDomain(), true);
        return domainInfo;
    }
}
