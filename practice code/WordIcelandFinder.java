import java.util.*;

public class WordIcelandFinder {
    public static List<String> findWordIcelands(String text) {
        String[] words = text.split(" "); // Split words by space
        List<String> icelands = new ArrayList<>();
        StringBuilder currentIceland = new StringBuilder(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (shareCommonChar(words[i - 1], words[i])) {
                currentIceland.append(" ").append(words[i]);
            } else {
                icelands.add(currentIceland.toString());
                currentIceland = new StringBuilder(words[i]);
            }
        }
        icelands.add(currentIceland.toString()); // Add last Iceland
        return icelands;
    }

    private static boolean shareCommonChar(String word1, String word2) {
        for (char c : word1.toCharArray()) {
            if (word2.indexOf(c) != -1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        scanner.close();

        List<String> icelands = findWordIcelands(sentence);
        System.out.println("Word Icelands: " + icelands);
    }
}
