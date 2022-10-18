package javaPrograms;

public class LoopingStatements {
	public static void main(String[] args) {
		int a='A';
		for(int i=1;i<=5;i++) { 
			for(int j=1;j<=5;j++) {
				if(j%2==0) {
					System.out.print("#");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}