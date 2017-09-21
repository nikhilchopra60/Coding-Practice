package ProbablisticCounting;

import java.util.ArrayList;
import java.util.List;

public class GenerateParan {

	public static void main(String args[]){
		System.out.println(generateParenthesis(3));
	}
	public static List<String> generateParenthesis(int n) {
        List<String> res =new ArrayList<String>();
        generate(res,"",n,n);
        return res;
    }
    
    public static void generate(List<String> res,String temp,int l,int r){
        if(l==0&& r==0){
            res.add(temp);
            
        }
        if(l<=r){
        if(l>0){
           
            generate(res,temp+"(",l-1,r); 
        }
        if(r>0){
        	
            generate(res,temp+")",l,r-1);
        }
        }
        return;
    }
}
