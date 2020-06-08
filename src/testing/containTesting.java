package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import iStackInterface.I_Stack;

class containTesting {

	@Test
	void test() {
		I_Stack test = new I_Stack(3);
		test.Push(3);
		test.Push(6);
		test.Push(9);
		Boolean output= test.Contains(3);		
		assertEquals(true, output);
		
		output= test.Contains(6);	
		assertEquals(true, output);
		
		output= test.Contains(9);	
		assertEquals(true, output);
		
		output= test.Contains(12);	
		assertEquals(false, output);
	}

}
