package com.algorithm.search;

public class LinearSearchAlg {

	public static void main(String[] args) {
		int[] a={2,4,6,8,12,45};
		System.out.print(linearSearch(a, 45));
	}
	
	public static int linearSearch(int[] searchHere, int value ){
		for (int i=0;i<searchHere.length;i++){
			if(searchHere[i]== value){
				return i;
			}
		}	
		return -1;
	}
	
}
