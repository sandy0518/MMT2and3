package javaPrograms;

import java.util.Arrays;

public class WrapClass{
	public static void main(String[] args) {
		String s="a11b22c33";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				int sc = Integer.parseInt(s);
				sum=sum+sc;
			}
		}
		System.out.println(sum);
	}
}