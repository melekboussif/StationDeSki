package tn.esprit.tic.skimelekboussif.services;

import tn.esprit.tic.skimelekboussif.entities.Abonnement;
import tn.esprit.tic.skimelekboussif.entities.Cours;

import java.util.List;
import java.util.Optional;

public interface IAbonnementService {

    List<Abonnement> retrieveAllAbonnement();
    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement updateAbonnement (Abonnement abonnement);
    Optional<Abonnement> retrieveAbonnement (Long numAbon);

    void removeAbonnement(Long numAbon);
}
