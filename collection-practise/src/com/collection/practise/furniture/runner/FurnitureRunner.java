package com.collection.practise.furniture.runner;

import com.collection.practise.furniture.dto.FurnitureDto;
import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;

public class FurnitureRunner {
    public static void main(String[] args) {
        FurnitureDto furnitureDto1=new FurnitureDto("Sofa","seating","leather","brown",1500);
        FurnitureDto furnitureDto2=new FurnitureDto("Dining Table","Table","wood","Walnut",12000);
        FurnitureDto furnitureDto3=new FurnitureDto("Office Chair","Chair","Mesh","Black",4500);
        FurnitureDto furnitureDto4 =new FurnitureDto("Bookshelf","storage","Engineered Wood","Oak",5000);
        FurnitureDto furnitureDto5 =new FurnitureDto("Bed", "Sleeping", "Teak Wood", "Dark Brown", 18000);
        FurnitureDto furnitureDto6 =new FurnitureDto("Coffee Table", "Table", "Glass", "Transparent", 3000);
        FurnitureDto furnitureDto7 =new FurnitureDto("Wardrobe", "Storage", "Plywood", "Beige", 11000);
        FurnitureDto furnitureDto8 =new FurnitureDto("Recliner", "Seating", "Fabric", "Grey", 8500);
        FurnitureDto furnitureDto9 =new FurnitureDto("Bookshelf","storage","Engineered Wood","Oak",5000);
        FurnitureDto furnitureDto10 =new FurnitureDto("Study Desk", "Table", "Sheesham Wood", "Natural", 6500);

        Collection<FurnitureDto> collection=new ArrayList<>();
        collection.add(furnitureDto1);
        collection.add(furnitureDto2);
        collection.add(furnitureDto3);
        collection.add(furnitureDto4);
        collection.add(furnitureDto5);
        collection.add(furnitureDto6);
        collection.add(furnitureDto7);
        collection.add(furnitureDto8);
        collection.add(furnitureDto9);
        collection.add(furnitureDto10);

        for(FurnitureDto furnitureDto:collection){
            System.out.println(furnitureDto.getName()+" "+furnitureDto.getType()+" "+furnitureDto.getMaterial()+" "+furnitureDto.getColor()+" "+furnitureDto.getPrice());
        }







    }

}
