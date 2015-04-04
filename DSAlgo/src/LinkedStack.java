import java.util.Scanner;


public class LinkedStack implements Stack {
	Node top = null;
	Node next=null;
	int size=0;
	Node current=null;
	public static void main(String[] args) throws StackFullException,StackEmptyException {
			LinkedStack ls = new LinkedStack();
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
						  ls.push((Integer)(sc.nextInt()));
						  break;
				case "2":System.out.println(ls.pop());break;
				case "3":System.out.println(ls.isEmpty());break;
				case "4":System.out.println(ls.size());break;	
				case "5":System.out.println(ls.top());break;
				case "6":System.exit(0);
				default:break;
				}
			}
	}

	@Override
	public void push(Object element) throws StackFullException {
		Node n = new Node(element,top);
		top=n;
		current=top;
		size++;
		
	}

	@Override
	public Object pop() {		
		Object ret = current.getEle();
		top =current.getNext();
		current.setNext(null);
		current=top;
		size--;
		return ret;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (size<0);
	}

	@Override
	public Object top() throws StackEmptyException {
		return top.getEle();
	}

}
