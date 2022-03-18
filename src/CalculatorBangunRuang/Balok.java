package CalculatorBangunRuang;

public class Balok implements Hitung {
    double panjang,lebar,tinggi;
    public Balok(double p, double l, double t){
        this.panjang=p;
        this.lebar=l;
        this.tinggi=t;
    }

    @Override
    public double LuasPermukaan() {
        return 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
    }

    @Override
    public double Volume() {
        return panjang*lebar*tinggi;
    }

}
