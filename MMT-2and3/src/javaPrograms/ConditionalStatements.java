package javaPrograms;

public class ConditionalStatements {
	public static void main(String[] args) {
		char ch='A';
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
			if(ch>='a'&&ch<='z') {
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					System.out.println(ch+" is lower case vowel");
				}
				else {
					System.out.println("Not a vowel");
				}
			}
			if(ch>='A'&&ch<='Z') {
				if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
					System.out.println(ch+" is upper case vowel");
				}
				else {
					System.out.println("Not a vowel");
				}
			}
		}
		else {
			System.out.println("it is a special character");
		}
	}
}
