package stackImplementation;

// Please watch: https://www.youtube.com/watch?v=wjI1WNcIntg

class Node {
	int id;
	String name;
	Node next; 

	public Node(int id, String name){
		this.id = id;
		this.name = name;
	}

	public void displayANode(){
		System.out.println("id: " + id + " name:" + name );
	}

	public String toString(){   // Required
		return name;
	}

}  // End of the Node class

class Stack {
	Node top;

	Stack(){   // Optional 
		top = null;  // null initialization
		// Here to show the top always start as null
	}

	public boolean isempty() {
		return(top == null);
	}

	public int peek() {
		return top.id;
	}

	public void push(int id, String name) {
		Node node = new Node(id, name);
		node.next = top;
		top = node;
	}

	public void pop() {
		int id = top.id;
		String name = top.name;
		top = top.next;
		System.out.println("Poped the node with Id: " + id + " and Name:" + name );

	}

	public void displayAllNodes(){

		Node thisNode = top;

		while(thisNode != null){
			thisNode.displayANode();
			System.out.println("Next Node: " + thisNode.next);
			thisNode = thisNode.next;
			System.out.println();

		}

	}


}  // end of the Stack Class


public class StackImplementationExplained {

	public static void main(String[] args) {

		System.out.println("Stack Implementation Explained ....... ");

		Stack mys = new Stack();

		mys.push(1, "AA");
		mys.push(2, "BB");
		mys.push(3, "CC");
		mys.push(4, "DD");
		mys.push(5, "EE");

		mys.displayAllNodes();

		mys.pop();
		mys.pop();

		mys.displayAllNodes();

	}

}
