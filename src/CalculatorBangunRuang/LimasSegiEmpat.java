package CalculatorBangunRuang;

public class LimasSegiEmpat implements Hitung{
    double luasAlas, Luassisi, tinggi;

    public double alasPersegi(double sisi){
        luasAlas = sisi*sisi;
        return luasAlas;
    }
    public double alasPersegiPanjang(double panjang,double lebar){
        luasAlas = panjang*lebar;
        return luasAlas;
    }
    public double alasJajarGenjang(double alas,double tinggi){
        luasAlas = alas*tinggi;
        return luasAlas;
    }
    public double alasTrapesium(double alasa,double alasb,double tinggi){
        luasAlas = 0.5*(alasa+alasb)*tinggi;
        return luasAlas;
    }
    public double alasBelahKetupat(double diagonal1,double diagonal2){
        luasAlas = 0.5*diagonal1*diagonal2;
        return luasAlas;
    }
    public double alasLayangLayang(double diagonal1,double diagonal2){
        luasAlas = 0.5*diagonal1*diagonal2;
        return luasAlas;
    }

    public LimasSegiEmpat() {

    }

    public LimasSegiEmpat(double la, double ls, double t) {
        this.luasAlas = la;
        this.Luassisi = ls;
        this.tinggi = t;
    }

    @Override
    public double LuasPermukaan() {
        return luasAlas+(3*Luassisi);
    }

    @Override
    public double Volume() {
        return 0.333*luasAlas*tinggi;
    }
}
