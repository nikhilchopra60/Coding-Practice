package Imp;


/***
 * 
 * Given arrival and departure times of all trains that reach a railway station, find the minimum number of platforms required for the railway station so that no train waits.
 * We are given two arrays which represent arrival and departure times of trains that stop
Examples:
Input:  arr[]  = {9:00,  9:40, 9:50,  11:00, 15:00, 18:00}
        dep[]  = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
Output: 3
There are at-most three trains at a time (time between 11:00 to 11:20)

The idea is to consider all evens in sorted order. Once we have all events in sorted order, we can trace the number of trains at any time keeping track of trains that have arrived, but not departed.
 * 
 * 
 * ***/
 
public class NoOfPlatforms {

	
	public static int sort(int[] arr, int[] dep){
		
		MergeSort ms = new MergeSort();
		ms.mergeSort(arr, 0, arr.length-1);
		ms.mergeSort(dep, 0, dep.length-1);
		
		
		int platforms =0, result=0, i=0,j=0;
		
		while(i<arr.length && j<dep.length){
			
			if(arr[i]<dep[j]){
				platforms++;
				i++;
				
				if(platforms>result){
					result = platforms;
				}
			}
			
			else{
				platforms--;
				j++;
			}
			
			
		}
		
		
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {900, 940, 950, 1100, 1500, 1800};
		int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
		
		System.out.println("No of Platforms : "+sort(arr,dep));
	}

}
