
public class Node {

	private Object element;
	private Node next;
	
	public Object getEle() {
		return element;
	}
	public  void setEle(Object ele) {
		element = ele;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node n) {
		next = n;
	}
	
	public Node(Object ele, Node n){
		element =ele;
		next = n;
	}
	
	public Node(){
		element = null;
		next = null;
	}
	
	
}
