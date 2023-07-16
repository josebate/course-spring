package com.in28minutes.learnspringframework.helloworld;

import com.in28minutes.learnspringframework.helloworld.Address;
import com.in28minutes.learnspringframework.helloworld.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String [] args){
        // 1: Launch a Spring Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2: Configure the thing that we want Spring to manage - @Configuration
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
        System.out.println(context.getBean("person3ParametersQualifier"));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean(Address.class));

        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
    }
} 
