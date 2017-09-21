package Imp;

import java.util.HashSet;
import java.util.Scanner;

// SImply finds first Non Repeating Character eg: input = Kaak output = a
public class FirstRepeatingCharInAString {
	
	public static HashSet h = new HashSet();
	
	public static char firstRepeatingChar(String input){
		
		for(int i=0;i<input.length();i++){
			
			if(h.contains(input.charAt(i))){
				return input.charAt(i);
			}
			else{
				h.add(input.charAt(i));
			}
		}
		
		return '\0';
	}
	
	public static char firstRepeatingChar2(String input){
		
		int minIndex= input.length();
		for(int i=0;i<input.length();i++){
			
			if(h.contains(input.charAt(i))){
				if(input.indexOf(input.charAt(i))<minIndex){
					minIndex = input.indexOf(input.charAt(i));
				}
			}
			else{
				h.add(input.charAt(i));
			}
		}
		
		return input.charAt(minIndex);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		System.out.println("First Repeating Character : "+firstRepeatingChar(input));
		
		// Eg: Input = kaak, output = k. because k is before a in original string, so k will be the output
		System.out.println("First Repeating Character Based on their position in Original String: "+firstRepeatingChar2(input));
		

	}

}
