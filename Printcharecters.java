// 1.Write a program to print the charecters which are present in even indexes.
public class Printcharecters
{
public static void main(String[] args)
{
String s="indiA";
for(int i=1;i<=s.length()-1;i++)
{
if(i%2==0)
{
System.out.println(s.charAt(i));
}
}
}
}