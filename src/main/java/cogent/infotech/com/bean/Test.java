package cogent.infotech.com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config7.xml");
        Person person = (Person)ctx.getBean("person");
        Car car = person.getCar();
        Address address = person.getAddress();
        System.out.println("***************Address************");
        System.out.println("House no : " + address.getHouseNo());
        System.out.println("Street Name : " + address.getStreet());
        System.out.println("City Name : " + address.getCity());

        System.out.println("****************Car****************");
        System.out.println("Car model : " + car.getModel());
        System.out.println("Car Price : " + car.getPrice());
    }
}
