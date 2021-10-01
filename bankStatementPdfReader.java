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
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.text.PDFTextStripper;

public class lineParser {

	public static void lineParseMethod() throws IOException, InterruptedException {

		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		BufferedWriter bw = new BufferedWriter(new FileWriter("bankData", StandardCharsets.UTF_8));
		String pdfText = stripper.getText(Loader.loadPDF(file)).toUpperCase();

		bw.write(pdfText);
		bw.flush();
		bw.close();
		TimeUnit.SECONDS.sleep(3);

		LineNumberReader lineNum = new LineNumberReader(new FileReader("bankData"));
		String line;
		while ((line = lineNum.readLine()) != null) {
			int lineNumber = lineNum.getLineNumber();
			String data = Files.readAllLines(Paths.get("bankData")).get(lineNumber);
			String input = data;
			String regex = "(\\D\\d{2}\\s-?\\d+\\D\\d{2})";
			Matcher m = Pattern.compile(regex).matcher(input);
			if (m.find()) {
				System.out.println(data);
			} else if (!m.find()) {
				continue;
			} else {
				break;
			}

		}
	}
}
