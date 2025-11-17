package Day3programs;
//class shape with methods getPerimeter() and getArea()
//subclass circle that overrides the getPerimeter() and getArea() methods to
//calculate area and perimeter of circle

class shape
{
	double pi = 3.14;
	final void getPerimeter(int r)
	{
		//int r = 0;
		//double pi = 3.14;
		
		System.out.println("Perimeter of circle: " + 2*pi*r);;
	}
	
	final void getArea(int r)
	{
		//int r = 0;
		System.out.println("Area of circle: " + pi*r*r);
	}
}

class circle extends shape
{
	
}
public class e2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle obj = new circle();
		obj.getPerimeter(2);
		obj.getArea(2);

	}

}