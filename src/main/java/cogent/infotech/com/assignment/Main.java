package cogent.infotech.com.assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("config5.xml");
        University u1 = (University) ctx.getBean("university");
        University u2 = (University) ctx.getBean("university");
        System.out.println("University 1 : " + u1.hashCode());
        System.out.println("University 2 : " + u2.hashCode());
    }
}
