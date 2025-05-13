package com.voiturereservetion.Resrvation.des.Voitures.Service;

import com.voiturereservetion.Resrvation.des.Voitures.Entity.Voiture;

import java.util.Optional;

public interface ServiceInterface {

    public Optional<Voiture> getVoiture(long id);

}
