package deathratedto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DeathRateDTO {
    private String name;
    private String death;
    private String date;
    private String location;
}
