package iStackInterface;

public class I_Stack implements IStack{
	private int stackArray[];
    private int top;
    private int MaxSize;
    public I_Stack(int s) {
    	this.MaxSize = s;
        stackArray = new int[s];
        top = 0;
    }
    public void Clear()
    { 
    	stackArray = new int [MaxSize];
    	top = 0;
    }
    
    public boolean Contains(int value)
    {
    	for(int i=0; i<top; i++)
    	{
    		if (stackArray[i]==value)
    			return true;
    	}
    	return false;
    }
    
    public int Peek() throws StackEmptyException 
    { 
    	if(!IsEmpty()){
             return stackArray[top-1];
        } else{
        	throw new StackEmptyException("Can't peek when stack is empty");
        }
    }

	public void Push(int value) 
	{
	    if (top == stackArray.length){
	    	System.out.println("Stack is full");
	    } else {
	       stackArray[top]= value;
	       top++;
	    }
	
	}

	public int Pop() throws StackEmptyException
	{
	    if(!IsEmpty()){
	    	int value = stackArray[top-1];
	       	top--;
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
	@Override
	public boolean IsFull() {		
		return top==MaxSize;
	}
}
