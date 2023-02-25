package tn.esprit.tic.skimelekboussif.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.skimelekboussif.entities.Inscription;
import tn.esprit.tic.skimelekboussif.entities.Skieur;

public interface InscriptionRepository extends JpaRepository<Inscription,Long > {
}
