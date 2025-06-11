package service;

import dto.WeatherDTO;
import repository.WeatherRepository;
import repository.WeatherRepositoryImplimentation;

public class WeatherServiceImplimentation implements WeatherService{

    @Override
    public boolean validate(WeatherDTO weatherDTO) {
        System.out.println("Running the Validate method in the Weatherservice");
        if(weatherDTO!=null){
            String name=weatherDTO.getPlacename();
            if(name!=null){
                System.out.println("Place name is not null");
                WeatherRepository weatherRepository=new WeatherRepositoryImplimentation();
                return weatherRepository.validate(weatherDTO);
            }
        }
        return false;
    }
}
