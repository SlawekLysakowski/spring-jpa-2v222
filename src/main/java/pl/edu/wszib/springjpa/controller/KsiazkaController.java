package pl.edu.wszib.springjpa.controller;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.springjpa.controller.dto.AutorDTO;
import pl.edu.wszib.springjpa.controller.dto.KsiazkaDTO;
import pl.edu.wszib.springjpa.controller.mapper.AutorDTOMapper;
import pl.edu.wszib.springjpa.controller.mapper.KsiazkaDTOMapper;
import pl.edu.wszib.springjpa.service.KsiazkaService;
import pl.edu.wszib.springjpa.service.model.DomainAutor;
import pl.edu.wszib.springjpa.service.model.DomainKsiazka;

import java.util.List;

@RequestMapping("/ksiazka")
@RestController
public class KsiazkaController {
    @Autowired
    private KsiazkaService ksiazkaService;
    private KsiazkaDTOMapper mapper = Mappers.getMapper(KsiazkaDTOMapper.class);

    @GetMapping("/list")
    public List<KsiazkaDTO> list() {
        return mapper.mapToDTO(ksiazkaService.list());
    }

    @GetMapping
    public KsiazkaDTO get(@RequestParam Integer id) {
        return mapper.map(ksiazkaService.get(id));
    }

    @PostMapping
    public KsiazkaDTO create(@RequestBody KsiazkaDTO ksiazkaDTO) {
        DomainKsiazka output = ksiazkaService.create(mapper.map(ksiazkaDTO));
        return mapper.map(output);
    }
    @PutMapping
    public KsiazkaDTO update(@RequestBody KsiazkaDTO ksiazkaDTO) {
        DomainKsiazka output = ksiazkaService.update(mapper.map(ksiazkaDTO));
        return mapper.map(output);
    }

    @DeleteMapping
    public void delete(@RequestParam Integer id) {
        ksiazkaService.delete(id);
    }






}
