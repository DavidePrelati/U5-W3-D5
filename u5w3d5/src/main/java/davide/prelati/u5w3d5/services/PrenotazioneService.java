package davide.prelati.u5w3d5.services;

import davide.prelati.u5w3d5.entities.Prenotazione;
import davide.prelati.u5w3d5.entities.Utente;
import davide.prelati.u5w3d5.repositories.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class PrenotazioneService {
    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    public Prenotazione savePrenotazione(Prenotazione prenotazione) {
        return prenotazioneRepository.save(prenotazione);
    }

    public Optional<Prenotazione> getPrenotazioniByUser(Utente utente) {
        return prenotazioneRepository.findAllByUtente(utente);
    }

    public void deletePrenoazione(Long id) {
        prenotazioneRepository.deleteById(id);
    }
}
