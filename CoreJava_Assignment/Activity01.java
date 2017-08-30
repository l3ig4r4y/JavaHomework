package Homework;

import java.util.Scanner;


class Activity01 
{	
	//Static variables for scanner, n (length of array), array, index and element of array//
	static Scanner sc = new Scanner(System.in);
	static int n = 0;
	static int [] arr = new int[n];
	static int index = 0;
	static int element = 0;
	Activity01()
	{
		//brief description of the program
		System.out.println
		(
				"This program allows you to select the length of an array.\n"+
				"Enter the elements of the array manually and finally ...\n"+
				"Pull an element by Index number!\n"
		);
		//class variables/objects made from return methods
		n 	= getArrayLength(); 				// array length retrieved from user
		arr	= setArrayElements(n); 				// array populated by user
		index = getIndex();						// element index retrieved by user
		element = getElementByIndex(arr,index);	// element selected by index printed unless exception caught
	}
	//this method asks user to enter length or array and returns that number using SCANNER(SYSTEM.IN)
	static int 		getArrayLength()
	{		
		System.out.println("Enter number of elements in the array: ");
		int arrlength = sc.nextInt();
		return arrlength;
	}
	//this method takes the length of an array provided by the user to create the array using FOR LOOP
	// and asks user to manually enter the values for each element of the array
	// finally the array is returned in the form of int[] array
	static int[] 	setArrayElements(int n)
	{
		int[] arr = new int[n]; //initializes array and length based on previous method
		for (int i = 0; i < arr.length; i++) 
		{
			//prompts user to enter elements manually one at a time using a FOR LOOP
			System.out.print("Enter element "+(i+1)+": ");
			arr[i]=sc.nextInt(); //stores user input in array by index
		}
		return arr; //returns array with values provided by user
	}
	//this method ask user to enter the index of the element he/she wishes to pull from the array
	static int 		getIndex()
	{
		System.out.println("Enter the index of the array element you want to access");
		//prompts user to provide the desired index
		index = sc.nextInt();
		//stores user input
		return index;
	}
	//this method prints the array element as per the provided index or informs the user that such
	//index goes over the length of the array, making it "out of range"
	static int 		getElementByIndex(int[] arr, int index)
	{
		try
		{		
				System.out.println("The array element at index "+index+" is "+arr[index]);
				System.out.println("The array element successfully accessed");
				return arr[index];
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("IndexOutOfRangeException\n"); //custom message for outofbounds exception
			
		}
		return 0;
	}
	
	public static void main(String[] args) 
	{
		Activity01 demo = new Activity01();//instance of Activity01 class created in main class
	}
}