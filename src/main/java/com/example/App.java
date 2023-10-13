package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("camel-context.xml");
        try {
            Thread.sleep(10000);  // Laissez tourner l'application pendant 10 secondes pour tester
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            context.close();
        }
    }
}
