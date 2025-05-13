package com.voiturereservetion.Resrvation.des.Voitures.Service;

import com.voiturereservetion.Resrvation.des.Voitures.Entity.Voiture;
import com.voiturereservetion.Resrvation.des.Voitures.Repository.VoitureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceImp implements ServiceInterface {
@Autowired
    VoitureRepo voitureRepo;


    @Override
    public Optional<Voiture> getVoiture(long id) {
        return voitureRepo.findById(id);
    }
}
