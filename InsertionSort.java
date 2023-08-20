package com.kn.InsertionSort;

public class InsertionSort {
	public int[] InsertionSortingElements(int [] arr)
	{
		;
		for(int i=0;i<arr.length;i++)
		{
			int temp=arr[i];
			int j=i-1;
			
			while(j>=0&&arr[j]>temp)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
			
			}
		
		return arr;
		
	}
	public int[] DescendingOrder(int [] brr)
	{
		
		for(int i=brr.length;i>0;i--)
		{
			int temp=brr[i];
			int j=i-1;
			
			while(j>=0&&brr[j]>temp)
			{
				brr[j+1]=brr[j];
				j--;
			}
			brr[j+1]=temp;
			
			}
		
		return brr;
		
	}
	

}
