package sandbox;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class sandbox {

	public static void main(String[] args) throws IOException {

		BufferedReader bchoice = new BufferedReader(new FileReader("taskList.txt"));
		
		while (bchoice.readLine() != null) {
			System.out.println("Press e to enter a task, press q to quit/print list, or press d to delete a task");
			Scanner scanner = new Scanner(System.in);
			String choice = scanner.nextLine();
			if (choice.equals("e")) {
				addTaskAndStore();
			}
			else if (choice.equals("q")) {
				printTodoListToTerminal();
				break;
			}
			else if (choice.equals("d")) {
				deleteTask();
			}
		}
	}

	public static void addTaskAndStore() throws IOException {
		System.out.println("Enter task: ");
		Scanner scanner = new Scanner(System.in);
		String task = scanner.nextLine();
		BufferedWriter bw = new BufferedWriter(new FileWriter("taskList.txt", true));
		bw.write(task);
		bw.newLine();
		bw.close();
		printTodoListToTerminal();
	}

	public static void printTodoListToTerminal() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("taskList.txt"));
		String st = br.readLine();
		while (st != null) {
			System.out.println(st);
			st = br.readLine();
		}
		br.close();
	}

	public static void deleteTask() throws IOException {
		printTodoListToTerminal();
		BufferedReader br = new BufferedReader(new FileReader("taskList.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("temp.txt"));
		System.out.println("Enter task to delete: ");
		Scanner scanner = new Scanner(System.in);
		String deletedTask = scanner.nextLine();
		
		while (br.readLine() != null) {
			if (deletedTask != br.readLine()) {
				bw.write(br.readLine());
			}
			else if (deletedTask == br.readLine()) {
				bw.newLine();
			}
			
		}
		

	}
}
