package javaPrograms;

public class DecisionMakingStatements {
	public static void main(String[] args) {
		int i=1;
		int count=0;
		while(i<=10) {
			if(i%2==0) {
			System.out.print(i+" ");
			count++;
			}
			i++;
		}
		System.out.println();
		System.out.println("even count is "+count);
	}
}