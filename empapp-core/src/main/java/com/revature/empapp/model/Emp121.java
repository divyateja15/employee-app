package com.revature.empapp.model;

public class Emp121 {
private Integer id;
private String name;
private String designation;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
@Override
public String toString() {
	return "Emp121 [id=" + id + ", name=" + name + ", designation=" + designation + ", getId()=" + getId()
			+ ", getName()=" + getName() + ", getDesignation()=" + getDesignation() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}