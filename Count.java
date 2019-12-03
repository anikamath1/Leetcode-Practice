import java.util.*;
class Count
{	
	public static void main(String args[])
	{
		//Scanner obj=new Scanner(System.in);

		//int n= obj.nextInt();
		int counter=1;
		String str="1";
		String order="";
		int count=0,i=0;
		while(counter<=n)
		{
			i=0;
			while(i<str.length())
			{
				int num1=str.charAt(i)-'0';
				count=1;
				i++;
				while(i<str.length())
				{	
					int num2=str.charAt(i)-'0';
					if(num2!=num1)
						break;
					count++;
					i++;	
					
				}
				order+=Integer.toString(count)+Integer.toString(num1);		
			}
			
			str=order;
			order="";
			//System.out.println("The next generated number is " + str);
			counter++;
		}
	}
}
