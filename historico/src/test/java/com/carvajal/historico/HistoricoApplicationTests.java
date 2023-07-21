package com.carvajal.historico;

import com.carvajal.historico.entities.Historical;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HistoricoApplicationTests {

	@Test
	void testGettersAndSetters() {
		// Arrange
		Historical historical = new Historical();

		// Act and Assert
		historical.setId(1L);
		assertEquals(1L, historical.getId());

		historical.setUserId(100L);
		assertEquals(100L, historical.getUserId());

		historical.setProductId(50L);
		assertEquals(50L, historical.getProductId());

		LocalDate date = LocalDate.now();
		historical.setDate(date);
		assertEquals(date, historical.getDate());

		String description = "This is a historical record.";
		historical.setDescription(description);
		assertEquals(description, historical.getDescription());
	}


}

