package cogent.infotech.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Student st =(Student) ctx.getBean("student");
        System.out.println(st);

    }
}
