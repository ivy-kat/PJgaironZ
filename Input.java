import java.io.Console;
import java.util.Scanner;

// 担当者の名前を書いてください

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

        //TODO: 範囲checkをしていないので修正する必要がある
        try{
            return Integer.parseInt(tInput.trim());
        }catch(NumberFormatException e){
            System.out.println("入力が無効です。0〜2の数字を入力してください。");
            return getHiddenInput(iPlayerName);
        }
    }
}