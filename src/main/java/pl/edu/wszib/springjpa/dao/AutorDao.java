package pl.edu.wszib.springjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.springjpa.model.Autor;

import java.util.List;

@Repository
public interface AutorDao extends JpaRepository<Autor, Integer> {

    List<Autor> findAllByImie(String imie);
    List<Autor> findAllByKsiazkiTytul(String tytul);

}
