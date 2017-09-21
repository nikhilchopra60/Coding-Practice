package Imp;

import java.util.ArrayList;

// For sorted arrays, apply mrege procedure of merge sort. FOR DISTINCT ELEMENTS IN EACH ARRAY
// here. first do sorting of smaller array, then binary search each element of larger array into that smaller one.
/*1) Initialize union U as empty.
2) Find smaller of m and n and sort the smaller array.
3) Copy the smaller array to U.
4) For every element x of larger array, do following
…….b) Binary Search x in smaller array. If x is not present, then copy it to U.
5) Return U.*/




// jVASCRIPT APPROACH. CAN BE DONE BY SIMPLE HASHSET IN JAVA.

public class UnionAndIntersectionOfUnsortedArrays {

	
	public static ArrayList<Integer>un = new ArrayList<Integer>();
	public static ArrayList<Integer>in = new ArrayList<Integer>();
	
	public static boolean BinarySearch(int l, int r, int k){
		
		if(l<=r){
			
			int m = (l+r)/2;
			if(k==un.get(m)){
				return true;
			}
			if(k>un.get(m)){
				return BinarySearch(m+1,r,k);
			}
			
			else{
				return BinarySearch(l,m-1,k);
			}
			
			
		}
		
		return false;
		
	}
	
	public void Union(int[] arr1){
		
		
		for(int i=0;i<arr1.length;i++){
			if(BinarySearch(0,un.size()-1, arr1[i])){
				in.add(arr1[i]);
				continue;
			}
			
			un.add(arr1[i]);
		}
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UnionAndIntersectionOfUnsortedArrays Ob = new UnionAndIntersectionOfUnsortedArrays();
		int[] arr1 = {2,4,5,1,3,7,13,0};
		int[] arr2 = {4,1,5,8};
		
		if(arr1.length<arr2.length){
			MergeSort.mergeSort(arr1,0,arr1.length-1);
			
			for(int i=0;i<arr1.length;i++){
				un.add(arr1[i]);
			}
			Ob.Union(arr2);
			
		}
		else {
			MergeSort.mergeSort(arr2,0,arr2.length-1);
			for(int i=0;i<arr2.length;i++){
				un.add(arr2[i]);
			}
			Ob.Union(arr1);
			
		}
		
		
		for(int i=0;i<un.size();i++){
			System.out.print(un.get(i) + " ");
		}
		System.out.println();
		for(int i=0;i<in.size();i++){
			System.out.print(in.get(i) + " ");
		}
		
		
	}

}
