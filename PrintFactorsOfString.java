class PrintFactorsOfString
{
public static void main(String[] args)
{
String s="12345";
String []a=Integer.parseInt(s);
int count=0;
for(int i=0;i<=s.length-1;i++)
{
for(int j=1;j<=s.length-1;j++)
{
if(a%j==0)
{
count++;
if(count>0)
{
System.out.println(a + "=" +j);
}
}
}
}
}
}