package tn.esprit.tic.skimelekboussif.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tic.skimelekboussif.entities.Skieur;
public interface SkieurRepository extends JpaRepository<Skieur,Long > {



}
