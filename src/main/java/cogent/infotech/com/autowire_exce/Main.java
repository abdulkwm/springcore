package cogent.infotech.com.autowire_exce;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // TODO: 4/5/23  
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config8.xml");
        Customer customer = (Customer)ctx.getBean("customer");
        Reservation reservation = customer.getReservation();
        System.out.println("*************Reservation*********");
        System.out.println("reservation id : " + reservation.getId());
        System.out.println("reservation time : " + reservation.getTime());
        System.out.println(reservation.toString());
    }
}
