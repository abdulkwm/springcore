package cogent.infotech.com.lc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }
    public void init(){
        System.out.println("Inside init method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside after property set method");
    }
    @Override
    public void destroy() throws  Exception{
        System.out.println("Inside Destroy method");
    }

}
