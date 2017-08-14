package exercise;

import edu.princeton.cs.algs4.StdOut;
//注意判断字符串相等用equals
public class E1_2_6 {
	public static boolean check(String s1,String s2) {
		if((s2.substring(s2.indexOf(s1.charAt(0)), s2.length())+s2.substring(0, s2.indexOf(s1.charAt(0)))).equals(s1))
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdOut.print(check("hello","llohep"));
		
	}

}
