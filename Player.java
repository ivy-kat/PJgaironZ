
public class Player {
    public static String names[] = {"P1","P2"};
    public static int hands[] = new int[2];
    public static void chooseHands() {
        for(int i = 0; i < names.length; i++) {
            hands[i]=Input.getHiddenInput(names[i]);
        }
    }
}
