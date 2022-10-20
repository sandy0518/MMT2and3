package javaPrograms;

public class Calling {
	public static void m1(char a,int b,String c) {
		System.out.println("position differed in 1st method");
	}
	public static void m1(int a,char b,String c) {
		System.out.println("position differed in 2nd method");
	}
	public static void m1(String a,int b,char c) {
		System.out.println("position differed in 3rd method");
		System.out.println("position differed in 3rd method");
	}
	public static void main(String[] args) {
		m1('a',45,"s");
		m1(11,'a',"c");
		
	}
}
