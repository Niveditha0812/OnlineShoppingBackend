package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="cart")
@Component
public class Cart {
	@Id
	private String id;
	private String order_id;
	private String billing_address_id;
	private String shipping_address_id;
	private String payment_method_mode;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getBilling_address_id() {
		return billing_address_id;
	}
	public void setBilling_address_id(String billing_address_id) {
		this.billing_address_id = billing_address_id;
	}
	public String getShipping_address_id() {
		return shipping_address_id;
	}
	public void setShipping_address_id(String shipping_address_id) {
		this.shipping_address_id = shipping_address_id;
	}
	public String getPayment_method_mode() {
		return payment_method_mode;
	}
	public void setPayment_method_mode(String payment_method_mode) {
		this.payment_method_mode = payment_method_mode;
	}

}
