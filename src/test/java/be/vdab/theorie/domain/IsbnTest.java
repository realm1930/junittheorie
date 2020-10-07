package be.vdab.theorie.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.*;

class IsbnTest {
    /**
     * 9789027439642 -> correct
     */

    @ParameterizedTest
    @ValueSource(longs = {0,-1L,978902743964L,97890274396421L,9779027439642L,9789027439641L,9789027439643L})
    void verkeerdGetal(long nummer){
        assertThatIllegalArgumentException().isThrownBy(()->new Isbn(nummer));
    }
    @Test
    void eenNummerMet13CijfersMetCorrectControleGetal2(){
        new Isbn(9789027439642L);
    }


    @Test
    void toStringMoetHetNummerTeruggeven(){
        assertThat(new Isbn(9789027439642L)).hasToString("9789027439642");
    }

}