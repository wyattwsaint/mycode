package readPDF;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.text.PDFTextStripper;

public class readPDF {

	public static void main(String[] args) throws IOException {
		
		//aspenHomeImprovements();
		//military();
		//amazonMarketplace();
		//progressFitness();
		//americanFunds();
		//usaa();
		//tithely();
		//hondaOdysseyLoanPayment();
		wawaPurchases();
		
	}

	static void aspenHomeImprovements() throws IOException {

		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "PAYMENT: ACH: ASPEN HOME IMPRO";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 3;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				String data4 = data3.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data4) + Integer.valueOf(aspenAddUp);

				String stringOfAdd = Integer.toString(add);

				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(stringOfAdd);
				aspenBw.flush();
				aspenBw.newLine();

			} else if (!line.contains(transactionName)) {
				continue;
			}

		}
		String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
		BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
		aspenBw.write("0");
		aspenBw.flush();
		System.out.println(aspenAddUp);
	}
	
	static void military() throws NumberFormatException, IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "PAYMENT: ACH: DFAS-IN IND, IN";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 3;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				String data4 = data3.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data4) + Integer.valueOf(aspenAddUp);

				String stringOfAdd = Integer.toString(add);

				BufferedWriter transBw = new BufferedWriter(new FileWriter("temp.txt"));
				transBw.write(stringOfAdd);
				transBw.flush();
				transBw.newLine();

			} else if (!line.contains(transactionName)) {
				continue;
			}

		}
		String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
		BufferedWriter transBw = new BufferedWriter(new FileWriter("temp.txt"));
		transBw.write("0");
		transBw.flush();
		System.out.println(aspenAddUp);
	}
	static void amazonMarketplace() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "PAYMENT: ACH: AMAZON MARKETPLA";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 3;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				String data4 = data3.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data4) + Integer.valueOf(aspenAddUp);

				String stringOfAdd = Integer.toString(add);

				BufferedWriter transBw = new BufferedWriter(new FileWriter("temp.txt"));
				transBw.write(stringOfAdd);
				transBw.flush();
				transBw.newLine();

			} else if (!line.contains(transactionName)) {
				continue;
			}

		}
		String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
		BufferedWriter transBw = new BufferedWriter(new FileWriter("temp.txt"));
		transBw.write("0");
		transBw.flush();
		System.out.println(aspenAddUp);
	}
	
	static void progressFitness() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "PAYMENT: ACH: PROGRESS FITNESS";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 3;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				String data4 = data3.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data4) + Integer.valueOf(aspenAddUp);

				String stringOfAdd = Integer.toString(add);

				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(stringOfAdd);
				aspenBw.flush();
				aspenBw.newLine();

			} else if (!line.contains(transactionName)) {
				continue;
			}

		}
		String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
		BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
		aspenBw.write("0");
		aspenBw.flush();
		System.out.println(aspenAddUp);
	}
	static void americanFunds() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "ACH WITHDRAWAL AMERICAN FUNDS INVESTMENT";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 2;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(2).trim();
				String data4 = data3.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data4) + Integer.valueOf(aspenAddUp);

				String stringOfAdd = Integer.toString(add);

				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(stringOfAdd);
				aspenBw.flush();
				aspenBw.newLine();

			} else if (!line.contains(transactionName)) {
				continue;
			}

		}
		String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
		BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
		aspenBw.write("0");
		aspenBw.flush();
		System.out.println(aspenAddUp);
		
	}
	
	static void usaa() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "ACH WITHDRAWAL USAA P&C EXT AUTOPAY";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber - 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(2).trim();
				String data4 = data3.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data4) + Integer.valueOf(aspenAddUp);

				String stringOfAdd = Integer.toString(add);

				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(stringOfAdd);
				aspenBw.flush();
				aspenBw.newLine();

			} else if (!line.contains(transactionName)) {
				continue;
			}

		}
		String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
		BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
		aspenBw.write("0");
		aspenBw.flush();
		System.out.println(aspenAddUp);
		
	}
	
	static void tithely() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "ACH WITHDRAWAL TITHE.LY TITHE.LY  WYATT MANDY SAINT";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber - 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				String data4 = data3.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data4) + Integer.valueOf(aspenAddUp);
				String stringOfAdd = Integer.toString(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(stringOfAdd);
				aspenBw.flush();
				aspenBw.newLine();

			} else if (!line.contains(transactionName)) {
				continue;
			}

		}
		String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
		BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
		aspenBw.write("0");
		aspenBw.flush();
		System.out.println(aspenAddUp);
	}
	
	static void hondaOdysseyLoanPayment() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "HOME BANKING WITHDRAWAL TRANSFER TO LOAN 0004";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber - 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				String data4 = data3.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data4) + Integer.valueOf(aspenAddUp);
				String stringOfAdd = Integer.toString(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(stringOfAdd);
				aspenBw.flush();
				aspenBw.newLine();

			} else if (!line.contains(transactionName)) {
				continue;
			}

		}
		String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
		BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
		aspenBw.write("0");
		aspenBw.flush();
		System.out.println(aspenAddUp);
		
	}
	
	static void wawaPurchases() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "WAWA";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				String data4 = data3.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data4) + Integer.valueOf(aspenAddUp);
				String stringOfAdd = Integer.toString(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(stringOfAdd);
				aspenBw.flush();
				aspenBw.newLine();

			} else if (!line.contains(transactionName)) {
				continue;
			}

		}
		String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
		BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
		aspenBw.write("0");
		aspenBw.flush();
		System.out.println(aspenAddUp);
		
	}
	
	
}
