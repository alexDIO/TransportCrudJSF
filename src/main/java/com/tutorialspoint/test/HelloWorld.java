package com.tutorialspoint.test;

/**
 * Created by Alex on 11/2/2014.
 */
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {
    public HelloWorld() {
        System.out.println("HelloWorld started!");
    }
    public String getMessage() {
        return "Hello World, Motherfucker!";
    }
}
