package simulateur;

/**
 * 
 * @author i2202003 Alexandre GRASTEAU
 *
 */
public class AdaptateurDOie implements Cancaneur {
    private Oie oie;

    public AdaptateurDOie(Oie oie) {
        this.oie = oie;
    }

    @Override
    public void cancaner() {
        oie.cacarder();
    }
}