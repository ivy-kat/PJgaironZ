/**
 * Displayクラス
 * 結果表示を担当
 * 担当者: [あなたの名前]
 */
public class Display {
    // 結果表示メソッド
    public static void showResult(String iResult) {
        System.out.println("==== 結果発表 ====");
        System.out.println(Player.sNames[0] + "：" + GameManager.handName(Player.sHands[0]));
        System.out.println(Player.sNames[1] + "：" + GameManager.handName(Player.sHands[1]));
        System.out.println("------------------");
        System.out.println(iResult);
    }
}
