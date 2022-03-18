package CalculatorBangunRuang;


public class Bola implements Hitung{
    double jarijari;
    public Bola(double r){
        this.jarijari=r;
    }

    @Override
    public double LuasPermukaan() {
        return 4*phi*jarijari*jarijari;
    }

    @Override
    public double Volume() {
        return 1.333*phi*jarijari*jarijari*jarijari;
    }
}
