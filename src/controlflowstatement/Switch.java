package controlflowstatement;

public class Switch {
    public static void main(String[] args) {
        char switchValue = 'J';

        switch(switchValue){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("I am: "+switchValue);
                break;

            default:
                System.out.println("Not found");
                break;
        }
    }
}
