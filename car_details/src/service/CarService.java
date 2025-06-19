package service;

import dto.CarLoginDTO;

public interface CarService {
    boolean save(CarLoginDTO carLoginDTO);
    CarLoginDTO[] findAll();
}
