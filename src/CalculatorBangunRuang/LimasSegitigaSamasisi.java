package CalculatorBangunRuang;

public class LimasSegitigaSamasisi implements Hitung{
    double Luasalas, Luassisi, tinggi;
    LimasSegitigaSamasisi(double la,double ls, double t){
        this.Luasalas=la;
        this.Luassisi=ls;
        this.tinggi=t;
    }
    @Override
    public double LuasPermukaan() {
        return Luasalas+(3*Luassisi);
    }

    @Override
    public double Volume() {
        return 0.333*Luasalas*tinggi;
    }
}
