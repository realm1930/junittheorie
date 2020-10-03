package be.vdab.theorie.domain;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class JaarTest {
    @Test
    void eenJaarDeelbaarDoor400IsEenSchrikkeljaar(){
        var jaar = new Jaar(2000);
        Assertions.assertThat(jaar.isSchrikkeljaar()).isTrue();
    }
    @Test
    void eenJaarDeelbaarDoor100IsGeenSchrikkelhaar(){
        Assertions.assertThat(new Jaar(1900).isSchrikkeljaar()).isFalse();
    }
    @Test
    void eenJaarDeelbaarDoor4IsEenSchrikkeljaar() {
        Assertions.assertThat(new Jaar(2012).isSchrikkeljaar()).isTrue();
    }
    @Test
    void eenJaarNietDeelbaarDoor4IsGeenSchrikkeljaar() {
        Assertions.assertThat(new Jaar(2015).isSchrikkeljaar()).isFalse();
    }
    @Test
    void toStringGeeftHetJaarAlsTekst() {
        Assertions.assertThat(new Jaar(2015)).hasToString("2015");
    }

}
