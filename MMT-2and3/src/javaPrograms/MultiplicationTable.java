package javaPrograms;

public class MultiplicationTable {
	public static void main(String[] args) {
		int num=3;
		for(int i=1;i<=10;i++)
		{
			int mul = num*i;
			System.out.println(num+"*"+i+"="+mul);
		}
	}
}