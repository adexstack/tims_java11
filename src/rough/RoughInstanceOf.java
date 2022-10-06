package rough;

class Animal {
}

class Dog extends Animal {
    /*public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d instanceof Dog);

        Dog d2 = null;
        System.out.println(d2 instanceof Dog);

        //Dog d3 = new Animal(); //(Downcasting) Compilation error
        Dog d4 = (Dog) new Animal(); // Downcasting by typecasting ; ClassCastException at runtime
    }*/

    // Using instanceof to smartly downcast
    static void method(Animal a) {
        if (a instanceof Dog) {
            Dog d = (Dog) a;
            System.out.println("ok downcasting performed");

        }
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        Dog.method(a);
    }
}


