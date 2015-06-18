package entity;

/**
 * Created by Pavel on 10.06.2015.
 */
public class PunctuationMark extends Symbol {
    private boolean itSentenceEnd;
    public PunctuationMark(char symbol,boolean itSentenceEnd) {
        super(symbol);
        this.itSentenceEnd=itSentenceEnd;
    }

    public boolean isItSentenceEnd(char symbol){
        if((symbol == '.') || (symbol == '!') || (symbol == '?'))
            this.itSentenceEnd=true;
        return itSentenceEnd;
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
