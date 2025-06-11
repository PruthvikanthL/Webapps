package repository;

import dto.WeatherDTO;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;

public class WeatherRepositoryImplimentation implements WeatherRepository{
    @SneakyThrows
    @Override
    public boolean validate(WeatherDTO weatherDTO) {
        System.out.println("Runining the validate method in the WeatherRepositoryImplimentation");
        System.out.println("Data should have to push");
        if(weatherDTO!=null){
             String url="jdbc:mysql://localhost:3306/weatherforecast";
             String username="root";
             String password="Pruthvi@123";
             try{
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 Connection connection= DriverManager.getConnection(url,username,password);
                 String sql="insert into weather_deatiles values(0,'"+weatherDTO.getPlacename()+"','"+weatherDTO.getWeather()+"','"+weatherDTO.getMintemp()+"','"+weatherDTO.getMaxtemp()+"','"+weatherDTO.getCloudy()+"','"+weatherDTO.getRaining()+"','"+weatherDTO.getRaininmm()+"','"+weatherDTO.getHumidity()+"','"+weatherDTO.getWindspeed()+"','"+weatherDTO.getSunrise()+"','"+weatherDTO.getSunset()+"','"+weatherDTO.getMoonrise()+"','"+weatherDTO.getMoonset()+"','"+weatherDTO.getRainstart()+"','"+weatherDTO.getRainend()+"','"+weatherDTO.getPrecipitation()+"','"+ LocalTime.now() +"','"+ LocalDate.now() +"')";
                 Statement statement=connection.createStatement();
                 statement.executeUpdate(sql);
             } catch (ClassNotFoundException|SQLException e) {
                 throw new RuntimeException(e);
             }

            return true;
        }
        return false;
    }
}
