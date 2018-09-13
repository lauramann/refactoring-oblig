package pull_up_method;

import static org.junit.Assert.*;

import org.junit.Test;

public class PullUpTest {

	@Test
	public void testCalc() {
		PullUp p = new PullUp(0);
		
		assertEquals(5,p.calc());
	}

}
