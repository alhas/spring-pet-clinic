package alhas.bahtiyarali.springpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

    /*
    Crud Service is mimicking our behavior for other interfaces
    we used here java Generics.
    */

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
