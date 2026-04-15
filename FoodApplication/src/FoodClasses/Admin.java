package FoodClasses;
public class Admin extends Person {
   private String email;
    public void setEmail(String email){
        this.email = email;
    }
    @Override
    public String displayInfo() {
        return "Email: "+email + super.displayInfo();
    }    
}