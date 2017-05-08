package inheritance;

public class RationalNumber implements Comparable<RationalNumber>
{
	private int num;
	private int den;
	
	public RationalNumber(int n, int d)
	{
		if(d == 0)
			throw new ArithmeticException();
		if(d < 0)
		{
			n *= -1;
			d *= -1;
		}
		
		num = n;
		den = d;
		
		this.reduce();
	}
	
	public boolean equals(Object o)
	{
		RationalNumber other = (RationalNumber)o;
		return this.num == other.num && this.den == other.den;
	}
	
	private void reduce()
	{
		if(num != 0)
		{
			int divisor = gcd(num, den);
			
			num /= divisor;
			den /= divisor;
		}
	}
	
	//use Euclid's algorithm
	//precondition: num1 and num2 are positive
	private int gcd(int num1, int num2)
	{
		while(num1 != num2)
			if(num1 > num2)
				num1 -= num2;
			else
				num2 -= num1;
		return num1;
	}
	
	public String toString()
	{
		if(num == 0 || den == 1)
			return num + "";
		return num + "/" + den;
	}
	
	public int getNumerator()
	{
		return num;
	}
	
	public int getDenominator()
	{
		return den;
	}
	
	public int compareTo(RationalNumber other)
	{
		double thisDec = this.getDouble();
		double otherDec = other.getDouble();
		
		if(thisDec > otherDec)
			return 1;
		else if(thisDec < otherDec)
			return -1;
		else
			return 0;
	}
	
	public RationalNumber add(RationalNumber other)
	{
		return new RationalNumber((this.num * other.den + this.den * other.num), this.den * other.den);
	}
	
	public RationalNumber subtract(RationalNumber other)
	{
		return new RationalNumber((this.num * other.den - this.den * other.num), this.den * other.den);
	}
	
	public RationalNumber multiply(RationalNumber other)
	{
		return new RationalNumber((this.num * other.num), (this.den * other.den));
	}
	
	public RationalNumber divide(RationalNumber other)
	{
		return new RationalNumber((this.num * other.getReciprocal().num), (this.den * other.getReciprocal().den));
	}
	
	public double getDouble()
	{
		return (double)num / den;
	}
	
	public RationalNumber getReciprocal()
	{
		return new RationalNumber(this.den, this.num);
	}
}
