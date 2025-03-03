import java.util.*;
class CheckCount
{
public static int count(int c)
{
if(c==0)
	{
return 0;
	}
else
	{
return 1+count(c/10);
	}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
System.out.println(count(n));
}
}