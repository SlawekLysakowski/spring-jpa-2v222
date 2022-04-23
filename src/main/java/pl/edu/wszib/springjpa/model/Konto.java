package pl.edu.wszib.springjpa.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Konto {

    @Id
    @GeneratedValue
    private Integer id;

    private String number;

    @ManyToMany
    @JoinTable(name = "konto_wlasiciel_konto_mapping",
    joinColumns = @JoinColumn(name = "konto.id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "Wlasciciel_id", referencedColumnName = "id")
    )
    private List<WlascicielKonta> wlasciciele;



}
