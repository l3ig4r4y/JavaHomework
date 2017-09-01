package Homework;

import java.util.Scanner;


class Activity01 
{	
									
	static Scanner sc = new Scanner(System.in);			// Static variables for scanner, 
	static int n = 0;						// n (length of array)
	static int [] arr = new int[n];					// array object with n length 
	static int index = 0;						// index variable
	static int element = 0;						// integer variable that will hold the pulled element
	
	Activity01()
	{
									//brief description of the program
		System.out.println
		(
				"This program allows you to select the length of an array.\n"+
				"Enter the elements of the array manually and finally ...\n"+
				"Pull an element by Index number!\n"
		);
									// class variables/objects made from return methods
		n 	= getArrayLength(); 				// array length retrieved from user
		arr	= setArrayElements(n); 				// array populated by user
		index = getIndex();					// element index retrieved by user
		element = getElementByIndex(arr,index);	                // element selected by index printed 
	}								// unless exception is caught	
	
	
									
									
	static int 		getArrayLength()			// this method asks user to enter length of array
	{								// and returns that number using Scanne class
		System.out.println("Enter number of elements in the array: ");
		int arrlength = sc.nextInt();
		return arrlength;
	}								
								
	static int[] 		setArrayElements(int n)			// method asks user for elements and returns array	
	{								
		int[] arr = new int[n]; 				// initializes array and length 
		for (int i = 0; i < arr.length; i++) 			// based on previous input
		{
									// prompts user to enter elements
			System.out.print("Enter element "+(i+1)+": ");	// manually one at a time using a FOR LOOP
			arr[i]=sc.nextInt(); 				// stores user input in array by index
		}
		return arr; 						// returns array with values provided by user
	}
						
	static int 		getIndex()				// this method asks user to enter the index
	{								// of the element to be to pulled from the array
		System.out.println					// prompts user to provide the desired index
		("Enter the index of the array element you want to access");
		
		index = sc.nextInt();					// stores user input into index variable
		
		return index;
	}								
	
	static int 		getElementByIndex(int[] arr, int index)	// this method prints the array element as per
	{								// the provided index if index goes over the length
		try							// throws outofrange exception
		{		
				System.out.println("The array element at index "+index+" is "+arr[index]);
				System.out.println("The array element successfully accessed");
				return arr[index];	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("IndexOutOfRangeException\n");// custom message for outofbounds exception
			
		}
		return 0;
	}
	
	public static void main(String[] args) 
	{
		Activity01 demo = new Activity01();			// instance of Activity01 class created in main class
	}
}
