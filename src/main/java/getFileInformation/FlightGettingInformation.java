package getFileInformation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.flightAndBooking.Flight;

import java.util.List;

public class FlightGettingInformation {
    public String Flight(List<Flight> flights) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            return mapper.writeValueAsString(flights);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }



}


