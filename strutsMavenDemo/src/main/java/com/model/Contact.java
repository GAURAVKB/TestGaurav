package com.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="contacts")
public class Contact implements Serializable{
	private static final long serialVersionUID = -8767337896773261247L;
	private int id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String cellNo;
	private String birthDate;
	//private String website;
	//private Date created;
	//@OneToMany
	@ElementCollection(fetch = FetchType.LAZY)
	public List<Address> address;
	
	//@OneToMany(targetEntity=Address.class, mappedBy="contact" ,fetch=FetchType.EAGER)
	//@JoinTable(name = "address")
	@OneToMany(cascade = CascadeType.ALL)
public List<Address> getaddress() {
		return address;
	}
	public void setaddress(List<Address> address) {
		this.address = address;
	}
@Id @GeneratedValue(strategy=GenerationType.AUTO) @Column(name="id") 
public int getId() { return id; } @Column(name="firstname") 
public String getFirstName() { return firstName; } @Column(name="lastname") 
public String getLastName() { return lastName; } @Column(name="email_id") 
public String getEmailId() { return emailId; } @Column(name="cell_no") 
public String getCellNo() { return cellNo; } @Column(name="birthdate") 
public String getBirthDate() { return birthDate; }  
 //@Column(name="created")
//public Date getCreated() { return created; }
public void setId(int id) { this.id = id; } 
public void setFirstName(String firstName) { this.firstName = firstName; }
public void setLastName(String lastName) { this.lastName = lastName; } 
public void setEmailId(String emailId) { this.emailId = emailId; } 
public void setCellNo(String cellNo) { this.cellNo = cellNo; } 
public void setBirthDate(String birthDate) { this.birthDate = birthDate; } 
//public void setCreated(Date created) { this.created = created; }
/*public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
} 
*/

}


