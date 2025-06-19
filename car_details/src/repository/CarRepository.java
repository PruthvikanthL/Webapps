package repository;

import dto.CarLoginDTO;

public interface CarRepository {
    boolean persist(CarLoginDTO carLoginDTO);
    CarLoginDTO[] findall();
}
