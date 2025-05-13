package com.voiturereservetion.Resrvation.des.Voitures.Repository;

import com.voiturereservetion.Resrvation.des.Voitures.Entity.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepo extends JpaRepository<Voiture, Long> {
}
