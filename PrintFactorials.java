import java.util.Scanner;
class PrintFactorials
{
public static int factorialsOfNum(int fact)
{
if(fact==0)
return 1;
else
{
return fact*factorialsOfNum(fact-1);
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int f=sc.nextInt();
System.out.println(factorialsOfNum(f));
}
}

