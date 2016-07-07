package com.controller;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.model.Address;
import com.model.Contact;
import com.util.HibernateUtil;
public class ContactManager extends HibernateUtil {
	public Contact add(Contact contact) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		System.out.println(contact.getaddress().size());
		session.save(contact);
		session.getTransaction().commit();
//		session.close();
		return contact;
	}
	
	public Contact delete(int id) throws Exception {
		
		Session session = null;
		try {
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		System.out.println("id: " + id);
		System.out.println("Contact class name: " + Contact.class.getName());
		System.out.println("Session toString: " + session.toString());
		Contact contact = null;
		
		Serializable data = new Integer(id);
		contact =(Contact) session.get(Contact.class, data);//load was used
		System.out.println(contact.getaddress().size());
		//System.out.println(contact);
		//Object persistentInstance = session.load(Contact.class, data);
		if (contact != null) {
		    session.delete(contact);
		}
		
//		contact = (Contact) session.load(Contact.class, 1);
//		if(contact != null) {
//			session.delete(contact);
//		}
		session.getTransaction().commit();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		//finally {
			//session.close();
		//}
		return null;		
	}
	
	/*public Contact show(){
		Session session =null;
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Contact contact1 = null;
		contact1 = (Contact) session.get(Contact.class, 80);
		System.out.println(contact1);
		session.getTransaction().commit();
		return contact1;
	}*/
	
	public List<Contact> getAllContacts() {
	    List<Contact> list = null;
	    Session session = null;
	    
	    try {
	        //session = (Session) getSessionFactory();
	    	session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
	        Query query = session.createQuery("FROM Contact");
	        list = query.list();
	        for(Contact contacts : list) {
	            System.out.println("Contact ID: " + contacts.getId());
	            List<Address> addressset = (List<Address>) contacts.getaddress();
	            System.out.println("all address: ");
//	            session.close();
	            for(Address address : addressset) {
	                System.out.println(address.getCity());
	                System.out.println(address.getState());
	            }
	        }
	    } catch(Exception e) {
	        e.printStackTrace();
	    } finally {
	        if(session != null) {
	            System.out.println("session is still alive");
	            //releaseSession(session);
	        }
	    }
	    return (list);
	}
	
	public List<Contact> list() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Contact> contacts = null;
		try {
			
			contacts = (List<Contact>)session.createQuery("from Contact").list();
			//List<Address> addressset = (List<Address>) 	 ((Contact) contacts).getaddress();
			//contacts.add((Contact) addressset);
			//contacts = (List<Contact>) ((ContactManager) session.get(Contact.class, 80)).list();
			//System.out.println(contacts.size());
			//contacts = (List<Contact>)session.createQuery("from Address").list();
			//((Contact) contacts).getAddress();
} catch (HibernateException e) { e.printStackTrace(); session.getTransaction().rollback(); }
		session.getTransaction().commit(); 
		return contacts; }

	
	}
