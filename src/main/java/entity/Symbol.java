package entity;

/**
 * Created by Pavel on 10.06.2015.
 */
public abstract class Symbol {
    private char symbol;

    public Symbol(char symbol){
        this.symbol=symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
