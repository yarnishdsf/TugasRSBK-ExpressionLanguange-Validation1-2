package coreservlets;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class SpamBean {
  private String email, url1, url2;

  public String getEmail() {
    return(email);
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getUrl1() {
    return(url1);
  }

  public void setUrl1(String url1) {
    this.url1 = url1;
  }

  public String getUrl2() {
    return(url2);
  }

  public void setUrl2(String url2) {
    this.url2 = url2;
  }
  
  public String signup() {
    return("confirm-signup");
  }
}
