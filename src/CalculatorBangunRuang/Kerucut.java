package CalculatorBangunRuang;

import static java.lang.Math.*;

public class Kerucut implements Hitung{

    double jarijari, tinggi,apotema;
    public Kerucut(double r, double t){
        this.jarijari=r;
        this.tinggi=t;
        apotema = sqrt((jarijari*jarijari)+(tinggi*tinggi));
    }
    @Override
    public double LuasPermukaan() {
        return phi*jarijari*(jarijari+apotema);
    }

    @Override
    public double Volume() {
        return 0.333*phi*jarijari*jarijari*tinggi;
    }

    public double LuasSelimut() {
        return phi*jarijari*apotema;
    }
}
