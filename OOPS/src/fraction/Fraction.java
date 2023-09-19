package fraction;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) throws zerodenominatorException {
		this.numerator=numerator;
		if(denominator==0) {
	        zerodenominatorException e= new zerodenominatorException();
			throw e;
		}
		this.denominator=denominator;
		simplify();
	}
	private void simplify() {
		int gcd=1;
		int small= Math.min(denominator, numerator);
		for(int i=2;i<=small;i++) {
			if(numerator%2==0 && denominator%2==0) {
				gcd=i;
			}
		}
		numerator=numerator/gcd;
		denominator=denominator/gcd;
	}
	public void setnumerator(int numerator) {
		this.numerator=numerator;
		simplify();
	}
	public void setdenominator(int denominator) {
		if (denominator==0) {
			//TODO error
		}
		this.denominator=denominator;
		simplify();
	}
	public void print() {
		if(denominator==1) {
			System.out.println(numerator);
		}
		else {
			System.out.println(numerator  +"/" + denominator);
		}
	}
	public int getnumerator() {
		return numerator;
	}
	public int getdenominator() {
		return denominator;
	}
	public void add(Fraction f2) {
		this.numerator=this.numerator*f2.denominator+this.denominator*f2.numerator;
		this.denominator=this.denominator*f2.denominator;
		simplify();
	}
	public static Fraction add(Fraction f1,Fraction f2) {
		int newnum= f1.numerator*f2.denominator+f1.denominator*f2.numerator;
		int newden= f1.denominator*f2.denominator;
		Fraction f = new Fraction(newnum, newden);
		return f;
	}

}
