package com.kn.InsertionSort;

import java.util.Scanner;

public class InsertionSortDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//Array Declaration and Declaration
		System.out.println("Enter Size of Array");
		int [] arr=new int[s.nextInt()];
		//Array Initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter "+(i+1)+" Elements");
			arr[i]=s.nextInt();
		}
		
		//Create Object for the Class InsertionSort
		InsertionSort sort=new InsertionSort();
		
		//Calling Method Insertion Sorting Elements
		for(int i:sort.InsertionSortingElements(arr))
		{
			System.out.println(i);
		}
		for(int i:sort.DescendingOrder(arr))
		{
			System.out.println(i);
		}
		
	}

}
