package dateutility;


	import java.io.*;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	 
	public class Comparedate {
	    public static void main (String[] args) throws ParseException  {
	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
	        Date d1 = simpleDateFormat.getInstance().parse("2022-12-06");
	        Date d2 = simpleDateFormat.getInstance().parse("2022-12-06");
	        //System.out.println(d1.equals(d2));
	        System.out.println(d2.compareTo(d1));
	        
	    }
	}


