package Tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.*;

public class factTest {
	
	@Test
	public void method() {
		
		assertEquals("5!", Factorials.factorialTF(120));
		assertEquals("NONE", Factorials.factorialTF(-120));
		assertEquals("NONE", Factorials.factorialTF(0));
		
		
	}

}
