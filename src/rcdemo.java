import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class rcdemo {
   public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException, URISyntaxException {
   
	   while(true){ 
	        BufferedReader buf = new BufferedReader(new FileReader("C:\\link.txt"));
	        String currentLine = null;
	        while((currentLine = buf.readLine())!=null){
	            System.out.print(currentLine+"\n");
	            Desktop.getDesktop().browse(new URL(currentLine).toURI());
	            
	             Thread.sleep(10000);
	            }
	        }
   }
}