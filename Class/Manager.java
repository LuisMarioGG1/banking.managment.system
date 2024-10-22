public class Manager extends Person {
    private boolean adminPrivilige;

    

    public void setAdminPrivilige(boolean adminPrivilige){
        this.adminPrivilige = adminPrivilige;
        System.out.println("Amdin privilige acquire");
    }
    public boolean getAdminPrivilige(){
        return adminPrivilige;
    }
}
