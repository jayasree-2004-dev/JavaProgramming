import java.util.Scanner;
class PrintNextPrimeNum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int n=sc.nextInt();
String isPrime="Yes"
for(int i=(n+1);true;i++)
{
	boolean isPrime=true;
for(int j=2;j<i;j++)
{
if(i%j==0)
{
isPrime="False";
}
}
if(isPrime)
{
System.out.println(i);
break;
}
}
}
}