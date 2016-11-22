package com.niit.shoppingcart.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Entity//it will be mapped to db
@Table (name="user")//if tablename same as class name no need to specify table annotation, map to db table
@Component//automatic class instance is created 

public class User {
	@Id 
	private String emailid;
	
	//@Column (name="name")
	private String name;
	
	//@Column (name="password")
		private String password;
	
		//@Column (name="contact")
				private String contact;
				
				//@Column (name="address")
				private String address;
			
				//@Column (name="role")
				private String role;

				public String getEmailid() {
					return emailid;
				}

				public void setEmailid(String emailid) {
					this.emailid = emailid;
				}

				public String getName() {
					return name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getPassword() {
					return password;
				}

				public void setPassword(String password) {
					this.password = password;
				}

				public String getContact() {
					return contact;
				}

				public void setContact(String contact) {
					this.contact = contact;
				}

				public String getAddress() {
					return address;
				}

				public void setAddress(String address) {
					this.address = address;
				}

				public String getRole() {
					return role;
				}

				public void setRole(String role) {
					this.role = role;
				}
			
			
			
			
			
}
