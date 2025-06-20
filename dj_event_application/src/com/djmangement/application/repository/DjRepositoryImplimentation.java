package com.djmangement.application.repository;

import com.djmangement.application.dto.DJDto;
import com.djmangement.application.utils.JDBCutils;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class DjRepositoryImplimentation implements DjRepository{
    @Override
    public boolean persist(DJDto djDto) {
        if(djDto!=null){
            try {
                Class.forName(JDBCutils.Driver);
                Connection connection= DriverManager.getConnection(JDBCutils.URL,JDBCutils.USER_NAME,JDBCutils.PASSWORD);
                String presql="insert into dj_form values(?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement preparedStatement =connection.prepareStatement(presql);
                preparedStatement.setInt(1,djDto.getId());
                preparedStatement.setString(2,djDto.getUserName());
                preparedStatement.setString(3,djDto.getUserNumber());
                preparedStatement.setString(4,djDto.getUserEmail());
                preparedStatement.setString(5,djDto.getEventName());
                preparedStatement.setString(6,djDto.getLocation());
                preparedStatement.setString(7,djDto.getEventDate());
                preparedStatement.setString(8,djDto.getEventTime());
                preparedStatement.setString(9,djDto.getNote());
                preparedStatement.setTimestamp(10, Timestamp.valueOf(djDto.getCreatedDate()));
                preparedStatement.executeUpdate();
                System.out.println("Data was pushed to Database");


            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
            return true;
        }
        return false;
    }

    @Override
    public Optional<DJDto> findbyid(int id) {
        try {
            Class.forName(JDBCutils.Driver);
            Connection connection=DriverManager.getConnection(JDBCutils.URL,JDBCutils.USER_NAME,JDBCutils.PASSWORD);
            String fetch="select * from dj_form where id=?";
            PreparedStatement prep=connection.prepareStatement(fetch);
            prep.setInt(1,id);
            ResultSet resultSet=prep.executeQuery();
            while(resultSet.next()){
                int fetchedid=resultSet.getInt("id");
                String userName=resultSet.getString("User_Name");
                String userNumber=resultSet.getString("User_Number");
                String userEmail=resultSet.getString("User_Email");
                String eventName=resultSet.getString("Event_Name");
                String location=resultSet.getString("Location");
                String event_date=resultSet.getString("Event_Date");
                String event_time=resultSet.getString("Event_Time");
                String note=resultSet.getString("Note");
                String createdDate=resultSet.getString("CreatedDate");

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
                DJDto djDto = new DJDto();
                djDto.setId(fetchedid);
                djDto.setUserName(userName);
                djDto.setUserNumber(userNumber);
                djDto.setUserEmail(userEmail);
                djDto.setEventName(eventName);
                djDto.setLocation(location);
                djDto.setEventDate(event_date);
                djDto.setEventTime(event_time);
                djDto.setNote(note);
                djDto.setCreatedDate(LocalDateTime.parse(createdDate, formatter));
                return Optional.of(djDto);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return DjRepository.super.findbyid(id);
    }

}
