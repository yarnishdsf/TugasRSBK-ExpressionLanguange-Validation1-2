package coreservlets;

import javax.faces.bean.*;

@ManagedBean
public class Employee1 extends Employee {
  public Employee1() {
    super(new Name("Yarnish Dwi Sagita", "Fidarliyan"),
          new Company("RSBK-TEKOM-coreservlets.com",
                      "Customized Java EE and Ajax Training"));
  }
}
