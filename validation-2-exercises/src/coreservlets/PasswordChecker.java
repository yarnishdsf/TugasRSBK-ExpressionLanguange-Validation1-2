package coreservlets;

import javax.faces.application.FacesMessage;
import javax.faces.bean.*;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
@ApplicationScoped
public class PasswordChecker {
  private static final String[] BOGUS_PASSWORDS =
    { "password", "123456", "12345678", "qwerty", "abc123" };
  
  public void validatePassword(FacesContext context,
                               UIComponent componentToValidate,
                               Object value)
      throws ValidatorException {
    String password = (String)value;
    boolean isBogus = false;
    for(String bogusPassword: BOGUS_PASSWORDS) {
      if (bogusPassword.equals(password)) {
        isBogus = true;
        break;
      }
    }
    if (isBogus) {
      FacesMessage errorMessage = new FacesMessage("Bogus password");
      errorMessage.setSeverity(FacesMessage.SEVERITY_ERROR);
      throw new ValidatorException(errorMessage);
    }
  }
}
