package assignment5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class TimeLinkedList 
{
	static long timeStart, timeMid, timeEnd, timeActual;
	static final int timesToLoop = 10000;
	static MyLinkedList<Integer> list1 = new MyLinkedList<Integer>(); //empty list
	static ArrayList<Integer> arrList = new ArrayList<Integer>(); //empty list
	static MyLinkedList<Integer> list2 = new MyLinkedList<Integer>(); //permuted elements
	static ArrayList<Integer> arrList2 = new ArrayList<Integer>(); //permuted elements
	static MyLinkedList<Integer> list3 = new MyLinkedList<Integer>(); //removal list
	static ArrayList<Integer> arrList3 = new ArrayList<Integer>(); //removal list
	
	static MyStack<Integer> stack = new MyStack<Integer>();
	static MyStack<Integer> stack2 = new MyStack<Integer>();
	
	static LinkedList<Integer> jList = new LinkedList<Integer>();
	
	static Random rand = new Random();
	
	public static void main(String[] args)
	{
		for (int k=0; k<1000; k++)
		{
			list2.addFirst(rand.nextInt(100000));
			arrList2.add(0, rand.nextInt(100000));
			jList.add(k);
			stack2.push(k);
		}
		
		
		
		timeStart = System.nanoTime();
		while (System.nanoTime() - timeStart < 2000000000) { } //thread stabilizer
		for (int j = 0; j < 50; j++)
		{
			for (int k=0; k<timesToLoop + j; k++)
			{
//				list3.addFirst(k);
//				arrList3.add(k);
				jList.add(k);
			}
			
			timeStart = System.nanoTime();

			for (int i=0; i < timesToLoop; i++)
			{
				jList.remove(j); //--------------- perform tests here ---------------
			}

			timeMid = System.nanoTime();

			for (int i=0; i < timesToLoop; i++) 
			{ 

			} //loop to catch runtime of loop itself

			timeEnd = System.nanoTime();

			timeActual = ((timeMid - timeStart) - (timeEnd - timeMid)) / timesToLoop;
			System.out.println(j + " " + timeActual);
		}
	}

}
