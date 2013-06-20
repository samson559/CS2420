package assignment5;

import java.util.ArrayList;

public class TimeLinkedList 
{
	static long timeStart, timeMid, timeEnd, timeActual;
	static final int timesToLoop = 100;
	static MyLinkedList<Integer> list1 = new MyLinkedList<Integer>();
	static ArrayList<Integer> arrList = new ArrayList<Integer>();
	
	public static void main(String[] args)
	{
		timeStart = System.nanoTime();
		while (System.nanoTime() - timeStart < 2000000000) { } //thread stabilizer
		for (int j = 0; j < 100; j++)
		{
			timeStart = System.nanoTime();

			for (int i=0; i < timesToLoop; i++)
			{
				arrList.add(0, j); //perform tests here
			}

			timeMid = System.nanoTime();

			for (int i=0; i < timesToLoop; i++) { } //empty loop to catch runtime of loop itself

			timeEnd = System.nanoTime();

			timeActual = ((timeMid - timeStart) - (timeEnd - timeMid)) / timesToLoop;
			System.out.println("Time (ns): " + timeActual);
		}
	}

}
