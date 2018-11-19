import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class Lab5 {
	public static void main(String args[])
	{
		Queues();
	}
	
	
	
	public static void Stacks() {
		Stack<Data> stack = new Stack<Data>();
		stack.push(new Data("Fred", 13));
		while(stack.isEmpty() == false)
		{
			stack.pop().Print();
		}
		System.out.println(stack.size());

	}
	public static void Queues() {
		ArrayBlockingQueue<Data> q = new ArrayBlockingQueue<Data>(10);
		while(q.isEmpty() == false)
		{
			q.poll().Print();
		}	
		for(int i=0;i<20;++i)
		{
			q.offer(new Data("Test:"+String.valueOf(i),i));
		}
		PrintCollection(q);

		

	}
	
	public static void ArrayLists() {
		ArrayList<Data> arrayA = new ArrayList<Data>();
		ArrayList<Data> arrayB = new ArrayList<Data>();
		ArrayList<Data> arrayC = new ArrayList<Data>();
		ArrayList<Data> arrayD = new ArrayList<Data>();
		arrayA.add(new Data("Fred",41));
		arrayA.add(new Data("Jo",43));
		arrayA.add(new Data("Harry",78));
		arrayA.add(new Data("Zoe",37));
		
		
		//arrayB points to arrayA so when something is deleted from A it is also deleted from B
		PrintCollection(arrayA);
		System.out.println();
		arrayB = arrayA;
		PrintCollection(arrayB);
		System.out.println();
		arrayA.remove(1);
		PrintCollection(arrayB);

		

		arrayC.add(new Data("Fred",41));
		arrayC.add(new Data("Jo",43));
		arrayC.add(new Data("Harry",78));
		arrayC.add(new Data("Zoe",37));
		
		
		PrintCollection(arrayC);
		System.out.println();
		arrayD = (ArrayList<Data>)arrayC.clone();
		arrayC.remove(1);
		PrintCollection(arrayC);
		System.out.println();	
		PrintCollection(arrayD);
		System.out.println();
	}
	
	
	public static void PrintCollection(Collection<Data> c)
	{
		for (Iterator<Data> iter = c.iterator(); iter.hasNext();)
		{
			Data x = (Data)iter.next();
			x.Print();
		}
		System.out.println();
	}

}
