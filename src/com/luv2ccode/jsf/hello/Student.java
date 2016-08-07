package com.luv2ccode.jsf.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {
	
private String firstName;
private String lastName;
private String country;

public Student(){}


public String getFirstName() {
	System.out.println("first name=" + firstName);
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
	System.out.println("set first name="+ firstName);
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

}
