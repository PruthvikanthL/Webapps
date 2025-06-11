package repository;

import dto.WeatherDTO;

public interface WeatherRepository {
    boolean validate(WeatherDTO weatherDTO);
}
