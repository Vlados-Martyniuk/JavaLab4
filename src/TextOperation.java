import java.util.List;

public class TextOperation {
    public Text processText(Text text) {
        List<Sentence> sentences = text.getSentences();

        for (Sentence sentence : sentences) {
            List<Word> words = sentence.getWords();
            if (words.size() > 1) {
                Word firstWord = words.get(0);
                Word lastWord = words.get(words.size() - 1);

                words.set(0, lastWord);
                words.set(words.size() - 1, firstWord);
            }
        }
        return text;
    }
}
