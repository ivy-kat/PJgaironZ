public class Display {
    public static void showResult(String iResult) {
        System.out.println("==== 結果発表 ====");
        System.out.println(Player.names[0] + "：" + GameManager.handName(Player.hands[0]));
        System.out.println(Player.names[1] + "：" + GameManager.handName(Player.hands[1]));
        System.out.println("------------------");
        System.out.println(iResult);
    }
}
