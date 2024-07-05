package davide.prelati.u5w3d5.controllers;

import davide.prelati.u5w3d5.entities.Evento;
import davide.prelati.u5w3d5.services.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/eventi")
public class EventoController {
    @Autowired
    private EventoService eventoService;

    @PostMapping("/create")
    public ResponseEntity<Evento> createEvento(@RequestBody Evento evento) {
        return ResponseEntity.ok(eventoService.saveEvent(evento));
    }

    @GetMapping("/list")
    public ResponseEntity<List<Evento>> listEventi() {
        return ResponseEntity.ok(eventoService.getAllEvents());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable Long id) {
        eventoService.deleteEvent(id);
        return ResponseEntity.ok().build();
    }

}