package tn.esprit.tic.skimelekboussif.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tic.skimelekboussif.entities.Inscription;
import tn.esprit.tic.skimelekboussif.repositories.InscriptionRepository;

import java.util.List;
import java.util.Optional;
@Service
public class IInscriptionServiceImp implements IInscriptionService{

    @Autowired
    InscriptionRepository inscriptionRepository;
    @Override
    public List<Inscription> retrieveAllInscription() {
        return inscriptionRepository.findAll();
    }

    @Override
    public Inscription addInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Optional<Inscription> retrieveInscription(Long numInscription) {
        return inscriptionRepository.findById(numInscription);
    }

    @Override
    public void removeInscription(Long numInscription) {
        inscriptionRepository.deleteById(numInscription);
    }
}
