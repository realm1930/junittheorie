package be.vdab.theorie.repositories;

import java.math.BigDecimal;

public class OpbrengstrepositoryStub implements OpbrengstRepository {
    @Override
    public BigDecimal findTotaleOpbrengst() {
        return BigDecimal.valueOf(200);
    }
}
