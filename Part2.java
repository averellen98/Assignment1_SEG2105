package lab1;
import java.io.*;
import java.util.*; 

public class Part2 {
	public static void main(String[] args) {
		int size = 99999999;
		
		System.out.println("Testing size of: " + size);
		for(int x = 0; x < 5; x++) {
			//To Test Simple array
			
			long startTime = System.nanoTime();
			int sum1 = 0;
			int[] test1 = new int[size];
			for(int i = 0; i < size; i++) {
				test1[i] = (int) (Math.random()*((9-0+1))+0);
			}
			long endTime = System.nanoTime();
			long durationFirst = (endTime - startTime)/1000000;
			startTime = System.nanoTime();
			
			for(int i = 0; i < size; i++) {
				sum1 += test1[i];
			}
			endTime = System.nanoTime();
			long durationSeccond = (endTime - startTime)/1000000;  //divide by 1000000 to get milliseconds.
			System.out.println("Test# "+x+"\nBasic Array: \n\t Duration to create: " + (durationFirst) + " millisecconds, Duration to Sum: " + durationSeccond + " millisecconds, total Sum: "+ sum1 + "\n\t\t Total Time: " + (durationFirst + durationSeccond) + " millisecconds");
			
			//to Test ArrayList
			startTime = System.nanoTime();
			int sum2 = 0;
			ArrayList<Integer> test2  = new ArrayList<Integer>();
			for(int i = 0; i < size; i++) {
				test2.add((int) (Math.random()*((9-0+1))+0));
			}
			endTime = System.nanoTime();
			durationFirst = (endTime - startTime)/1000000;
			startTime = System.nanoTime();
			
			for(int i = 0; i < size; i++) {
				sum2 += test2.get(i);
			}
			endTime = System.nanoTime();
			durationSeccond = (endTime - startTime)/1000000;  //divide by 1000000 to get milliseconds.
			System.out.println("ArrayList: \n\t Duration to create: " + (durationFirst) + " millisecconds, Duration to Sum: " + durationSeccond + " millisecconds, total Sum: "+ sum1 + "\n\t\t Total Time: " + (durationFirst + durationSeccond) + " millisecconds");
			
			//To Test VECTOR
			startTime = System.nanoTime();
			int sum3 = 0;
			Vector<Integer> test3 = new Vector<Integer>();
			for(int i = 0; i < size; i++) {
				test3.add((int) (Math.random()*((9-0+1))+0));
			}
			endTime = System.nanoTime();
			durationFirst = (endTime - startTime)/1000000;
			startTime = System.nanoTime();
			for(int i = 0; i < size; i++) {
				sum3 += test3.get(i);
			}
			endTime = System.nanoTime();
			durationSeccond = (endTime - startTime)/1000000;  //divide by 1000000 to get milliseconds.
			System.out.println("Vector: \n\t Duration to create: " + (durationFirst) + " millisecconds, Duration to Sum: " + durationSeccond + " millisecconds, total Sum: "+ sum1 + "\n\t\t Total Time: " + (durationFirst + durationSeccond) + "millisecconds");
		}
	}
	
}
