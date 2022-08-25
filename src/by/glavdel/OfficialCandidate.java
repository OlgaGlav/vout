package by.glavdel;

public class OfficialCandidate extends AbstractCandidate {
    private static final int MIN_INDEX_CANDIDATE = 41;
    private static final int MAX_INDEX_CANDIDATE = 100;

    public OfficialCandidate() {
        super(MIN_INDEX_CANDIDATE, MAX_INDEX_CANDIDATE);
    }

    @Override
    public String toString() {
        return "OfficialCandidate";
    }
}
