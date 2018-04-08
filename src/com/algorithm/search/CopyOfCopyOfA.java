package com.algorithm.search;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		int a[]={10,20,12,45,60,46};
		System.out.print(recursiveLinearSearch(a,0,45));
	}

	
	public static int recursiveLinearSearch(int[] search,int i, int x){
		if(i>search.length-1){
			return -1;
		}else if(search[i]==x){
			return i;
			
		}else{
			System.out.println("value :"+i);
			return recursiveLinearSearch(search, i+1, x);
		}
		
	}
}
