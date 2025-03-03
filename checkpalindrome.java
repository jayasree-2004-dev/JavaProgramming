public class checkpalindrome
{
public static void main(String[] args)
{
String s="malayalam";
String rev="";
for(int i=s.length()-1;i>=0;i--)
{
char ch=s.charAt(i);
rev=rev+ch;
}
if(s.equals(rev))
	{
System.out.println("The string is a palindrome ");
	}
	else 
	{
		System.out.println("The string is not a palindrome number");
	}
}
}