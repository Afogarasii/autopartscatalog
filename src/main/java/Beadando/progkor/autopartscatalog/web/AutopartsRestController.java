package Beadando.progkor.autopartscatalog.web;

import java.util.List;

import Beadando.progkor.autopartscatalog.data.model.Parts;
import Beadando.progkor.autopartscatalog.service.PartsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/parts")
public class AutopartsRestController {

    private  final PartsService partsService;

    public AutopartsRestController(PartsService partsService) {
        this.partsService = partsService;
    }

    @GetMapping("/{id}")
public Parts getPartsById(@PathVariable Long id){
        return partsService.retrievePartsById(id);

    }
    @GetMapping
    public List <Parts>getAllParts(){
return partsService.retrieveAllParts();

    }

    @PostMapping
    public Parts createParts(@RequestBody Parts parts){
        return partsService.createParts(parts);

    }
@PutMapping
    public Parts updateParts(@RequestBody Parts parts){
return partsService.updateParts(parts);

}
@DeleteMapping ("/{id}")
    public void deletePartsById(@PathVariable Long id){
        partsService.deletePartsById(id);
}
}
