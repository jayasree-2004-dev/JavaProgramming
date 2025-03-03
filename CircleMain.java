import java.util.*;
class CircleMain
{
public static void main(String[] args)
{

CircleArea c1=new CircleArea();
CircleArea c2=new CircleArea();
c1.r=4;
c2.r=6;
double area1=c1.pi*c1.r*c1.r;
double area2=c2.pi*c2.r*c2.r;
System.out.println("Area of the circle is="+area1);
System.out.println("Area of the circle is="+area2);
}
}


