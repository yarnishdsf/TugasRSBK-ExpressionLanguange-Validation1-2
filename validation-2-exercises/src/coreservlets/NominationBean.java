package coreservlets;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class NominationBean {
  private String name;

  public String getName() {
    return (name);
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public String doNomination() {
    return("confirm-nomination");
  }
}
