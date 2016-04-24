/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fishapp;

/*import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author coreilly
 */
public class FishApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainFrame mf = new MainFrame();
        mf.setVisible(true);
        
        
    }
    
    /*        public class FileWriter {
    
    public void main (String[] args)throws IOException {
        List<String> lines = Arrays.asList("Mares eat oats");
        
        try
        {
            Path file = Paths.get("Fish-Quantity.txt");
            Files.write(file, lines, Charset.forName("UTF-8"));
        } 
        catch (Exception e) 
        {
            System.out.println("Could not write to file");
        }
    }
    
    }
    
  
    
public class FileWriter {

    /**
     * @param args the command line arguments
         * @throws java.io.IOException
     */
   /* public void main(String[] args) throws IOException {
        // TODO code application logic here
        
        List<String> lines = Arrays.asList("Mares eat oats", "and does eat oats", "and little lambs eat ivy.");
        
        try {
            Path file = Paths.get("Fish_Quantities.txt");
            Files.write(file, lines , Charset.forName("UTF-8"));
            System.out.println("Successfully written to file");
        } catch (Exception e){
            System.out.println("Could not write to file");
        }
            
        try (BufferedReader br = new BufferedReader(new FileReader("Fish_Quantities.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            
            String everything = sb.toString();
            System.out.println(everything);                
            }
        
        catch (Exception e){
            System.out.println("Could not write to file");
        }
     
        }
        
    }
    */
}
