package alhas.bahtiyarali.springpetclinic.services;

import alhas.bahtiyarali.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save (Vet vet);

    Set<Vet> findAll();

}
