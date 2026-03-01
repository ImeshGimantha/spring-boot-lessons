package com.nobody.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
    <@Component>: use for dependency injection.
                  if didn't include that, it doesn't know this
                  class have to inject or not

    <@Autowired>: use for automatically inject subclasses
                  constructor and setter injections are better than field injection
*/
@Component
public class Dev {

    @Autowired // field injection
    /*
        @Qualifier: use for get only one class among the candidate classes
                    we have to provided "bean name" with it.
                    It means class name with simple letters
     */
    @Qualifier("desktop")
    private Computer computer;

    /*
        constructor injection
        in constructor injection, doesn't use <@Autowired> manually
        it has default that
     */

    /*
    public Dev(Laptop laptop) {
        this.laptop = laptop;
    }

    @Autowired // setter injection
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
     */

    public void build() {
        computer.compile();
        System.out.println("Working on awesome project");
    }
}
