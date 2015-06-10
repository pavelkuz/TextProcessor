package entity;

/**
 * Created by Pavel on 10.06.2015.
 */
public class PunctuationMark extends Symbol {
    private boolean itSentenceEnd;
    public PunctuationMark(char symbol) {
        super(symbol);
    }

    public boolean isItSentenceEnd(char symbol){
        if((symbol == '.') || (symbol == '!') || (symbol == '?'))
            this.itSentenceEnd=true;
        return itSentenceEnd;
    }
}
