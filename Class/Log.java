


public class Log {
    private int cardNumber;
    private String cardType;
    private String nameOfHolder;
    private String nameOfRecipient;
    private int balance;
    private int amount;
    
    /**
     * 
     * @return Card number.
     */
    public int getCardNumber(){
        return cardNumber;
    }
    /**
     * 
     * @return Card type.
     */
    public String getCardType(){
        return cardType;
    }
    /**
     * 
     * @return Name of holder.
     */
    public String getNameOfHolder(){
        return nameOfHolder;
    }

    /**
     * 
     * @return Name of the recipient.
     */
    public String getNameOfRecipient(){
        return nameOfRecipient;
    }

    /**
     * 
     * @return Account balance.
     */
    public int getBalance(){
        return balance;
    }
    
    /**
     * 
     * @return amount sent or received.
     */
    public int getAmount(){
        return amount;
    }
    /**
     * 
     * @param cardNumber Account card number from different card types.
     */
    public void setCardNumber(int cardNumber){
        this.cardNumber = cardNumber;
    }
    /**
     * 
     * @param cardType Credit, Checking or Saving.
     */
    public void setCardType(String cardType){
        this.cardType = cardType;
    }
    /**
     * 
     * @param nameOfHolder Costumer name.
     */
    public void setNameOfHolder(String nameOfHolder){
        this.nameOfHolder = nameOfHolder;
    }
    /**
     * 
     * @param nameOfRecipient Person that interact with costumer.
     */
    public void setNameOfRecipien(String nameOfRecipient){
        this.nameOfRecipient=nameOfRecipient;
    }
    /**
     * 
     * @param balance Set initial balance from card type.
     * 
     */
    public void setBalance(int balance){
        this.balance = balance;
    }
    /**
     * 
     * @param amount set amount sent, witdraw or deposit.
     */
    public void setAmount(int amount){
        this.amount = amount;
    }

    /**
     * To create a new balance inquiry log by initializing.
     * @param nameOfHolder is the name of the client: unique
     * @param cardType there should be 3 options, Saving, checking, and credit.
     * @param cardNumber we should add an id or number to the card.
     * @param balance depends on the cardTye and number the balance for that especific card.
     */
     public void balanceInquiry(String nameOfHolder,String cardType, int cardNumber,int balance){
        System.out.println(nameOfHolder+" made a balance inquiry on " +cardType+"-"+cardNumber+"."+nameOfHolder+"'s Balance for "+cardType+"-"+cardNumber+":$"+balance);
    }
    /**
     * To create a new "paid to" log by initializing.
     * @param nameOfHolder
     * @param nameOfRecipient can be a sender or a receiver.
     * @param balance
     * @param cardNumber
     * @param cardType
     * @param amount 
     */
    public void paidTo(String nameOfHolder,String nameOfRecipient,String cardType, int cardNumber,int balance){
        this.nameOfHolder = nameOfHolder;
        this.nameOfRecipient = nameOfRecipient;
        System.out.println(nameOfHolder+" paid " +nameOfRecipient+"$"+amount+" from "+cardType+"-"+cardNumber+"."+nameOfHolder+"'s New Balance for "+cardType+"-"+cardNumber+":$"+balance);

    }
    /**
     * To create a new "received from" log by initializing
     * @param nameOfHolder
     * @param nameOfRecipient can be a sender or a receiver.
     * @param balance
     * @param cardNumber
     * @param cardType
     * @param amount 
     */
    public void receivedFrom(String nameOfHolder,String nameOfRecipient, int cardNumber,String cardType,int balance, int amount){
        this.nameOfHolder = nameOfHolder;
        this.nameOfRecipient = nameOfRecipient;
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.balance = balance;
        System.out.println(nameOfHolder + " received $"+amount+ " from " + nameOfRecipient + ".");
        updateBalanceMessage(balance, nameOfHolder, cardType, cardNumber);
    }
    /**
     * Print the update balance message
     * @param balance
     * @param nameOfHolder
     * @param cardType
     * @param cardNumber
     */
    public void updateBalanceMessage(int balance,String nameOfHolder,String cardType,int cardNumber){
        this.balance = balance;
        this.nameOfHolder = nameOfHolder;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        System.out.println(nameOfHolder+"'s New Balance for "+cardType+"-"+cardNumber+":$"+balance);
        
    }

    @Override
    public String toString(){
        
        return nameOfHolder + "'s New Balance for " + cardType + "-"+cardNumber+":$"+balance;
    }

}

