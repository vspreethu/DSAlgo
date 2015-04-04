import java.util.Scanner;


public class ArrayQueue implements Queue{

	public int f=-1,r=-1;
	Integer a[]=new Integer[1000];
	static ArrayQueue aq;
	public static void main(String[] args) {
		aq = new ArrayQueue();
		System.out.println("Select options");
		System.out.println("1.Enqueue");
		System.out.println("2.Dequeue");
		System.out.println("3.Empty ?");
		System.out.println("4.Size ?");
		System.out.println("5.front ?");
		System.out.println("6:exit?");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			switch(sc.next()){
			case "1": System.out.println("Enter element");
					  aq.enqueue((Integer)(sc.nextInt()));
					  break;
			case "2":System.out.println(aq.dequeue());break;
			case "3":System.out.println(aq.isEmpty());break;
			case "4":System.out.println(aq.size());break;
			case "5":System.out.println(aq.front());break;
			case "6":System.exit(0);
			default:break;
					  
			}
		}
		
	}

	@Override
	public void enqueue(Object ele) {
		if(aq.size()==1000)System.out.println("Memory limit");
		else {
			if(f==-1 && r==-1){f++;}
			r++;
			a[r]=(Integer) ele;
			
		}
		
	}

	@Override
	public Object dequeue() {
		
		Integer ele= (Integer) aq.front();	
		if(f==r) {f=-1;r=-1;}
		else {f++;}
		return ele;
		
	}

	@Override
	public Object front() {
		return a[f];
	}

	

	@Override
	public int size() {
		if(f==-1)return -1;
		if(f==r)return r-f+1;
		return r-f;
	}

	@Override
	public boolean isEmpty() {		
		return (f<0);
	}

	
}
