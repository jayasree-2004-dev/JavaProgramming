public class Bank
{
private static int accBalance=1600;
private static int a;
public static int void Deposit(int d)
{
if(d>0)
{
a=d;
accBalance=accBalance+d;
}
else
{
System.out.println("Invalid ammount deposit");
System.out.println("Deposit more than one rupee:");
}
}
public static void witDraw(int w)
{
if(accBalance>100)
{
System.out.println("Not enough deposit ammount");
}
else
{
accBalance=accBalance-w;
}
}
}
public static ShowBal()
{
System.out.println("Account Balance="+accBalance)
}
