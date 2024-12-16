package com.main;

import com.codeewithathul.Cricketer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("/com/resources/applicationContext.xml");

     Cricketer cricketer =(Cricketer) context.getBean("cricket");
     cricketer.display();
    }
}
/*  spring jar:-
*   spring bean
* spring core
* spring context
* spring expression
* comman logging
          */