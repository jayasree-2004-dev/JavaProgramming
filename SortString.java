class SortString
{
public static void main(String[] args)
{
String s="jspider";
char []arr=s.toCharArray();
for (int i = 0; i < arr.length - 1; i++) 
{
            for (int j = 0; j < arr.length - 1 - i; j++) 
	    {
                if (arr[j] > arr[j + 1]) 
		{ 
                   
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
		    }
		    }
			System.out.println(arr[j+1]);
		    }
			
		    }
		    }

		    