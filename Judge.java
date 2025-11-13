public class Judge {
public static String judgeResult(int hand1, int hand2) {
if (hand1 == hand2) {
return GameManager.makeResultMessage("", false, true);
} else if ((hand1 == 0 && hand2 == 1) || (hand1 == 1 && hand2 == 2) || (hand1 == 2 && hand2 == 0)) {
return GameManager.makeResultMessage(Player.names[1], true, false);
} else {
return GameManager.makeResultMessage(Player.names[0], true, false);
}
}
}
