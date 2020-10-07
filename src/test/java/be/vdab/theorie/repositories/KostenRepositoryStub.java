package be.vdab.theorie.repositories;

import java.math.BigDecimal;

public class KostenRepositoryStub implements KostRepository {
    @Override
    public BigDecimal findTotaleKost() {
        return BigDecimal.valueOf(169);
    }
}
