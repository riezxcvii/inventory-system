
package Server;

public class UserData {
    private int id;
    private String type;
    private String username;
    private String password;
    private String last;
    private String first;
    private String address;
    private String mobile;
    private String email;
    private boolean present;
    
    public int getUserId(){
        return id;
    }
    public void setUserId(int id){
        this.id = id;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
     public String getUserName(){
        return username;
    }
    public void setUserName(String username){
        this.username = username;
    }
     public String getPass(){
        return password;
    }
    public void setPass(String password){
        this.password = password;
    }
     public String getLast(){
        return last;
    }
    public void setLast(String last){
        this.last = last;
    } public String getFirst(){
        return first;
    }
    public void setFirst(String first){
        this.first = first;
    } public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
     public String getMobile(){
        return mobile;
    }
    public void setMobile(String mobile){
        this.mobile = mobile;
    }
     public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public boolean getPresent(){
        return present;
    }
    public void setPresent(boolean present){
        this.present = present;
    }
    
    
}
