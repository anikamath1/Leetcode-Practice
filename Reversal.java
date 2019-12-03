import java.util.*;

class Node
{
	Node next;
	int data;
}

class Main
{
	public static void main(String args[])
	{
		//making a linked list to store numbers
		Scanner obj=new Scanner(System.in);
		Node head=new Node();
		int n=obj.nextInt();
		Node temp=new Node();
		head=temp;
		for(int counter=0;counter<n;counter++)
		{
			temp.data=counter;
			temp.next=new Node();
			temp=temp.next;
		}
		System.out.println(" Linked list created");
		temp=head;
		for(int counter=0;counter<n;counter++)
		{
			System.out.println("The number is " + temp.data );
			temp=temp.next;	
		}
		String s="HELLO WORLD";
		System.out.println(s.substring(0,1));
		System.out.println(Arrays.toString(s.toCharArray()));
		System.out.println(Integer.toString(1));
		System.out.println(Integer.toString(2));
		int a='9'-'0';
		System.out.println(a);
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(15);
		list.add(14);
		list.add(13);
		list.add(12);
		list.add(11);
		list.add(10);
		//System.out.println("The numbers are :");
		//System.out.println(list.get(0));
		//System.out.println(list.get(1));
		
		System.out.println("The list is ------------------------");
		Collections.sort(list);
		System.out.println("The sorted array" );
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
