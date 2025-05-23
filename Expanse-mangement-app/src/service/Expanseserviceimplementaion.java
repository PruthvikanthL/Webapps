package service;

import dto.ExpanseDto;
import repository.Expanserepoimplimentation;


public class Expanseserviceimplementaion implements Expanseservice{
    Expanserepoimplimentation expanserepoimplimentation=new Expanserepoimplimentation();
    @Override
    public boolean save(ExpanseDto expanseDto) {
        return expanserepoimplimentation.save(expanseDto);
    }
}
