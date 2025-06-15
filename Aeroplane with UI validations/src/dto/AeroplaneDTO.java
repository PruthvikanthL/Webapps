package dto;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AeroplaneDTO {
    private String flightName;
    private String flightNumber;
    private String source;
    private String destination;
    private String isDomestic;
    private String departureDate;
    private String arrivalTime;
    private Map<String, String> errors = new HashMap<>();
}
