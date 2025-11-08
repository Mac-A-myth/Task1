import java.util.*;

public class UniqueWords {
    public static void main(String[] args) {
        String paragraph = "Java is fun and Java is powerful";
        String[] words = paragraph.split(" ");
        Set<String> unique = new HashSet<>();

        for (String w : words)
            unique.add(w.toLowerCase());

        System.out.println("Unique words: " + unique);
    }
}
