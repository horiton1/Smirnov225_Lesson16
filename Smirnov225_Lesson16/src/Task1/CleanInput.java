package Task1;

public class CleanInput {
    public String fixString(String str) {
        return str.isBlank() ? "Вы ничего не ввели!" : str.trim();
    }
}