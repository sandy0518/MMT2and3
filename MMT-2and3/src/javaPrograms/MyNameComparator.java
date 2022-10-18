package javaPrograms;

import java.util.Comparator;

public class MyNameComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		CollFrWork e1=(CollFrWork)o1;
		CollFrWork e2=(CollFrWork)o2;
		if(e1.name.compareTo(e2.name)>0) {
			return 1;
		}
		else if(e1.name.compareTo(e2.name)<0) {
			return -1;
		}
		return 0;
	}
}
