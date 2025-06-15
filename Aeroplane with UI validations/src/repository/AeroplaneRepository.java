package repository;

import dto.AeroplaneDTO;

public interface AeroplaneRepository {
    boolean save(AeroplaneDTO aeroplaneDTO);
}
