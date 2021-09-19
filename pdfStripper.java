package readPDF;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.text.PDFTextStripper;

public class readPDF {

	public static void main(String[] args) throws IOException {
		
		
		
		File file = new File("C:\\Users\\wmsai\\Desktop\\BankStatement.pdf");
		PDFTextStripper stripper = new PDFTextStripper();
		
		String pdfText = stripper.getText(Loader.loadPDF(file));
		
		System.out.println(pdfText);
		
	}

}
