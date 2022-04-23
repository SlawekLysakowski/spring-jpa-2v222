package pl.edu.wszib.springjpa.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Ksiazka {
  @Id
  @GeneratedValue
  private Integer id;

  @ManyToMany
  @JoinTable(name = "autor_ksiazka_mapping",
          joinColumns = @JoinColumn(name = "kdiazka.id", referencedColumnName = "id"),
          inverseJoinColumns = @JoinColumn(name = "autor", referencedColumnName = "id")
  )
  private List<Autor> autorzy;
  private String tytul;
  private String gatunek;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public List<Autor> getAutorzy() {
    return autorzy;
  }

  public void setAutorzy(List<Autor> autorzy) {
    this.autorzy = autorzy;
  }

  public String getTytul() {
    return tytul;
  }

  public void setTytul(String tytul) {
    this.tytul = tytul;
  }

  public String getGatunek() {
    return gatunek;
  }

  public void setGatunek(String gatunek) {
    this.gatunek = gatunek;
  }
}
