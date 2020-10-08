package be.vdab.util;

public class WoordenTeller {
    public static int telWoorden(String zin){
        var aantalWoorden = 0;
        var index = 0;

        while (index != zin.length()){
            while(index != zin.length() && zin.charAt(index) == ' ' || zin.charAt(index) == ','){
                index++;
            }
            if (index != zin.length() && index != zin.length()){
                aantalWoorden++;
                while (index != zin.length() && zin.charAt(index) != ' ' && zin.charAt(index) != ','){
                    index++;
                }
            }
        }
        return aantalWoorden;
    }
    public static int telWoorden2(String zin){
        return (int) zin.replaceAll(","," ")
                        .replaceAll("\\s+"," ")
                        .strip().chars().filter(c->c==' ')
                        .count()+1;
    }
}
