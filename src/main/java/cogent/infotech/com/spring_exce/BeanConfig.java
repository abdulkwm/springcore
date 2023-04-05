package cogent.infotech.com.spring_exce;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean(name = "person")
    public Person getPerson() {
        Person p = new Person();
        p.setId(1001);
        p.setName("Abdu");
        p.setAge(23);
        return p;
    }
    @Bean(name = "product")
    public Product getProduct() {
        Product pro = new Product();
        pro.setProductId(1022);
        pro.setProductName("Apple");
        pro.setProductPrice(2000);
        return pro;
    }
}
