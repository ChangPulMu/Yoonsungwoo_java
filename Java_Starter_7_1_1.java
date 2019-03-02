class Triangle
{
	double length;
	double height;
	
	public Triangle(double len, double hei)
	{
		length = len;
		height = hei;
	}
	
	public void change(double len, double hei)
	{
		length = len;
		height = hei;
	}
	
	public double area()
	{
		return length*height*0.5;
	}
}


public class Java_Starter_7_1_1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Triangle tri = new Triangle(1.5, 3.2);
		
		tri.change(1.0, 3.0);
		System.out.println(tri.area());
	}

}
