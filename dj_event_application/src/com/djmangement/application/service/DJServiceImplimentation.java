package com.djmangement.application.service;

import com.djmangement.application.dto.DJDto;
import com.djmangement.application.repository.DjRepository;
import com.djmangement.application.repository.DjRepositoryImplimentation;

import java.util.Optional;

public class DJServiceImplimentation implements DJService{
    @Override
    public boolean save(DJDto djDto) {
        if(djDto!=null){
            String userName= djDto.getUserName();
            String userEmail= djDto.getUserEmail();
            String userNumber= djDto.getUserNumber();
            String eventName= djDto.getEventName();

            if (userName == null||userName.isEmpty()||userName.matches(".*\\d.*")) {
                System.out.println("invalid user Name");
                return false;
            }
            if (userEmail == null||userEmail.isEmpty()||!userEmail.contains("@")||!userEmail.contains(".com")) {
                System.out.println("Invalid Email ");
                return false;
            }
            if (userNumber == null || !userNumber.matches("\\d{10}")) {
                System.out.println("Invalid phone number (must be 10 digits)");
                return false;
            }
            if(eventName.isEmpty()){
                System.out.println("Event Name Should not be Empty");
                return false;
            }
            DjRepository djRepository=new DjRepositoryImplimentation();
            return djRepository.persist(djDto);
        }
        return false;
    }

    @Override
    public Optional<DJDto> findbyid(int id) {
        if(id>0){
            System.out.println("Running the findbyid method in the service implimentation method and calling the repo");
            DjRepository djRepository=new DjRepositoryImplimentation();
            return djRepository.findbyid(id);
        }
        return DJService.super.findbyid(id);
    }
}
