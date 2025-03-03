class PrintFrequencyOfElements
{
public static void main(String[] args)
{
String s="I am an indian";
String []s1=s.split(" ");
int count=0;
for(int i=0;i<=s.length()-1;i++)
{
for(int j=0;j<=s1.length-1;j++)

{
if(s.indexOf(i)==s1[j])
{
count++;
}
}
}
System.out.println(count);
}
}