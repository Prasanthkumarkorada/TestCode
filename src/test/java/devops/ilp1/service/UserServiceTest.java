package devops.ilp1.service;

import static org.junit.Assert.*;

import org.junit.Test;

import devops.ilp1.model.User;

public class UserServiceTest {

	@Test
	public void testIsAutherozied() {
		User u1=new User("prasanth","kumar","1234","prasanthkumarmpcs@gmail.com");
		assertEquals(true,new UserService().isAuthorized(u1));
	}

	@Test
	public void testUpdatePassword() {
		User u1=new User("","","9876","prasanthkumarmpcs@gmail.com");
		assertEquals(true,new UserService().updatePassword(u1));
	}

	@Test
	public void testDoRegistration() {
		User u1=new User("sri","RAJ","1234","prasanthkumarmpcs@gmail.com");
		assertEquals(true,new UserService().doRegistration(u1));
	}

}

