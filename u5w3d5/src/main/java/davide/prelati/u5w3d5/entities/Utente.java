package davide.prelati.u5w3d5.entities;

import davide.prelati.u5w3d5.enums.TypeUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user;
    private String username;
    private String password;
    @Enumerated(EnumType.STRING)
    private TypeUser typeUser;

    @Setter
    @OneToMany(mappedBy = "utente")
    private List<Evento> eventi;


    public Utente(String username, TypeUser typeUser) {
        this.username = username;
        this.typeUser = typeUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id_user +
                ", username='" + username + '\'' +
                ", typeUser=" + typeUser +
                '}';
    }
}
