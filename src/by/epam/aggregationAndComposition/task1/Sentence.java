package by.epam.aggregationAndComposition.task1;

/*Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

public class Sentence {

    private String sentence="";

    public void addSentence(Word word){
        sentence += " " + word.getWord();
    }

    public String getSentence() {
        return sentence;
    }
}
