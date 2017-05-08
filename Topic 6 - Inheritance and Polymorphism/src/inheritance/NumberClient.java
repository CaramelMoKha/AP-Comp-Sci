package inheritance;

public class NumberClient 
{
	public static void main(String[] args)
	{
		RationalNumber rat1 = new RationalNumber(1, 2);
		RationalNumber rat2 = new RationalNumber(9, 2);
		
		MixedNumber mix1 = new MixedNumber(rat2);
		MixedNumber mix2 = new MixedNumber(3, 4, 5);
		
		
		//MixedNumber sum1 = rat1.add(rat2);	NO
		//MixedNumber sum2 = mix1.add(rat1);	NO
		//MixedNumber sum3 = mix1.add(mix2);	LEGAL
		
		//RationalNumber sum4 = rat1.add(rat2);  LEGAL
		//RationalNumber sum5 = mix1.add(rat1);  LEGAL
		//RationalNumber sum6 = mix1.add(mix1);  LEGAL
		
		//boolean equalTo = rat1.equals(mix1);	 LEGAL
		//boolean equalTo2 = mix1.equals(rat1);  LEGAL
		
		//int wholeNum = mix1.getWhole();		 LEGAL
		//int wholeNum2 = rat1.getWhole();       NOPE
		
		//illegal
		//illegal
		//illegal
		//num/den
		//legal
		//illegal
	}
}
