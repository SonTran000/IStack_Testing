package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import iStackInterface.I_Stack;

class sizeTesting {

	@Test
	void test() {
		I_Stack test = new I_Stack(3);
		int output= test.size();		
		assertEquals(0, output);
		test.Push(3);
		output= test.size();	
		assertEquals(1, output);
		test.Push(6);
		output= test.size();	
		assertEquals(2, output);
		test.Push(9);
		output= test.size();	
		assertEquals(3, output);
	}

}
