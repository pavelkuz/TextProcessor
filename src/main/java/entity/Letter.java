package entity;

/**
 * Created by Pavel on 12.06.2015.
 */
public class Letter extends Symbol {
    private boolean letterCase;

    public Letter(char symbol, boolean letterCase) {
        super(symbol);
        this.letterCase=letterCase;
    }

    @Override
    public char getSymbol() {
        return super.getSymbol();
    }

    private boolean isUpperCase(String symbol){
        if(symbol!=symbol.toUpperCase())
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
    public void add(Symbol element) {

    }

    @Override
    public Symbol remove(int index) {
        return null;
    }

    @Override
    public Symbol remove(Symbol element) {
        return null;
    }

    @Override
    public String completeString() {
        return super.completeString();
    }
}
