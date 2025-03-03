import java.util.Scanner;
class BankMainClass
{
public static void main(String[] args)
{
 public static main BankDetails(int b)
{
Scanner sc=new Scanner(System.in);
Bank b=new Bank;

int code=0;

while(code!=4)
{
System.out.println("ENTER 1 FOR DEPOSIT");
System.out.println("ENTER 2 FOR WITHDRAW");
System.out.println("ENTER 3 FOR BALANCE CHECK");
System.out.println("ENTER 4 FOR EXIT");
System.out.println("YOUR CHOICE");
code=sc.nextInt();

switch(code)
{
case 1:System.out.println("Deposit");
int depositAmmount=sc.nextInt();
b.Deposit(depositAmmount);
break;

case 2: System.out.println("Withdraw");
int WithdrawAmmount=sc.nextInt();
b.Deposit(depositAmmount);
break;

case 3: System.out.println("Show balance");
break;

case 4: System.out.println("Exit");
break;
}
}
}
}