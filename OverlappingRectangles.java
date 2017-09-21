package ProbablisticCounting;

import java.util.Scanner;

public class overlappingRect {
	
	coordinate pA1;
	coordinate pA2;
	coordinate pB1;
	coordinate pB2;
	
	
	public static class coordinate{
		
		int x;
		int y;
		public coordinate(int x,int y){
			this.x=x;
			this.y=y;
			
		}
	}
	
	
	
	
	public boolean isOverlapping(){
		
		if( (pA1.x<= pB1.x) && (pB1.x<=pA2.x) && (pA2.y<=pB2.y) && (pB2.y<=pA1.y)  || (pB1.x<= pA1.x) && (pA1.x<=pB2.x) && (pB2.y<=pA1.y) && (pA1.y<=pB1.y)
				|| (pB1.x<= pA1.x) && (pA1.x<=pB2.x) && (pB2.y<=pA2.y) && (pA2.y<=pB1.y) || (pA2.x<= pB1.x) && (pB1.x<=pA1.x) && (pA2.y<=pB1.y) && (pB1.y<=pA1.y)){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);	
	int T=sc.nextInt();
	overlappingRect or=new overlappingRect();
	or.pA1=new coordinate(sc.nextInt(),sc.nextInt());
	or.pA2=new coordinate(sc.nextInt(),sc.nextInt());
	or.pB1=new coordinate(sc.nextInt(),sc.nextInt());
	or.pB2=new coordinate(sc.nextInt(),sc.nextInt());
	System.out.println(or.isOverlapping());
		
	}

}
