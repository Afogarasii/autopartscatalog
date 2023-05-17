package Beadando.progkor.autopartscatalog.service;

import java.util.List;

import Beadando.progkor.autopartscatalog.data.model.Parts;
import jakarta.servlet.http.Part;

public interface PartsService {
    /**
     *
     * @param parts
     * @return
     */
    Parts createParts(Parts parts);
    Parts retrievePartsById(Long id);
    List<Parts> retrieveAllParts();

    Parts updateParts (Parts parts);
    void deletePartsById(Long id);


}
