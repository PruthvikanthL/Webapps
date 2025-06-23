package com.collection.practise.appliance.runner;

import com.collection.practise.appliance.dto.ApplianceDto;
import javafx.print.Collation;

import java.util.ArrayList;

public class ApplianceRunner {
    public static void main(String[] args) {
        ApplianceDto applianceDto1=new ApplianceDto("Refrigerator", "LG", "Cooling", 180, 22000);
        ApplianceDto applianceDto2=new ApplianceDto("Washing Machine", "Samsung", "Laundry", 500, 18500);
        ApplianceDto applianceDto3=new ApplianceDto("Microwave Oven", "IFB", "Cooking", 1200, 9500);
        ApplianceDto applianceDto4=new ApplianceDto("Air Conditioner", "Voltas", "Cooling", 1500, 30000);
        ApplianceDto applianceDto5=new ApplianceDto("Electric Kettle", "Prestige", "Kitchen", 1500, 2000);
        ApplianceDto applianceDto6=new ApplianceDto("Water Purifier", "Aquaguard", "Filtration", 60, 8000);
        ApplianceDto applianceDto7=new ApplianceDto("Television", "Sony", "Entertainment", 120, 40000);
        ApplianceDto applianceDto8=new ApplianceDto("Mixer Grinder", "Philips", "Kitchen", 750, 3500);
        ApplianceDto applianceDto9=new ApplianceDto("Room Heater", "Bajaj", "Heating", 1000, 2500);
        ApplianceDto applianceDto10=new ApplianceDto("Dishwasher", "Bosch", "Cleaning", 1400, 38000);
        ArrayList<ApplianceDto> collation=new ArrayList<>();
        collation.add(applianceDto1);
        collation.add(applianceDto2);
        collation.add(applianceDto3);
        collation.add(applianceDto4);
        collation.add(applianceDto5);
        collation.add(applianceDto6);
        collation.add(applianceDto7);
        collation.add(applianceDto8);
        collation.add(applianceDto9);
        collation.add(applianceDto10);

        for(ApplianceDto applianceDto:collation){
            System.out.println(applianceDto.getName()+" "+applianceDto.getBrand()+" "+applianceDto.getType()+" "+applianceDto.getPowerconsumption()+" "+applianceDto.getPrice());
        }

    }
}
