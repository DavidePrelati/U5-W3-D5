package davide.prelati.u5w3d5.repositories;

import davide.prelati.u5w3d5.entities.Prenotazione;
import davide.prelati.u5w3d5.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    Optional<Prenotazione> findAllByUtente(Utente utente);
}
