package chandu.springframework.mypetclinic.bootStrap;

import chandu.springframework.mypetclinic.model.Owner;
import chandu.springframework.mypetclinic.model.PetType;
import chandu.springframework.mypetclinic.model.Vet;
import chandu.springframework.mypetclinic.services.OwnerService;
import chandu.springframework.mypetclinic.services.PetTypeService;
import chandu.springframework.mypetclinic.services.VetService;
import chandu.springframework.mypetclinic.services.map.OwnerServiceMap;
import chandu.springframework.mypetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private  final VetService vetService;
    private  final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService,PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }



    @Override
    public void run(String... args) throws Exception {

        PetType dog= new PetType();
        dog.setName("Dog");
        PetType saveDogType = petTypeService.save(dog);

        PetType cat= new PetType();
        cat.setName("Cat");
        PetType saveCatType = petTypeService.save(cat);

        System.out.println("Loaded Pet Services");


        Owner owner1 = new Owner();
        owner1.setFirstName("chandu");
        owner1.setLastName("konuru");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Raghu");
        owner2.setLastName("Kamamabti");
        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Sam");
        vet2.setLastName("Axe");
        vetService.save(vet2);

        System.out.println("Loaded Vet Services...");





    }
}
