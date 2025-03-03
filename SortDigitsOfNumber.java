import java.util.Scanner;
class SortDigitsOfNumber
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
int sort=0;
for(int i=1;i<=9;i++)
{
int temp=n;
while(temp>0)
{
int ld=temp%10;
if(i==ld)
sort=sort*10+ld;
temp=temp/10;
}
}
System.out.println(sort);
}
}