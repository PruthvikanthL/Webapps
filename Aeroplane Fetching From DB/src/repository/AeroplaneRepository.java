package repository;

import dto.AeroplaneDTO;

import java.util.Optional;

public interface AeroplaneRepository {
    boolean save(AeroplaneDTO aeroplaneDTO);
    default Optional<AeroplaneDTO> findbyid(int id){
        return Optional.empty();
    }

}
