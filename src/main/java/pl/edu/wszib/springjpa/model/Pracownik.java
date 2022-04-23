package pl.edu.wszib.springjpa.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table
public class Pracownik {

    @Id
    @GeneratedValue
    private Integer id;

    private String nazwisko;

    @OneToOne
//    @JoinColumn(name = "osobaID")
    @JoinColumn
    private Osoba osoba;


}
