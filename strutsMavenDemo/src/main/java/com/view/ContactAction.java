package com.view;

import java.util.ArrayList;
import java.util.List;
import com.controller.ContactManager;
import com.model.Contact;
import com.opensymphony.xwork2.ActionSupport;
public class ContactAction extends ActionSupport {
	private static final long serialVersionUID = 9149826260758390091L;
	private Contact contact;
	private List<Contact> contactList = new ArrayList<Contact>();
	private int id;
	private ContactManager contactManager;
	public ContactAction() {
		contactManager = new ContactManager();
	}
	public String execute() {
		this.contactList = contactManager.list();
		//contactManager.show();
		contactManager.getAllContacts();
		//System.out.println(contactList);
		System.out.println(contactList.size());
		System.out.println("execute called");
		return SUCCESS;
	}
	
	public String add() {
		System.out.println(getContact());
		try {
			contactManager.add(getContact());
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.contactList = contactManager.list();
		return SUCCESS;
	}
	public String delete() {
		try {
			contactManager.delete(getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}
	public Contact getContact() {
		return contact;
	}
	public List<Contact> getContactList() {
		return contactList;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public void setContactList(List<Contact> contactsList) {
		this.contactList = contactsList;
	}
	public int getId() {
		return id;
	}
public void setId(int id) { this.id = id; } }


