package service;

import dto.CarLoginDTO;
import repository.CarRepository;
import repository.CarRepositoryImplimentation;

public class CarServiceImplimentation implements CarService{
    @Override
    public boolean save(CarLoginDTO carLoginDTO) {
        if(carLoginDTO!=null){

            return true;
        }
        return false;
    }

    @Override
    public CarLoginDTO[] findAll() {
        CarRepository carRepository=new CarRepositoryImplimentation();

        return carRepository.findall();
    }
}
