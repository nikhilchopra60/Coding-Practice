package Imp;

import java.util.Scanner;

// Check if the given string is a palindrome

public class Palindrome {
	
	
	public static boolean checkPalin(String input){
		
		if(input==null || input=="" || input==" "){return false;}
		
		for(int i=0;i<input.length()/2;i++){
			
			if(input.charAt(i)!=input.charAt(input.length()-i-1)){
				return false;
			}
		}
		
		return true;		
		
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		System.out.println("Answer :  "+checkPalin(input));
		
		
		
		
		
	}

}
