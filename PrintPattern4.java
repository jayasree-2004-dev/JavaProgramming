class PrintPattern4
{
public static void main(String[] args)
{
for(int r=0;r<=5;r++)
{
for(int c=0;c<=4;c++)
{
if(r>0)
{
System.out.print(r++);
}
System.out.print("");
}
System.out.println();
}
}
}