package inheritance;

public class MixedNumber extends RationalNumber
{
	public MixedNumber(int w, int n, int d)
	{
		super(w * d + n, d);
	}
	
	public MixedNumber(RationalNumber temp)
	{
		super(temp.getNumerator(), temp.getDenominator());
	}
	
	public String toString()
	{
		if(this.getWhole() == 0)
			return super.toString();
		else if(this.getFraction().getNumerator() == 0)
			return this.getWhole() + "";
		else
			return this.getWhole() + " " + this.getFraction().toString();
	}
	
	public int getWhole()
	{
		return this.getNumerator() / this.getDenominator();
	}
	
	public RationalNumber getFraction()
	{
		return new RationalNumber(this.getNumerator() % this.getDenominator(), this.getDenominator());
	}
	
	public MixedNumber add(MixedNumber other)
	{
		RationalNumber sum = super.add(other);
		MixedNumber result = new MixedNumber(sum);
		return result;
	}
	
	public MixedNumber subtract(MixedNumber other)
	{
		RationalNumber difference = super.subtract(other);
		MixedNumber result = new MixedNumber(difference);
		return result;
	}
	
	public MixedNumber divide(MixedNumber other)
	{
		RationalNumber quotient = super.divide(other);
		MixedNumber result = new MixedNumber(quotient);
		return result;
	}
	
	public MixedNumber multiply(MixedNumber other)
	{
		RationalNumber product = super.multiply(other);
		MixedNumber result = new MixedNumber(product);
		return result;
	}
}
//inherit from RationalNumber, override from RationalNumber, or write new function



/*public class MixedNumber implements Comparable<MixedNumber>
{
	private int whole;
	private RationalNumber frac;   //this demonstrates a composition relationship between MixedNumber and RationaNumber - MixedNumber HAS-A RationalNumber
	
	public MixedNumber(int w, int n, int d)
	{
		w = w + n / d;
		n = n % d;
		
		whole = w;
		frac = new RationalNumber(n, d);
		
	}
	
	public MixedNumber(RationalNumber temp)
	{
		whole = temp.getNumerator()/temp.getDenominator();
		frac  = new RationalNumber(temp.getNumerator() % temp.getDenominator(), temp.getDenominator());
	}
	
	public int compareTo(MixedNumber other)
	{
		double thisNumber = this.getDouble();
		double otherNumber = other.getDouble();
		
		if(thisNumber > otherNumber)
			return 1;
		else if(thisNumber < otherNumber)
			return -1;
		else
			return 0;
	}
	
	public String toString()
	{
		if(whole == 0)
			return frac.toString();
		else if(frac.getNumerator() == 0)
			return whole + "";
		else
			return whole + " " + frac.toString();
	}
	
	public boolean equals(Object o)
	{
		MixedNumber other = (MixedNumber)o;
		return this.whole == other.whole && this.frac.equals(other.frac);
	}
	
	public int getWhole()
	{
		return whole;
	}
	
	public RationalNumber getFraction()
	{
		return frac;
	}
	
	public double getDouble()
	{
		return whole + frac.getDouble();
	}
	
	public MixedNumber add(MixedNumber other)
	{
		RationalNumber r = new RationalNumber((this.frac.getDenominator() * this.whole) + this.frac.getNumerator(), this.frac.getDenominator());
		RationalNumber n = new RationalNumber((other.frac.getDenominator() * other.whole) + other.frac.getNumerator(), other.frac.getDenominator());
		RationalNumber rational = r.add(n);
		return new MixedNumber(rational);
	}
	
	public MixedNumber subtract(MixedNumber other)
	{
		MixedNumber m = new MixedNumber(this.whole + other.whole,this.frac.add(other.frac).getNumerator(), this.frac.add(other.frac).getDenominator());
		return m;
	}
	
	public MixedNumber multiply(MixedNumber other)
	{
		MixedNumber m = new MixedNumber(this.whole + other.whole,this.frac.add(other.frac).getNumerator(), this.frac.add(other.frac).getDenominator());
		return m;
	}
	
	public MixedNumber divide(MixedNumber other)
	{
		MixedNumber m = new MixedNumber(this.whole + other.whole,this.frac.add(other.frac).getNumerator(), this.frac.add(other.frac).getDenominator());
		return m;
	}
}*/
