
public class Shapes 
{
	int numberOfSides = 3;
	
	Shapes()
	{
	
	}
	void calculateShapeArea(int numbersides, int sidelength)
	{
//		if(numbersides==1)
//		{
//			Circle c = new Circle();
//			c.calculateArea(sidelength);
//		}
//		else if(numbersides==3)
//		{
//			Triangle c = new Triangle();
//			c.calculateArea(sidelength);
//		}
//		else if(numbersides==4)
//		{
//			Square c = new Square();
//			c.calculateArea(sidelength);
//		}
//		else
//		{
//			System.out.println("No Shapes Present");
//		}
		
		switch (numbersides)
		{
		case 1: numbersides = 1;
				Circle c = new Circle();
				c.calculateArea(sidelength);
				break;
		case 3: numbersides = 3;
				Triangle t = new Triangle();
				t.calculateArea(sidelength);
				break;
		case 4: numbersides = 4;
				Square s = new Square();
				s.calculateArea(sidelength);
				break;
		default:System.out.println("No Shapes Present");
				break;
		}
		
		
	}
	
	public static void main(String[] args) 
	{
		Shapes s1 = new Shapes();
		s1.calculateShapeArea(3, 12);
		
		Shapes s2 = new Shapes();
		s2.calculateShapeArea(4, 15);
		
		Shapes s3 = new Shapes();
		s3.calculateShapeArea(5, 15);
	}

}
