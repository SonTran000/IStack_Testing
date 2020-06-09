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
		assertEquals("StackEmptyException ", exception.getMessage());
	}

}
