package be.vdab.theorie.domain;

import java.util.Objects;

public class Rechthoek {
    private final int lengte;
    private final int breedte;

    public Rechthoek(int lengte, int breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
    }

    public int getOppervlakte(){
        return lengte*breedte;
    }
    public int getOmtrek(){
        return (lengte+breedte)*2;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Rechthoek){
            var andereRechthoek = (Rechthoek) o;
            return lengte == andereRechthoek.lengte
                    && breedte == andereRechthoek.breedte;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lengte, breedte);
    }
}
