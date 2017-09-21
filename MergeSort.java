package Imp;

import java.util.Scanner;

public class MergeSort {

	public static void merge(int[] a, int l, int m , int r){
		
		int n1 = m-l+1;
		int n2 = r-m;
		
		int[] L = new int[n1];
		int[] R =new int[n2];
		
		for(int i=0;i<n1;i++){
			L[i] = a[l+i];
			
		}
		
		for(int i=0;i<n2;i++){
			R[i] = a[m+1+i];
			
		}
		
		int i=0, j=0, k=l;
		
		while(i<n1 && j<n2){
			
			if(L[i]<=R[j]){
				
				a[k] = L[i];
				i++;
			}
			
			else{
				a[k] = R[j];
				j++;
			}
			k++;
			
		}
		
		while(i<n1){
			a[k] = L[i];
			i++;
			k++;
		}
		
		while(j<n2){
			a[k] = R[j];
			j++;
			k++;
		}
		
	}
	
	
	public static void mergeSort(int[] a, int left, int right){
		
		if(left<right){
			int m = (left+right)/2;
			
			mergeSort(a,left,m);
			mergeSort(a,m+1,right);
			
			merge(a,left,m,right);
		}
		
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0;i<n;i++){
			a[i] = sc.nextInt();
			
		}
		
		mergeSort(a, 0, a.length-1);
		
		for(int i =0; i<a.length;i++){
			System.out.println(a[i]);
		}
		
	}
}
