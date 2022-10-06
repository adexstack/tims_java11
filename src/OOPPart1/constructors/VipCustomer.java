package OOPPart1.constructors;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("Seyi",1500.50,"seyi@yahoo.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name,creditLimit,"ken@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        System.out.println(creditLimit);
        return creditLimit;
    }

    public String getEmail() {
        System.out.println(email);
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        VipCustomer person1 = new VipCustomer();
        person1.setEmail("dan@email.com");
        person1.getEmail();
        VipCustomer person2 = new VipCustomer("Femi", 5000);
        person2.getEmail();
        person2.getCreditLimit();
        VipCustomer person3 = new VipCustomer("Dan",10.200,"steve@gmail.com");
        person3.getEmail();    }
}
