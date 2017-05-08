
public class WrapperClassDemo 
{
	public static void main(String[] args)
	{
		Integer intObj = new Integer(6);
		int j = intObj.intValue();
		
		System.out.println("Integer value: " + intObj);
		//calls toString() 
		
		Object object = new Integer(5);  //Object variable Integer reference here, object will only have access to functions that are
										 //defined in the Object class however, any overridden functions (toString) will behave in an
										 //*Integer* way because of polymorphism. This declaration is legal because Integer IS-A object
		
		
		
		Integer intObj2 = new Integer(5);	//why can we do this???
		int k = intObj2.intValue();
		
		//if(intObj.equals(intObj2))		//is this ok?  why?    Yes, because .equals is being used on two integer types
			//System.out.println("intObj equals intObj2"); 
		
		//if(intObj.intValue() == intObj2.intValue())  //is this ok?  why?  Yes, comparing two integer values
			//System.out.println("intObj == intObj2");
		
		//if(k.equals(j))			//is this ok?  why?  No, because methods cannot be invoked on primitive data types
			//System.out.println("k equals j");
			
		//if(intObj.equals(j))			//is this ok?  why?  Method is not being invoked on primitive data type but on object
			//System.out.println("intObj equals j");
		
		//if(intObj.intValue().compareTo(intObj2.intValue()) < 0)		//is this ok?  why? No, returns int and can't invoke on primitive data type
			//System.out.println("intObj compared To intObj2 is < 0");
		
		//if(intObj.compareTo(intObj2.intValue()) < 0)		//is this ok?  why?  Yes, invoked on Obj not a returned int
			//System.out.println("intObj compared To intObj2 is < 0");
		
		//if(intObj.compareTo(object) < 0)		//is this ok?  why?    No, comparTo expects an int not an object
			//System.out.println("intObj compared to (Integer)object is < 0");
		
		//if(intObj.equals(object))     Yes, .equals expects object, casts objec to integer for comparison
			//System.out.println("intobj is equal to object");
		
		if(intObj.compareTo((Integer)object) < 0)		//is this ok?  why?  Yes, compareTo expects an int which object was cast to
			System.out.println("intObj comapred to (Integer)object is < 0");
		
		//if(object.compareTo(intObj) < 0)			//is this ok?  why? No
			System.out.println("object compared to intObj is < 0");
		
		//if(((Integer)object).compareTo(intObj) < 0)			//is this ok?  why? Yes
			//System.out.println("object compared to intObj is < 0");	
	}
}
