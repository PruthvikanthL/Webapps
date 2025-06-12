package dto;

import lombok.*;

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
}
