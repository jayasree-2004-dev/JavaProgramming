class DuplicateMemberInString 
{
public static void main(String[] args) 
		{

		String s="I_am_a_Indian";
		String[] s1=s.split("_");
		for(int i=0;i<=s1.length-1;i++)
		{
         
         if(i%2!=0)
          {
	     System.out.println(s1[i]);
          }
	    }
		}
}
