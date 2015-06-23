package entity;

/**
 * Created by Pavel on 10.06.2015.
 */
public class Symbol implements Leaf<Symbol> {
    private char symbol;

    public Symbol(){}

    public Symbol(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public Symbol replace(Symbol symbol, Symbol newSymbol) {
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
//        return null;
//    }
}
