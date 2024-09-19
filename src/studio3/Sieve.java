package studio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		//Prompt user for list length
		Scanner in = new Scanner(System.in); 
		System.out.print("List Length: ");
		int length = in.nextInt(); 
		in.close(); 
		
		//Make a list of length n
		List<Integer> allNumbers = new ArrayList<>(); 
		for(int i = 2; i<= length; i++) {
			allNumbers.add(i); 
		}
		
		List<Integer> primeNumbers = new ArrayList<>(); 
		
		System.out.println(allNumbers);
		
		for(int i = 2; i <= length; i++) {
			if(allNumbers.get(i-1) % i == 0) {
				allNumbers.set(i-1, 0);  
			}
		}
		System.out.println(allNumbers); 
	}
} 