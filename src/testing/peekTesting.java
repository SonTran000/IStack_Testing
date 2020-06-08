package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import iStackInterface.I_Stack;
import iStackInterface.StackEmptyException;

class peekTesting {

	@Test
	void test() throws StackEmptyException {
		I_Stack test = new I_Stack(3);
		test.Push(3);
		test.Push(6);
		test.Push(9);
		int output= test.Peek();		
		assertEquals(9, output);
	}

}
