import java.util.Scanner;
class PrintFactors
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the range:");
int range=sc.nextInt();
for(int i=1;i<=range;i++)
{
if(range%i==0)
{
System.out.println(i);
}
}
}
}