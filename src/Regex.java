import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[A-ZŁĄŻĆĘŹ][a-złążćęź]+", "Oskar"));
        System.out.println(Pattern.matches("\\d{2}-\\d{3}", "45-123"));
        System.out.println(Pattern.matches("(0048|\\+?48)? ?([0-9]{3}[- ]?){3}", "48 123 123 123"));

    }
}
