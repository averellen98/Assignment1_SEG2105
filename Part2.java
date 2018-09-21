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
			for(int i = 0; i < size; i++) {
				sum1 += test1[i];
			}
			long endTime = System.nanoTime();
			long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
			System.out.println("Test# "+x+"\nBasic Array: \n\t Duration: " + (duration/1000000) + " millisecconds, Sum: " + sum1);
			
			//to Test ArrayList
			startTime = System.nanoTime();
			int sum2 = 0;
			ArrayList<Integer> test2  = new ArrayList<Integer>();
			for(int i = 0; i < size; i++) {
				test2.add((int) (Math.random()*((9-0+1))+0));
			}
			for(int i = 0; i < size; i++) {
				sum2 += test2.get(i);
			}
			endTime = System.nanoTime();
			duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
			System.out.println("ListArray: \n\t Duration: " + (duration/1000000) + " millisecconds, Sum: " + sum2);
			
			//To Test VECTOR
			startTime = System.nanoTime();
			int sum3 = 0;
			Vector<Integer> test3 = new Vector<Integer>();
			for(int i = 0; i < size; i++) {
				test3.add((int) (Math.random()*((9-0+1))+0));
			}
			for(int i = 0; i < size; i++) {
				sum3 += test3.get(i);
			}
			endTime = System.nanoTime();
			duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
			System.out.println("Vector: \n\t Duration: " + (duration/1000000) + " millisecconds, Sum: " + sum3);
		}
	}
	
}
