package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest32 {
	
	public static void main(String[] args) {
		Set<Gugudan> s = new HashSet<Gugudan>();
		
		s.add(new Gugudan(2, 3));
		s.add(new Gugudan(9, 9));
		s.add(new Gugudan(3, 2));
		s.add(new Gugudan(3, 2));
		
		for(Gugudan g : s) {
			System.out.println(g);
		}
				
	}

}
