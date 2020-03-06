package org.example.util;

import com.alibaba.fastjson.JSON;

import java.util.Map;

public class MapToBeanUtil {

    /**
     * map转换成实体bean
     * @param param
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T mapToBean(Map<String, ?> param, Class<T> clazz) {
        return JSON.parseObject(JSON.toJSONString(param), clazz);
    }

    /**
     * readme
     * public static <T> T request2Bean(HttpServletRequest request,Class<T> clazz){}
     * 其中第一个<T>是与传入的参数Class<T>相对应的，相当于返回值的一个泛型，后面的T是返回值类型，代表方法必须返回T类型的（由传入的Class<T>决定）
     */

    /**
     * ？ 表示不确定的java类型。
     * T 表示java类型。
     * K V 分别代表java键值中的Key Value。
     * E 代表Element。
     */

}
