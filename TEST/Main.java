
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) throws IOException {
        Integer currentLine;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        while((currentLine = Integer.parseInt(in.readLine())) != null){            
            if(currentLine == 42){
             System.exit(0);
            }
            
            System.out.println(currentLine);
        }
    }
}
