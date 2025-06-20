package com.djmangement.application.service;

import com.djmangement.application.dto.DJDto;

import java.util.Optional;

public interface DJService {
    boolean save(DJDto djDto);
    default Optional<DJDto> findbyid(int id){
        System.out.println("Running the findbyid in Service");
        return Optional.empty();
    }

}
