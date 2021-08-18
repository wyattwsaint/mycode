package sandbox;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class sandbox {

	public static void main(String[] args) throws Exception {
	
		
		System.out.println("Press \"a\" then \"Enter\" to add a task, or \"c\" then \"Enter\" to cross off a task.");
		Scanner scanner = new Scanner(System.in);
		String addOrCrossOff = scanner.next();
		if (addOrCrossOff.equals("a")) {
			taskDataEntry();
		}
		else if (addOrCrossOff.equals("c")) {
			crossTasksOffTheList();
		}
		else {
			System.out.println("Please press \"a\" or \"c\".");
			}
	
	}

	public static void taskDataEntry() throws Exception {
		System.out.println("Enter task to accomplish: ");
		Scanner scanner = new Scanner(System.in);
		String enteredTask = scanner.nextLine();
		File myFile = new File("taskList.txt");
		Scanner readFile = new Scanner(myFile);
		BufferedWriter bw = new BufferedWriter(new FileWriter("taskList.txt", true));
		bw.write(enteredTask);
		bw.newLine();
		bw.close();
		
		int lineNumber = 1;
		while (readFile.hasNext()) {
			String data = readFile.nextLine();
			System.out.println(lineNumber + ". " + data);
			lineNumber++;
		}
		
		
	}

	public static void crossTasksOffTheList() throws Exception {
		System.out.println("Enter task to cross off: ");
		Scanner scanner = new Scanner(System.in);
		String taskToCrossOff = scanner.next();
		
		File myFile = new File("taskList.txt");
		Scanner readFile = new Scanner(myFile);
		int lineNumber = 1;
		while (readFile.hasNext()) {
			String data = readFile.nextLine();
			System.out.println(lineNumber + ". " + data);
			lineNumber++;
		}
	}

	public static void addOrCrossOffTasksDecision() throws Exception {
		System.out.println("Press \"A\" to add a task, and \"C\" to cross off a task.");
		Scanner scanner = new Scanner(System.in);
		String addOrCrossOff = scanner.next();
		if (addOrCrossOff == "a") {
			taskDataEntry();
		} else if (addOrCrossOff == "c") {
			crossTasksOffTheList();
		} else {
			System.out.println("Please press \"a\" or \"c\".");
		}
	}

}
