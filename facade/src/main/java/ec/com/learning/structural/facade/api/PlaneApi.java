package ec.com.learning.structural.facade.api;

/**
 *
 * @author Steven Guamán - March 2022
 */
public class PlaneApi {

    public void findFlight(String departureDate, String arrivalDate, String origin, String destination) {
        System.out.println("**********************\n"
                + "Flight found for:\n"
                + "[origin: " + origin + ", destination: " + destination + "]\n"
                + "[Departure date: " + departureDate + ", Arrival date: " + arrivalDate + "]\n"
                + "**********************");
    }

}
