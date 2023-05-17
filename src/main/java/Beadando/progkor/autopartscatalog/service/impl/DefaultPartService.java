package Beadando.progkor.autopartscatalog.service.impl;

import java.util.List;

import Beadando.progkor.autopartscatalog.data.model.Parts;
import Beadando.progkor.autopartscatalog.data.repository.Repository;
import Beadando.progkor.autopartscatalog.service.PartsService;
import jakarta.servlet.http.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultPartService implements PartsService {
    private final Beadando.progkor.autopartscatalog.data.repository.Repository<Parts,Long> partRepository;
    @Autowired
    public DefaultPartService(Repository<Parts, Long> partRepository) {
        this.partRepository = partRepository;
    }



    @Override
    public Parts createParts(Parts parts) {
        return partRepository.save(parts);
    }

    @Override
    public Parts retrievePartsById(Long id) {
        return partRepository.getById(id);
    }

    @Override
    public List<Parts> retrieveAllParts() {
        return partRepository.getAll();
    }

    @Override
    public Parts updateParts(Parts parts) {
        return partRepository.update(parts);
    }


    @Override
    public void deletePartsById(Long id) {
partRepository.deleteById(id);
    }
}
