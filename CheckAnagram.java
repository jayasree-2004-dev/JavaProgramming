class CheckAnagram
{
public static void main(String[] args)
{
String s1="race";
String s2="care";
if(s1.length()==s2.length())
{
String str1=s1.toLowerCase();
String str2=s2.toLowerCase();
 char []ch1=str1.toCharArray();
char []ch2=str2.toCharArray();

for(int i = 0; i < ch1.length - 1; i++) 
{
            for (int j = 0; j < ch1.length - 1 - i; j++) 
	    {
                if (ch1[j] > ch1[j + 1]) 
		{ 
                   
                    char temp = ch1[j];
                    ch1[j] = ch1[j + 1];
                    ch1[j + 1] = temp;
		    }
			}
}

for(int i = 0; i < ch2.length - 1; i++) 
{
            for (int j = 0; j < ch2.length - 1 - i; j++) 
	    {
                if (ch2[j] > ch2[j + 1]) 
		{ 
                   
                    char temp = ch2[j];
                    ch2[j] = ch2[j + 1];
                    ch2[j + 1] = temp;
		    }
			}
}

}
else
	{
	System.out.println("String is not a anagram:");
	}
}
}