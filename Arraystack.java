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

	public static void main(String[] args) throws StackFullException {
		Arraystack as = new Arraystack();
		Integer e = new Integer();
		System.out.println("Select options");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.println("3.Empty ?");
		System.out.println("4.Size ?");
		System.out.println("5.top ?");
		Scanner sc = new Scanner();
		while(sc.hasnext()){
			switch(sc.next()){
			case '1': System.out.println("Enter element");
					  push(Integer.parseInt(sc.nextInt()));
					  break;
			case '2':pop();break;
			case '3':Empty();break;
			case '4':Size();break;
			case '5':top();break;
			default:break;
					  
			}
		}
		
		

	}

	@Override
	public void push(Object element) throws StackFullException {
		if (size() == capacity)
			throw new StackFullException("Stack is Full");
		s[++t] = element;

	}

	@Override
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

	@Override
	public int size() {
		return t + 1;
	}

	@Override
	public boolean isEmpty() {
		return (t < 0);
	}

	@Override
	public Object top() throws StackEmptyException {
		if (isEmpty())
			throw new StackEmptyException("Stack is Empty");
		return s[t];
	}

}
