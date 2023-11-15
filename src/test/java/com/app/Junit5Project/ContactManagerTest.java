package com.app.Junit5Project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

import com.app.Employee;

public class ContactManagerTest {

	@Test
	public void shouldCreateContact() {
		

		
		

		ContactManager manager = new ContactManager();
		manager.addContact("anil", "ulli", "9542242273");

		assertFalse(manager.getAllContacts().isEmpty());
		assertEquals(1, manager.getAllContacts().size());
		assertTrue(manager.getAllContacts().stream()
				.filter(contact -> contact.getFirstName().equals("anil") && contact.getLastName().equals("ulli")

						&& contact.getPhoneNumber().equals("9542242273"))
				.findAny().isPresent());

	}

	@Test
	@DisplayName("should not create when first name is null")
	public void shouldThrowRuntimeExceptionWhenFirstNameisNull() {
		ContactManager manager = new ContactManager();

		Assertions.assertThrows(RuntimeException.class, () -> {
			manager.addContact(null, "ulli", "9542242273");
		});

	}

	@Test
	@DisplayName("should not create last name is null")
	public void shouldThrowRuntimeExceptionWhenLatNameisNull() {
		ContactManager manager = new ContactManager();

		Assertions.assertThrows(RuntimeException.class, () -> {
			manager.addContact("anil", "naidu", "9542242273");
		});
	}

	@Test
	@DisplayName("should not create when phone Number  is null")
	public void shouldThrowRuntimeExceptionWhenPhoneNumberisNull() {
		ContactManager manager = new ContactManager();

		Assertions.assertThrows(RuntimeException.class, () -> {
			manager.addContact("anil", "ulli", "09542242273");
		});
	}
	
	
	@Test
	@Disabled
	@DisplayName("should not be create in mac os")
	@DisabledOnOs(value=OS.MAC ,disabledReason="disbled on mac os")
	public void shouldNotCreateContactOnMac() {

		ContactManager manager = new ContactManager();
		manager.addContact("anil", "ulli", "9542242273");

		assertFalse(manager.getAllContacts().isEmpty());
		assertEquals(1, manager.getAllContacts().size());
		assertTrue(manager.getAllContacts().stream()
				.filter(contact -> contact.getFirstName().equals("anil") && contact.getLastName().equals("ulli")

						&& contact.getPhoneNumber().equals("9542242273"))
				.findAny().isPresent());

	}
	@Test
	@DisplayName("should not be create in windows os")
	@DisabledOnOs(value=OS.WINDOWS,disabledReason="disbaled on windows os")
	public void shouldNotCreateContactOnwindos() {

		ContactManager manager = new ContactManager();
		manager.addContact("anil", "ulli", "9542242273");

		assertFalse(manager.getAllContacts().isEmpty());
		assertEquals(1, manager.getAllContacts().size());
		assertTrue(manager.getAllContacts().stream()
				.filter(contact -> contact.getFirstName().equals("anil") && contact.getLastName().equals("ulli")

						&& contact.getPhoneNumber().equals("9542242273"))
				.findAny().isPresent());

	}
	
	
	
	
	@Test
	@DisplayName("repete contact creation 5 times")
	@RepeatedTest(value=5)
	public void shouldtestContactRepeted() {

		ContactManager manager = new ContactManager();
		manager.addContact("anil", "ulli", "0542242273");

		assertFalse(manager.getAllContacts().isEmpty());
		assertEquals(1, manager.getAllContacts().size());
		/*
		 * assertTrue(manager.getAllContacts().stream() .filter(contact ->
		 * contact.getFirstName().equals("anil") && contact.getLastName().equals("ulli")
		 * 
		 * && contact.getPhoneNumber().equals("9542242273")) .findAny().isPresent());
		 */

	}
	@RepeatedTest(value=10)
	public void creationTest() {
		System.out.println("test");
		
	}

}
