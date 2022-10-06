package OOPPart1;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("Seyi", 1245.60,"seyi@yahoo.com");

    }

    public VipCustomer(double creditLimit, String email) {
        this("feyi",creditLimit,email);

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
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {
        VipCustomer getSavedField = new VipCustomer("Set",145.67,"set.com");
        System.out.println("saved is "+(getSavedField.getCreditLimit()));

        VipCustomer getEmptyConstructor = new VipCustomer();
        System.out.println(getEmptyConstructor.getCreditLimit());

        VipCustomer getDefaultValue = new VipCustomer(345.0,"feyisara@yahoo.com");
        System.out.println(getDefaultValue.getName());
    }
}
