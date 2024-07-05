package davide.prelati.u5w3d5.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_evento;
    private String titolo;
    private String descrizione;
    private LocalDateTime data;
    private String luogo;
    private int posti_max;
    @ManyToOne
    @JoinColumn(name = "id_utente")
    private Utente utente;

    public Evento(String titolo, String descrizione, LocalDateTime data, String luogo, int posti_max, Utente organizzatore) {
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.data = data;
        this.luogo = luogo;
        this.posti_max = posti_max;
        this.utente = organizzatore;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "titolo='" + titolo + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", data=" + data +
                ", luogo='" + luogo + '\'' +
                ", posti_max=" + posti_max +
                ", organizzatore=" + utente +
                ", id=" + id_evento +
                '}';
    }
}
