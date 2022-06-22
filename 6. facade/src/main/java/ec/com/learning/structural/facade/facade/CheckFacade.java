package ec.com.learning.structural.facade.facade;

import ec.com.learning.structural.facade.api.HotelApi;
import ec.com.learning.structural.facade.api.PlaneApi;

/**
 *
 * @author Steven Guamán - March 2022
 */
public class CheckFacade {
    
    private PlaneApi planeApi;
    private HotelApi hotelApi;
    
    public CheckFacade(){
        planeApi = new PlaneApi();
        hotelApi = new HotelApi();
    }
    
    public void find(String departureDate, String arrivalDate, String origin, String destination){
        planeApi.findFlight(departureDate, arrivalDate, origin, destination);
        hotelApi.findHotel(departureDate, arrivalDate, origin, destination);
    }
    
}
