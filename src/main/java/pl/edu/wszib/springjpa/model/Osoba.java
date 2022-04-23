package pl.edu.wszib.springjpa.model;

import org.hibernate.annotations.OnDelete;

import javax.persistence.*;

@Entity
@Table
public class Osoba {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String nazwisko;

    @OneToOne(mappedBy = "osoba")
    private Pracownik pracownik;



}
