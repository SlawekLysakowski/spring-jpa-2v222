package pl.edu.wszib.springjpa.model;

import javax.persistence.*;

@Entity
@Table
public class Produkt {

    @Id
    @GeneratedValue
    private Integer id;

    private String nazwa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Kategoria kategoria;



}
