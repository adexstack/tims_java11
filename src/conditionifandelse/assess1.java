package conditionifandelse;

public class assess1 {

    public static void main(String[] args) {


        int position = calculateHighScorePosition(1500);
        disPlayHighScorePosition("Steve", position);
        position = calculateHighScorePosition(900);
        disPlayHighScorePosition("Dave", position);
        position = calculateHighScorePosition(400);
        disPlayHighScorePosition("Grace", position);
        position = calculateHighScorePosition(50);
        disPlayHighScorePosition("Kevin", position);
        position = calculateHighScorePosition(1000);
        disPlayHighScorePosition("Dean", position);
        position = calculateHighScorePosition(500);
        disPlayHighScorePosition("Seyi", position);

    }

    public static void disPlayHighScorePosition(String name, int position) {
        System.out.println(name + " manage to get " + position + " position on the high score record");

    }

    public static int calculateHighScorePosition(int score) {
        /* Note that I removed redundant code score >= 500 && score <1000
        if(score >= 1000){
            return 1;
        }  else if(score >= 500){
            return 2;
        } else if(score >= 100){
            return 3;
        } else {
            return 4;
        }
*/
        int positionStand = 4;
        if (score >= 1000) {
            positionStand = 1;
        } else if (score >= 500) {
            positionStand = 2;
        } else if (score >= 100) {
            positionStand = 3;
        }
        return positionStand;
    }
}


