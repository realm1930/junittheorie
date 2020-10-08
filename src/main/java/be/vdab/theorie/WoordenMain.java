package be.vdab.theorie;

import be.vdab.util.WoordenTeller;

public class WoordenMain {
    public static void main(String[] args) {
        System.out.println(
                WoordenTeller.telWoorden2(
                        "Joske is geen jefke, polleke is geen joske")
        );
        System.out.println(
                WoordenTeller.telWoorden2(
                        "Joske      is geen ,,,jefke, polleke ,is geen joske")
        );
        System.out.println(
                WoordenTeller.telWoorden2(
                        "Joske is, geen flupke, , polleke is geen joske,,,  ")
        );
        System.out.println(
                WoordenTeller.telWoorden2(
                        ",, Joske is een jefke , polleke ,is geen joske")
        );
    }
}
