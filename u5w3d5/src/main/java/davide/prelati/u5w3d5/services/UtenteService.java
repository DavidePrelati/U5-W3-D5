package davide.prelati.u5w3d5.services;

import davide.prelati.u5w3d5.entities.Utente;
import davide.prelati.u5w3d5.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UtenteService {
    @Autowired
    private UtenteRepository utenteRepository;

    public Utente saveUtente(Utente utente) {
        return utenteRepository.save(utente);
    }

    public Optional<Utente> findByUsername(String username) {
        return utenteRepository.findByUsername(username);
    }

}
