/**
 * Judgeクラス
 * 勝敗判定を担当
 * 担当者: [あなたの名前]
 */
public class Judge {
    // 勝敗判定メソッド
    public static String judgeResult(int iHand1, int iHand2) {
        String oStr;    // 結果メッセージ格納用変数
        if (iHand1 == iHand2) {     // あいこ
            oStr = GameManager.makeResultMessage("", false, true);
        } else if ((iHand1 == 0 && iHand2 == 1) 
                    || (iHand1 == 1 && iHand2 == 2) 
                    || (iHand1 == 2 && iHand2 == 0)) {  // プレイヤー1の勝ち
            oStr = GameManager.makeResultMessage(Player.sNames[0], true, false);
        } else {    // プレイヤー2の勝ち
            oStr = GameManager.makeResultMessage(Player.sNames[1], true, false);
        }
        return oStr;
    }
}
