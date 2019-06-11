package es.orange;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void existe() {
		try {
			App.add();
			assertTrue(true);
		}catch (Exception e) {
			fail("No Existe");
		}
	}

}
