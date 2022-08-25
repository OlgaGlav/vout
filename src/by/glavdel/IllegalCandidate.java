package by.glavdel;

public class IllegalCandidate extends AbstractCandidate {

    private static final int MIN_INDEX_CANDIDATE = 0;
    private static final int MAX_INDEX_CANDIDATE = 3;

    public IllegalCandidate() {
        super(MIN_INDEX_CANDIDATE, MAX_INDEX_CANDIDATE);
    }

    @Override
    public String toString() {
        return "IllegalCandidate";
    }
}
