package project;

import java.util.Date;

public class DatePrac {

	public static void main(String[] args) {
		Date date = new Date ();
		
		String s = date.toString();
		//System.out.println(date);
		String s1 = s.replaceAll("\\s+","").replaceAll(":", "");
		System.out.println(s1);
		
	}

}
