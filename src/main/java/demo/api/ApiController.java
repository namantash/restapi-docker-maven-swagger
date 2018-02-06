package demo.api;

import demo.api.model.NewPet;
import demo.api.model.Pet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author: Askhat Salikhov
 */
@Controller
public class ApiController implements PetsApi {
    @Override
    public ResponseEntity<Pet> addPet(NewPet pet) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deletePet(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Pet> findPetById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<List<Pet>> findPets(List<String> tags, Integer limit) {
        return new ResponseEntity<List<Pet>>(HttpStatus.OK);
    }
}
