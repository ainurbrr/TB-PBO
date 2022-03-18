package CalculatorBangunRuang;

public class Prisma implements Hitung{
    double luasAlas, tinggi, KelAlas;

    public double kelilingsegiTiga(double a1,double a2,double a3){
        KelAlas=a1+a2+a3;
        return KelAlas;
    }
    public double kelilingsegiEmpat(double a1,double a2,double a3,double a4){
        KelAlas=a1+a2+a3+a4;
        return KelAlas;
    }
    public double kelilingsegiLima(double a1,double a2,double a3,double a4,double a5){
        KelAlas=a1+a2+a3+a4+a5;
        return KelAlas;
    }
    public double kelilingsegiEnam(double a1,double a2,double a3,double a4,double a5, double a6){
        KelAlas=a1+a2+a3+a4+a5+a6;
        return KelAlas;
    }
    public Prisma(){

    }
    public Prisma(double la,double t, double kelA){
        this.luasAlas=la;
        this.tinggi=t;
        this.KelAlas=kelA;
    }


    @Override
    public double LuasPermukaan() {
        return tinggi*KelAlas+(2*luasAlas);
    }

    @Override
    public double Volume() {
        return luasAlas*tinggi;
    }
}
