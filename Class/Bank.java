import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Bank {
    /**Used to track if the user is a manager or a regular user*/
    private boolean isManager;
    /**Hash map used to store the list of customers in the system*/
    private HashMap<Integer, Customer> customerList = new HashMap<>();
    /**Scanner object used to handle user inputs*/
    private Scanner input = new Scanner(System.in);
    /**String used to store user inputs*/
    private String userInput;
    /**Name of file to be used for assignment*/
    private String fileName = "CS 3331 - Bank Users(1).csv";
    
    private BufferedReader br;

    public void initializeBank(){
        String line = "";
        try{
            //intitalizes buffered reader with the name of file to be read
            br = new BufferedReader(new FileReader(fileName));
            //skips first line of csv since it contains no customer info
            br.readLine();
            //loops through csv until last entry
            while((line = br.readLine()) != null){
                //splits entries from the csv by the comma seperation
                String [] customerInfo = line.split(",");
                //adds new instances of customer to a hashmap with customer ID as key and the array as arg to constructor
                customerList.put(Integer.parseInt(customerInfo[0]), new Customer(customerInfo));
            }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public void login(){
        System.out.println("login as Customer or Manager?");
        System.out.println("A. Customer");
        System.out.println("B. Manager");
        if(input.nextLine().equalsIgnoreCase("A")){
            isManager = false;
        }
        else if(input.nextLine().equalsIgnoreCase("B")){
            isManager = true;
        }
        else{
            System.out.println("Invalid input, returning to previous option select.");
            login();
        }
    }
}