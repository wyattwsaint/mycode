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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.text.PDFTextStripper;

public class readPDF {

	public static void main(String[] args) throws IOException {

		/*aspenHomeImprovements();
		military();
		amazonMarketplace();
		progressFitness();
		americanFunds();
		usaa();
	    tithely();
		hondaOdysseyLoanPayment();
		wawaPurchases();
		amazon();
		dunkinDonuts();
	    primeVideo_WithDate();
		trashService();
		electricBill();
		aldi();
		sheetz();
		ezPass();
		pennDot();
		quikQualityCarWash();
		armyAAFES();
		capitalRegion();
		onlineSusquehannaBillPayFee();
		sewage();
		amazonPrimeSubscription();
		costco();
		triCare();
		walmart();
		walmartReturns();
		amazonReturns();
		pizzaGrille();
		lowes();
		dairyQueen();
		paymentFromPaypal();
		paypalPayments();
		mandyLifeInsurance();
		sunoco();
		navigators();
		sevenEleven();
		cloud10CarWash();
		turkeyHill();
		instacart();
		hburgYMCA();
		childTaxCredit();
		dollarTree();
		mortgage();
		onceUponAChild();
		giant();
		disciplemakers();
		a1ExpressMart();*/
		checks();
		
		
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
		aspenBw.close();
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
		transBw.close();
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
		transBw.close();
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
		aspenBw.close();
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
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();

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
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();

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
				double add = Double.valueOf(data4) + Double.valueOf(aspenAddUp);
				double roundUp = Math.ceil(add);
				String roundUpToString = Double.toString(roundUp);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(roundUpToString);
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
		aspenBw.close();
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
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();

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
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();

	}

	static void amazon() throws IOException {

		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "PURCHASE AMAZON.COM";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();

	}

	static void dunkinDonuts() throws IOException {

		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "DEBIT CARD PURCHASE DUNKIN";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
	}

	static void primeVideo_WithDate() throws IOException {

		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "PRIME VIDEO";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber() - 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(lineNumber);
				String input = data;
				String regex = " (\\D\\d{2}/\\d{2}/\\d{4}\\D) ";
				Matcher m = Pattern.compile(regex).matcher(input);
				if (m.find()) {
					int newLineNumber = lineNumber + 2;
					String newData = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
					String[] data2 = newData.split("/", 2);
					String data3 = data2[1].replaceAll(",", "").substring(3);
					double data4 = Double.valueOf(data3);
					double data5 = Math.floor(data4);
					String data6 = String.valueOf(data5);
					String data7 = data6.substring(0, data3.length() - 3);
					String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
					int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
					String added = String.valueOf(add);
					BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
					aspenBw.write(added);
					aspenBw.flush();
					aspenBw.newLine();
				} else if (!m.find()) {
					continue;
				}

			} else {
				continue;
			}

		}
		String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
		BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
		aspenBw.write("0");
		aspenBw.flush();
		System.out.println(aspenAddUp);
		aspenBw.close();
	}

	static void trashService() throws IOException {

		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "ACH WITHDRAWAL PENN WASTE";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber - 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();

	}

	static void electricBill() throws NumberFormatException, IOException {

		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "ACH WITHDRAWAL PP ELEC BILL";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber - 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();

	}
	
	static void aldi() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "DEBIT CARD PURCHASE ALDI";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void sheetz() throws NumberFormatException, IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "DEBIT CARD PURCHASE SHEETZ";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void ezPass() throws NumberFormatException, IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "DEBIT CARD PURCHASE PTC EZPASS";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void pennDot() throws NumberFormatException, IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "DEBIT CARD PURCHASE PA DRIVER & VEHICLE SE";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void quikQualityCarWash() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "DEBIT CARD PURCHASE QUIK QUALITY CAR WAS";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void armyAAFES() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "AAFES";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void capitalRegion() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "CAPITAL REGION";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void onlineSusquehannaBillPayFee() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "BILL SERVICING";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber - 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 4);
				String data3 = data2[3].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void sewage() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "SUSQUEHANNA TOWNSHIP";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void amazonPrimeSubscription() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "AMAZON PRIME";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber - 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 3);
				String data3 = data2[2].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void costco() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "COSTCO WHSE";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void triCare() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "HGB TRS TRR";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void walmart() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "PURCHASE WM SUPERCENTER";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void walmartReturns() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "RETURN ADJUSTMENT WAL-MART";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void amazonReturns() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "REFUNDAMAZON.COM";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 0;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void pizzaGrille() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "THE PIZZA GRILLE";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void lowes() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "LOWE'S";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber - 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 4);
				String data3 = data2[3].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void dairyQueen() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "DAIRY QUEEN";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void paymentFromPaypal() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "PAYMENT: ACH: PAYPAL";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 3;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void paypalPayments() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "WITHDRAWAL PAYPAL";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void mandyLifeInsurance() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "BANNER LIFE PREM";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber - 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	
	static void sunoco() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "SUNOCO";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void navigators() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "NAVIGATORS";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber - 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void sevenEleven() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "7-ELEVEN";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void cloud10CarWash() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "CLOUD 10";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void turkeyHill() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "TURKEY HILL";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void instacart() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "INSTACART";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void hburgYMCA() throws IOException {

		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "PAYMENT: ACH: 34474 HARRISBURG";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 3;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void childTaxCredit() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "PAYMENT: ACH: IRS TREAS";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 2;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void dollarTree() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "DOLLAR TREE";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void mortgage() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "FREEDOM MTG";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber - 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void onceUponAChild() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "ONCE UPON A CHILD";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 2);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void giant() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "GIANT";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber - 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 4);
				String data3 = data2[3].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void disciplemakers() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "DISCIPLEMAKERS";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void a1ExpressMart() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "A1 EXPRESS MART";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber();
				int newLineNumber = lineNumber + 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
				String[] data2 = data.split("/", 2);
				String data3 = data2[1].replaceAll(",", "").substring(3);
				double data4 = Double.valueOf(data3);
				double data5 = Math.floor(data4);
				String data6 = String.valueOf(data5);
				String data7 = data6.substring(0, data3.length() - 3);
				String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
				int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
				String added = String.valueOf(add);
				BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
				aspenBw.write(added);
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
		aspenBw.close();
		
	}
	
	static void checks() throws IOException {
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String transactionName = "CHECK";
		String line;
		while ((line = lineNum.readLine()) != null) {
			if (line.contains(transactionName)) {
				int lineNumber = lineNum.getLineNumber() - 1;
				String data = Files.readAllLines(Paths.get("bankData")).get(lineNumber);
				String input = data;
				//System.out.println(lineNumber);
				String regex = "\\/";
				Matcher m = Pattern.compile(regex).matcher(input);
				if (m.find()) {
					int newLineNumber = lineNumber;
					//System.out.println(newLineNumber);
					String newData = Files.readAllLines(Paths.get("bankData")).get(newLineNumber);
					String[] data2 = newData.split("/", 2);
					String data3 = data2[1].replaceAll(",", "").substring(3);
					double data4 = Double.valueOf(data3);
					double data5 = Math.floor(data4);
					//System.out.println(data5);
					String data6 = String.valueOf(data5);
					String data7 = data6.substring(0, data3.length() - 3);
					String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
					int add = Integer.valueOf(data7) + Integer.valueOf(aspenAddUp);
					String added = String.valueOf(add);
					BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
					aspenBw.write(added);
					aspenBw.flush();
					aspenBw.newLine();
				} else if (!m.find()) {
					continue;
				}

			} else {
				continue;
			}
		
	}
		String aspenAddUp = Files.readAllLines(Paths.get("temp.txt")).get(0);
		BufferedWriter aspenBw = new BufferedWriter(new FileWriter("temp.txt"));
		aspenBw.write("0");
		aspenBw.flush();
		System.out.println(aspenAddUp);
		aspenBw.close();
	}
}
