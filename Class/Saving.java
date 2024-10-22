public class Saving extends Account{
    private double interest;
    private int period;
    private double currentAmount;

    public double getSavings(){
        return currentAmount;
    }
    public double getInterest(){
        return interest;
    }
    public int getPeriod(){
        return period;
    }
    public void setSavings(double currentAmount){
        this.currentAmount = currentAmount;
    }
    public void setInterest(double interest){
        this.interest  = interest;
    }
     public void setPeriod(int period){
        this.period = period;
     }
    
}
