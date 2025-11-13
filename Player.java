// プレイヤークラス　※コーディング規約無視・バグ入り
public class player {  // クラス名小文字始まり、接頭辞なし
public static String names[]={"P1","P2"}; // 配列の型と[]の位置が乱れている、変数名a,bではないが短すぎ
public static int hands[]=new int[1]; // 2人なのに配列サイズ1 → 実行時にArrayIndexOutOfBoundsの可能性

public static void chooseHands(){   // インデントガタガタ
for(int i=0;i<names.length;i++) // 中かっこ省略
hands[i]=Input.getHiddenInput(names[i]);  // 配列サイズ1なのでi=1で例外
}
}
