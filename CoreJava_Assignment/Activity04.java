package Homework;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public abstract class Activity04 
{
	protected int num01, num02, num03, result, responseTime;
	Date timeRequested;
	protected long timeRequestedLong =  0;
	
	abstract void add		(int a, 		int b		);
	abstract void subtract	(int a, 		int b		);
	abstract void multiply	(int a, 		int b		);
	abstract void divide	(int a, 		int b		);
	abstract void print		(int result, 	int seconds	);	
}

class Adder extends Activity04
{
	Adder(int a, int b)
	{
		this.num01 			= a;
		this.num02 			= b;
		timeRequested 		= new Date();
		timeRequestedLong 	= timeRequested.getTime();
	}
	Adder(int a, int b, int c)
	{
		this.num01 			= a;
		this.num02 			= b;
		this.num03			= c;
		timeRequested 		= new Date();
		timeRequestedLong 	= timeRequested.getTime();
	}

	@Override
	void add		(int a, 		int b		) 
	{
		result 				= a + b;
		Date newObj 		= new Date();
		Long newObjLong		= newObj.getTime();
		responseTime = (int) (newObjLong - timeRequestedLong)/1000;
		print(result, responseTime);
	}
	void add		(int a, 		int b,			int c) 
	{
		result 				= a + b + c;
		Date newObj 		= new Date();
		Long newObjLong		= newObj.getTime();
		responseTime = (int) (newObjLong - timeRequestedLong)/1000;
		print(result, responseTime);
	}
	@Override
	void print		(int result,	int seconds	) 
	{
		System.out.println("The answer to your inquiry is "+result);
		System.out.println("Response time: "+responseTime);
	}
	@Override
	void subtract	(int a, 		int b		) {}
	@Override
	void multiply	(int a, 		int b		) {}
	@Override
	void divide		(int a, 		int b		) {}
	
}

class Multiplier extends Activity04
{
	Multiplier		(int a, 		int b)
	{
		this.num01 			= a;
		this.num02 			= b;
		timeRequested 		= new Date();
		timeRequestedLong 	= timeRequested.getTime();
	}
	Multiplier		(int a, 		int b, int c)
	{
		this.num01 			= a;
		this.num02 			= b;
		this.num03			= c;
		timeRequested 		= new Date();
		timeRequestedLong 	= timeRequested.getTime();
	}

	@Override
	void multiply	(int a, 		int b		) 
	{
		result 				= a * b;
		Date newObj 		= new Date();
		Long newObjLong		= newObj.getTime();
		responseTime = (int) (newObjLong - timeRequestedLong)/1000;
		print(result, responseTime);
	}
	void multiply	(int a, 		int b,			int c) 
	{
		result 				= a * b * c;
		Date newObj 		= new Date();
		Long newObjLong		= newObj.getTime();
		responseTime = (int) (newObjLong - timeRequestedLong)/1000;
		print(result, responseTime);
	}
	void print		(int result,	int seconds	) 
	{
		System.out.println("The answer to your inquiry is "+result);
		System.out.println("Response time: "+responseTime);
	}
	@Override
	void subtract	(int a, 		int b		) {}
	@Override
	void add		(int a, 		int b		) {}
	@Override
	void divide		(int a, 		int b		) {}
}

class Divider extends Activity04
{
	Divider			(int a, int b)
	{
		this.num01 			= a;
		this.num02 			= b;
		timeRequested 		= new Date();
		timeRequestedLong 	= timeRequested.getTime();
	}
	Divider			(int a, int b, int c)
	{
		this.num01 			= a;
		this.num02 			= b;
		this.num03			= c;
		timeRequested 		= new Date();
		timeRequestedLong 	= timeRequested.getTime();
	}

	@Override
	void divide		(int a, 		int b		) 
	{
		result 				= a / b;
		Date newObj 		= new Date();
		Long newObjLong		= newObj.getTime();
		responseTime = (int) (newObjLong - timeRequestedLong)/1000;
		print(result, responseTime);
	}	
	void divide		(int a, 		int b,			int c) 
	{
		result 				= a / b / c;
		Date newObj 		= new Date();
		Long newObjLong		= newObj.getTime();
		responseTime = (int) (newObjLong - timeRequestedLong)/1000;
		print(result, responseTime);
	}
	void print		(int result,	int seconds	) 
	{
		System.out.println("The answer to your inquiry is "+result);
		System.out.println("Response time: "+responseTime);
	}
	@Override
	void subtract	(int a, 		int b		) {}
	@Override
	void add		(int a, 		int b		) {}
	@Override
	void multiply	(int a, 		int b		) {}
}

class Subtractor extends Activity04
{
	Subtractor		(int a, int b)
	{
		this.num01 			= a;
		this.num02 			= b;
		timeRequested 		= new Date();
		timeRequestedLong 	= timeRequested.getTime();
	}
	Subtractor		(int a, int b, int c)
	{
		this.num01 			= a;
		this.num02 			= b;
		this.num03			= c;
		timeRequested 		= new Date();
		timeRequestedLong 	= timeRequested.getTime();
	}

	void subtract	(int a, 		int b		) 
	{
		result 				= a - b;
		Date newObj 		= new Date();
		Long newObjLong		= newObj.getTime();
		responseTime = (int) (newObjLong - timeRequestedLong)/1000;
		print(result, responseTime);
	}
	void subtract	(int a, 		int b,			int c) 
	{
		result 				= a - b - c;
		Date newObj 		= new Date();
		Long newObjLong		= newObj.getTime();
		responseTime = (int) (newObjLong - timeRequestedLong)/1000;
		print(result, responseTime);
	}
	void print		(int result,	int seconds	) 
	{
		System.out.println("The answer to your inquiry is "+result);
		System.out.println("Response time: "+responseTime);
	}
	@Override
	void divide		(int a, 		int b		) {}
	@Override
	void add		(int a, 		int b		) {}
	@Override
	void multiply	(int a, 		int b		) {}
}

class InputCollector
{
	Scanner sc = new Scanner(System.in);
	long timeRequested;
	int num01, num02, num03;
	
	InputCollector()
	{
		Calendar currentTime = Calendar.getInstance();
		timeRequested = currentTime.getTimeInMillis();
	}
	
	void collectInput()
	{
		System.out.println("Please select a number from the following choices:");
		System.out.println("1. ADD");
		System.out.println("2. SUBTRACT");
		System.out.println("3. MULTIPLY");
		System.out.println("4. DIVIDE");
		int choice = sc.nextInt();
		if(choice == 1)
		{
			System.out.println("Please enter first integer: ");
			num01 = sc.nextInt();
			System.out.println("Please enter second integer: ");
			num02 = sc.nextInt();
			System.out.println("Would you like to add a third integer? Enter 1 for YES and 2 for NO. ");
			int userinput = sc.nextInt();
			if(userinput==1)
			{
				num03 = sc.nextInt();
				Adder a = new Adder(num01,num02,num03,timeRequested);
			}
			
			Adder a = new Adder(num02,num02);
		}
	}
}