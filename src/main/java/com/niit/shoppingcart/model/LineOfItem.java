package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="lineofitem")
@Component
public class LineOfItem {
	
	
	
@Id
private String id;
private String product_id;
private Integer rate;
private Integer quantity;

public Integer getQuantity() {
	return quantity;
}
public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getProduct_id() {
	return product_id;
}
public void setProduct_id(String product_id) {
	this.product_id = product_id;
}
public Integer getRate() {
	return rate;
}
public void setRate(Integer rate) {
	this.rate = rate;
}
}
