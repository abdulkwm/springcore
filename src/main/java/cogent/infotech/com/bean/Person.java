package cogent.infotech.com.bean;

public class Person {
    Car car;
    Address address;

    public Car getCar() {
        return car;
    }
    public Address getAddress() {
        return address;
    }

    // TODO: 4/5/23  this is used by auto wire by constructure 
    public Person(Car car, Address address) {
        this.car = car;
        this.address = address;
    }
    // TODO: 4/5/23 is not required for auto wire by constructure  
    
//    public void setCar(Car car) {
//        this.car = car;
//    }
//
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }
}
