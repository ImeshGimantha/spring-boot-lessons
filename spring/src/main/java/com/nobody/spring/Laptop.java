package com.nobody.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
/*
    if we have same type of classes, spring confuse with what class to use.
    <@Primary> use for fix that confusion
 */
//@Primary
public class Laptop implements Computer {
    public void compile() {
        System.out.println("Compiling with 404 bugs");
    }
}