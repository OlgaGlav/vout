package by.glavdel;

public class AbstractCandidate {
    private final int MAX_INDEX_CANDIDAT;
    private final int MIN_INDEX_CANDIDAT;

    public AbstractCandidate(int MIN_INDEX_CANDIDAT, int MAX_INDEX_CANDIDAT) {
        this.MAX_INDEX_CANDIDAT = MAX_INDEX_CANDIDAT;
        this.MIN_INDEX_CANDIDAT = MIN_INDEX_CANDIDAT;
    }

    public int getMAX_INDEX_CANDIDAT() {
        return MAX_INDEX_CANDIDAT;
    }

    public int getMIN_INDEX_CANDIDAT() {
        return MIN_INDEX_CANDIDAT;
    }

}
