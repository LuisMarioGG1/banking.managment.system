
import java.io.*;

public class ReadCSVFile{
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args){
        try (
        
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\luism\\OneDrive\\Escritorio\\Project1\\Class\\src\\banking.managment.system\\CS3331-BankUsers.csv"
        ))) {

            String line;
            while((line = br.readLine())!= null){
                System.out.println(line);
    
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    } 
    

}
  
