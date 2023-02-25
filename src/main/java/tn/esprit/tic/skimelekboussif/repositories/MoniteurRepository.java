package tn.esprit.tic.skimelekboussif.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.skimelekboussif.entities.Moniteur;
import tn.esprit.tic.skimelekboussif.entities.Skieur;

public interface MoniteurRepository extends JpaRepository<Moniteur,Long > {
}
