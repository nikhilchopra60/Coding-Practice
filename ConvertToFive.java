package ProbablisticCounting;

import java.util.Scanner;

/*Complete the function below*/
class Reverse{
	public void convertFive(int n){
String number=String.valueOf(n);
char[] num=number.toCharArray();
for(int i=0;i<num.length;i++){
    if(num[i]=='0'){
        num[i]='5';
    }
    
}
number=String.valueOf(num);
n=Integer.parseInt(number);
}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.close();
		while(t-->0){
			int n=sc.nextInt();
			Reverse g=new Reverse();
			g.convertFive(n);
		}
}
	}