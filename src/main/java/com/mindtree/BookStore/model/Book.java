package com.mindtree.BookStore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Book {
@Id
@GeneratedValue
private int bid;
private String name;
private int cost;
public String getName() {
	return name;
}
public void setBid(int bid) {
	this.bid = bid;
}
public void setName(String name) {
	this.name = name;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public int getBid() {
	return bid;
}

}
