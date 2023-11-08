import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestUnitaires {

	@Test	
	void doitRenvoyerFizz() {
		assertEquals("Fizz", FizzBuzz.check(6));
		assertEquals("Fizz", FizzBuzz.check(12));
	}
}
