package com.collection.practise.saree.runner;

import com.collection.practise.saree.dto.SareeDto;

import java.util.ArrayList;
import java.util.Collection;

public class SareeRunner {
    public static void main(String[] args) {
        SareeDto sareeDto1=new SareeDto("Silk","Red","Pure Silk",1500f);
        SareeDto sareeDto2=new SareeDto("Cotton","Blue","Cotton Blend",1200f);
        SareeDto sareeDto3=new SareeDto("Gergette","Green","Geogette",1800f);
        SareeDto sareeDto4=new SareeDto("Chiffon","Black","Soft Chiffon",2100f);
        SareeDto sareeDto5=new SareeDto("Kanjivaram","Pink","Silk Cotton",3500f);
        SareeDto sareeDto6 = new SareeDto("Banarasi", "Golden", "Banarasi Silk", 4800.0f);
        SareeDto sareeDto7 = new SareeDto("Tussar", "Beige", "Tussar Silk", 3200.0f);
        SareeDto sareeDto8 = new SareeDto("Linen", "White", "Pure Linen", 2200.0f);
        SareeDto sareeDto9 = new SareeDto("Net", "Purple", "Fancy Net", 1500.0f);
        SareeDto sareeDto10 = new SareeDto("Paithani", "Maroon", "Traditional Silk", 5500.0f);

        Collection<SareeDto> collection=new ArrayList<>();
        collection.add(sareeDto1);
        collection.add(sareeDto2);
        collection.add(sareeDto3);
        collection.add(sareeDto4);
        collection.add(sareeDto5);
        collection.add(sareeDto6);
        collection.add(sareeDto7);
        collection.add(sareeDto8);
        collection.add(sareeDto9);
        collection.add(sareeDto10);
        for(SareeDto sareeDto:collection){
            System.out.println(sareeDto.getType()+" "+sareeDto.getColor()+" "+sareeDto.getMaterial()+" "+sareeDto.getCost());
        }


    }
}
