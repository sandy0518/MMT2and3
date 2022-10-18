package javaPrograms;

import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.AbstractMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.Stack;
import java.util.Map;
import java.util.TreeMap;
import java.util.Properties;
import java.util.Queue;
import java.util.TreeSet;
import java.util.Vector;


public class CollFrWork implements Comparable{
	int eid;
	String name;
	int salary;

	CollFrWork(int eid, String name, int salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "eid=" + eid + ", name=" + name + ", salary=" + salary;
	}
	@Override
	public int compareTo(Object o) {
		CollFrWork cr = (CollFrWork)o;
		if(eid>cr.eid) {
			return 1;
		}
		else if(eid<cr.eid) {
			return -1;
		}
		return 0;
	}
	public static void main(String[] args) {
		ArrayList le=new ArrayList<>();
		le.add(new CollFrWork(10, "krishna", 5486));
		le.add(new CollFrWork(2, "ram", 10000));
		le.add(new CollFrWork(21, "arjun", 65000));
		le.add(new CollFrWork(1, "lakshman", 0011));
		le.add(new CollFrWork(0, "karan", 584687));
		Collections.sort(le);
		System.out.println(le);

		System.out.println("sorting based on name");
		Collections.sort(le, new MyNameComparator());
		for(Object list:le) {
			System.out.println(list);
		}
		System.out.println("sorting based on salary");
		Collections.sort(le, new MySalaryComparator());
		for(Object list:le) {
			System.out.println(list);
		}
	}
}