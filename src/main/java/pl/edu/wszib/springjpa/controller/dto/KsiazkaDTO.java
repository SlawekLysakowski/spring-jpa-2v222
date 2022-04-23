package pl.edu.wszib.springjpa.controller.dto;

import java.util.List;

public class KsiazkaDTO {

    private Integer id;
    private String tytul;
    private String gatunek;
    private List<AutorDTO> autorzy;

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

    public List<AutorDTO> getAutorzy() {
        return autorzy;
    }

    public void setAutorzy(List<AutorDTO> autorzy) {
        this.autorzy = autorzy;
    }
}
