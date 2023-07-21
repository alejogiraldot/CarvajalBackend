package com.carvajal.products;

import com.carvajal.products.entities.Product;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductsApplicationTests {
	private Product product;

	@BeforeEach
	public void setUp() {
		// Configurar datos de prueba antes de cada prueba individual
		product = new Product(1L, "Test Product", 100, 50, "This is a test product.", true, "/path/to/image");
	}
	@Test
	public void testGetters() {
		// Prueba de los métodos getter
		assertEquals(1L, product.getId());
		assertEquals("Test Product", product.getName());
		assertEquals(100, product.getPrice());
		assertEquals(50, product.getStock());
		assertEquals("This is a test product.", product.getDescription());
		assertTrue(product.isStatus());
		assertEquals("/path/to/image", product.getImgPath());
	}

	@Test
	public void testSetters() {
		// Prueba de los métodos setter
		product.setId(2L);
		product.setName("New Test Product");
		product.setPrice(200);
		product.setStock(30);
		product.setDescription("Updated description.");
		product.setStatus(false);
		product.setImgPath("/new/path/to/image");

		assertEquals(2L, product.getId());
		assertEquals("New Test Product", product.getName());
		assertEquals(200, product.getPrice());
		assertEquals(30, product.getStock());
		assertEquals("Updated description.", product.getDescription());
		assertFalse(product.isStatus());
		assertEquals("/new/path/to/image", product.getImgPath());
	}


}
