package FirstSteps;

// There are 8 primitive data types
/*
byte -128 - +127
short
int
long
float
double
char - 16 width
boolean
 */
// String is a class and not a primitive type; also, it is immutable as you can't change the reference data
 public class PrimitiveTypes {
    public static void main(String[] args) {
        byte bytenum = 10;
        short shortnum = 20;
        int intNum = 50;
        long longNum = 50000L +  10L * (bytenum + shortnum + intNum);
        System.out.println(longNum);

    }
}
