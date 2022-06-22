package ec.com.learning.structural.facade.api;

/**
 *
 * @author Steven Guamán - March 2022
 */
public class HotelApi {

    public void findHotel(String checkInDate, String checkOutDate, String origin, String destination) {
        System.out.println("**********************\n"
                + "Hotels found for:\n"
                + "[Check-in date: " + checkInDate + ", Check-out date: " + checkOutDate + "]\n"
                + "Hotel A\n"
                + "Hotel B\n"
                + "Hotel C\n"
                + "Hotel D\n"
                + "**********************");
    }

}
