package ProbablisticCounting;

import java.io.*;
import java.util.*;

class Meeting3 {

  static int[] meetingPlanner(int[][] slotsA, int[][] slotsB, int dur) {
    // your code goes here
	  
	int[] res=new int[2];  
	int a=0;
	int b=0;
	
	while(a<slotsA.length && b<slotsB.length){
		
		int cS=Math.max(slotsA[a][0], slotsB[b][0]);
		int cE=Math.min(slotsA[a][1], slotsB[b][1]);
		if(cE-cS>=dur){
			res[0]=cS;
			res[1]=cS+dur;
			return res;
		}
		if(slotsA[a][1]<slotsB[b][1]){
			a++;
		}
		else b++;
	}
		  
	 
	  
	  return res;
  }

  public static void main(String[] args) {
	  int[] res=new int[2];
	  int[][] a={{7,12}};
	  int[][] b={{2,11}};
	  res=meetingPlanner(a,b,5);
	  System.out.println(res);
  }

}