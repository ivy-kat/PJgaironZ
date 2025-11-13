public class GameManager {

    // 共通のグローバル変数
    public static boolean debugMode = false;

    // ===== 各メンバーが追加・修正する予定のメソッド群 =====
    // ※チーム全員がこのファイルを編集する（衝突ポイント）

    // (Displayクラス担当) 初期メッセージやタイトル表示など
    public static void showTitle() {
        System.out.println("=== チーム開発版：じゃんけんゲーム ===");
    }

    // (Inputクラス担当) デバッグログ出力
    public static void log(String text) {
        if (debugMode) {
            System.out.println("[DEBUG] " + text);
        }
    }

    // (Judgeクラス担当) 手の名前を取得する関数
    public static String handName(int hand) {
        switch (hand) {
            case 0: return "グー";
            case 1: return "チョキ";
            case 2: return "パー";
            default: return "不明";
        }
    }

    // (Mainクラス担当) 勝敗メッセージ生成関数
    public static String makeResultMessage(String name, boolean win, boolean draw) {
        if (draw) return "あいこです。";
        if (win) return name + " の勝ち！";
        return name + " の負け。";
    }

    // (Playerクラス担当) 終了処理や再戦確認など（例）
    public static void endGame() {
        System.out.println("ゲームを終了します。");
    }

    // ==========================================================
}
