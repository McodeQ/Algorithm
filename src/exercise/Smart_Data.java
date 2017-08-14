package exercise;

import edu.princeton.cs.algs4.StdOut;

public class Smart_Data {
	private final int month;
	private final int date;
	private final int year;
	
	public Smart_Data(int m ,int d, int y ) {
		if(m>12) 
			throw new RuntimeException("Error date");
		else if(d>31)
			throw new RuntimeException("Error date");
		else if((m==4||m==6||m==9||m==12)&&d>30)
			throw new RuntimeException("Error date");		
		if(y%400==0||(y%4==0&&y%100!=0)) {
			if(m==2&&d>29)
				throw new RuntimeException("Error date");
		}
		else {
			if(m==2&&d>28)
				throw new RuntimeException("Error date");
		}
		month = m;
		date =d;
		year = y;
	}
	public int month()
	{
		return month;
	}
	public int date()
	{
		return date;
	}
	public int year ()
	{
		return year;
	}
	public String toString()
	{
		return ""+month+"/"+date+"/"+year;
	}
	public static void main(String[] args)
	{
		Smart_Data D= new Smart_Data(5,31,2012);
		StdOut.print(D.toString());
		
	}
}
