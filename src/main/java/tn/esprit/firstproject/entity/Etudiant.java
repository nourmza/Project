package tn.esprit.firstproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.*;
import org.springframework.core.SpringVersion;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEtudiant;
    private String nomEt;
    private String PrenomEt;
    private long cin;
    private String ecole;
    private Date dateNaissance;
    @ToString.Exclude
    @JsonIgnore
    @ManyToMany(mappedBy = "etudiants",cascade = CascadeType.ALL)
    private Set<Reservation>reservations;
}
