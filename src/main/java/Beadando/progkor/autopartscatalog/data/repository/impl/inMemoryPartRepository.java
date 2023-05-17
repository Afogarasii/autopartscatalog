package Beadando.progkor.autopartscatalog.data.repository.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Beadando.progkor.autopartscatalog.data.model.Parts;
import Beadando.progkor.autopartscatalog.data.repository.Repository;
@org.springframework.stereotype.Repository
public class inMemoryPartRepository implements Repository <Parts, Long> {
    private static final Map<Long,Parts> STOREGE = new HashMap<>();

    @Override
    public Parts save(Parts parts) {
        Long id=STOREGE.size() + 1L;
        parts.setId(id);
        STOREGE.put(id, parts);
        return STOREGE.get(id);
    }

    @Override
    public Parts getById(Long id) {
        return STOREGE.get(id);
    }

    @Override
    public List<Parts> getAll() {
        return STOREGE.values().stream().toList();
    }

    @Override
    public Parts update(Parts parts) {
Long id = parts.getId();
STOREGE.put(id, parts);
        return STOREGE.get(id);
    }

    @Override
    public void deleteById(Long id) {
STOREGE.remove(id);
    }
}
