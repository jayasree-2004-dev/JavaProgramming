import java.util.Scanner;
class ConverCases//toggle String
{
public static void main(String[] args)
{
String s="India";
String s2="";
for(int i=0;i<=s.length()-1;i++)
{
char ch=s.charAt(i);
if(ch>=65 && ch<=90)
{
s2=s2+Character.toLowerCase(ch);
}
else
{
s2=s2+Character.toUpperCase(ch);
}
}
System.out.println(s2);
}
}
