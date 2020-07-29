package alhas.bahtiyarali.springpetclinic.services;

import alhas.bahtiyarali.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);


}
