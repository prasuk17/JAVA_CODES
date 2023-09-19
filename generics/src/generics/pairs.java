package generics;

public class pairs<T> {
	private T first;
	private T second;
	
	public pairs(T first,T second) {
		this.first=first;
		this.second=second;
	}
	
	public T getfirst() {
		return first;
	}
	public T getsecond() {
		return second;
	}
	
	public void setfirst(T first) {
		this.first=first;
	}
	public void setsecond(T second) {
		this.second=second;
	}

}
