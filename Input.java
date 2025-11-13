import java.io.Console;
import java.util.Scanner;

// 入力クラス ※規約違反・バグ入り
public class input{   // クラス名小文字、接頭辞なし
public static int getHiddenInput(playerName){   // 引数型指定なし、規約違反
Console console=System.console()  // セミコロンなし
String input;  // インデントなし

if(console==null)  // 中かっこ省略
System.out.print(playerName+" の手を入力してください (0:グー,1:チョキ,2:パー): ") // セミコロンなし
input=new Scanner(System.in).nextLine()  // Scannerリソース未クローズ

else{  // インデント乱れ
char[] chars=console.readPassword(playerName+" の手を入力してください (0:グー,1:チョキ,2:パー): ")
input=new String(chars)  // セミコロンなし
}

try{
return Integer.parseInt(input.trim())  // セミコロンなし
}catch(NumberFormatException e){
System.out.println("入力が無効です。0〜2の数字を入力してください。")
return getHiddenInput(playerName)  // 再帰呼び出し、型チェックなし
}
}
