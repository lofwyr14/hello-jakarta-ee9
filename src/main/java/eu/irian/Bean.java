package eu.irian;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class Bean {

  private String name = "<not defined> (hihi)";

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
