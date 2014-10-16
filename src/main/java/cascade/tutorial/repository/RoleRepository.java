package cascade.tutorial.repository;

import org.springframework.data.repository.CrudRepository;

public interface RoleRepository <Role> extends CrudRepository<Role, Long> {

}
