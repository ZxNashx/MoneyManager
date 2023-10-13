package ManagerPack;

import java.util.Scanner;

public class IncomeManager {

	private int MAX_FILE_CONTENTS = 20;
	private int[] fileContents;
	
	private int readLine(Scanner reader) {
		if(reader.hasNextLine()) {
			return reader.nextInt();
		}else {
			return 0;
		}
	}
	
	public void readFile(Scanner reader) {
		int i = 0;
		fileContents = new int[MAX_FILE_CONTENTS];
		while(reader.hasNextLine()) {
			fileContents[i] = readLine(reader);
			i++;
		}
	}
	
	public void printFile() {
		for(int i = 0; i < fileContents.length; i++) {
			if(!(fileContents[i] == 0)) {
				System.out.println(fileContents[i]);
			}
		}
	}
		
	public int total() {
		int sum = 0;
		for(int i = 0; i < fileContents.length; i++) {
			sum += fileContents[i];
		}
		return sum;
	}
	// AVALABLE MONEY AFTER TAXES
	// tax = 15%
	// TOTAL MONEY - 15% OF TOTAL MONEY
	public float afterTax() {
		return (float) ((float)total() - (float)total() * 0.15);
	}
		// SET A BUDGET (% OF INCOME OR A ABSOLUTE VALUE)
		
		// PERCENT OF BUDGET USED FROM EXPENSES
		

		
		// AMOUNT OF MONEY PUT INTO SAVINGS
		
		// AVERAGE PAY 

	
}
