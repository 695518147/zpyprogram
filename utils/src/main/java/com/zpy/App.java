package com.zpy;

import com.zpy.bean.HumpBean;
import com.zpy.bean.UnderlineBean;
import com.zpy.util.MapToBeanUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Map<String, String> param1 = new HashMap<String, String>();
        param1.put("return_code", "success");
        param1.put("return_message", "成功");

        HumpBean humpBean = MapToBeanUtil.mapToBean(param1, HumpBean.class);
        UnderlineBean underlineBean = MapToBeanUtil.mapToBean(param1, UnderlineBean.class);

        System.out.println(humpBean);
        System.out.println(underlineBean);
    }
}
