package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		String s1 = new String("도우넛");
		String s2 = new String("도우넛");
		
		String s3 = "둘리";
		
		set.add("둘리");
		set.add("마이콜");
		set.add("또치");
		set.add(s1);
		set.add(s2);
		set.add(s3);

		System.out.println(set.size());
		System.out.println(set.contains(s1));
		
		//순회
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
	
	}

}
