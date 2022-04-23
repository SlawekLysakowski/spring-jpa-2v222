package pl.edu.wszib.springjpa.controller.mapper;

import org.mapstruct.Mapper;
import pl.edu.wszib.springjpa.controller.dto.AutorDTO;
import pl.edu.wszib.springjpa.service.model.DomainAutor;

import java.util.List;

@Mapper
public interface AutorDTOMapper {

    AutorDTO map(DomainAutor domainAutor);
    DomainAutor map(AutorDTO autorDTO);
    List<AutorDTO> mapToDTO(List<DomainAutor> domainAutors);

}
