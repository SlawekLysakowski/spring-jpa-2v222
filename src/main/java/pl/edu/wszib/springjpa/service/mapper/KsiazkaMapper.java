package pl.edu.wszib.springjpa.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pl.edu.wszib.springjpa.model.Autor;
import pl.edu.wszib.springjpa.model.Ksiazka;
import pl.edu.wszib.springjpa.service.model.DomainAutor;
import pl.edu.wszib.springjpa.service.model.DomainKsiazka;

import java.util.List;

@Mapper(uses = {AutorMapper.class})
public interface KsiazkaMapper {

    @Mapping(source = "id", target = "id")
    DomainKsiazka map(Ksiazka ksiazka);

    Ksiazka map (DomainKsiazka domainKsiazka);

    List<DomainKsiazka> mapToDomain(List<Ksiazka> ksiazki);


//    @BeforeMapping
//    default void before(@MappingTarget Autor target, DomainAutor source) {
//
//    }
//
//    @AfterMapping
//    default void after(@MappingTarget Autor target, DomainAutor source) {
//
//    }

}
