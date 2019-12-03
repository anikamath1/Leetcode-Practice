import java.util.*;
class Mocks
{
	public static void main(String args[])
	{
		Map<Integer,String> map=new HashMap<>();
		map.put(10,"Anirudh");
		map.put(20,"Yash");
		map.put(30,"CCC");
		map.put(40,"DDD");
		Iterator<Map.Entry<Integer,String>> itr=map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer,String> entry=itr.next();
			System.out.println("The key is " +entry.getKey());
			System.out.println("The value is " + entry.getValue());		
		}
	}





}
