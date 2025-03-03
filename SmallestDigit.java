import java.util.*;
class SmallestDigit
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int sd=9;
while(n>0)
{
int d=n%10;
if(d<sd)
{
sd=d;
}
n=n/10;
}
System.out.println(sd);
}
}