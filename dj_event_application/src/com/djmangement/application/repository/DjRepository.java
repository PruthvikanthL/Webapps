package com.djmangement.application.repository;

import com.djmangement.application.dto.DJDto;

import java.util.Optional;

public interface DjRepository {
    boolean persist(DJDto djDto);
    default Optional<DJDto> findbyid(int id){
        System.out.println("Running the findby id in the Repository");
        return Optional.empty();
    }
}
