package lab4;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AddressBookRepo extends CrudRepository<AddressBook, Long> {

//    List<AddressBook> findByLastName(String lastName);

    AddressBook findById(long id);


}
