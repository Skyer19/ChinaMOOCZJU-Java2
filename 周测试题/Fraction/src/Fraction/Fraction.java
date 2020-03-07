package Fraction;

class Fraction {
	private int a;
	private int b;
	private int gcd;
	Fraction(int a,int b){
		this.a=a;
		this.b=b;
	}
	 double toDouble() {
		return ((double)a)/b;		
	}
	public Fraction plus(Fraction r) {
		int fenzi=a*r.b+b*r.a;
		int fenmu=b*r.b;
		return new Fraction(fenzi,fenmu);
	}
	public Fraction multiply(Fraction r) {
		return new Fraction(r.a*a,b*r.b);
	}
	void print() {
		if(a==b) {
			System.out.println(1);
		}else {
			gcd=gcd(a,b);
			System.out.println((int)(a/gcd)+"/"+(int)(b/gcd));
		}
	}
	int gcd(int a,int b) {
		if(b==0) return a;
		else{
			return gcd(b,a%b);
		}
	}
	
}
