package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Activity03 
{
	public static void main(String[] args) 
	{
		Activity03 demo = new Activity03(); 						//instance of Activity03 class created in main class
	}
	
	Activity03()
	{
																	//brief description of what program does
		System.out.println
		("This program prints EVEN and ODD numbers from a given RANGE using multithreading and user input");
		System.out.println
		("To determine the range we need a start and and end number\n");
		
		Scanner sc 		= new Scanner(System.in);					// declare and initializes scanner(input reader)
		System.out.print("Enter range START number:\t");
		int 	start	= sc.nextInt();								// retrieves start of range from user
		System.out.print("Enter range END   number:\t");
		int 	end		= sc.nextInt();								// retrieves end   of range from user
		sc.close();
		Number_Program a= new Number_Program(start,end,"ODD");		// creates class object for ODD  #s
		Thread t01 		= new Thread(a);							// creates thread for this object
		t01.start();												// it starts thread
		
		Number_Program b= new Number_Program(start,end,"EVEN");		// creates class objects or EVEN #s
		Thread t02 		= new Thread(b);							// following steps are the same as above but
		t02.start();												// with corresponding object b and thread t02
	}
}

class Number_Program implements Runnable
{
		static int 			start		= 0;
		static int 			end			= 0;
		static int 			remainder	= 0;
		private String 		numberType	= "";
		static String   	outmsg		= " numbers in given range:";
		List<Integer>		numberList	= null;
		
		Number_Program(int start, int end, String numberType)
		{
			Number_Program.start 		= start;					// declares and store input from constructor
			Number_Program.end			= end;						// and assigns it to class variables
			this.numberType 			= numberType;
			this.numberList				= new ArrayList<Integer>();
		}
		public void start() 										// starts thread
		{}
		@Override
		public void run() 											// calls print method based on eve or odd
		{															// stores values in an arraylist
			if		(numberType.equalsIgnoreCase("odd"))
			{
				
				remainder 	= 1;
				
				print(start,end,remainder);
			}
			else if	(numberType.equalsIgnoreCase("even"))
			{
				
				remainder 	= 0;
				
				print(start,end,remainder);
			}	
				numberList = new ArrayList<Integer>();
		}	
		
		void print(int start, int end, int remainder)				// prints values in loop range based on
		{ 															// remainder value. 1 for odd, 2 for even.
			for(int i=start; i<=end; i++)
			{	
				if(i%2==remainder)
				{
					numberList.add(i);	
				}
			}	
			System.out.print
			(	
					"\n"+numberType+outmsg+"\n"+
					Arrays.asList(numberList)+"\n"
			);	
		}		
}