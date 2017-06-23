package Training.project.joinee.Joinee;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.testng.annotations.Test;

public class ConvertDollarToRupeeTest {
  @Test
  public void f() throws IOException {
	  String testenv = System.getProperty("dollars");
	  
	    Document page = Jsoup.connect(
                "http://www.xe.com/currencyconverter/convert/?Amount="
                +testenv
                + "&From=USD&To=INR"
        ).get();
        
        System.out.println(testenv
                + "USD == " 
                + page.select("span.uccResultAmount").text() 
                + "INR");
  }
}
