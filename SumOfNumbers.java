import java.util.*;
class SumOfNumbers
{
public static int Summation(int a,int b)
{
if(a>b)
return 0;
else
return a+Summation(a+1,b);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Starting and ending range");
int start=sc.nextInt();
int end=sc.nextInt();
System.out.println(Summation(start,end));
}
}