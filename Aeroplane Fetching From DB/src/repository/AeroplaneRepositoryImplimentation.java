package repository;

import com.mysql.cj.jdbc.Driver;
import constants.DBProperties;
import dto.AeroplaneDTO;
import lombok.SneakyThrows;

import javax.servlet.annotation.WebServlet;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

public class AeroplaneRepositoryImplimentation implements AeroplaneRepository{

    @Override
    public boolean save(AeroplaneDTO aeroplaneDTO) {

        if(aeroplaneDTO!=null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection= DriverManager.getConnection(DBProperties.URL.getProp(),DBProperties.USER_NAME.getProp(),DBProperties.SECRET.getProp());
                String sql="insert into aerodata values(0,'"+aeroplaneDTO.getFlightName()+"','"+aeroplaneDTO.getFlightNumber()+"','"+aeroplaneDTO.getSource()+"','"+aeroplaneDTO.getDestination()+"','"+aeroplaneDTO.getIsDomestic()+"','"+aeroplaneDTO.getDepartureDate()+"','"+aeroplaneDTO.getArrivalTime()+"','"+LocalTime.now()+"')";
                Statement statement=connection.createStatement();
                statement.executeUpdate(sql);
            } catch (ClassNotFoundException |SQLException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Aeroplane Data is Pushed to DataBase");
            return true;
        }
        return false;


    }

    @SneakyThrows
    @Override
    public Optional<AeroplaneDTO> findbyid(int id) {
        System.out.println("Running the findbyid method in AeroplaneRepositoryImplimentation");
        System.out.println("ID is"+id);

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection(DBProperties.URL.getProp(),DBProperties.USER_NAME.getProp(),DBProperties.SECRET.getProp());
            String findsql="select * from aerodata as aero where aero.id="+id+"";
        System.out.println(id);
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(findsql);
        System.out.println("Resultset is"+resultSet);
        while(resultSet.next()){
            int pk=resultSet.getInt("id");
            String flightname=resultSet.getString("Flight_Name");
            String flightnum=resultSet.getString("Flight_Number");
            String source=resultSet.getString("Source");
            String destination=resultSet.getString("Destination");
            String isdomestic=resultSet.getString("IsDomestic");
            String departuredate=resultSet.getString("DepartureDate");
            String arrivaltime=resultSet.getString(8);
            AeroplaneDTO aeroplaneDTO=new AeroplaneDTO();
            aeroplaneDTO.setFlightName(flightname);
            aeroplaneDTO.setFlightNumber(flightnum);
            aeroplaneDTO.setSource(source);
            aeroplaneDTO.setDestination(destination);
            aeroplaneDTO.setIsDomestic(isdomestic);
            aeroplaneDTO.setDepartureDate(departuredate);
            aeroplaneDTO.setArrivalTime(arrivaltime);
            return Optional.of(aeroplaneDTO);

        }
        return AeroplaneRepository.super.findbyid(id);
    }
}
