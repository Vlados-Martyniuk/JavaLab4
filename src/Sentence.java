/**
 * Клас, що представляє речення, яке складається зі слів і пунктуації.
 */
import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<Word> words;
    private Punctuation punctuation;

    /**
     * Конструктор для створення об'єкта речення.
     *
     * @param sentence текстове представлення речення
     */
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

    /**
     * Повертає список слів у реченні.
     *
     * @return список слів
     */
    public List<Word> getWords() {
        return words;
    }

    /**
     * Повертає пунктуацію в кінці речення.
     *
     * @return пунктуаційний символ або null, якщо відсутній
     */
    public Punctuation getPunctuation() {
        return punctuation;
    }

    /**
     * Повертає текстове представлення речення.
     *
     * @return речення як рядок
     */
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
