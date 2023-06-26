package com.ohgiraffers.autoconfiguration;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;

@Configuration  // Bean을 app에 설치하면 app이 뚱뚱해지기대문에 여기다가 bean 생성
public class SpringConfiguration {

    @Value("${test.value}")
    public String value;
    
    @Value("${test.list}")
    private String[] list;

    @Value("${test.greeting}")
    private String greeting;

    @Value("${test.array}")
    private Set<String> array;

    @Value("${username}")
    private String username;

    @Bean
    public Object propertyReadTest() {

//        System.out.println("value = " + value);

//        list.forEach(System.out::println);
//        Arrays.stream(list).forEach(System.out::println);
//        System.out.println("greeting = " + greeting);
        array.forEach(System.out::println);

        System.out.println("username = " + username);

        return new Object();
    }


}
