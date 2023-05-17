package cogent.infotech.com.autowiring_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config8.xml");
        Person person = (Person)ctx.getBean("person");
        Car car = person.getCar();
        System.out.println("*************Car*********");
        System.out.println("car model : " + car.getModel());
        System.out.println("Car price : " + car.getPrice());
    }
}
