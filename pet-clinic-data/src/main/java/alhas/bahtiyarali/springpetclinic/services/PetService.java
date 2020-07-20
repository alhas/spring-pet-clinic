package alhas.bahtiyarali.springpetclinic.services;

import alhas.bahtiyarali.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save (Pet pet);

    Set<Pet> findAll();
}
