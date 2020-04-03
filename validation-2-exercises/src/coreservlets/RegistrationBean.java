package coreservlets;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class RegistrationBean {
  private String username, password1="", password2="";

  public String getUsername() {
    return(username);
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword1() {
    return(password1);
  }

  public void setPassword1(String password1) {
    this.password1 = password1;
  }

  public String getPassword2() {
    return(password2);
  }

  public void setPassword2(String password2) {
    this.password2 = password2;
  }
  
  public String doRegistration() {
    if (!password1.equals(password2)) {
      FacesMessage errorMessage = new FacesMessage("Passwords do not match");
      errorMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
      FacesContext.getCurrentInstance().addMessage("mainForm:password1", errorMessage);
      return(null);
    } else {
      return("confirm-registration");
    }
  }
}
