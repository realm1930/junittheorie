package be.vdab.theorie.services;

import be.vdab.theorie.repositories.CSVPersoonRepository;
import be.vdab.theorie.repositories.PersoonRepository;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class PersoonService {
    private final PersoonRepository respository;

    public PersoonService(PersoonRepository respository) {
        this.respository = respository;
    }

    public BigDecimal standaardAfwijkingWeddes() throws IOException {
        var weddes = respository.findAllWeddes();
        var totaal = BigDecimal.ZERO;
        for (var wedde : weddes){
            totaal = totaal.add(wedde);
        }
        var gemiddelde = totaal.divide(BigDecimal.valueOf(weddes.length),2, RoundingMode.HALF_UP);
        totaal = BigDecimal.ZERO;
        for (var wedde:weddes){
            var verschil = wedde.subtract(gemiddelde);
            var kwadraat = verschil.pow(2);
            totaal = totaal.add(kwadraat);
        }
        var variantie = totaal.divide(BigDecimal.valueOf(weddes.length),2,RoundingMode.HALF_UP);
        var standaardAfwijking = BigDecimal.valueOf(Math.sqrt(variantie.doubleValue()));
        return standaardAfwijking;
    }
}
