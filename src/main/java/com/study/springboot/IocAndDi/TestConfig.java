package com.study.springboot.IocAndDi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//얘도 component annotation
public class TestConfig {

    //수동적으로 return 에 new를 받아서 IOC에 강제로 Bean을 등록
    @Bean
    public Test1 t1(){
        return new Test1();
    }

    @Bean
    public Test2 t2(){
        return new Test2();
    }
}

/*
    component 랑 차이
    configuration은 여러개의 객체를 생성해서 IOC에 등록가능
    gson library에서 사용
*/
