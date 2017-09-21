package Imp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ransomnote {
	
	    public static HashMap<String, Integer> magazineMap = new HashMap<String,Integer>();
	    Map<String, Integer> noteMap;
	    
	    public ransomnote(String magazine, String note) {
	        solve(magazine,note);
	        
	    }
	    
	    public static boolean solve(String magazine, String note) {
	        
	        String[] mag = magazine.split(" ");
	        for(int i=0;i<mag.length;i++){
	            if((!magazineMap.isEmpty()) && magazineMap.containsKey(mag[i])){
	                //magazineMap.get()
	                int n = magazineMap.get(mag[i]);
	                magazineMap.put(mag[i],n+1);
	               
	            }
	            else{
	                magazineMap.put(mag[i],1);
	            }
	        }
	        
	        
	        String[] nott = note.split(" ");
	        for(int i=0;i<nott.length;i++){
	           if(magazineMap.containsKey(nott[i])){
	        	   int n = magazineMap.get(nott[i]);
	                magazineMap.put(nott[i],n-1);
	            }
	           else{
	                   return false;
	            }
	        
	        }
	        
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int m = scanner.nextInt();
	        int n = scanner.nextInt();
	        
	        // Eat whitespace to beginning of next line
	        scanner.nextLine();
	        String mag = scanner.nextLine();
	        String note = scanner.nextLine();
	       // Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
	        //scanner.close();
	        
	       boolean answer = solve(mag,note);
	        if(answer)
	            System.out.println("Yes");
	        else System.out.println("No");
	      
	    }
	}

