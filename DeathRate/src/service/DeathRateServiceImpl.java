package service;

import deathratedto.DeathRateDTO;
import repository.DeathRateRepository;
import repository.DeathRateRepositoryImpl;

public class DeathRateServiceImpl implements DeathRateService{
    @Override
    public boolean save(DeathRateDTO deathRateDTO) {
        System.out.println("DeathRateServiceImpl service is Running");
        if(deathRateDTO!=null){
            System.out.println("Name data is valid and pushing to database");
            DeathRateRepository deathRateRepository=new DeathRateRepositoryImpl();
            return deathRateRepository.validate(deathRateDTO);
        }
        return false;
    }
}
