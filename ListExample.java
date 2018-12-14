import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListExample {

	public static void main(String[] args) {
		
		List l =new LinkedList();
		//Set<Integer> s= new HashSet<Integer>();
		HashSet s= new HashSet();
		for(int i=0; i<20;i++)
		{
			 s.add((Integer)i*2);
		}
		System.out.println(s);
	TreeSet ts=new TreeSet(s);	
	System.out.println("TreeeSet.."+ts);	
	System.out.println(ts.tailSet(24));
	}
	
}
