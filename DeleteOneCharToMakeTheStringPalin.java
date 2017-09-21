package Imp;
/***
 * 
 * Given a string, , of lowercase letters, determine the index of the character whose removal will make a palindrome. 
 * If is already a palindrome or no such character exists, then print . There will always be a valid solution, and any correct answer is acceptable. 
 * For example, if "bcbc", we can either remove 'b' at index or 'c' at index .
 * 
 * * 
 * ***/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DeleteOneCharToMakeTheStringPalin {

	    public static int checkPalin(String input){
	        
	        for(int i=0; i<input.length()/2;i++){
	            
	            if(input.charAt(i)!=input.charAt(input.length()-1-i)){
	                
	                return i;
	            }
	        }
	        return -1;
	        
	    }
	    
	    public static int check(String input){
	        
	        if(input==null || input=="" || input==" "){return -1;}
	        
	        int checkInputStringIndex = checkPalin(input);
	        if( checkInputStringIndex ==-1) {return -1;}
	        
	        else{
	           
	                String s = input.substring(0,checkInputStringIndex) + input.substring(checkInputStringIndex+1);
	     
	                if(checkPalin(s)== -1) {return checkInputStringIndex;}
	            
	                else{
	                String s1 = input.substring(0,(input.length()-1-checkInputStringIndex)) + input.substring(input.length()-checkInputStringIndex);
	         
	          
	                    if(checkPalin(s1)==-1) {return input.length()-1-checkInputStringIndex;}
	               
	                }
	          return -100; 	// Will never go in this.
	        }
	        
	        
	    }  
	        
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        
	        Scanner sc = new Scanner(System.in);
	        int n  = sc.nextInt();
	        
	        for(int i=0;i<n;i++){
	        String input = sc.next();
	        System.out.println(check(input));
	        }
	    }
	}



