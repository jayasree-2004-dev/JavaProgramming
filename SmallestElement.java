public class SmallestElement
{
public static boolean isEmpty(int []a)
{
if(a.length==0)
return true;
else
return false;
}
public static boolean isZero(int []a)
{
for(int i=0;i<a.length-1;i++)
{
if(a[i]==0)
{
return true;
}
}
return false;
}
public static void largest(int []a)
{
int largest=0;
for(int i=0;i<a.length-1;i++)
{
if(a[i]>largest)
{
largest=a[i];
}
}
System.out.println("Largest:"+largest);
}
}
public static void main(String[] args)

int []a={1,2,3,4,5}
