package sample;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Calendar;
//import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.FileWriter;
import java.time.*;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		String tim=cal.getTime().toString();
		try
		{
			 File obj=new File("StudentFile.txt");
			 if(obj.createNewFile())
			 {
				 
				 System.out.println("File Created:" +obj.getName());
			 }
			 else
			 {
				 Scanner Reader=new Scanner(obj);
				 while(Reader.hasNextLine())
				 {
					 String name=Reader.next();
					System.out.println(name);
					 String num=Reader.next();
					 
					 String regex="[7-9]{1}[0-9]{9}";
					 if(num.matches(regex)==true)
					 {
						  File str=new File(name + ".txt");
						  System.out.println(str);
						  FileWriter a=new FileWriter(str);
						  a.write(tim);
						  a.close();
					 }
				 }
				
				 //System.out.println("File already exists");
			 }
		}
		catch(IOException e)
		{
			System.out.println("An error has occured");
			e.printStackTrace();
		}
       
        
	}

}
