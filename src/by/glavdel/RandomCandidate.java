package by.glavdel;

public class RandomCandidate extends AbstractCandidate {
    private static final int MIN_INDEX_CANDIDATE = 4;
    private static final int MAX_INDEX_CANDIDATE = 40;

    public RandomCandidate() {
        super(MIN_INDEX_CANDIDATE, MAX_INDEX_CANDIDATE);
    }

    @Override
    public String toString() {
        return "RandomCandidate";
    }
}
