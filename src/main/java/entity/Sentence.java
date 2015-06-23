package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel on 10.06.2015.
 */
public class Sentence extends AbstractComposite<Word> implements Composite<Word> {
    public Sentence() {
        super();
    }

    @Override
    public Word get(int index) {
        return null;
    }

    @Override
    public Word remove(int index) {
        return null;
    }

    @Override
    public Word remove(Word element) {
        return null;
    }

    @Override
    public void add(Word word) {
        super.add(word);
    }
}
