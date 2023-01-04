package javaPrograms;

public class Arrayss {
	public static void main(String[] args) {
		int[]a= {1,6,2,4,6,3};
		boolean status =true;
		System.out.println("missing numbers are :");
		for(int i=1;i<=10;i++)
		{
			for(int j=0;j<a.length;j++) {
				if(i==a[j])
				{
					status=false;
					break;
				}
			}
			if(status==true)//number is not present
			{
				System.out.print(i+" ");
			}
			status=true;//for every number status should be true
		}
	}
}