package fraction;

public class Fractionuse {
	public static void main(String[] args)throws zerodenominatorException {
		Fraction f1= new Fraction(10, 20);
		Fraction f2= new Fraction(2,10);
		f1.setdenominator(0);
		f1.print();
		f2.print();
		f1.add(f2);
		f1.print();
		Fraction f3= Fraction.add(f1, f2);
		f3.print();
		Fraction f4 = Fraction.add(f2, f3);
		f4.print();
	}

}
