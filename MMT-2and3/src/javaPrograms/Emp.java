package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;


public class Emp implements Comparator{

	public int compare(Object o1, Object o2) {
		String i1=(String)o1;
		String i2=(String)o2;
		if(i1.compareTo(i2)>0) {
			return 1;
		}
		return -1;
	}
	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add("1");
		a.add("2");
		a.add("5");
		a.add("4");
		a.add("3");
		Collections.sort(a,new Emp());
		System.out.println(a);

	}	
}


