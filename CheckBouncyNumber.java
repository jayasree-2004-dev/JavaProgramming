import java.util.Scanner;
class CheckBouncyNumber
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
int ld=n%10;
boolean isIncreasing=true;
boolean isDecreasing=true;
while(n>0)
{
int cd=n%10;
if(ld>cd)
isDecreasing=false;
else if(ld<cd)
isIncreasing=false;
ld=cd;
n=n/10;
}
if(!isIncreasing && !isDecreasing)
System.out.println("Bouncy Number");
else if(!isIncreasing && isDecreasing)
System.out.println("The number is in Decreasing order");
else if(isIncreasing && !isDecreasing)
System.out.println("The number is in increasing order");
}
}