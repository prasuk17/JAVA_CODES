package generics;

public class pairsuse {
	
	public static void main(String[] args) {
		pairs<String> p= new pairs<String>("prasuk","jain");
		p.setfirst("gunjan");
		System.out.println(p.getfirst()+" "+p.getsecond());
		pairs<Integer> p1= new pairs<Integer>(1,2);
		p1.setsecond(0);
		int a=p1.getfirst();
		System.out.println(a);
		pairs2<Integer, Character> p3 = new pairs2<Integer, Character>(17, 'p');
		System.out.println(p3.getfirst()+""+p3.getsecond());
		
		
		pairs2<Integer,Integer> p5 = new pairs2<Integer, Integer>(1,2);
		pairs2<pairs2<Integer, Integer>, Integer> p4= new pairs2<pairs2<Integer,Integer>, Integer>(p5,3);
		System.out.println(p4.getfirst().getfirst()+""+p4.getfirst().getsecond()+""+p4.getsecond());
	}

}
