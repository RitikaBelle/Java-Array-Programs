package com.kn.utubeArrayPrograms;

public class SearchMaxMinNumber {
	public static void main(String[] args) {
		int[] a= {4,3,2,1,5,6,8,10};
		int max = a[0];
		int min =a[0];
		for(int i =1;i<a.length;i++) 
		{
			if(max < a[i]) 
			{
				max = a[i];
			}
			if(min > a[i]) 
			{
				min = a[i];
			}
			
		}
		System.out.println("Maximum element is " +max);
		System.out.println("Minimum element is " +min);
	}
}
