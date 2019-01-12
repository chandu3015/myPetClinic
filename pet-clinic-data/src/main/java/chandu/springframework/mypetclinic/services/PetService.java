package chandu.springframework.mypetclinic.services;

import chandu.springframework.mypetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
