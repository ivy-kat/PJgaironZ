/**
 * GameManagerクラス
 * ゲーム全体の管理を担当
 */
public class GameManager {

    // 共通のグローバル変数
    public static boolean sDebugMode = false;

    // ===== 各メンバーが追加・修正するメソッド群 =====
    // ※チーム全員がこのファイルを編集する（衝突ポイント）

    // (Displayクラス担当) 初期メッセージやタイトル表示など
    public static void showTitle() {
        System.out.println("=== チーム開発版：じゃんけんゲーム ===");
    }

    // (Inputクラス担当) デバッグログ出力
    public static void log(String iText) {
        if (sDebugMode == true) {
            System.out.println("[DEBUG] " + iText);
        }
    }

    // (Judgeクラス担当) 手の名前を取得する関数
    public static String handName(int iHand) {
        String oStr;
        switch (iHand) {
            case 0: {
                oStr = "グー";
                break;
            }
            case 1: {
                oStr = "チョキ";
                break;
            }
            case 2: {
                oStr = "パー";
                break;
            }
            default: {
                oStr = "不明";
            }
        }
        return oStr;
    }

    // (Mainクラス担当) 勝敗メッセージ生成関数
    public static String makeResultMessage(String iName, boolean iWin, boolean iDraw) {
        String oStr = iName + " の負け。";
        if (iDraw == true) {
            oStr = "あいこです。";
        }
        if (iWin == true) {
            oStr = iName + " の勝ち！";
        }
        return oStr;
    }

    // (Playerクラス担当) 終了処理や再戦確認など（例）
    public static void endGame() {
        System.out.println("ゲームを終了します。ありがとうございました！");
    }

    // ==========================================================
}
