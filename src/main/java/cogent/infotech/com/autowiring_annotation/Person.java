package cogent.infotech.com.autowiring_annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    @Autowired
    Car car;

    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }
}
