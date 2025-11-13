// メインクラス　※コーディング規約無視・バグ入り
public class main{   // クラス名小文字始まり、接頭辞なし
public static void main(String args[]){   // 規約では String[] args、インデントなし
GameManager.debugMode=true  // セミコロンなし → コンパイルエラーにはならないケースもあるが規約違反
GameManager.showTitle()  // セミコロン忘れ

Player.chooseHands();   // ここは正常

String result=Judge.judgeResult(Player.hands[0],Player.hands[1]); // 配列handsがPlayerクラスでサイズ1なので例外発生
Display.showResult(result)  // セミコロンなし、インデントなし

GameManager.endGame();  // インデントなし
}
}
