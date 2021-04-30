package collection;

import java.util.HashSet;
import java.util.Set;

import chapter04.Rect;

public class HashSelTest {

	public static void main(String[] args) {
		Set<Rect> set = new HashSet<>();

		Rect r1 = new Rect(10, 20);
		Rect r2 = new Rect(10, 20);

		set.add(r1);
		set.add(r2);

		for (Rect rect : set) {
			System.out.println(rect);
		}

	}

}
