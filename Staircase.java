package ProbablisticCounting;

public class Staircase {
	
	static public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        int third=4;
        for (int i = 4; i <= n; i++) {
            int fourth = first + second +third;
            first = second;
            second = third;
            third=fourth;
        }
        return third;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(4));

	}

}
