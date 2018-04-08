package com.algorithm.search;

public class RecursiveWay {

	public static void main(String[] args) {
		recursiveMethod(10);
	}

	
	public static void recursiveMethod(int n){
		if(n>=0)
			recursiveMethod(n-1);
		
		System.out.println("value :"+n);  // The way n is printed this way because it is a recursive method call. In a stack the method call 
		//keeps on happening and method grow on top of other, so first the top level method will be executed and then bottom level
	}
}
