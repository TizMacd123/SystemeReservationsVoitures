package com.voiturereservetion.Resrvation.des.Voitures.web;

import com.voiturereservetion.Resrvation.des.Voitures.Entity.Voiture;
import com.voiturereservetion.Resrvation.des.Voitures.Service.ServiceImp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController("api/v1/voiture")
//localhost:8080/api/v1/voiture/id id bdlo bnùra dial tonobila mzyoda
public class controller {

    ServiceImp service;
    @GetMapping("/{id}")
    public Optional<Voiture> getVoiture(@PathVariable int id) {
        return service.getVoiture(id);
    }

}
