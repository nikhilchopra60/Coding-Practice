package ProbablisticCounting;

import java.util.Scanner;

public class maxAvgStudent {

	String name;
	int marks1;
	int marks2;
	int marks3;
	int avg;
	maxAvgStudent(String name,int m1,int m2,int m3){
		
		this.name=name;
		this.marks1=m1;
		this.marks2=m2;
		this.marks3=m3;
		this.avg=(m1+m2+m3)/3;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int maxAvg=0;
		String maxStud="";
		for(int i=0;i<T;i++){
			int numOfStud=sc.nextInt();
			maxAvgStudent[] s=new maxAvgStudent[numOfStud];
			for(int a=0;a<numOfStud;a++){
				 s[i]=new maxAvgStudent(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
				 if(maxAvg<s[i].avg)
				 {
					 maxAvg=s[i].avg;
					 maxStud=s[i].name;
				 }
			}
			
			System.out.println(maxStud+" "+maxAvg);
		}
		
	}
}
