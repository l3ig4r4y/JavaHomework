
public class Triangle 
{
	int sides;
	
	Triangle()
	{
		
	}
	
	void calculateArea(int sides)
	{
		double area = 0.433 * sides * sides;
		System.out.println("Area of triangle is "+area);
	}
}
