

public class Main {
    public static void main(String[] args) {

        String text = "Це перше речення. Ось друге речення з прикладом. А це третє!";
        System.out.println("Оригінальний текст:");
        System.out.println(text);

        TextOperation textProcessor = new TextOperation();
        Text inputText = new Text(text);

        try {
            Text processedText = textProcessor.processText(inputText);
            System.out.println("\nОброблений текст:");
            System.out.println(processedText);
        } catch (Exception e) {
            System.err.println("Виникла помилка: " + e.getMessage());
        }

    }
}