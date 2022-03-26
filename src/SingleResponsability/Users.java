package SingleResponsability;

public class Users {
    private String surName;
    private String lastName;
    private String address;

    public String getSurName(){
        return surName;
    }
    public void setSurName(String surName){
        this.surName = surName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }
}
