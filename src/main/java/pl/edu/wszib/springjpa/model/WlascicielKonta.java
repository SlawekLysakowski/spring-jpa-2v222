package pl.edu.wszib.springjpa.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class WlascicielKonta {

    @Id
    @GeneratedValue
    private Integer Id;

    private String imie;

    private String nazwisko;

    @ManyToMany(mappedBy = "wlasciciele")
    private List<Konto> konta;




}
