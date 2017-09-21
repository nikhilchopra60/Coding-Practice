package ProbablisticCounting;

public class Repeated {
	public static boolean find(String p,String str){
		String s =  str;
		System.out.println(s.substring(0, s.length() ));
        return s.substring(0, s.length()).contains(p);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(find("abab"));
		String f="";
		String str="abcdabcd";
		for(int i=1;i<str.length();i++){
			if(find(str.substring(0, i)+str.substring(0, i),str)){
				f=str.substring(0, i);
			}
		}
		
		System.out.println("printinf final "+f );
	}

}
