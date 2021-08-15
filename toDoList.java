package sandbox;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class sandbox {

	public static void main(String[] args) throws Exception {
	
		
		//Use a while loop???
		System.out.println("Press \"a\" then \"Enter\" to add a task, or \"a\" then \"Enter\" to cross off a task.");
		Scanner scanner = new Scanner(System.in);
		String addOrCrossOff = scanner.next();
		if (addOrCrossOff == "a") {
			taskDataEntry();
		}
		else if (addOrCrossOff == "c") {
			crossTasksOffTheList();
		}
		else {
			System.out.println("Please press \"a\" or \"c\".");
			}
	
	}

	public static void taskDataEntry() throws Exception {
		System.out.println("Enter task to accomplish: ");
		Scanner scanner = new Scanner(System.in);
		String enteredTask = scanner.next();
		scanner.close();
		BufferedWriter bw = new BufferedWriter(new FileWriter("taskList.txt", true));
		bw.write(String.valueOf(enteredTask));
		bw.newLine();
		bw.flush();
		bw.close();
	}

	public static void crossTasksOffTheList() throws Exception {
		System.out.println("Enter task to cross off: ");
		Scanner scanner = new Scanner(System.in);
		String crossedOffTask = scanner.next();
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
