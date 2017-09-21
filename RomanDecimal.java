package Imp;

import java.util.HashMap;
import java.util.Scanner;

public class RomanDecimal {

	public static HashMap<Character,Integer> romans;
	
	RomanDecimal(){
		
		romans= new HashMap<Character,Integer>();
		romans.put('I',1);
		romans.put('V',5);
		romans.put('X',10);
		romans.put('L',50);
		romans.put('C',100);
		romans.put('D',500);
		romans.put('M',1000);
		
	}
	
	public static int RomanToDecimal(String input){
		
		int decimal=0;
		for(int i=0;i<input.length();i++){
			
			if((i!=input.length()-1)&&(romans.get(input.charAt(i)))<(romans.get(input.charAt(i+1)))){
				
				decimal = decimal+ (romans.get(input.charAt(i+1))-romans.get(input.charAt(i)));
				i++;
				
			}
			else{
				
				
				decimal = decimal+romans.get(input.charAt(i));
			}
		}
		
		return decimal;
	}
	
public static String DecimalToRoman(String input){
		
		int number = Integer.parseInt(input);
		String roman = "";
		if(number<=0){
			return null;
		}
		
		while(number!=0){
			
			if(number>=1000){
				
				int times = number/1000;
				for(int i=0;i<times;i++){
					roman = roman+"M";
				}
				number = number%1000;
			}
			else if(number>=500){
				
				if(number>=900){
					
					int times = number/900;
					for(int i=0;i<times;i++){
						roman = roman+"CM";
					}
					number = number%900;
				}
				else{
					int times = number/500;
					for(int i=0;i<times;i++){
						roman = roman+"D";
					}
					number = number%500;
				}
			}
			
			else if(number>=100){
				
				if(number>=400){
					
					int times = number/400;
					for(int i=0;i<times;i++){
						roman = roman+"CD";
					}
					number = number%400;
				}
				else{
					int times = number/100;
					for(int i=0;i<times;i++){
						roman = roman+"C";
					}
					number = number%100;
				}
			}
			
			else if(number>=50){
				
				if(number>=90){
					
					int times = number/90;
					for(int i=0;i<times;i++){
						roman = roman+"XC";
					}
					number = number%90;
				}
				else{
					int times = number/50;
					for(int i=0;i<times;i++){
						roman = roman+"L";
					}
					number = number%50;
				}
			}
			
			else if(number>=10){
				
				if(number>=40){
					
					int times = number/40;
					for(int i=0;i<times;i++){
						roman = roman+"XL";
					}
					number = number%40;
				}
				else{
					int times = number/10;
					for(int i=0;i<times;i++){
						roman = roman+"X";
					}
					number = number%10;
				}
			}
			
			else if(number>=5){
				
				if(number>=9){
					
					int times = number/9;
					for(int i=0;i<times;i++){
						roman = roman+"IX";
					}
					number = number%9;
				}
				else{
					int times = number/5;
					for(int i=0;i<times;i++){
						roman = roman+"V";
					}
					number = number%5;
				}
			}
			
			else if(number>=1){
				
				if(number>=4){
					
					int times = number/4;
					for(int i=0;i<times;i++){
						roman = roman+"IV";
					}
					number = number%4;
				}
				else{
					int times = number/1;
					for(int i=0;i<times;i++){
						roman = roman+"I";
					}
					number = number%1;
				}
			}
			
			
		}
		
		return roman;
		
}
	
	public static void main(String[] args){
		
		RomanDecimal rd= new RomanDecimal();
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if(input.contains("I")|| input.contains("V")||input.contains("X")||input.contains("L")||input.contains("M")||input.contains("C")|| input.contains("D")){
		System.out.println(RomanToDecimal(input)); 
		}
		else{
			System.out.println(DecimalToRoman(input)); 
			
		}
			
	}
}
