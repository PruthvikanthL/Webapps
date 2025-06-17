package service;

import dto.AeroplaneDTO;

import java.util.Optional;

public interface AeroplaneService {
    boolean save(AeroplaneDTO aeroplaneDTO);
    default Optional<AeroplaneDTO> findbyid(int id){
        System.out.println("Running the Optional default method in the AeroplaneService");
        return Optional.empty();
    }
}
