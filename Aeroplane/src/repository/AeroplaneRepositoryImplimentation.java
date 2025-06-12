package repository;

import com.mysql.cj.jdbc.Driver;
import dto.AeroplaneDTO;

import javax.servlet.annotation.WebServlet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
@WebServlet(urlPatterns = "/")
public class AeroplaneRepositoryImplimentation implements AeroplaneRepository{
    @Override
    public boolean save(AeroplaneDTO aeroplaneDTO) {
        if(aeroplaneDTO!=null){
            String url="jdbc:mysql://localhost:3306/aeroplanedatabase";
            String username="root";
            String password="Pruthvi@123";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection= DriverManager.getConnection(url,username,password);
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
}
