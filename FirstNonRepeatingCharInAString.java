package Imp;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharInAString {

	public static char firstNonRepeatingChar(String input){
		
		int count = 0;
		input = input.toLowerCase();
		LinkedHashMap<Character, Integer>h = new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<input.length();i++){
			
			char ch = input.charAt(i);
			if(h.containsKey(ch)){
				
				h.put(ch, h.get(ch)+1);
			}
			else{
				
				h.put(ch, 1);
			}
			
		}
		
		for(Map.Entry<Character, Integer>e : h.entrySet()){
			
			if(e.getValue()==1){
				return e.getKey();
			}
		}
		
		return '\0';
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		System.out.println("First Non- Repeating Character : "+firstNonRepeatingChar(input));
		
	}

}
