package cogent.infotech.com.spring_exce;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Person p = (Person) context.getBean("person");
        System.out.println("Person id : " + p.getId());
        System.out.println("Person name : " + p.getName());
        System.out.println("Person age : " + p.getAge());

        System.out.println("-------------------------------------");
        Product pro = (Product) context.getBean("product");
        System.out.println("Product id : " + pro.getProductId());
        System.out.println("Product name : " + pro.getProductName());
        System.out.println("Product price : " + pro.getProductPrice());
    }
}
