package javaPrograms;

import java.util.Arrays;

public class LocandGlobalVariables {
	final static int j=24;
	final int i=100; 
	public static void main(String[] args)
	{
		j=45; // it will throw error 
		LocandGlobalVariables lg=new LocandGlobalVariables();
		lg.i=35;  //it will throw error
	}
}