/**
 * Клас, що представляє одну літеру.
 */
public class Letter {
    private char value;

    /**
     * Конструктор для створення об'єкта літери.
     *
     * @param value значення літери
     */
    public Letter(char value) {
        this.value = value;
    }

    /**
     * Повертає значення літери.
     *
     * @return значення літери
     */
    public char getValue() {
        return value;
    }

    /**
     * Повертає текстове представлення літери.
     *
     * @return рядок із літерою
     */
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
