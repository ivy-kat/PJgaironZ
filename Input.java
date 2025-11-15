import java.io.Console;
import java.util.Scanner;

// 担当者の名前を書いてください

public class Input {
    public static int getHiddenInput(String iPlayerName) {
        Console console = System.console();
        String tInput;

        if (console == null) {
            System.out.print(iPlayerName + " の手を入力してください (0:グー, 1:チョキ, 2:パー): ");
            tInput = new Scanner(System.in).nextLine();
        } else {
            char[] chars = console.readPassword(iPlayerName + " の手を入力してください (0:グー, 1:チョキ, 2:パー): ");
            tInput = new String(chars);
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