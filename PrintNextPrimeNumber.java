import java.util.Scanner;
class PrintNextPrimeNumber
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int x=sc.nextInt();
for(int n=(x+1);true;n++)
{
int count=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
count++;
}
}
if(count==2)
{
System.out.println("Next prime number is:"+n);
break;
}
}
}
}