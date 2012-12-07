import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Integer n;
        String[] lineArray; 
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        Integer rows = Integer.parseInt(in.readLine());
        
        for(Integer i=0; i < rows; i++){
            System.out.println(
                factorial(Integer.parseInt(in.readLine()))
            );
        }

    }
    
    public static BigInteger factorial(Integer n){    
        BigInteger input = BigInteger.valueOf(n);
        BigInteger result = input;
        BigInteger subtract = new BigInteger("1");

        for(Integer x=n-1; x > 0 ; x--){
           result = result.multiply(input = input.subtract(subtract));
        }
        
        return result;
    }
}

