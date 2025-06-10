package repository;

import deathratedto.DeathRateDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeathRateRepositoryImpl implements DeathRateRepository{
    @Override
    public boolean validate(DeathRateDTO deathRateDTO) {
        System.out.println("Running the validate method in Repo");
        System.out.println("should save into the DB");
        if(deathRateDTO!=null){
            String url="jdbc:mysql://localhost:3306/DeathRate";
            String username="root";
            String password="Pruthvi@123";
            try{
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection= DriverManager.getConnection(url,username,password);
                    String sql="insert into death_rate_data values(0,'"+deathRateDTO.getName()+"',"+Integer.parseInt(deathRateDTO.getDeath())+",'"+deathRateDTO.getDate()+"','"+deathRateDTO.getLocation()+"')";
                    Statement statement=connection.createStatement();
                    statement.executeUpdate(sql);
                } catch (ClassNotFoundException | SQLException e) {
                    throw new RuntimeException(e);
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
            return true;
        }
      return false;
    }
}
