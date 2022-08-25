package by.glavdel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {

    List<Vouter> vouters = new ArrayList<>();

    Map<AbstractCandidate, Integer> results = new HashMap<>();
    AbstractCandidate illegal = new IllegalCandidate();
    AbstractCandidate random = new RandomCandidate();
    AbstractCandidate official = new OfficialCandidate();

    public Result(int quantityVouters) {
        for (int i = 0; i < quantityVouters; i++) {
            vouters.add(new Vouter());
        }
    }

    public AbstractCandidate findWinner() {
        results.put(illegal, 0);
        results.put(random, 0);
        results.put(official, 0);
        for (Vouter vouter : vouters) {
            vouter.vote();
            int voice = vouter.getVoutForCandidate();

            if (voice <= illegal.getMAX_INDEX_CANDIDAT() && voice >= illegal.getMIN_INDEX_CANDIDAT()) {
                results.put(illegal, results.get(illegal) + 1);

            } else if (voice <= random.getMAX_INDEX_CANDIDAT() && voice >= random.getMIN_INDEX_CANDIDAT()) {
                results.put(random, results.get(random) + 1);

            } else {
                results.put(official, results.get(official) + 1);
            }

        }

        if (results.get(official) >= results.get(random) && results.get(official) >= results.get(illegal)) {
            return new OfficialCandidate();

        } else if (results.get(official) < results.get(random) && results.get(random) >= results.get(illegal)) {
            return new RandomCandidate();
        }

        return new IllegalCandidate();
    }
}
