package com.corejsf;

import java.io.Serializable;
import java.util.Date;
import javax.inject.Named;
// or import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
// or import javax.faces.bean.SessionScoped;

@Named("user") // or @ManagedBean(name="user")
@SessionScoped
public class UserBean implements Serializable {

    @Size(max = 150, min = 1)
    private String name;

    @NotNull
     private String dob;

    @Size(max = 150, min = 1)
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String newValue) {
        name = newValue;
    }

    public String getdob() {
        return dob;
    }

    public void setDob(String newValue) {
        dob = newValue;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newValue) {
        address = newValue;
    }

}
