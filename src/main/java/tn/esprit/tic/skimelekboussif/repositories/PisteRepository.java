package tn.esprit.tic.skimelekboussif.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.skimelekboussif.entities.Piste;
import tn.esprit.tic.skimelekboussif.entities.Skieur;

public interface PisteRepository extends JpaRepository<Piste,Long > {
}
