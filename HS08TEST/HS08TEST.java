import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String currentLine;
        String[] lineArray; 
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        while((currentLine = in.readLine()) != null){
            lineArray = currentLine.split(" ");
            double fee = 0.5;
            Double withdraw = Double.parseDouble(lineArray[0]);
            Double balance = Double.parseDouble(lineArray[1]);
            Double newBalance = balance-withdraw-fee;
           
            if(newBalance < 0 || withdraw%5 != 0){            
                newBalance = balance;
            }
            
            DecimalFormat money = new DecimalFormat("#.00");
            System.out.println(money.format(newBalance));
        }
    }
}
