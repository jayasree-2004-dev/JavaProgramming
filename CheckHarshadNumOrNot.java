import java.util.*;
class CheckHarshadNumOrNot
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int temp=num;
int sum=0;
while(temp!=0)
{
int ld=temp%10;
sum=temp+ld;
temp=temp/10;
}
if(num%sum==0)
{
System.out.println("Its a hasrhsd number");
}
else
{
System.out.println("Its not a harshad number");
}
}
}