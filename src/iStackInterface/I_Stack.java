package iStackInterface;

public class I_Stack {
	private int stack[];
    private int top;
    private int size;
    public I_Stack(int s) {
    	this.size = s;
        stack = new int[s];
        top = 0;
    }
    public void Clear()
    { 
    	stack = new int [size];
    	top = 0;
    }
    
    public boolean Contains(int value)
    {
    	for(int i=0; i<top; i++)
    	{
    		if (stack[i]==value)
    			return true;
    	}
    	return false;
    }
    
    public int Peek() throws StackEmptyException 
    { 
    	if(!IsEmpty()){
             return stack[top-1];
        } else{
        	throw new StackEmptyException("Can't peek when stack is empty");
        }
    }

	public void Push(int value) 
	{
	    if (top == stack.length){
	    	System.out.println("Stack is full");
	    } else {
	       stack[top]= value;
	        top++;
	    }
	
	}

	public int Pop() throws StackEmptyException
	{
	    if(!IsEmpty()){
	    	int value = stack[top-1];
	       	top --;
	     	return value; 
	    } else{
	    	throw new StackEmptyException("Can't pop when stack is empty");
	    }
	}

	public boolean IsEmpty()
	{
	    if (top == 0)
	    {
	        return true;
	    } else {
	    	return false;
	    }
	}
	public int size() {
		return top;
	}
}
