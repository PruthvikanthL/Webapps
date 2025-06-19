package dto;

import constant.LoginConstant;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
public class CarLoginDTO {
    private int id;
    private String userName;
    private String userEmail;
    private String userPassword;
    private String createdBy = LoginConstant.SYSTEM.toString();
    private Timestamp createdTime = Timestamp.valueOf(LocalDateTime.now());


}
