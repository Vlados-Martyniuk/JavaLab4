/**
 * Клас, що представляє текст, який складається з речень.
 */
import java.util.ArrayList;
import java.util.List;


public class Text {
    private List<Sentence> sentences;

    /**
     * Конструктор для створення об'єкта тексту.
     *
     * @param text текстове представлення тексту
     */
    public Text(String text) {
        sentences = new ArrayList<>();
        String[] sentenceArray = text.split("(?<=\\.|\\!|\\?)");
        for (String sentence : sentenceArray) {
            sentences.add(new Sentence(sentence));
        }
    }

    /**
     * Повертає список речень у тексті.
     *
     * @return список речень
     */
    public List<Sentence> getSentences() {
        return sentences;
    }

    /**
     * Повертає текстове представлення тексту.
     *
     * @return текст як рядок
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Sentence sentence : sentences) {
            result.append(sentence.toString()).append(" ");
        }
        return result.toString().trim();
    }
}
