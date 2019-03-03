class Point
{
	private int xPos, yPos;
	
	public Point(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	
	public void showPointInfo()
	{
		System.out.println("["+xPos+", "+yPos+"]");
	}
}

class Circle
{
	Point p;
	int rad;
	
	public Circle(int x, int y, int r)
	{
		p = new Point(x,y);
		rad = r;
	}
	
	public void showCircleInfo()
	{
		System.out.println("radius : "+rad);
		p.showPointInfo();
	}
}

class Ring
{
	Circle c1;
	Circle c2;
	
	public Ring(int x1, int y1, int r1, int x2, int y2, int r2)
	{
		c1 = new Circle(x1,y1,r1);
		c2 = new Circle(x2,y2,r2);
	}
	
	public void showRingInfo()
	{
		System.out.println("Inner Circle Info...");
		c1.showCircleInfo();
		System.out.println("Outter Circle Info...");
		c2.showCircleInfo();
	}
}

public class Java_Starter_9_2
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Ring ring = new Ring(1,1,4,2,2,9);
		ring.showRingInfo();
	}
}
