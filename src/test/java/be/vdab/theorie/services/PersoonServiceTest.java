package be.vdab.theorie.services;

import be.vdab.theorie.repositories.PersoonRepositoryStub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.*;


class PersoonServiceTest {
    private PersoonService service;
    @BeforeEach

    void beforeEach(){
        service = new PersoonService(new PersoonRepositoryStub());
    }

    @Test
    void deWeddeStandaardAfwijking2Is() throws IOException{
        assertThat(service.standaardAfwijkingWeddes()).isEqualByComparingTo("2");
    }

}