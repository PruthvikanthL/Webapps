package com.collection.practise.camping.runner;

import com.collection.practise.camping.dto.CampingAccessoryDto;

import java.util.ArrayList;
import java.util.Collection;

public class CampingAccessoryRunner {
    public static void main(String[] args) {
        CampingAccessoryDto CampingAccessoryDto1 = new CampingAccessoryDto("Tent", "wildcraft", "polyster", 2.5f, 3500);
        CampingAccessoryDto campingAccessoryDto2 = new CampingAccessoryDto("Sleeping bag", "Quechua", "nylon", 1.5f, 15000);
        CampingAccessoryDto campingAccessoryDto3 = new CampingAccessoryDto("Camping Stove", "coleman", "Steel", 3.0f, 2800);
        CampingAccessoryDto campingAccessoryDto4 = new CampingAccessoryDto("Lantern", "Eveready", "Plastic", 0.8f, 700);
        CampingAccessoryDto campingAccessoryDto5 = new CampingAccessoryDto("BackPack", "Decation", "Canvas", 1.5f, 2200);
        CampingAccessoryDto campingAccessoryDto6 = new CampingAccessoryDto("Water Bottle", "Milton", "Stainless Stell", 0.6f, 500);
        CampingAccessoryDto campingAccessoryDto7 = new CampingAccessoryDto("Camping Chair", "Amazon Basics", "Aluminum", 2.0f, 1800);
        CampingAccessoryDto campingAccessoryDto8 = new CampingAccessoryDto("First Aid Kit", "Red Cross", "Plastic", 0.5f, 450);
        CampingAccessoryDto campingAccessoryDto9 = new CampingAccessoryDto("Flashlight", "Plastic", "Philips", 0.3f, 350);
        CampingAccessoryDto campingAccessoryDto10 = new CampingAccessoryDto("Portable Grill", "Weber", "Iron", 4.0f, 4000.0);

        Collection<CampingAccessoryDto> collection = new ArrayList<>();
        collection.add(CampingAccessoryDto1);
        collection.add(campingAccessoryDto2);
        collection.add(campingAccessoryDto3);
        collection.add(campingAccessoryDto4);
        collection.add(campingAccessoryDto5);
        collection.add(campingAccessoryDto6);
        collection.add(campingAccessoryDto7);
        collection.add(campingAccessoryDto8);
        collection.add(campingAccessoryDto9);
        collection.add(campingAccessoryDto10);

        for(CampingAccessoryDto campingAccessoryDto:collection ){
            System.out.println(campingAccessoryDto.getName()+" "+campingAccessoryDto.getBrand()+" "+campingAccessoryDto.getMaterial()+" "+campingAccessoryDto.getWeight()+" "+campingAccessoryDto.getPrice());
        }


    }
}