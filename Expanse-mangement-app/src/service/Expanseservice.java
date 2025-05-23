package service;

import dto.ExpanseDto;
import repository.Expanserepo;

public interface Expanseservice {

    boolean save(ExpanseDto expanseDto);
}
