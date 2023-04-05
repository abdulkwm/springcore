package cogent.infotech.com.check;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config3.xml");
        Prescription pr =(Prescription) ctx.getBean("prescription");
        System.out.println("prescription detail : " + pr.toString());
    }
}
