 import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VowelsAndConsonants {

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        
        List<Character> inputChars = inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());

        List<Character> vowelList = inputChars.stream()
                .filter(c -> vowels.contains(c))
                .collect(Collectors.toList());

        List<Character> consonantList = inputChars.stream()
                .filter(c -> !vowels.contains(c) && Character.isAlphabetic(c))
                .collect(Collectors.toList());

        System.out.println("Vowels: " + vowelList);
        System.out.println("Consonants: " + consonantList);
    }
}


