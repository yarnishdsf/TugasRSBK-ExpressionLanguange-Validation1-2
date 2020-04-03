package coreservlets;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
public class SimpleBean {
  private String[] colors =
    { "red", "orange", "yellow" };
  
  public String getMessage() {
    return("Hello, Yarnish Dwi Sagita F");
  }
  
  public String[] getColors() {
    return(colors);
  }
}