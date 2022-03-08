package com.niit;

import com.niit.domain.Cab;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Cab cab1 = (Cab)context.getBean("cab1");
        System.out.println(cab1);

        Cab cab2 = (Cab)context.getBean("cab2");
        System.out.println(cab2);

        System.out.println( "Thanks for Ride With Us!" );
    }
}
