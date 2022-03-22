//Create Registration Class in which you would have
//        variables as email, userName and password that have an access scope only within its own class.
//        After creating an object of the class user should be able to
//        call methods and in each method separately pass
//        values to set users email, username and password.
//        Requirements:
//        A.Valid email consider to be only yahoo
//        B.Valid userName and password cannot be empty and
//        should be of length larger than 6 characters. Also
//        valid password cannot contain userName.


import java.sql.SQLOutput;

class Registration{
    private String email;
    private String userName;
    private String password;

    public String getEmail() {
        return email;
    }
    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
    public void setEmail(String email) {
        if (email.contains("@yahoo.com")){
                this.email = email;
        } else {
            System.out.println("Invalid email");
        }
    }
    public void setUserName(String userName) {
        if (userName.isBlank()) {
            System.out.println("Username cannot be blank");
        } else if (userName.length()>6){
                this.userName = userName;
            } else {
                System.out.println("Username must be at least 7 characters");
            }
        }

    public void setPassword(String password) {
        if (password.length()<7){
            System.out.println("Password must be at least 7 characters");
        } else if (password.contains(userName)){
            System.out.println("Password cannot contain Username");
        } else if(password.isBlank()){
            System.out.println("Password cannot be blank");
        } else {
            this.password = password;
        }
    }



}
public class GroupTask04 {
}
