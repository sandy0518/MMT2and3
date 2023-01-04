package javaPrograms;

import java.util.TreeSet;

public class ColleFraWork {
	
	public static void main(String[] args) {
		TreeSet s=new TreeSet();
		s.add(2);
		s.add(69);
		s.add(96);
		s.add(12);
		s.add(15);
		System.out.println(s);
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.pollFirst());
		System.out.println(s.pollLast());
		System.out.println(s);
	}
}
