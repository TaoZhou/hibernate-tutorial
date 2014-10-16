package cascade.tutorial.repository;

import org.springframework.data.repository.CrudRepository;


public interface UserRepository <User> extends CrudRepository<User, Long> {

}
