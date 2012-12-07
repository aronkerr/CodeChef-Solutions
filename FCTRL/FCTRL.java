
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String currentLine;
        String[] lineArray; 
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        Integer rows = Integer.parseInt(in.readLine());
        
        for(int i=0; i < rows ; i++){
            currentLine = in.readLine();
            Integer n = Integer.parseInt(currentLine);
            System.out.println(factorial(n));
        }
    }
    
    public static Integer factorial(Integer n) {
        Integer input = n;
        Integer output = 0;
        Integer divisor = 5;
        
        while(divisor <= input){
            output = output + (input-(input%divisor))/divisor;
            divisor = divisor*5;
        }
        
        return output;
    }
}
