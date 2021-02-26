package lab4;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BuddyInfoRepo extends CrudRepository<BuddyInfo, Long> {

    List<BuddyInfo> findByName(String name);

    BuddyInfo findById(long id);


}
