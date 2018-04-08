package com.algorithm.search;

public class BinarySearchAlg {
	
	public static void main(String[] args) {
		int[] a={2,4,6,8,12,45,50,65,70,75,80};
		System.out.print(binarySearch(a, 45));
	}
	
	public static int binarySearch(int[] searchHere, int value ){
		int p= 0;int r=searchHere.length-1;
		while(p<=r){
			int q=(p+r)/2;
			if(searchHere[q]==value){
				return q;
			}else if(searchHere[q]>value){
				r=q-1;
			}else{
				p=q+1;
			}
		}
		
		return 0;
	}
}
