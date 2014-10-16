package cascade.tutorial.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "user")
public class User implements Serializable {

  private static final long serialVersionUID = -4008073637076300576L;

  @Id
  @Column(name = "userid")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "firstname")
  private String firstname;

  @Column(name = "lastname")
  private String lastname;

  @Column(name = "password")
  private String password;

  @Column(name = "enabled")
  private boolean enabled;

  @Column(name = "email", unique = true)
  private String email;

  public void setId(final Long id) {

    this.id = id;
  }

  public Long getId() {

    return id;
  }

  public void setEmail(final String email) {

    this.email = email;
  }

  public String getEmail() {

    return email;
  }

  public void setEnabled(final boolean enabled) {

    this.enabled = enabled;
  }

  public boolean isEnabled() {

    return enabled;
  }

  public void setPassword(final String password) {

    this.password = password;
  }

  public String getPassword() {

    return password;
  }

  public void setFirstname(final String firstname) {

    this.firstname = firstname;
  }

  public String getFirstname() {

    return firstname;
  }

  public void setLastname(final String lastname) {

    this.lastname = lastname;
  }

  public String getLastname() {

    return lastname;
  }

}
