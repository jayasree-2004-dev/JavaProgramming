import java.util.Scanner;
class SmallestDigitsOfNumber
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
int ld=0;
int temp=n;
for(int i=1;i<=9;i++)
{

ld=temp%10;
if(i==ld)
	System.out.println(ld+"is the smallest number");
break;
}
}
}