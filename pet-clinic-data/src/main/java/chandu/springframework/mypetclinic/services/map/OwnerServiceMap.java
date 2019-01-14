package chandu.springframework.mypetclinic.services.map;

import chandu.springframework.mypetclinic.model.Owner;
import chandu.springframework.mypetclinic.services.CrudServices;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudServices<Owner,Long> {

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
         super.deleteById(id);

    }

    @Override
    public void delete(Owner object) {
        super.delete(object);

    }
}
