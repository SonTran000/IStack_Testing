package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import iStackInterface.I_Stack;

class clearTesting {

	@Test
	void test() {
		I_Stack test = new I_Stack(3);
		test.Push(3);
		test.Push(6);
		test.Push(9);
		Boolean output= test.IsEmpty();		
		assertEquals(false, output);
		test.Clear();
		output= test.IsEmpty();		
		assertEquals(true, output);
	}

}
