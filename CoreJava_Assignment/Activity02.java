package Homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Activity02 
{
	static String 		commands 	= ""; 			// commands in string to be filled by user
	static int    		commandsLength 	= 0;			// length of commands string
	static BufferedReader 	bf 		= null;			// reader declared, bufferedreader type
	private int 		x, y;					// values of coordinates, integer type
	static  int []		coor 		= new int[2];		// values of coordinates to be, integer array type, with size 2 for x and y values
	boolean 		repeat		= false;		// boolean value to help add more commands later on
	
	Activity02()//constructor
	{
		//constructor creates objects that in turn calls all the methods below
		System.out.println
		(
				"This program allows you to give up to 10 commands to Optimus Prime\n"+
				"and print its new coordinates"
		);							// brief description of the program
		commands = getCommands();				// commands retrieved from user in string form
		coor = getCoordinates(commands);			// calculates coordinates based on previous input
		isContinue();						// asks user whether he wants to add more commands or exit program
	}
	
	Activity02(int[] xy) 						// overloaded constructor that passes an array,
	{								// in this case the coordinates values(x,y).
		this.x = xy[0];
		this.y = xy[1];
		commands = getCommands();				// same as previous constructor except that 
		coor = getCoordinates(commands);			// it takes last coordinates as a starting point(x,y)
		isContinue();						// thus adding to the last values instead of
	}								// starting from scratch (0,0).
	
	//	this method uses BufferedReader to read user input (commands) and validates it in terms of
	// 	length and "right type: only R,L,U,D letters with try-catch and outofbound exception
	String getCommands()
	{
		bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter your commands for Prime: \n");
		System.out.print("INPUT: ");
			
			try 
			{
				commands = bf.readLine();
				
				int spaceWithouSpaces = 0;
				for(int i=0; i<commands.length(); i++)
				{					// if it is not letter: d,r,u,l or space throw exception
					if	(			
							!(	commands.charAt(i)=='d' || commands.charAt(i)=='u' ||
								commands.charAt(i)=='l' || commands.charAt(i)=='r' ||
								commands.charAt(i)=='D' || commands.charAt(i)=='U' ||
								commands.charAt(i)=='L' || commands.charAt(i)=='R' ||
								commands.charAt(i)==' '
							)
							
						)
					{
						
						throw new Exception();
					}
					
					if	(commands.charAt(i)!=' ')
					{
						spaceWithouSpaces++;	// through the loop it counts the commands without spaces
					}
				}
				
				if(spaceWithouSpaces>10)		// if commands go over 10, throw exception
				{
					throw new ArrayIndexOutOfBoundsException();
				}
			} 
			catch (ArrayIndexOutOfBoundsException e) 
			{
				System.out.println("I will not make it that far! (Please limit your orders to 10 at a time)");
				getCommands();
			} 
			catch (Exception e) 				// custom exception for not being the right letter (command)
			{
				System.out.print("Not the right command format! (Only R,L,D and U are admisible)\n");
				getCommands();
			} 
	
		return commands;
	}
	
	// this method adds or subtracts values to coordinates(x,y) based on validated commands using FOR LOOP
	// and return the coordinates in an array of the integer type.
	int[] getCoordinates(String orders)
	{
		for(int i=0; i<orders.length(); i++)
		{
			if(orders.charAt(i)=='U' || orders.charAt(i)=='u')
			{
				y++;					// add 	    1 to Y if UP
			}
			if(orders.charAt(i)=='D' || orders.charAt(i)=='d')
			{
				y--;					// subtract 1 to Y if DOWN
			}
			if(orders.charAt(i)=='R' || orders.charAt(i)=='r')
			{
				x++;					// add 	    1 to X if RIGHT
			}
			if(orders.charAt(i)=='L' || orders.charAt(i)=='l')
			{
				x--;					// subtract 1 to X if LEFT
			}
		}
		
		coor[0] = x; coor[1]=y;					// populates array with x and y values	
		System.out.println("\nOUTPUT: "+ coor[0] + " " + coor[1]);
		return coor;
	}
	
	// this little method allows us to either add more commands or exit program taking user input, try-catch
	// and recalling entire program with overloaded constructor that takes the last values of x and y
	void isContinue()
	{	
		System.out.print("More commands? (Y/N): ");
		try 
		{
			String answer = bf.readLine();
			if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes"))
			{
				System.out.print("\nWelcome back!");
				new Activity02(coor);			// creates a new instance of class with overloaded constructor
			}						// that passes last values of x ad y in an integer type array
			else if(answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no"))
			{
				System.out.println("\nProgram is exiting... Good-bye!");
				System.out.println("\t\t\t\tFINAL OUTPUT: " + coor[0] +" "+ coor[1]);
				System.exit(0);				// exits program
			}	
			else
			{
				throw new IllegalArgumentException();
			}
		} 
		catch (IllegalArgumentException e) 
		{
			System.out.println("Invalid answer! Type Y to continue and N to exit program.");
			isContinue();					// isContinue method recursion to re-retrieve commands
		}
		catch (IOException e) 
		{
			
		}
	}
	
	public static void main(String[] args) 
	{	
		new Activity02(); 					//an instance of the Activity02 class runs in main	 
	}
	
}
