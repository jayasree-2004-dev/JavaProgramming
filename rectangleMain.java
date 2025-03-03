class rectangleMain
{
public static void main(String[] args)
{
rectangle r1=new rectangle();
rectangle r2=new rectangle();
 r1.length=5;
 r1.breadth=6;
 r2.length=7;
 r2.breadth=4;
int area1=r1.length*r2.length;
int area2=r2.length*r2.breadth;
int crmf1=2*(r1.length+r1.breadth);
int crmf2=2*(r1.length+r1.breadth);
System.out.println(area1);
System.out.println(area2);
System.out.println(crmf1);
System.out.println(crmf2);
}
}