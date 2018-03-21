import java.util.HashMap;
import java.util.Map;

public class Task16Loops {
    public static void main(String[] args) {
        String word = "asdJasdasdsjaJAdadasudHAHAJSJASsadjayADdkasf";
        Map<Character, Integer> integerMap = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char someChar = word.charAt(i);
            if(Character.isLowerCase(someChar)){
                if(integerMap.containsKey(someChar)){
                    integerMap.put(someChar, integerMap.get(someChar) + 1);
                }else{
                    integerMap.put(someChar, 0);
                }
            }
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : integerMap.entrySet()) {
            System.out.println(characterIntegerEntry.getKey() + " : " + characterIntegerEntry.getValue());
        }
    }
}
