package testing;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import iStackInterface.I_Stack;
import iStackInterface.StackEmptyException;


class ExceptionTesting {	
	
	@Test
	void test() {
		
		I_Stack test = new I_Stack(3);		
		Exception exception = assertThrows(StackEmptyException.class,() -> test.Pop());
		assertEquals("StackEmptyException Can't pop when stack is empty", exception.getMessage());
		exception = assertThrows(StackEmptyException.class,() -> test.Peek());
		assertEquals("StackEmptyException Can't peek when stack is empty", exception.getMessage());
	}

}
