package org.example;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");

        //BeanFactory context=new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        Car car1 = context.getBean(Car.class);
        car1.drive();
    }
}
