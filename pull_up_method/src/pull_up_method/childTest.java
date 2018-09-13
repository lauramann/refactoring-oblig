package pull_up_method;

import static org.junit.Assert.*;

import org.junit.Test;

public class childTest {

	@Test
	public void testCalc() {
		
		child c = new child(0);
		
		assertEquals(5,c.calc());
	}

}
