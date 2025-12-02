package Task4;

public class Capitalizator {
    public String capitalize(String str) {
        var firstChar = str.substring(0, 1).toUpperCase();
        return firstChar + str.substring(1);
    }
}