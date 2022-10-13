package com.lulu.springemp.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="helpdesk")

public class HelpDesk {
	 @Id
	   // @GeneratedValue(strategy = GenerationType.AUTO) //Auto increment's the primary key
int id;
String name;
String complaintdesc;
LocalDate ordersDate;
public HelpDesk() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getComplaintdesc() {
	return complaintdesc;
}
public void setComplaintdesc(String complaintdesc) {
	this.complaintdesc = complaintdesc;
}
public LocalDate getOrdersDate() {
	return ordersDate;
}
public void setOrdersDate(LocalDate ordersDate) {
	this.ordersDate = ordersDate;
}
public HelpDesk(int id, String name, String complaintdesc, LocalDate ordersDate) {
	super();
	this.id = id;
	this.name = name;
	this.complaintdesc = complaintdesc;
	this.ordersDate = ordersDate;
}
@Override
public String toString() {
	return "HelpDesk [id=" + id + ", name=" + name + ", complaintdesc=" + complaintdesc + ", ordersDate=" + ordersDate
			+ "]";
}

}
