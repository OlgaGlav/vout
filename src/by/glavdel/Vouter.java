package by.glavdel;


public class Vouter {
    private int voutForCandidate;

    public void vote() {
        voutForCandidate = (int) (Math.random() * 100);
    }

    public int getVoutForCandidate() {
        return voutForCandidate;
    }
}
