package com.cskaoyan.th58.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author 远志 zhangsong@cskaoyan.onaliyun.com
 * @Date 2024/5/14 11:48
 * @Version 1.0
 */
public class ProxyUtils {

    public static Object getProxy(Object target){
        Class<?> targetClass = target.getClass();
        return Proxy.newProxyInstance(targetClass.getClassLoader(), targetClass.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //无论调用的是哪个方法，那么均进行代理增强
                //此时仅希望对login进行增强
                //动态代理存在的问题：业务方法和增强逻辑的匹配上面不是非常的灵活方便
                //这里面的代码耦合性会比较高
                Object invoke = method.invoke(target, args);

                return invoke;
            }
        });
    }
}
