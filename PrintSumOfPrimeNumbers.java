import java.util.Scanner;
class PrintPrimeNumbersUptoN
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the range of the number:");
int range=sc.nextInt();
int sum=0;
for(int i=1;i<=range;i++)
{
boolean isPrime=true;

{
for(int j=2;j<i;j++)
{
if(i%j==0)
{
isPrime=false;
break;
}
else
	{
sum=sum+i;
	}
	System.out.println(sum);
}
}
}
}
}
