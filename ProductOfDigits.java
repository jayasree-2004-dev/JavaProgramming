import java.util.Scanner;
class ProductOfDigits
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
int prod=1;
int rem;
while(num%10!=0)
{
rem=num%10;
prod=prod*rem;
num=num/10;
}
System.out.println(prod);
}
}
