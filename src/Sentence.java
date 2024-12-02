import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<Word> words;
    private Punctuation punctuation;

    public Sentence(String sentence) {
        words = new ArrayList<>();
        String[] wordArray = sentence.trim().split("\\s+");
        for (String word : wordArray) {
            if (".!?".indexOf(word.charAt(word.length() - 1)) != -1) {
                punctuation = new Punctuation(word.charAt(word.length() - 1));
                word = word.substring(0, word.length() - 1);
            }
            words.add(new Word(word));
        }
    }

    public List<Word> getWords() {
        return words;
    }

    public Punctuation getPunctuation() {
        return punctuation;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            result.append(words.get(i).toString());
            if (i < words.size() - 1) {
                result.append(" ");
            }
        }
        if (punctuation != null) {
            result.append(punctuation);
        }
        return result.toString();
    }
}
