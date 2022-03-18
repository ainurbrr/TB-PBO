package CalculatorBangunRuang;

public class Kubus implements Hitung{

    double sisi;
    public Kubus(double s){
        this.sisi = s;
    }

    @Override
    public double LuasPermukaan() {
        return 6*sisi*sisi;
    }

    @Override
    public double Volume() {
        return sisi*sisi*sisi;
    }

}
