package cascade.tutorial.domain;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name = "userrole")
public class Role implements Serializable {

  private static final long serialVersionUID = 3875690504145526815L;

  @Id
  @Column(name = "roleid")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name", unique = true)
  private String name;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "mergeduserrole", joinColumns = {@JoinColumn(name = "roleid")},
      inverseJoinColumns = {@JoinColumn(name = "userid")})
  private Set<User> users;

  public void setId(final Long id) {

    this.id = id;
  }

  public Long getId() {

    return id;
  }

  public void setName(final String name) {

    this.name = name;
  }

  public String getName() {

    return name;
  }

  public void setUsers(final Set<User> users) {

    this.users = users;
  }

  public Set<User> getUsers() {

    return users;
  }

}
