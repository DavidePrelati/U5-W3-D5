package davide.prelati.u5w3d5.services;

import davide.prelati.u5w3d5.entities.Evento;
import davide.prelati.u5w3d5.repositories.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EventoService {
    @Autowired
    private EventoRepository eventoRepository;

    public Evento saveEvent(Evento event) {
        return eventoRepository.save(event);
    }

    public List<Evento> getAllEvents() {
        return eventoRepository.findAll();
    }

    public Optional<Evento> findEventById(Long id) {
        return eventoRepository.findById(id);
    }

    public void deleteEvent(Long id) {
        eventoRepository.deleteById(id);
    }
}
