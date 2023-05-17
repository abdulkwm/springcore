package cogent.infotech.com.autowire_exce;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
    @Autowired
    private String name;
    Reservation reservation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
