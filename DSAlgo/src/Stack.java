public interface Stack {

	public void push(Object element) throws StackFullException;

	public Object pop();

	public int size();

	public boolean isEmpty();

	public Object top() throws StackEmptyException;
}
