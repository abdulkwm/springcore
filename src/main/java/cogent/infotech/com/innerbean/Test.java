package cogent.infotech.com.innerbean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("config4.xml");
        Employee emp = (Employee) ctx.getBean("employee");
        System.out.println(emp);
    }
}
