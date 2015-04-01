import java.util.Scanner;

public class Arraystack implements Stack {

	public static final int CAPACITY = 1000;
	private int capacity;
	private Object s[];
	private int t = -1;

	public Arraystack() {
		this(CAPACITY);
	}

	public Arraystack(int cap) {
		this.capacity = cap;
		s = new Object[capacity];
	}

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		Arraystack as = new Arraystack();
		System.out.println("Select options");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.println("3.Empty ?");
		System.out.println("4.Size ?");
		System.out.println("5.top ?");
		System.out.println("6:exit?");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			switch(sc.next()){
			case "1": System.out.println("Enter element");
					  as.push((Integer)(sc.nextInt()));
					  break;
			case "2":System.out.println(as.pop());break;
			case "3":System.out.println(as.isEmpty());break;
			case "4":System.out.println(as.size());break;
			case "5":System.out.println(as.top());break;
			case "6":System.exit(0);
			default:break;
					  
			}
		}
		
		

	}

	public void push(Object element) throws StackFullException {
		if (size() == capacity)
			throw new StackFullException("Stack is Full");
		s[++t] = element;

	}

	public Object pop() {
		Object ele;
		if (isEmpty())
			try {
				throw new StackEmptyException("Stack is Empty");
			} catch (StackEmptyException e) {
				e.printStackTrace();
			}
		ele = s[t];
		s[t] = null;
		t--;
		return ele;
	}

	public int size() {
		return t + 1;
	}

	public boolean isEmpty() {
		return (t < 0);
	}

	public Object top() throws StackEmptyException {
		if (isEmpty())
			throw new StackEmptyException("Stack is Empty");
		return s[t];
	}

}
