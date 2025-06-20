package com.djmangement.application.dto;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class DJDto {
    private int id;
    private String userName;
    private String userNumber;
    private String userEmail;
    private String eventName;
    private String location;
    private String eventDate;
    private String eventTime;
    private String note;
    private LocalDateTime createdDate = LocalDateTime.now();


}
