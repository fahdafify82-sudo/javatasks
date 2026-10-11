package Model;

public class Account {
    private String username;
    private String password;
    private String email;
    private double  balance;
   private int phoneNumber;
   private int age;
public Account(String username,String password,String email,int phoneNumber,int age){
    this.username=username;
    this.password=password;
    this.email=email;
    this.phoneNumber=phoneNumber;
    this.age=age;

}
    public Account() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

