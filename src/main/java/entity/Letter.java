package entity;

/**
 * Created by Pavel on 12.06.2015.
 */
public class Letter extends Symbol {
    private String letter;
    private boolean isUpperCase;

    public Letter(String letter, boolean isUpperCase) {
        super();
        this.letter=letter;
        this.isUpperCase = isUpperCase;
    }

    @Override
    public char getSymbol() {
        return super.getSymbol();
    }

    private boolean isUpperCase(String letter) {
        if (letter != letter.toUpperCase())
            return false;
        else return true;
    }

    @Override
    public Symbol replace(Symbol element, Symbol newElement) {
        return null;
    }

    @Override
    public Symbol get(int index) {
        return null;
    }

    @Override
    public Symbol remove(int index) {
        return null;
    }

    @Override
    public Symbol remove(Symbol element) {
        return null;
    }

//    @Override
//    public String completeString() {
//        return super.completeString();
//    }
}
