package methodsandexpressions;

public class PlayingCat {
    public static void main(String[] args) {
        isCatPlaying(false,35);

    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(temperature >= 25 && ((summer && temperature <=45) || (!summer && temperature <=35))){
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }
}
