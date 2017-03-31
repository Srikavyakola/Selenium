package dateandtime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CaptureDateAndTime {

	public static void main(String[] args) 
	
	{
		
			DateFormat dateformat=new SimpleDateFormat("MM/dd/yyyy HH:MM:SS");
			
			Date date=new Date();
			
			String date1=dateformat.format(date);
			
			System.out.println("Today's date and time is --->"+date1);
		

	}

}
