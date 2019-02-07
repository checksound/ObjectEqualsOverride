package laboratorio.persona;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PersonaTest {

	@Test
	void testValueEquals() {
		Persona persA = new Persona("Marco", 5);
		Persona persB = new Persona("Marco", 5); // same values
		
		Persona persC = new Persona("Marco", 6); // different age
		Persona persD = new Persona("Luca", 5); // different name
		
		assertFalse(persA == persB);
		
		assertEquals(persA, persB);
		
		assertNotEquals(persA, persC);
		assertNotEquals(persA, persD);
	}
	
}
