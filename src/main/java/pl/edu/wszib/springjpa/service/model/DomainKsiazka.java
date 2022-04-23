package pl.edu.wszib.springjpa.service.model;

import java.util.List;

public class DomainKsiazka {

    private Integer id;
    private String tytul;
    private String gatunek;
    private List<DomainAutor> autorzy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<DomainAutor> getAutorzy() {
        return autorzy;
    }

    public void setAutorzy(List<DomainAutor> autorzy) {
        this.autorzy = autorzy;
    }
}
