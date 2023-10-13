package ManagerPack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RunManager {

	public static void main(String[] args) {
		
		// locate the two text files
		File incomeObj = new File("income.txt");
		File expensesObj = new File("expenses.txt");
		try {
			// open the text files with scanner
			Scanner incomeReader = new Scanner(incomeObj);
			Scanner expensesReader = new Scanner(expensesObj);
			
			//insert code
			
			IncomeManager IM = new IncomeManager();
			ExpensesManager EM = new ExpensesManager();
			IM.readFile(expensesReader);
			IM.printFile();
			
			// end of program
			incomeReader.close();
			expensesReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
