package javaPrograms;

public class Armstrong3 {
	public static void main(String[] args) {
		int n=153;
		int rem=0;
		int temp=n;
		int sum=0;
		while(n!=0) {
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(temp==sum)
			System.out.println(sum+" is amstrong number");
		else
			System.out.println(sum+" is not amstrong number");
	}
}
