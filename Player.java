
public class Player {
    public static String sNames[] = {"P1","P2"};
    public static int sHands[] = new int[2];
    public static void chooseHands() {
        for(int i = 0; i < sNames.length; i++) {
            sHands[i]=Input.getHiddenInput(sNames[i]);
        }
    }
}
