import java.util.Scanner;


public class LinkedQueue implements Queue {
	Node front,rear=null;
	Node current =null,prev=null;
	int size =-1;
	static LinkedQueue lq = new LinkedQueue();
	public static void main(String[] args) {
		System.out.println("Select options");
		System.out.println("1.Enqueue");
		System.out.println("2.Dequeue");
		System.out.println("3.Empty ?");
		System.out.println("4.Size ?");
		System.out.println("5.front ?");
		System.out.println("6.rear ?");
		System.out.println("7:List?");
		System.out.println("8:exit?");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			switch(sc.next()){
			case "1": System.out.println("Enter element");
					  lq.enqueue((Integer)(sc.nextInt()));
					  break;
			case "2":System.out.println(lq.dequeue());break;
			case "3":System.out.println(lq.isEmpty());break;
			case "4":System.out.println(lq.size());break;	
			case "5":System.out.println(lq.front());break;
			case "6":System.out.println(lq.rear());break;
			case "7":lq.list();break; 
			case "8":System.exit(0);
			default:break;
			}
		}

	}

	private void list() {
		Node c=front;
		for(int i=0;i<=size;i++){
			System.out.print(c.getEle()+"->");
			c=c.getNext();
		}
		
	}

	private Object rear() {
		return rear.getEle();
	}

	@Override
	public void enqueue(Object ele) {
		Node n = new Node(ele,null);
		rear =n;
		current=n;
		
		if(lq.isEmpty()){
			front = n;
		}
		else{
		prev.setNext(current);
		}
		prev=current;
		
		size++;
		
	}

	@Override
	public Object dequeue() {
		Node c =front;
		Object ret = c.getEle();
		front = c.getNext();
		c.setNext(null);
		size--;
		return ret;
	}

	@Override
	public Object front() {
		return front.getEle();
	}

	@Override
	public int size() {
		return size+1;
	}

	@Override
	public boolean isEmpty() {
		
		return (size<0);
	}

}
