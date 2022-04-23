package pl.edu.wszib.springjpa.controller;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.springjpa.controller.dto.AutorDTO;
import pl.edu.wszib.springjpa.controller.mapper.AutorDTOMapper;
import pl.edu.wszib.springjpa.service.AutorService;
import pl.edu.wszib.springjpa.service.model.DomainAutor;

import java.util.List;

@RequestMapping("/autor")
@RestController
public class AutorController {

    @Autowired
    private AutorService autorService;

    private AutorDTOMapper mapper = Mappers.getMapper(AutorDTOMapper.class);
    @GetMapping("/list")
    public List<AutorDTO> list() {
        return mapper.mapToDTO(autorService.list());
    }

    @GetMapping
    public AutorDTO get(@RequestParam Integer id) {
        return mapper.map(autorService.get(id));
    }

    @PostMapping
    public AutorDTO create(@RequestBody AutorDTO autorDTO) {
        DomainAutor output = autorService.create(mapper.map(autorDTO));
        return mapper.map(output);
    }
    @PutMapping
    public AutorDTO update(@RequestBody AutorDTO autorDTO) {
        DomainAutor output = autorService.update(mapper.map(autorDTO));
        return mapper.map(output);
    }

    @DeleteMapping
    public void delete(@RequestParam Integer id) {
        autorService.delete(id);
    }



}
