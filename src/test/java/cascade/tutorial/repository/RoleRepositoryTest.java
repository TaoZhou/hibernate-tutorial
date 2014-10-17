package cascade.tutorial.repository;


import static org.junit.Assert.assertEquals;

import cascade.tutorial.domain.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional("tutorialTransactionManager")
@TransactionConfiguration(defaultRollback = true)
public class RoleRepositoryTest {

  @Autowired
  private RoleRepository roleRepository;

  @Test
  public void findOne_withGivenRoleId_returnRoleAsExpected() {

    String expectedRoleName = "user";
    Long roleId = 1l;
    Role role = roleRepository.findOne(roleId);
    assertEquals(expectedRoleName, role.getName());
  }



}
