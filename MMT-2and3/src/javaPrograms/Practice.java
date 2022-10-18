package javaPrograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Practice extends Object{

	public static void main(String[] args) {
		String s="india";
		//1st step: add into collection
		LinkedHashSet<Character> ls=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			ls.add(s.charAt(i));
		}
		System.out.println(ls); //[a,b,c,d]

		// Step 2 Iterate Unique values
		for(Character lhs:ls) { //b
			if(!lhs.equals('i')) {
				System.out.println(lhs);
			}
//			int count=0;
//			for(int i=0;i<s.length();i++) {
//				if(lhs.equals(s.charAt(i))) {
//					count++;
//				}
//			}
//			if(count==1) {
//				System.out.println(lhs+" "+count);
//			}
		}
	}
}
