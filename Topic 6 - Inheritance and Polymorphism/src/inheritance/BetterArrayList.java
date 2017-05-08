package inheritance;
import java.util.ArrayList;

public class BetterArrayList<E> extends ArrayList<E> {
	//shuffle
	//findMax
	//findMin
	//findIndexesOf
	public BetterArrayList(){
		super();
	}
	public BetterArrayList(int initialCap){
		super(initialCap);
	}
	public void shuffle(){
		int rand;
		for(int i = 0; i  < this.size(); i++){
			rand = (int)(Math.random() * this.size());
			E temp = this.get(i);
			this.set(i, this.get(rand));
			this.set(rand, temp);
		}
	}
	
	public ArrayList<Integer> indexesOf(Object o){
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		for(int i = 0; i < this.size(); i++)
			if(this.get(i).equals(o))
				indexes.add(i);
		return indexes;
	}
	public static void main(String[] args){
		BetterArrayList<String> words = new BetterArrayList<String>();
		words.add("Hello");
		words.add("there");
		words.add("Anakin");
		words.add("Darth Maul");
		words.add("there");
		words.add("Obi Wan");
		words.add("there");
		
		words.shuffle();
		System.out.println(words);
		System.out.print(words.indexesOf("there"));
	}
}
