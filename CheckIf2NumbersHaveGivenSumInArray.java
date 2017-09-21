package Imp;

import java.util.HashMap;
import java.util.Map;

public class CheckIf2NumbersHaveGivenSumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {0,4,3,4,2,0};
			
		int target = 6;
			    
		  
		        int[] result = new int[2];
		        int k=0, a=0, min = 0;
		      
		
		        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		        for (int i = 0; i < nums.length; i++) {
		            if (map.containsKey(target - nums[i])) {
		                result[1] = i;
		                result[0] = map.get(target - nums[i]);
		               break;
		            }
		            map.put(nums[i], i);
		        }

		for(int i=0;i<2;i++){
			System.out.println(result[i]);
		}
	}

}
