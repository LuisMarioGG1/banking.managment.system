
public class Customer extends Person{
    private int customerID;

    Customer(String [] customerInfo){
        this.customerID = Integer.parseInt(customerInfo [0]);
        this.setFirstName(customerInfo[1]);
        this.setLastName(customerInfo[2]);
        this.setDob(customerInfo [3]);
        this.setAddress(customerInfo [4]);
        this.setPhoneNum(customerInfo [5]);
    }
    
}

