package fridge.runner;

import fridge.dto.FridgeDto;
import fridge.repository.FridgeRepositoryImplimentaion;

import java.util.Collection;
import java.util.Iterator;

public class FridgeRunner {
    public static void main(String[] args) {
        FridgeRepositoryImplimentaion fridgeRepositoryImplimentaion=new FridgeRepositoryImplimentaion();
        Collection<FridgeDto> fridgeDtos=fridgeRepositoryImplimentaion.findAll();
        System.out.println("Total Size:"+fridgeDtos.size());

        System.out.println("Brand with Capacity>150");
        for(FridgeDto fridgeDto:fridgeDtos){
            if(fridgeDto.getCapacity()>150){
                System.out.println(fridgeDto.getBrand());

            }
        }

        System.out.println("========== using Iterator=======");
        Iterator<FridgeDto> iterator=fridgeDtos.iterator();
        while(iterator.hasNext()){
            FridgeDto fridgeDto=iterator.next();
            System.out.println(fridgeDto);
        }
    }
}
