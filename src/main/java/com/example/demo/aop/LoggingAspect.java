package com.example.demo.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

/**
 * Created by enHui.Chen on 2018/5/14.
 */
// 声明切面类-必须
@Aspect
// 必须
@Component
@Slf4j
public class LoggingAspect {
    /**
     * @Author: enHui.Chen
     * @Description: 声明切入点,@Pointcut具体要切入的方法 包名.方法名.参数列表(*通配符表示任意个数)
     * @Data 2018/5/14
     */
    @Pointcut("within(com.example.demo.controllers.*)")
    public void loggingPointCut() {

    }

    /**
     * @Author: enHui.Chen
     * @Description: 声明切面方法, 切入点被编织后称为连接点
     * @Data 2018/5/14
     */
    @Around("loggingPointCut()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Object object = joinPoint.proceed();
        stopWatch.stop();
        System.out.println(stopWatch.currentTaskName());
        log.info("[{}] took time: {}ms",joinPoint.getSignature().getDeclaringTypeName() + "." +joinPoint.getSignature().getName(),
                stopWatch.getTotalTimeMillis());
        return object;
    }
}
