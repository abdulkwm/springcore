package cogent.infotech.com.lc3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                '}';
    }
    @PostConstruct
    public void init(){
        System.out.println("HI");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Bye");
    }
}
