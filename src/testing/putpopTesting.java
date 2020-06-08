package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import iStackInterface.I_Stack;
import iStackInterface.StackEmptyException;

class putpopTesting {

	@Test
	void test() throws StackEmptyException {
		I_Stack test = new I_Stack(3);
		test.Push(3);
		test.Push(6);
		test.Push(9);
		
		int output= test.Pop();		
		assertEquals(9, output);
		output= test.Pop();		
		assertEquals(6, output);
		output= test.Pop();		
		assertEquals(3, output);
	}

}
