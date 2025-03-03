class PrintPattern5
{
public static void main(String[] args)
{
int starCount=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=starCount;j++)
{
System.out.print(" * ");
}
System.out.println();
starCount++;
}
}
}