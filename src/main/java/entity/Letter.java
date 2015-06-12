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
}
