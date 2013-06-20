package assignment5;

public class TimeLinkedList 
{
	static long timeStart, timeMid, timeEnd, timeActual;
	static final int timesToLoop = 100;
	
	
	
	public static void main(String[] args)
	{
		timeStart = System.nanoTime();
		while (System.nanoTime() - timeStart < 1000000000) { } //thread stabilizer
		
		timeStart = System.nanoTime();
		
		for (int i=0; i < timesToLoop; i++)
		{
			//perform tests here
		}
		
		timeMid = System.nanoTime();
		
		for (int i=0; i < timesToLoop; i++) {} //empty loop to catch runtime of loop itself
		
		timeEnd = System.nanoTime();
		
		timeActual = ((timeMid - timeStart) - (timeEnd - timeMid)) / timesToLoop;
		System.out.println("Time (ns): " + timeActual);
	}

}
