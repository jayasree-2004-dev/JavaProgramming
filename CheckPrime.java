import java.util.*;
class CheckPrime
{
public static int isprime(int n)
{
int count=0;
 for (int i=1;i<= n;i++)
	 {
            if (n%i == 0) 
			count++;
     }
	 return count;
}
public static void main(String[] args)
  {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();

if(isprime(n)==2)
	{
System.out.println("Its a prime number");
	}
else
	{
	System.out.println("Not a prime number");
	}
   }
}