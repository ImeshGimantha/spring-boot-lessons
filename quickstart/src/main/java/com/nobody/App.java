package com.nobody;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        /*
            if you use getBean by name, you have to type cast it
            if you use getBean by Type, you doesn't have to do type cast
                Dev dev = context.getBean(Dev.class);
         */
        Dev dev = (Dev) context.getBean("dev");
        System.out.println(dev.getAge());
        dev.build();
    }
}
