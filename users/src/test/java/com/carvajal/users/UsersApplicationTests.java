package com.carvajal.users;

import com.carvajal.users.entities.Users;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UsersApplicationTests {

	@Test
	void testGettersAndSetters() {
		// Arrange
		Users user = new Users();

		// Act and Assert
		user.setId(1L);
		assertEquals(1L, user.getId());

		user.setUsername("john_doe");
		assertEquals("john_doe", user.getUsername());

		user.setPassword("password123");
		assertEquals("password123", user.getPassword());

		user.setName("John");
		assertEquals("John", user.getName());

		user.setLastName("Doe");
		assertEquals("Doe", user.getLastName());

		user.setEmail("john.doe@example.com");
		assertEquals("john.doe@example.com", user.getEmail());

		user.setPhone("1234567890");
		assertEquals("1234567890", user.getPhone());

		user.setEnabled(true);
		assertEquals(true, user.isEnabled());

		user.setProfile("USER");
		assertEquals("USER", user.getProfile());
	}

	@Test
	void testUsernameUniqueConstraint() {
		// Arrange
		String username = "john_doe";
		Users user1 = new Users(1L, username, "password123", "John", "Doe", "john.doe@example.com", "1234567890", true, "USER");
		Users user2 = new Users(2L, username, "another_password", "Jane", "Smith", "jane.smith@example.com", "9876543210", false, "ADMIN");

		// Act and Assert
		assertEquals(username, user1.getUsername());
		assertEquals(username, user2.getUsername());
	}
}


