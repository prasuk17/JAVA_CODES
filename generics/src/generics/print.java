package generics;

public class print {
	public static<T> void printarray(T a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		Integer arr[] = new Integer[10];
		for(int i=0;i<10;i++) {
			arr[i]=i+1;
		}
		printarray(arr);
		String a[] = new String[10];
		for(int i=0;i<10;i++) {
			a[i]="p";
		}
		printarray(a);
	}

}
