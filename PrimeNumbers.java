
public class PrimeNumbers 
{
	public static void main(String[] args) 
	{
		int w,x,y,z; 
		w=2; x=3; y=5; z=7;
		
		for(int i=2; i<150; i++)
		{
			if(i==w || i==x || i==y || i==z)
			{
				System.out.println(i);
			}
			else if(i%w!=0 && i%x!=0 && i%y!=0 && i%z!=0)
			{
				System.out.println(i);
			}
		}
	}
}
