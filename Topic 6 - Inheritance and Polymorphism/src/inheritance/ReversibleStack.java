package inheritance;
import java.util.Stack;

//subclass of Stack
public class ReversibleStack<E> extends Stack<E>
{
	//constructor
	public ReversibleStack()
	{
		super();
	}
	
	//reverse the order of the elements in "this"
	//rule: you can't use any functions that refer to 
		//and index of an element (inherited from vector)
	public void reverse()
	{
		ReversibleStack<E> stack = (ReversibleStack)this.clone();
		this.clear();
		while(stack.empty() == false)
		{
			this.push(stack.pop());
		}
	}
	
}
