package WebCrawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import javax.sound.midi.SysexMessage;
import java.io.IOException;

public class WebCrawler {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("http://facebook.com").get();
        String title=doc.title();
        System.out.println("title : "+ title);

        Elements links =doc.select("a[href]");
        for(Element link:links)
        {
            System.out.println("\n link: "+link.attr("href"));
            System.out.println("text: "+link.text());
        }
        System.out.println("Getting all images");
        Elements images=doc.getElementsByTag("img");
        for(Element src: images)
        {
            System.out.println( "src"+src.attr("src"));
        }
    }
}
