package tn.esprit.tic.skimelekboussif.services;

import tn.esprit.tic.skimelekboussif.entities.Abonnement;
import tn.esprit.tic.skimelekboussif.entities.Inscription;

import java.util.List;
import java.util.Optional;

public interface IInscriptionService {

    List<Inscription> retrieveAllInscription();
    Inscription addInscription(Inscription inscription);
    Inscription updateInscription(Inscription inscription);
    Optional<Inscription> retrieveInscription(Long numInscription);

    void removeInscription(Long numInscription);
}
