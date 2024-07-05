package davide.prelati.u5w3d5.controllers;

import davide.prelati.u5w3d5.entities.Prenotazione;
import davide.prelati.u5w3d5.services.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/prenotazioni")
public class PrenotazioneController {
    @Autowired
    private PrenotazioneService reservationService;

    @PostMapping("/prenota")
    public ResponseEntity<Prenotazione> prenotaEvento(@RequestBody Prenotazione prenotazione) {
        return ResponseEntity.ok(reservationService.savePrenotazione(prenotazione));
    }

    @DeleteMapping("/cancel/{id}")
    public ResponseEntity<Void> cancelPrenotazione(@PathVariable Long id) {
        reservationService.deletePrenotazione(id);
        return ResponseEntity.ok().build();
    }

}