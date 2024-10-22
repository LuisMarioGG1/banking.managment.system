public abstract class Person {
     /** First name of individual*/
     private String firstName;
     /** Last name of individual*/
     private String lastName;
     /** Date of birth of individual*/
     private String dob;
     /** Address of individual*/
     private String address;
     /** Phone number of individual*/
     private String phoneNum;
    /**
     * Update name.
     * @param name
     */
    public void setFirstName(String fName){
        this.firstName = fName;
    }
    public void setLastName(String lName){
        this.lastName = lName;
    }
    public void setDob(String dob){
        this.dob = dob;
    }

    /**
     * Update the address.
     * @param address
     */
    public void setAddress(String address){
        this.address = address;
    }
    /**
     * Update the phone number.
     * @param phoneNum
     */
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }
    /**
     * 
     * @return the name of the Person.
     */
    public String getFirstName(){
        return this.firstName;
    }
    /**
     * 
     * @return Last name
     */
    public String getLastName(){
        return this.lastName;
    }
    /**
     * 
     * @return Date of birth 
     */
    public String getDob(){
        return this.dob;
    }
    /**
     * 
     * @return the address of the Person.
     */
    public String getAddress(){
        return address;
    }
    /**
     * 
     * @return the phone number of the Person.
     */
    public String getPhoneNum(){
        return phoneNum;
    }
}

