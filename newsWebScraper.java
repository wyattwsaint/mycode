package webScraper.webScraper;

import java.io.FileWriter;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class App {
	
	public static void main(String[] args) throws IOException {

        String webPage1 = "https://www.theepochtimes.com";
        String html1 = Jsoup.connect(webPage1).get().html();
        Document document1 = Jsoup.parse(html1);
        Elements links1 = document1.select("a[href]");
        FileWriter fw1 = new FileWriter("searchresults.txt");
        fw1.write(links1.toString());
        fw1.close();
        System.out.println(links1);
	}
}
