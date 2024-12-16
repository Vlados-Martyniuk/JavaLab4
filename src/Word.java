/**
 * Клас, що представляє слово, яке складається з літер.
 */

import java.util.ArrayList;
import java.util.List;


public class Word {
    private List<Letter> letters;

    /**
     * Конструктор для створення об'єкта слова.
     *
     * @param word текстове представлення слова
     */
    public Word(String word) {
        letters = new ArrayList<>();
        for (char c : word.toCharArray()) {
            letters.add(new Letter(c));
        }
    }

    /**
     * Повертає текстове представлення слова.
     *
     * @return слово як рядок
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Letter letter : letters) {
            result.append(letter.getValue());
        }
        return result.toString();
    }
}
