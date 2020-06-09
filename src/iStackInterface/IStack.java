package iStackInterface;

public interface IStack {
	void Clear();
    boolean Contains(int value);
    int Peek() throws StackEmptyException;
    void Push(int value);
    int Pop() throws StackEmptyException;
    boolean IsEmpty();
    boolean IsFull();
    int size();
}
