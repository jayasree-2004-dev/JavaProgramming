public class Circle
{
private static double pi=3.14;
private int r;
public void giveradius (int a)
	{
	if (a>=7&& a<=25)
		{
		r=a;
		}
	else
		{
		System.err.println("Given radius is not valid....");
		System.err.println("Radius should be betweden 7 to 25 inclusive");
		}
	}
public void findArea()
		{
	double area=pi*r*r;
	System.out.println("Area of circle is:"+area);
		}
		public void findCircumference()
		{
			double circumference=2*pi*r;
			System.out.println("Circumference of circle is:"+circumference);
		}
			public void circleInformation()
			{
				System.out.println("pi :"+pi);
				System.out.println("Radius"+r);
				findArea();
				findCircumference();
			}
		}