package entity;

/**
 * Created by Pavel on 10.06.2015.
 */
public class Word extends AbstractComposite<Letter> implements Composite<Letter> {
    private String word;
    private char letter;

    //public Word(){}

    public Word(String word) {
        super();
        for (int i=0; i<word.length();i++)
            this.letter=word.charAt(i);
    }

    @Override
    public void add(Letter letters) {
        super.add(letters);
    }
//
    public char getLetter(String word){
        for (int i=0; i<word.length();i++)
            this.letter=word.charAt(i);
        return letter;
    }

    @Override
    public Letter get(int index) {
        return null;
    }

    @Override
    public Letter remove(int index) {
        return null;
    }

    @Override
    public Letter remove(Letter element) {
        return null;
    }

//    @Override
//    public String completeString() {
//        return super.completeString();
//    }
}
