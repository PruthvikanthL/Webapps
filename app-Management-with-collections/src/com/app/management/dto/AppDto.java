package com.app.management.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class AppDto {
    private String name;
    private AppType type;
    private AppVersion version;
    private LocalDate releaseDate;
    private double size;
    private boolean isFree;
    private double costPerPerson;
    private List<AppOwner> owner;
}
