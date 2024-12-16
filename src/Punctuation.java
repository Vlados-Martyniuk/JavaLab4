/**
 * Клас, що представляє символ пунктуації.
 */
public class Punctuation {
    private char value;

    /**
     * Конструктор для створення об'єкта пунктуаційного символу.
     *
     * @param value значення символу
     */
    public Punctuation(char value) {
        this.value = value;
    }

    /**
     * Повертає значення пунктуаційного символу.
     *
     * @return значення пунктуаційного символу
     */
    public char getValue() {
        return value;
    }

    /**
     * Повертає текстове представлення символу пунктуації.
     *
     * @return рядок із символом пунктуації
     */
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
