package fridge.repository;

import fridge.dto.FridgeDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FridgeRepositoryImplimentaion implements FridgeRepository{
    private Collection<FridgeDto> fridge=new ArrayList<>();
    public FridgeRepositoryImplimentaion(){
        fridge.add(new FridgeDto("Samsung",200,25000));
        fridge.add(new FridgeDto("LG",180,2300));
        fridge.add(new FridgeDto("Whirlpool",120,21000));
        fridge.add(new FridgeDto("Godrej",150,19000));
        fridge.add(new FridgeDto("Haier",170,22000));


    }








    @Override
    public Collection<FridgeDto> findAll() {
        return fridge;
    }
}
