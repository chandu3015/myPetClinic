package chandu.springframework.mypetclinic.services.map;

import chandu.springframework.mypetclinic.model.PetType;
import chandu.springframework.mypetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;


import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PetType,Long> implements PetTypeService {
    @Override
    public PetType findById(Long id) {

        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(PetType object) {
        super.delete(object);

    }
}
