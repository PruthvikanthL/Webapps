package repository;

import dto.CarLoginDTO;
import utils.JDBCutils;

import java.sql.*;
import java.util.Arrays;

public class CarRepositoryImplimentation implements CarRepository{

    @Override
    public boolean persist(CarLoginDTO carLoginDTO) {
        if(carLoginDTO!=null){
            try {
                Class.forName(JDBCutils.DRIVER);
                Connection connection= DriverManager.getConnection(JDBCutils.URL,JDBCutils.USER_NAME,JDBCutils.PASSWORD);
                String sql="insert into car_details(User_Name,User_Email,User_Password,Createdby,Created_time) values(?,?,?,?,?)";
                PreparedStatement statement=connection.prepareStatement(sql);
                statement.setString(1,carLoginDTO.getUserName());
                statement.setString(2,carLoginDTO.getUserEmail());
                statement.setString(3,carLoginDTO.getUserPassword());
                statement.setString(4,carLoginDTO.getCreatedBy());
                statement.setTimestamp(5,carLoginDTO.getCreatedTime());
                int result=statement.executeUpdate();
                if(result>0){
                    return true;
                }
            }

            catch (ClassNotFoundException | SQLException e) {
                 e.getStackTrace();
            }
        }
        return false;
    }

    @Override
    public CarLoginDTO[] findall() {
        int index=0;
        CarLoginDTO[] carLoginDTOS=new CarLoginDTO[1];

        try {
            Class.forName(JDBCutils.DRIVER);
            //get connection
            Connection connection = DriverManager.getConnection(JDBCutils.URL,JDBCutils.USER_NAME,JDBCutils.PASSWORD);
            String fetchAll ="select * from login_details";
            PreparedStatement statement = connection.prepareStatement(fetchAll);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){

                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
                System.out.println(resultSet.getString(4));
                System.out.println(resultSet.getString(5));
                System.out.println(resultSet.getTimestamp(6));
                System.out.println("==========================================");
                CarLoginDTO loginDto=new CarLoginDTO();
                loginDto.setId(resultSet.getInt(1));
                loginDto.setUserName(resultSet.getString(2));
                loginDto.setUserEmail(resultSet.getString(3));
                loginDto.setUserPassword(resultSet.getString(4));
                loginDto.setCreatedBy(resultSet.getString(5));
                loginDto.setCreatedTime(resultSet.getTimestamp(6));

                carLoginDTOS[index]=loginDto;

                index++;
                carLoginDTOS= Arrays.copyOf(carLoginDTOS,index+1);


            }

        }catch (ClassNotFoundException|SQLException e){
            e.printStackTrace();
        }

        return carLoginDTOS ;
    }
}

