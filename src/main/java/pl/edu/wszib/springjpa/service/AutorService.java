package pl.edu.wszib.springjpa.service;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.wszib.springjpa.dao.AutorDao;
import pl.edu.wszib.springjpa.model.Autor;
import pl.edu.wszib.springjpa.service.mapper.AutorMapper;
import pl.edu.wszib.springjpa.service.model.DomainAutor;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
@Service
public class AutorService implements CrudService<DomainAutor, Integer> {
    @Autowired
    private AutorDao autorDao;

    private AutorMapper mapper = Mappers.getMapper(AutorMapper.class);

    @Override
    public List<DomainAutor> list() {
        return mapper.mapToDomain(autorDao.findAll());
    }

    @Override
    public DomainAutor get(Integer integer) {
        return autorDao.findById(integer)
                .map(a -> mapper.map(a))
                .orElse(null); // = .map(mapper::map)
    }

    @Override
    public DomainAutor create(DomainAutor domainAutor) {
        domainAutor.setId(null);
        Autor created = autorDao.save(mapper.map(domainAutor));
        return mapper.map(created);
    }

    @Override
    public DomainAutor update(DomainAutor domainAutor) {
        DomainAutor existing = get(domainAutor.getId());
        if (existing == null) return null;
        Autor updated = autorDao.save(mapper.map(domainAutor));

        return mapper.map(updated);
    }

    @Override
    public void delete(Integer integer) {
    autorDao.deleteById(integer);
    }
}
