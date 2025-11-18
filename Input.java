import java.io.Console;
import java.util.Scanner;

/**
 * Inputクラス
 * プレイヤーの手の入力を非表示で受け取る
 * 担当者: [あなたの名前]
 */
public class Input {
    public static int getHiddenInput(String iPlayerName) {
        Console tConsole = System.console();
        String tInput;

        // コンソールが利用できない場合は通常の入力にフォールバック
        if (tConsole == null) {
            System.out.print(iPlayerName + " の手を入力してください (0:グー, 1:チョキ, 2:パー): ");
            tInput = new Scanner(System.in).nextLine();
        } else {
            char[] tChars = tConsole.readPassword(iPlayerName + " の手を入力してください (0:グー, 1:チョキ, 2:パー): ");
            tInput = new String(tChars);
        }

        //20251118片岡 入力範囲のcheck機能を追加
        try {
            int tHand = Integer.parseInt(tInput.trim());
            if(tHand < 0 || tHand > 2) {
                System.out.println("範囲外の数字です。0〜2の数字を入力してください。");
                return getHiddenInput(iPlayerName);
            }
            return tHand;
        } catch(NumberFormatException e) {
            System.out.println("入力が無効です。0〜2の数字を入力してください。");
            return getHiddenInput(iPlayerName);
        }
    }
}