package exercise;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class E1_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N  = StdIn.readInt();
		int min = StdIn.readInt();
		int max = StdIn.readInt();
		double[] number1 = new double[2];
		double[] number2 = new double[2];
		StdDraw.setXscale(min-1, max+1);
		StdDraw.setYscale(min-1, max+1);
		Interval1D X = new Interval1D(min,max);
		Interval1D Y = new Interval1D(min,max);
		Interval2D a = new Interval2D(X,Y);
		a.draw();
		Interval2D[] Inter = new Interval2D[N];
		for (int i = 0;i < N;i++) {
			for (int j = 0;j<2;j++) {
				 number1[j] = StdRandom.uniform(min+1, max);
				 number2[j] = StdRandom.uniform(min+1, max);
				 if (number1[j] == number2[j])
					 number1[j] = number1[j]-1;
				 StdOut.println(""+ number1[j]+" "+number2[j]);
			}
			Interval1D x= new Interval1D(Math.min(number1[0], number2[0]), Math.max(number1[0], number2[0]));
			Interval1D y= new Interval1D(Math.min(number1[1], number2[1]), Math.max(number1[1], number2[1]));
			Inter[i] = new Interval2D(x, y);
			Inter[i].draw();
		}
		int cout=0;
		for (int i =0;i<Inter.length;i++) {
			for (int j = i+1 ;j<Inter.length;j++) {
				if(Inter[i].intersects(Inter[j]))
				{
					cout++;
				}
			}
		}
		StdOut.println(cout);
		
	}


}
