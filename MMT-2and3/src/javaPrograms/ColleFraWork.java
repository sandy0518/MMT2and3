package javaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
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
