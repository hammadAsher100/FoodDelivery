package FoodClasses;

public class Person {
    private String name;
    private String contact;
    
    public void setName(String name){
        this.name = name;
    }
    public boolean setContact(String contact){
        if (contact !=null&& contact.length()== 10 || contact.length()== 11){
            this.contact = contact;
            return true;
        }
        else{
            return false;
        }
    }
    public String getName() {
        return name;
    }
    public String displayInfo(){
        return "\n\nContact:  "+contact;
    }
}