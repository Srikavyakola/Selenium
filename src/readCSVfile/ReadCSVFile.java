package readCSVfile;


import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class ReadCSVFile {

	public static void main(String[] args) throws IOException
	
	{
	
		FileReader scr=new FileReader("C:\\Users\\Kavya\\Desktop\\Eclipse\\Selenium_1\\TestData1.csv");
		
		CSVReader reader=new CSVReader(scr);
		
		List<String[]> l1=reader.readAll();
		
		Iterator<String[]> i1=l1.iterator();
		
		while(i1.hasNext())
		
		{
			String[] str=i1.next();
			
			System.out.println("The values of .CSV file are  ");
			
			for(int i=0;i<str.length;i++)
			
			{
				System.out.println(" "+str[i]);
				
				System.out.println("    ");
				
			}
			
		}

	}

}
