package cogent.infotech.com.lc3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new  ClassPathXmlApplicationContext("config2.xml");
        Employee emp = (Employee) ctx.getBean("employee");
        System.out.println(emp);
        ctx.registerShutdownHook();
    }
}
