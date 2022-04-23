package pl.edu.wszib.springjpa.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Kategoria {

    @Id
    @GeneratedValue
    private Integer id;

    private String nazwa;

    @OneToMany(mappedBy = "kategoria")
    private List<Produkt> produkty;
}
