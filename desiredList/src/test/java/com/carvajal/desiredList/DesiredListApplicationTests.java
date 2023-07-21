package com.carvajal.desiredList;

import com.carvajal.desiredList.entities.DesiredList;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DesiredListApplicationTests {

	@Test
	void testGettersAndSetters() {
		// Arrange
		DesiredList desiredList = new DesiredList();

		// Act and Assert
		desiredList.setId(1L);
		assertEquals(1L, desiredList.getId());

		desiredList.setUserId(100L);
		assertEquals(100L, desiredList.getUserId());

		desiredList.setProductId(50L);
		assertEquals(50L, desiredList.getProductId());
	}

}
