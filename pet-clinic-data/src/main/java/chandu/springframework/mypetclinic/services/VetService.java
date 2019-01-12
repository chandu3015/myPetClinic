package chandu.springframework.mypetclinic.services;

import chandu.springframework.mypetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
