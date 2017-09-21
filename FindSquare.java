package Imp;

import java.util.Scanner;

public class FindSquare {

	static int x1,y1, x2, y2, x3, y3, x4, y4 =0;
	
	public static double findDistance(int x1, int y1, int x2, int y2){
		
		return Math.pow((Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)),0.5);
		
	}
	
	public static boolean findSlope(int x1, int y1, int x2, int y2, int x3, int y3){
		
		double slope1 = (y3-y1)/(x3-x1);
		double slope2 = (y2-y1)/(x2-x1);
		
		if((slope1*slope2)==-1){
			return true;
		}

		else{
			return false;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		
		for(int i=0; i<testCases;i++){
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			x3 = sc.nextInt();
			y3 = sc.nextInt();
			x4 = sc.nextInt();
			y4 = sc.nextInt();
			
			
			double lengthOfLine1 = findDistance(x1, y1, x2, y2);
			double lengthOfLine2  = findDistance(x2, y2, x3, y3);
			double lengthOfLine3  = findDistance(x3, y3, x1, y1);
			
			if(lengthOfLine1==lengthOfLine2 || lengthOfLine2==lengthOfLine3 || lengthOfLine3==lengthOfLine1 ){
				
				if(lengthOfLine1==lengthOfLine2){
					
					if((findDistance(x1, y1, x4, y4) == findDistance(x3,y3,x4,y4)) && (findDistance(x1, y1, x4, y4)==lengthOfLine1) && (findDistance(x2,y2,x4,y4)==lengthOfLine3)){
						System.out.println(1);
						/*if(findSlope(x4,y4, x1,y1, x3,y3) && findSlope(x3,y3, x4,y4, x2,y2) && findSlope(x2,y2, x1,y1, x3,y3) && findSlope(x1,y1, x4,y4, x2,y2))
							System.out.println(1);
						else
							System.out.println(0);*/
						
					}
					else{
						
						System.out.println(0);
					}
				}
				else if(lengthOfLine2==lengthOfLine3){
					
					if((findDistance(x2, y2, x4, y4) == findDistance(x1,y1,x4,y4)) && (findDistance(x2, y2, x4, y4)==lengthOfLine2) && (findDistance(x3,y3,x4,y4)==lengthOfLine1)){
						
						System.out.println(1);
						/*if(findSlope(x4,y4, x1,y1, x3,y3) && findSlope(x3,y3, x4,y4, x2,y2) && findSlope(x2,y2, x1,y1, x3,y3) && findSlope(x1,y1, x4,y4, x2,y2))
							System.out.println(1);
						else
							System.out.println(0);*/
						
					}
					else{
						
						System.out.println(0);
					}
					
				}
				
				else if(lengthOfLine3==lengthOfLine1){
					
					if((findDistance(x2, y2, x4, y4) == findDistance(x3,y3,x4,y4)) && (findDistance(x2, y2, x4, y4)==lengthOfLine3) && (findDistance(x1,y1,x4,y4)==lengthOfLine2)){
						
						System.out.println(1);
						/*if(findSlope(x4,y4, x1,y1, x3,y3) && findSlope(x3,y3, x4,y4, x2,y2) && findSlope(x2,y2, x1,y1, x3,y3) && findSlope(x1,y1, x4,y4, x2,y2))
							System.out.println(1);
						else
							System.out.println(0);*/
						
					}
					else{
						
						System.out.println(0);
					}
					
				}
				
				
			}
			
			else{
				System.out.println(0);
			}
			
			
		}
		

	}

}
