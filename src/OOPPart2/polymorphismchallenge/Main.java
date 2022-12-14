package OOPPart2.polymorphismchallenge;

class Car{
    private  boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }

    }

class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}

class Nissan extends Car{

    public Nissan(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Nissan -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Nissan -> accelerate()";
    }

    @Override
    public String brake() {
        return "Nissan -> brake()";
    }
}

class Volvo extends Car{

    public Volvo(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +" -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +" -> brake()";
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Ford ford = new Ford(10,"Ford" );
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Volvo volvo = new Volvo(20,"Volvo" );
        System.out.println(volvo.startEngine());
        System.out.println(volvo.accelerate());
        System.out.println(volvo.brake());
    }

}
