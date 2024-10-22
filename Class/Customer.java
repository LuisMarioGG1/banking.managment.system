import java.util.List;


final class Customer extends Person{
    
    public static List<Account>accounts;
    private String customerID;

    public static List<Account> getAccounts() {
        return accounts;
    }

    public static void setAccounts(List<Account> accounts) {
        Customer.accounts = accounts;
    }
    
    /**
     * 
     * @param costumerID Costumer identification number.
     */
    public Customer(String customerID){
        getID();
    }
    /**
     * 
     * @param customerID Costumer identification number.
     */
    public void setID(String customerID){
        this.customerID = customerID;
    }
    public String getID(){
        return customerID;
    }
        
    
}

