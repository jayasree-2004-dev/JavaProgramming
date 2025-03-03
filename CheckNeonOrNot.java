import java.util.*;
class CheckNeonOrNot
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	int square=num*num;
    int sum=0;
    int temp=square;
while(temp!=0)
{
int ld=temp%10;
sum=sum+ld;
temp=temp/10;
}
if(sum==num)
	{
	System.out.println("Its a neon number");
	}
	else
	{
		System.out.println("Its not a neon number");
	}
}
}
