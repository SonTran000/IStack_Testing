package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import iStackInterface.I_Stack;

class isFullTesting {

	@Test
	void test() {
		I_Stack test = new I_Stack(3);
		Boolean output= test.IsFull();		
		assertEquals(false, output);
		test.Push(3);
		test.Push(6);
		test.Push(9);
		output= test.IsFull();		
		assertEquals(true, output);
	}

}
