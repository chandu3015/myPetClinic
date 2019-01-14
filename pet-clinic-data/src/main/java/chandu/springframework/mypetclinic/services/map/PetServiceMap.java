package chandu.springframework.mypetclinic.services.map;

import chandu.springframework.mypetclinic.model.Pet;
import chandu.springframework.mypetclinic.services.CrudServices;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements CrudServices<Pet,Long> {
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Pet object) {
        super.delete(object);

    }
}
