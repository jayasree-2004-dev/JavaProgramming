public class Stringreverse
{
public static void main(String[] args)
{
String s="JAVA";
String rev="";
for(int i=s.length()-1;i>=0;i--)
{
char ch=s.charAt(i);
rev=rev+ch;
}
System.out.println(rev);
}
}