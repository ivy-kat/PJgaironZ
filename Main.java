
public class Main{
    public static void main(String args[]) {
        GameManager.sDebugMode=true;
        GameManager.showTitle();

        Player.chooseHands();

        String result=Judge.judgeResult(Player.sHands[0], Player.sHands[1]);
        Display.showResult(result);

        GameManager.endGame();
    }
}
