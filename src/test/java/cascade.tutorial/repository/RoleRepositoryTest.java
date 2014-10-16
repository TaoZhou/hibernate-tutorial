package no.integrasco.intellego.model.repository;

import static org.springframework.test.util.AssertionErrors.assertEquals;

import cascade.tutorial.domain.Role;
import cascade.tutorial.repository.RoleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional("roleTransactionManager")
@TransactionConfiguration(defaultRollback = true)
public class RoleRepositoryTest {

  @Autowired
  private RoleRepository roleRepository;

  @Test
  public void verifyModelContainsExpectedVersions() {

    Long roleId = 1l;
    Role role = roleRepository.findOne(roleId);
    assertEquals();
  }

}
