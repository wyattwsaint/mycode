package commCalc;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Properties;

public class CommCalc {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		BufferedWriter bw = null;
		BufferedWriter bwcomm = null;
		BufferedWriter bwsold = null;
		BufferedWriter bwappt = null;
		BufferedWriter bwbonus = null;

		System.out.println("Sold? (y or n)");
		String soldornot = scanner.nextLine();

		
		// v v v Beginning IF statement for determining closing rate
		if (soldornot.equals("y")) {

			// v v Initial data entry
			System.out.println("Enter first name: ");
			String firstName = scanner.nextLine();
			System.out.println("Enter last name: ");
			String lastName = scanner.nextLine();
			System.out.println("Enter product: ");
			String product = scanner.nextLine();
			System.out.println("Comments: ");
			String comments = scanner.nextLine();

			System.out.println("Date: ");
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			Date date = new Date(System.currentTimeMillis());
			System.out.println(formatter.format(date));

			System.out.println("Credit status: ");
			String credstat = scanner.nextLine();

			// v v v Code to determine monthly closing percentage
			String soldline = Files.readAllLines(Paths.get("sold.txt")).get(0);
			double soldofline = Double.parseDouble(soldline);
			double soldadd = soldofline + 1;
			bwsold = new BufferedWriter(new FileWriter("sold.txt"));
			bwsold.write(String.valueOf(soldadd));
			bwsold.flush();
			String apptsline = Files.readAllLines(Paths.get("appts.txt")).get(0);
			double apptsofline = Double.parseDouble(apptsline);
			double apptsadd = apptsofline + 1;
			bwappt = new BufferedWriter(new FileWriter("appts.txt"));
			bwappt.write(String.valueOf(apptsadd));
			bwappt.flush();

			// v v This is to track basic appointment data
			bw = new BufferedWriter(new FileWriter("custinfo.txt", true));
			bw.write(firstName);
			bw.write(" ");
			bw.write(lastName);
			bw.newLine();
			bw.write(product);
			bw.newLine();
			bw.write(comments);
			bw.newLine();
			bw.write(formatter.format(date));
			bw.newLine();
			bw.flush();
			bw.close();

			// v v Commission calculations
			System.out.println("Enter book price: ");
			double book = scanner.nextDouble();
			System.out.println("Enter actual price: ");
			double actual = scanner.nextDouble();
			double drop = ((book - actual) / book);
			double commperc = (.48 - (drop)) / 2;

			// v v Big IF statement that determines different outcomes based on how deep the
			// rep discounted the price
			if (drop > .48) {
				System.out.println("Dropped " + 100 * drop
						+ " %, which is greater than a 48% drop. Diller will sarcastically tell you this later when you ask why your commission sucks. Commission is 0.");

				// v v Code for monthly running total of commissions earned
				String linecontent = Files.readAllLines(Paths.get("totalcommissions.txt")).get(0);
				double commofline = Double.parseDouble(linecontent);
				double commadd = commofline + (.02 * actual * .7);
				bwcomm = new BufferedWriter(new FileWriter("totalcommissions.txt"));
				bwcomm.write(String.valueOf(commadd));
				bwcomm.flush();
				System.out.println("Total MONTHLY commissions: " + commadd);

				// v v Code for monthly running total of sales earned AND monthly bonus tier
				String linecontents = Files.readAllLines(Paths.get("totalsales.txt")).get(0);
				double amountofline = Double.parseDouble(linecontents);
				double amountadd = amountofline + actual;
				bwcomm = new BufferedWriter(new FileWriter("totalsales.txt"));
				bwcomm.write(String.valueOf(amountadd));
				bwcomm.flush();
				System.out.println("Total MONTHLY sales: " + amountadd);
				if (amountadd > 0 && amountadd < 60000) {
					int bonus = 0;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);
				} else if (amountadd >= 60000 && amountadd < 70000) {
					int bonus = 800;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);
				} else if (amountadd >= 70000 && amountadd < 80000) {
					int bonus = 1200;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 80000 && amountadd < 90000) {
					int bonus = 1500;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 90000 && amountadd < 100000) {
					int bonus = 1700;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 100000 && amountadd < 115000) {
					int bonus = 2000;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 115000 && amountadd < 130000) {
					int bonus = 2200;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 130000 && amountadd < 145000) {
					int bonus = 2400;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 145000 && amountadd < 160000) {
					int bonus = 2600;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 160000 && amountadd < 170000) {
					int bonus = 2800;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 170000 && amountadd < 180000) {
					int bonus = 3200;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 180000 && amountadd < 190000) {
					int bonus = 3500;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 190000 && amountadd < 200000) {
					int bonus = 3700;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 200000 && amountadd < 215000) {
					int bonus = 4000;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 215000 && amountadd < 230000) {
					int bonus = 4200;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 230000 && amountadd < 245000) {
					int bonus = 4400;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 245000 && amountadd < 260000) {
					int bonus = 4600;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 260000 && amountadd < 270000) {
					int bonus = 4800;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 270000 && amountadd < 280000) {
					int bonus = 5200;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 280000 && amountadd < 290000) {
					int bonus = 5500;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 290000 && amountadd < 300000) {
					int bonus = 5700;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else {
					int bonus = 6000;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				}

				// v v Code for yearly running total commissions earned
				String yearlylinecontent = Files.readAllLines(Paths.get("totalyearlycommissions.txt")).get(0);
				double yearlycommofline = Double.parseDouble(yearlylinecontent);
				double yearlycommadd = yearlycommofline + (.02 * actual * .7);
				bwcomm = new BufferedWriter(new FileWriter("totalyearlycommissions.txt"));
				bwcomm.write(String.valueOf(yearlycommadd));
				bwcomm.flush();
				System.out.println("Total YEARLY commissions: " + yearlycommadd);

				// v v Code for yearly running total SALES earned
				String yearlySALESlinecontent = Files.readAllLines(Paths.get("totalyearlysales.txt")).get(0);
				double yearlySALESofline = Double.parseDouble(yearlySALESlinecontent);
				double yearlySALESadd = yearlySALESofline + (.02 * actual * .7);
				bwcomm = new BufferedWriter(new FileWriter("totalyearlysales.txt"));
				bwcomm.write(String.valueOf(yearlySALESadd));
				bwcomm.flush();
				System.out.println("Total YEARLY sales: " + yearlySALESadd);

				bw = new BufferedWriter(new FileWriter("custinfo.txt", true));
				bw.write(String.valueOf(.02 * actual * .7));
				bw.write(" / ");
				bw.write(String.valueOf(actual));
				bw.newLine();
				bw.write(String.valueOf("----"));
				bw.newLine();
				bw.flush();

				scanner.next();
				

				String commish = "0";
				String of = " of ";
				double bookprice = .24 * book * .7;
				String soldfor = "...sold for ";
				double actualprice = actual;
				String creddesc = "  Credit is ";
				String credit = credstat;
				String totalmonthlycomm = ".  Total monthly commish: ";
				String totalmonthlysales = ".  Total monthly sales: ";
				String premonthlybonus = ". Monthly bonus is: ";
				String linemonthlybonus = Files.readAllLines(Paths.get("monthlybonus.txt")).get(0);
				double monthlybonus = Double.parseDouble(linemonthlybonus);

				String to = "wmsaint17@gmail.com";

				String from = "wyatt.saint@aspenwindows.com";

				String host = "smtp.gmail.com";

				Properties properties = System.getProperties();

				properties.put("mail.smtp.host", host);
				properties.put("mail.smtp.port", "465");
				properties.put("mail.smtp.ssl.enable", "true");
				properties.put("mail.smtp.auth", "true");

				Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

					protected PasswordAuthentication getPasswordAuthentication() {

						return new PasswordAuthentication("wyatt.saint@aspenwindows.com", "Swatts0429*");

					}

				});

				session.setDebug(true);

				try {
					MimeMessage message = new MimeMessage(session);

					message.setFrom(new InternetAddress(from));

					message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

					message.setSubject("SOLD!!");

					message.setText(String
							.valueOf(commish + of + bookprice + soldfor + actualprice + creddesc + credit
									+ totalmonthlycomm + commadd + totalmonthlysales + amountadd
									+ ". Monthly closing rate: " + (soldadd / apptsadd * 100) + "%")
							+ premonthlybonus + monthlybonus);

					System.out.println("sending...");
					Transport.send(message);
					System.out.println("Sent message successfully....");
				} catch (MessagingException mex) {
					mex.printStackTrace();
				}
				scanner.next();
			}

			else if (drop > .44) {
				System.out.println("Dropped " + 100 * drop
						+ " %, which is greater than a 44% drop but less than 48%. Commission is " + .02 * actual * .7
						+ " of " + .24 * book * .7);

				// v v Code for monthly running total of commissions earned
				String linecontent = Files.readAllLines(Paths.get("totalcommissions.txt")).get(0);
				double commofline = Double.parseDouble(linecontent);
				double commadd = commofline + (.02 * actual * .7);
				bwcomm = new BufferedWriter(new FileWriter("totalcommissions.txt"));
				bwcomm.write(String.valueOf(commadd));
				bwcomm.flush();
				System.out.println("Total MONTHLY commissions: " + commadd);

				// v v Code for monthly running total of sales earned AND monthly bonus tier
				String linecontents = Files.readAllLines(Paths.get("totalsales.txt")).get(0);
				double amountofline = Double.parseDouble(linecontents);
				double amountadd = amountofline + actual;
				bwcomm = new BufferedWriter(new FileWriter("totalsales.txt"));
				bwcomm.write(String.valueOf(amountadd));
				bwcomm.flush();
				System.out.println("Total MONTHLY sales: " + amountadd);
				if (amountadd > 0 && amountadd < 60000) {
					int bonus = 0;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 60000 && amountadd < 70000) {
					int bonus = 800;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 70000 && amountadd < 80000) {
					int bonus = 1200;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 80000 && amountadd < 90000) {
					int bonus = 1500;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 90000 && amountadd < 100000) {
					int bonus = 1700;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 100000 && amountadd < 115000) {
					int bonus = 2000;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 115000 && amountadd < 130000) {
					int bonus = 2200;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 130000 && amountadd < 145000) {
					int bonus = 2400;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 145000 && amountadd < 160000) {
					int bonus = 2600;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 160000 && amountadd < 170000) {
					int bonus = 2800;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 170000 && amountadd < 180000) {
					int bonus = 3200;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 180000 && amountadd < 190000) {
					int bonus = 3500;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 190000 && amountadd < 200000) {
					int bonus = 3700;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 200000 && amountadd < 215000) {
					int bonus = 4000;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 215000 && amountadd < 230000) {
					int bonus = 4200;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 230000 && amountadd < 245000) {
					int bonus = 4400;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 245000 && amountadd < 260000) {
					int bonus = 4600;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 260000 && amountadd < 270000) {
					int bonus = 4800;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 270000 && amountadd < 280000) {
					int bonus = 5200;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 280000 && amountadd < 290000) {
					int bonus = 5500;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 290000 && amountadd < 300000) {
					int bonus = 5700;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else {
					int bonus = 6000;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				}

				// v v Code for yearly running total commissions earned
				String yearlylinecontent = Files.readAllLines(Paths.get("totalyearlycommissions.txt")).get(0);
				double yearlycommofline = Double.parseDouble(yearlylinecontent);
				double yearlycommadd = yearlycommofline + (.02 * actual * .7);
				bwcomm = new BufferedWriter(new FileWriter("totalyearlycommissions.txt"));
				bwcomm.write(String.valueOf(yearlycommadd));
				bwcomm.flush();
				System.out.println("Total YEARLY commissions: " + yearlycommadd);

				// v v Code for yearly running total SALES earned
				String yearlySALESlinecontent = Files.readAllLines(Paths.get("totalyearlysales.txt")).get(0);
				double yearlySALESofline = Double.parseDouble(yearlySALESlinecontent);
				double yearlySALESadd = yearlySALESofline + (.02 * actual * .7);
				bwcomm = new BufferedWriter(new FileWriter("totalyearlysales.txt"));
				bwcomm.write(String.valueOf(yearlySALESadd));
				bwcomm.flush();
				System.out.println("Total YEARLY sales: " + yearlySALESadd);

				bw = new BufferedWriter(new FileWriter("custinfo.txt", true));
				bw.write(String.valueOf(.02 * actual * .7));
				bw.write(" / ");
				bw.write(String.valueOf(actual));
				bw.newLine();
				bw.write(String.valueOf("----"));
				bw.newLine();
				bw.flush();

				scanner.next();
				

				double commish = .02 * actual * .7;
				String of = " of ";
				double bookprice = .24 * book;
				String soldfor = "...sold for ";
				double actualprice = actual;
				String creddesc = "  Credit is ";
				String credit = credstat;
				String totalmonthlycomm = ".  Total monthly commish: ";
				String totalmonthlysales = ".  Total monthly sales: ";
				String premonthlybonus = ". Monthly bonus is: ";
				String linemonthlybonus = Files.readAllLines(Paths.get("monthlybonus.txt")).get(0);
				double monthlybonus = Double.parseDouble(linemonthlybonus);

				String to = "wmsaint17@gmail.com";

				String from = "wyatt.saint@aspenwindows.com";

				String host = "smtp.gmail.com";

				Properties properties = System.getProperties();

				properties.put("mail.smtp.host", host);
				properties.put("mail.smtp.port", "465");
				properties.put("mail.smtp.ssl.enable", "true");
				properties.put("mail.smtp.auth", "true");

				Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

					protected PasswordAuthentication getPasswordAuthentication() {

						return new PasswordAuthentication("wyatt.saint@aspenwindows.com", "Swatts0429*");

					}

				});

				session.setDebug(true);

				try {

					MimeMessage message = new MimeMessage(session);

					message.setFrom(new InternetAddress(from));

					message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

					message.setSubject("SOLD!!");

					message.setText(String
							.valueOf(commish + of + bookprice + soldfor + actualprice + creddesc + credit
									+ totalmonthlycomm + commadd + totalmonthlysales + amountadd
									+ ". Monthly closing rate: " + (soldadd / apptsadd * 100) + "%")
							+ premonthlybonus + monthlybonus);

					System.out.println("sending...");
					Transport.send(message);
					System.out.println("Sent message successfully....");
				} catch (MessagingException mex) {
					mex.printStackTrace();
				}
				scanner.next();
			}

			else {
				double comm = commperc * actual * .7;
				System.out.println("Dropped " + 100 * drop + " %. Commission is " + comm + " of " + .24 * book * .7);

				// v v Code for monthly running total of commissions earned
				String linecontent = Files.readAllLines(Paths.get("totalcommissions.txt")).get(0);
				double commofline = Double.parseDouble(linecontent);
				double commadd = commofline + comm;
				bwcomm = new BufferedWriter(new FileWriter("totalcommissions.txt"));
				bwcomm.write(String.valueOf(commadd));
				bwcomm.flush();
				System.out.println("Total MONTHLY commissions: " + commadd);

				// v v Code for monthly running total of sales earned AND monthly bonus tier
				String linecontents = Files.readAllLines(Paths.get("totalsales.txt")).get(0);
				double amountofline = Double.parseDouble(linecontents);
				double amountadd = amountofline + actual;
				bwcomm = new BufferedWriter(new FileWriter("totalsales.txt"));
				bwcomm.write(String.valueOf(amountadd));
				bwcomm.flush();
				System.out.println("Total MONTHLY sales: " + amountadd);
				if (amountadd > 0 && amountadd < 60000) {
					int bonus = 0;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 60000 && amountadd < 70000) {
					int bonus = 800;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 70000 && amountadd < 80000) {
					int bonus = 1200;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 80000 && amountadd < 90000) {
					int bonus = 1500;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 90000 && amountadd < 100000) {
					int bonus = 1700;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 100000 && amountadd < 115000) {
					int bonus = 2000;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 115000 && amountadd < 130000) {
					int bonus = 2200;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 130000 && amountadd < 145000) {
					int bonus = 2400;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 145000 && amountadd < 160000) {
					int bonus = 2600;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 160000 && amountadd < 170000) {
					int bonus = 2800;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 170000 && amountadd < 180000) {
					int bonus = 3200;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 180000 && amountadd < 190000) {
					int bonus = 3500;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 190000 && amountadd < 200000) {
					int bonus = 3700;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 200000 && amountadd < 215000) {
					int bonus = 4000;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 215000 && amountadd < 230000) {
					int bonus = 4200;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 230000 && amountadd < 245000) {
					int bonus = 4400;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 245000 && amountadd < 260000) {
					int bonus = 4600;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 260000 && amountadd < 270000) {
					int bonus = 4800;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 270000 && amountadd < 280000) {
					int bonus = 5200;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 280000 && amountadd < 290000) {
					int bonus = 5500;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else if (amountadd >= 290000 && amountadd < 300000) {
					int bonus = 5700;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				} else {
					int bonus = 6000;
					bwbonus = new BufferedWriter(new FileWriter("monthlybonus.txt"));
					bwbonus.write(String.valueOf(bonus));
					bwbonus.flush();
					System.out.println("Monthly bonus is: " + bonus);

				}

				// v v Code for yearly running total commissions earned
				String yearlylinecontent = Files.readAllLines(Paths.get("totalyearlycommissions.txt")).get(0);
				double yearlycommofline = Double.parseDouble(yearlylinecontent);
				double yearlycommadd = yearlycommofline + comm;
				bwcomm = new BufferedWriter(new FileWriter("totalyearlycommissions.txt"));
				bwcomm.write(String.valueOf(yearlycommadd));
				bwcomm.flush();
				System.out.println("Total YEARLY commissions: " + yearlycommadd);

				// v v Code for yearly running total SALES earned
				String yearlySALESlinecontent = Files.readAllLines(Paths.get("totalyearlysales.txt")).get(0);
				double yearlySALESofline = Double.parseDouble(yearlySALESlinecontent);
				double yearlySALESadd = yearlySALESofline + actual;
				bwcomm = new BufferedWriter(new FileWriter("totalyearlysales.txt"));
				bwcomm.write(String.valueOf(yearlySALESadd));
				bwcomm.flush();
				System.out.println("Total YEARLY sales: " + yearlySALESadd);

				bw = new BufferedWriter(new FileWriter("custinfo.txt", true));
				bw.write(String.valueOf(comm));
				bw.write(" / ");
				bw.write(String.valueOf(actual));
				bw.newLine();
				bw.write(String.valueOf("----"));
				bw.newLine();
				bw.flush();

				scanner.next();
				

				double commish = comm;
				String of = " of ";
				double bookprice = .24 * book * .7;
				String soldfor = "...sold for ";
				double actualprice = actual;
				String creddesc = "  Credit is ";
				String credit = credstat;
				String totalmonthlycomm = ".  Total monthly commish: ";
				String totalmonthlysales = ".  Total monthly sales: ";
				String premonthlybonus = ". Monthly bonus is: ";
				String linemonthlybonus = Files.readAllLines(Paths.get("monthlybonus.txt")).get(0);
				double monthlybonus = Double.parseDouble(linemonthlybonus);

				String to = "wmsaint17@gmail.com";

				String from = "wyatt.saint@aspenwindows.com";

				String host = "smtp.gmail.com";

				Properties properties = System.getProperties();

				properties.put("mail.smtp.host", host);
				properties.put("mail.smtp.port", "465");
				properties.put("mail.smtp.ssl.enable", "true");
				properties.put("mail.smtp.auth", "true");

				Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

					protected PasswordAuthentication getPasswordAuthentication() {

						return new PasswordAuthentication("wyatt.saint@aspenwindows.com", "Swatts0429*");

					}

				});

				session.setDebug(true);

				try {
					MimeMessage message = new MimeMessage(session);

					message.setFrom(new InternetAddress(from));

					message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

					message.setSubject("SOLD!!");

					message.setText(String
							.valueOf(commish + of + bookprice + soldfor + actualprice + creddesc + credit
									+ totalmonthlycomm + commadd + totalmonthlysales + amountadd
									+ ". Monthly closing rate: " + (soldadd / apptsadd * 100) + "%")
							+ premonthlybonus + monthlybonus);

					System.out.println("sending...");
					Transport.send(message);
					System.out.println("Sent message successfully....");
				} catch (MessagingException mex) {
					mex.printStackTrace();
				}

				System.out.println("Monthly closing rate: " + (soldadd / apptsadd * 100) + "%");
				scanner.next();
			}
		}

		// v v v 2nd half of IF statement for closing percentage with result emailed out
		else {
			String apptsline = Files.readAllLines(Paths.get("appts.txt")).get(0);
			double apptsofline = Double.parseDouble(apptsline);
			double apptsadd = apptsofline + 1;
			bwappt = new BufferedWriter(new FileWriter("appts.txt"));
			bwappt.write(String.valueOf(apptsadd));
			bwappt.flush();
			String soldline = Files.readAllLines(Paths.get("sold.txt")).get(0);
			double soldofline = Double.parseDouble(soldline);
			double soldadd = soldofline;
			System.out.println("Monthly closing rate: " + (soldadd / apptsadd * 100) + "%");

			scanner.next();
			

			String to = "wmsaint17@gmail.com";

			String from = "wyatt.saint@aspenwindows.com";

			String host = "smtp.gmail.com";

			Properties properties = System.getProperties();

			properties.put("mail.smtp.host", host);
			properties.put("mail.smtp.port", "465");
			properties.put("mail.smtp.ssl.enable", "true");
			properties.put("mail.smtp.auth", "true");

			Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

				protected PasswordAuthentication getPasswordAuthentication() {

					return new PasswordAuthentication("wyatt.saint@aspenwindows.com", "Swatts0429*");

				}

			});

			session.setDebug(true);

			try {
				MimeMessage message = new MimeMessage(session);

				message.setFrom(new InternetAddress(from));

				message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

				message.setSubject("Didn't sell it :(");

				message.setText("Monthly closing rate: " + (soldadd / apptsadd * 100) + "%");

				System.out.println("sending...");
				Transport.send(message);
				System.out.println("Sent message successfully....");
			} catch (MessagingException mex) {
				mex.printStackTrace();
			}
			scanner.next();
		}
	}

}
