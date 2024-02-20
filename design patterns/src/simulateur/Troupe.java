package simulateur;

import java.util.ArrayList;
import java.util.List;

public class Troupe implements Cancaneur {
    private List<Cancaneur> troupes = new ArrayList<>();

    public void add(Cancaneur canard) {
        troupes.add(canard);
    }



    public void cancaner() {
        for (Cancaneur troupes: troupes) {
            troupes.cancaner();
        }
    }
}

