package davide.prelati.u5w3d5.repositories;

import davide.prelati.u5w3d5.entities.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}