package tn.esprit.tic.skimelekboussif.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tic.skimelekboussif.entities.Cours;
import tn.esprit.tic.skimelekboussif.entities.Skieur;

public interface CoursRepository extends JpaRepository<Cours,Long > {
}
