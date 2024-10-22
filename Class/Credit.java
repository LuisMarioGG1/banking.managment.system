public class Credit extends Account{
    private double creditMax;
    private double creditBalance;

    public void setCreditMax(double creditMax){
        this.creditMax = creditMax;
    }
    public void setCreditBalance(double creditBalance){
        this.creditBalance = creditBalance;
    }
    public double  getCreditMax(){
        return creditMax;
    }
    public double getCreditBalance(){
        return creditBalance;
    }
    public void updateBalance(double amount){

        System.out.println("Update balance"+amount);
    }
    

}
