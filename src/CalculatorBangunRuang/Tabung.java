package CalculatorBangunRuang;

public class Tabung implements Hitung{
    double jarijari,tinggi;
    public Tabung(double r, double t){
        this.jarijari = r;
        this.tinggi = t;
    }

    @Override
    public double LuasPermukaan() {
        return phi*jarijari*jarijari*tinggi;
    }

    @Override
    public double Volume() {
        return 2*phi*jarijari*(jarijari+tinggi);
    }

    public double LuasSelimut() {
        return 2*jarijari*phi*tinggi;
    }
}
