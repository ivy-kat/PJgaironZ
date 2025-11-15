
public class Main{
    public static void main(String args[]) {
        GameManager.debugMode=true;
        GameManager.showTitle();

        Player.chooseHands();

        String result=Judge.judgeResult(Player.hands[0], Player.hands[1]);
        Display.showResult(result);

        GameManager.endGame();
    }
}
