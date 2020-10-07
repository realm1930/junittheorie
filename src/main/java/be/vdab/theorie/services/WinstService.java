package be.vdab.theorie.services;
import be.vdab.theorie.repositories.KostRepository;
import be.vdab.theorie.repositories.OpbrengstRepository;

import java.math.BigDecimal;

public class WinstService {
    private final OpbrengstRepository opbrengstRepository;
    private final KostRepository kostRepository;

    public WinstService(OpbrengstRepository opbrengstRepository, KostRepository kostRepository) {
        this.opbrengstRepository = opbrengstRepository;
        this.kostRepository = kostRepository;
    }

    BigDecimal getWinst(){
        return opbrengstRepository.findTotaleOpbrengst().subtract(kostRepository.findTotaleKost());
    }

}
