/**
 * Playerクラス
 * プレイヤー情報と手の選択を担当
 * 担当者: [あなたの名前]
 */
public class Player {
    public static String sNames[] = {"P1","P2"};
    public static int sHands[] = new int[2];

    // プレイヤーの手を選択するメソッド
    public static void chooseHands() {
        for(int i = 0; i < sNames.length; i++) {
            sHands[i] = Input.getHiddenInput(sNames[i]);
        }
    }
}
