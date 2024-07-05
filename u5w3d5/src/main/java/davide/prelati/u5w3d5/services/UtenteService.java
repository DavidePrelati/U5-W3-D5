package davide.prelati.u5w3d5.services;

import davide.prelati.u5w3d5.entities.Utente;
import davide.prelati.u5w3d5.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UtenteService {
    @Autowired
    private UtenteRepository utenteRepository;

    public Utente saveUtente(Utente user) {
        return utenteRepository.save(user);
    }

    public Optional<Utente> findByUsername(String username) {
        return utenteRepository.findByUsername(username);
    }

}
