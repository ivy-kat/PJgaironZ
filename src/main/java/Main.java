/**
 * Mainクラス
 * ゲームの開始・終了処理を担当
 * 担当者: [あなたの名前]
 */
public class Main{
    public static void main(String args[]) {
        // デバッグモードON
        GameManager.sDebugMode=true;
        // ゲーム開始処理
        GameManager.showTitle();

        // プレイヤーの手選択
        Player.chooseHands();

        // 勝敗判定
        String result = Judge.judgeResult(Player.sHands[0], Player.sHands[1]);
        // 結果表示
        Display.showResult(result);
        // 終了処理
        GameManager.endGame();
    }
}
