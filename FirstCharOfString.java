class FirstCharOfString
{
public static void main(String[] args)
{
String s="This is india";
String []s1 =s.split("");
for(int j=0;j<=s1.length-1;j++)
{
System.out.println(s1[j].charAt(0));
}
}
}