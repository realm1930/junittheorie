package be.vdab.theorie.services;

import be.vdab.theorie.repositories.KostenRepositoryStub;
import be.vdab.theorie.repositories.OpbrengstrepositoryStub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WinstServiceTest {
    private WinstService winstService;
    @BeforeEach
    void beforeEach(){
        winstService = new WinstService(new OpbrengstrepositoryStub(),new KostenRepositoryStub());
    }
    @Test
    void winstIsOpbrengstMinKost(){
        assertThat(winstService.getWinst()).isEqualByComparingTo("31");
    }

}