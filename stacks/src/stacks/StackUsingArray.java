package stacks;

public class StackUsingArray {
	private int data[];
	private int top;
	 
	public StackUsingArray(){
		data= new int[10];
		top=-1;
	}
	public StackUsingArray(int capacity){
		data= new int[capacity];
		top=-1;
	}
	public boolean isempty() {
		if(top==-1) {
			return true;
		}
		return false;
	}
	
	public int size() {

		return top+1;
	 }

	public int top() throws StackEmptyException{
		if(size()==0) {
			StackEmptyException e =  new StackEmptyException();
			throw e;
		}
		return data[top];
	}

	public void push(int elem) throws StackFullExeption {
		if(size()== data.length) {
			StackFullExeption e= new StackFullExeption();
			throw e;
		}
		top++;
		data[top]=elem;
	}

	public int pop() throws StackEmptyException {
		if(size()==0) {
			StackEmptyException e =  new StackEmptyException();
			throw e;
		}
		int temp = data[top];
		top--;
		return temp;
	}
	
	
}
