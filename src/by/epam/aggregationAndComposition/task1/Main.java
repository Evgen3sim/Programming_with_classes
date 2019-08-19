package by.epam.aggregationAndComposition.task1;

/*Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

public class Main {
    public static void main(String[] args) {

        Word word = new Word("Study");

        Text text = new Text(word);

        Word word1 = new Word("Hello");
        Word word2 = new Word("my name is");
        Word word3 = new Word("Evgeny");

        Sentence sentence = new Sentence();
        sentence.addSentence(word1);
        sentence.addSentence(word2);
        sentence.addSentence(word3);

        text.addBody(sentence);

        System.out.println("  " + text.getHeader());
        System.out.println(" " + text.getBody());

    }
}
