package dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WeatherDTO {
    private String placename;
    private String Weather;
    private String mintemp;
    private String maxtemp;
    private String cloudy;
    private String raining;
    private String raininmm;
    private String humidity;
    private String windspeed;
    private String sunrise;
    private String sunset;
    private String moonrise;
    private String moonset;
    private String rainstart;
    private String rainend;
    private String precipitation;

}
