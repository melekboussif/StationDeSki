package tn.esprit.tic.skimelekboussif.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.skimelekboussif.entities.Abonnement;
import tn.esprit.tic.skimelekboussif.entities.Skieur;

public interface AbonnementRepository extends JpaRepository<Abonnement,Long > {
}
