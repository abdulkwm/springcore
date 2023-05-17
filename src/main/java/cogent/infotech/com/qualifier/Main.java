package cogent.infotech.com.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config9.xml");
        Employee employee = (Employee) ctx.getBean("employee");
        System.out.println(employee.getAddress());
    }
}
