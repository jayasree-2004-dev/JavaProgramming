class ReverseNumber
{
public static int reverse(int n,int rev)
	{
if(n==0)
return rev;
else
{
rev =rev*10+(n%10);
return reverse(n/10,rev);
}
}
public static void main(String[] args)
	{
System.out.println(reverse(12345,0));
}
}
