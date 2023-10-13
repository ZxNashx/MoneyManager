package ManagerPack;

import java.util.Scanner;

public class IncomeManager {

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
		fileContents = new int[10];
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
		
		// METHOD IDEAS
		
		// SET A BUDGET (% OF INCOME OR A ABSOLUTE VALUE)
		
		// PERCENT OF BUDGET USED FROM EXPENSES
		
		// AVALABLE MONEY AFTER TAXES
		
		// AMOUNT OF MONEY PUT INTO SAVINGS
		
		// AVERAGE PAY 
		
		
		
	}
	
	
}
