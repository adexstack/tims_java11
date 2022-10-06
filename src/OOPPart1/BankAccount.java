package OOPPart1;

//Do not call other methods or setters within the constructor (Best practise) tips
public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("56789", 2.50, "Default name", "Default address","default phone"); //constructor chaining . calling with default parameters
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double accountBalance, String name, String email, String phoneNumber) {
        System.out.println("BankAccount constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String name, String email, String phoneNumber) {
        this("99999",100.55,name,email,phoneNumber); // setting accountNumber and accountBalance as default parameters
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFund(int amount){
        if(amount>=0){
             this.accountBalance += amount;
        } else {
            System.out.println("No deposit made "+this.accountBalance);
        }
    }

    public void withdrawFund(int withdrawalAmount){
        if(withdrawalAmount<this.accountBalance){
             this.accountBalance -= withdrawalAmount;
        } else {
            System.out.println("Not sufficient fund. balance is :"+this.accountBalance);
        }
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.withdrawFund(50);
        ba.setAccountBalance(100);
        ba.depositFund(50);
        System.out.println(ba.getAccountBalance());
        ba.withdrawFund(50);
        System.out.println(ba.accountBalance);
        ba.withdrawFund(500);
        System.out.println(ba.accountBalance);

        BankAccount femAccount = new BankAccount();
        System.out.println(femAccount.name + " "+femAccount.email);

        BankAccount timAccount = new BankAccount("Seyi","tim@gmail.com","12345");
        System.out.println(timAccount.getAccountNumber()+" "+timAccount.getName());

    }
}
