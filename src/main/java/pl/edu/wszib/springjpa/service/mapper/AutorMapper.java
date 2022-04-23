package pl.edu.wszib.springjpa.service.mapper;

import org.mapstruct.*;
import pl.edu.wszib.springjpa.model.Autor;
import pl.edu.wszib.springjpa.service.model.DomainAutor;

import java.util.List;

@Mapper
public interface AutorMapper {

    @Mapping(source = "id", target = "id")
    DomainAutor map(Autor autor);

    Autor map (DomainAutor domainAutor);

    List<DomainAutor> mapToDomain(List<Autor> autorzy);


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
