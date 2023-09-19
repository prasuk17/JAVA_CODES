package classes_and_objects;

public class student {
	String name;
    int rollno;
    private static int studentnum;
    public student(String n,int rn) {
    	name=n;
    	rollno=rn;
    	studentnum++;
    }
    public static int getstudentnum() {
    	return studentnum;
    }
	
	public void setrollno(int rn) {
		rollno=rn;
	}
	
	public int getrollno() {
		return rollno;
	}

}
