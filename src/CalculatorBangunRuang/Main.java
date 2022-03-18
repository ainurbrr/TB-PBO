package CalculatorBangunRuang;

/**
 * @author Adilla Sanjaya 432
 * Nabil Ihza Ambariyono 437
 * Moh. Ainur Bahtiar Rohman 443
 */

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    /**
     * fungsi main untuk menjalankan program
     *
     * @param args untuk menjalakan semua fungsi dalam program
     */
    public static void main(String[] args) {
        int jenis, stopper, pilih, pilihan;
        double sisi, panjang, lebar, tinggi, jarijari, luasAlas = 0, luasSisi, kelilingAlas = 0;
        double alas, alasa, alasb, diagonal1, diagonal2;
        double sisi1, sisi2, sisi3, sisi4, sisi5, sisi6;
        boolean lanjut = true;

        Scanner input = new Scanner(System.in);


        System.out.println("======--SELAMAT DATANG DI CALCULARTOR BANGUN RUANG--======");
        do {
            try {
                System.out.println("=========Silahkan Pilih Jenis Bangun Ruang=========");
                System.out.println("---------------------------------------------------");
                System.out.println("| 1. Kubus                                        |");
                System.out.println("| 2. Balok                                        |");
                System.out.println("| 3. Tabung                                       |");
                System.out.println("| 4. Kerucut                                      |");
                System.out.println("| 5. Limas                                        |");
                System.out.println("| 6. Bola                                         |");
                System.out.println("| 7. Prisma                                       |");
                System.out.println("=-------------------------------------------------=");
                System.out.println("===================================================");
                System.out.print("Masukkan Pilihan Jenis dalam angka : ");
                jenis = input.nextInt();
                switch (jenis) {

                    case 1:
                        try {
                            System.out.println("________________--KUBUS--________________");
                            System.out.print("silahkan Masukkan Panjang sisi Kubus : ");
                            sisi = input.nextDouble();
                            Kubus kb = new Kubus(sisi);
                            System.out.println("=================hasil===================");
                            System.out.println("Luas Permukaan Kubus adalah = " + kb.LuasPermukaan());
                            System.out.println("Volume Kubus adalah = " + kb.Volume());
                            System.out.println("=========================================");
                        } catch (NumberFormatException nfe) {
                            System.out.println("Program menemukan Error!");
                            System.out.println("Kesalahan Format Inputan");
                        } catch (InputMismatchException ime) {
                            System.out.println("Menemukan eror!");
                        } catch (Exception e) {
                            System.out.println("Tolong masukkan format data dengan benar!!");
                        }
                        break;
                    case 2:
                        System.out.println("________________--BALOK--________________");
                        System.out.print("silahkan Masukkan Panjang Balok : ");
                        panjang = input.nextDouble();
                        System.out.print("silahkan Masukkan lebar Balok : ");
                        lebar = input.nextDouble();
                        System.out.print("silahkan Masukkan tinggi Balok : ");
                        tinggi = input.nextDouble();
                        Balok bal = new Balok(panjang, lebar, tinggi);
                        System.out.println("=================hasil===================");
                        System.out.println("Luas Permukaan Balok adalah = " + bal.LuasPermukaan());
                        System.out.println("Volume Balok adalah = " + bal.Volume());
                        System.out.println("=========================================");

                        break;
                    case 3:
                        System.out.println("________________--TABUNG--________________");
                        System.out.print("silahkan masukkan jari-jari tabung : ");
                        jarijari = input.nextDouble();
                        System.out.print("silahkan Masukkan tinggi tabung : ");
                        tinggi = input.nextDouble();
                        Tabung tb = new Tabung(jarijari, tinggi);
                        System.out.println("=================hasil===================");
                        System.out.println("Luas Permukaan Tabung adalah = " + tb.LuasPermukaan());
                        System.out.println("Volume Tabung adalah = " + tb.Volume());
                        System.out.println("Luas Selimut Tabung adalah = " + tb.LuasSelimut());
                        System.out.println("=========================================");
                        break;
                    case 4:
                        System.out.println("________________--KERUCUT--________________");
                        System.out.print("Silahkan Masukkan Jari-jari Kerucut : ");
                        jarijari = input.nextDouble();
                        System.out.print("Silahkan Masukkan tinggi kerucut : ");
                        tinggi = input.nextDouble();
                        Kerucut kc = new Kerucut(jarijari, tinggi);
                        System.out.println("=================hasil===================");
                        System.out.println("Luas Permukaan Kerucut adalah = " + kc.LuasPermukaan());
                        System.out.println("Volume Kerucut adalah = " + kc.Volume());
                        System.out.println("Luas Selimut Kerucut adalah = " + kc.LuasSelimut());
                        System.out.println("=========================================");
                        break;
                    case 5:
                        System.out.println("________________--LIMAS--________________");
                        System.out.print("Silahkan pilih jenis limas \n1. Limas Segitiga\n2. Limas Segi Empat\nMasukkan pilihan : ");
                        pilih = input.nextInt();
                        if (pilih == 1) {
                            System.out.println("------Limas Segitiga------");
                            System.out.print("silahkan Masukkan Luas alas limas : ");
                            luasAlas = input.nextDouble();
                            System.out.print("silahkan Masukkan Luas sisi limas: ");
                            luasSisi = input.nextDouble();
                            System.out.print("silahkan Masukkan tinggi limas : ");
                            tinggi = input.nextDouble();
                            LimasSegitigaSamasisi ls = new LimasSegitigaSamasisi(luasAlas, luasSisi, tinggi);
                            System.out.println("=================hasil===================");
                            System.out.println("Luas Permukaan Limas Segitiga adalah = " + ls.LuasPermukaan());
                            System.out.println("Volume Limas Segitiga adalah = " + ls.Volume());
                            System.out.println("=========================================");
                        } else if (pilih == 2) {
                            LimasSegiEmpat le = new LimasSegiEmpat();
                            System.out.println("------Limas Segi Empat------");
                            System.out.println("Silahkan pilih jenis luas alas yang akan dihitung : ");
                            System.out.println("1. Persegi\n2. Persegi Panjang\n3. Jajar Genjang\n4. Trapesium\n5. Belah Ketupat\n6. Layang-layang");
                            System.out.print("masukkan pilihan : ");
                            pilihan = input.nextInt();
                            if (pilihan == 1) {
                                System.out.println("--Luas alas Berbentuk Persegi--");
                                System.out.print("Silahkan masukkan panjang sisi persegi : ");
                                sisi = input.nextDouble();
                                luasAlas = le.alasPersegi(sisi);
                                System.out.println("=================hasil===================");
                                System.out.println("jadi luas alasnya =" + luasAlas);
                                System.out.println("=========================================");
                            } else if (pilihan == 2) {
                                System.out.println("--Luas alas Berbentuk Persegi Panjang--");
                                System.out.print("silahkan Masukkan Panjang Persegi panjang : ");
                                panjang = input.nextDouble();
                                System.out.print("silahkan Masukkan lebar Persegi panjang : ");
                                lebar = input.nextDouble();
                                luasAlas = le.alasPersegiPanjang(panjang, lebar);
                                System.out.println("=================hasil===================");
                                System.out.println("jadi luas alasnya =" + luasAlas);
                                System.out.println("=========================================");
                            } else if (pilihan == 3) {
                                System.out.println("--Luas alas Berbentuk Jajar Genjang--");
                                System.out.print("silahkan Masukkan Panjang alas Jajar Genjang : ");
                                alas = input.nextDouble();
                                System.out.print("silahkan Masukkan tinggi Jajar Genjang : ");
                                tinggi = input.nextDouble();
                                luasAlas = le.alasJajarGenjang(alas, tinggi);
                                System.out.println("=================hasil===================");
                                System.out.println("jadi luas alasnya =" + luasAlas);
                                System.out.println("=========================================");
                            } else if (pilihan == 4) {
                                System.out.println("--Luas alas Berbentuk Trapesium--");
                                System.out.print("silahkan Masukkan Panjang alas A Trapesium : ");
                                alasa = input.nextDouble();
                                System.out.print("silahkan Masukkan Panjang alas B Trapesium : ");
                                alasb = input.nextDouble();
                                System.out.print("silahkan Masukkan tinggi Trapesium : ");
                                tinggi = input.nextDouble();
                                luasAlas = le.alasTrapesium(alasa, alasb, tinggi);
                                System.out.println("=================hasil===================");
                                System.out.println("jadi luas alasnya =" + luasAlas);
                                System.out.println("=========================================");
                            } else if (pilihan == 5) {
                                System.out.println("--Luas alas Berbentuk Belah Ketupat--");
                                System.out.print("silahkan Masukkan Panjang diagonal 1 : ");
                                diagonal1 = input.nextDouble();
                                System.out.print("silahkan Masukkan Panjang diagonal 2 : ");
                                diagonal2 = input.nextDouble();
                                luasAlas = +le.alasBelahKetupat(diagonal1, diagonal2);
                                System.out.println("=================hasil===================");
                                System.out.println("jadi luas alasnya =" + luasAlas);
                                System.out.println("=========================================");
                            } else if (pilihan == 6) {
                                System.out.println("--Luas alas Berbentuk Layang-layang--");
                                System.out.print("silahkan Masukkan Panjang diagonal 1 : ");
                                diagonal1 = input.nextDouble();
                                System.out.print("silahkan Masukkan Panjang diagonal 2 : ");
                                diagonal2 = input.nextDouble();
                                luasAlas = le.alasLayangLayang(diagonal1, diagonal2);
                                System.out.println("=================hasil===================");
                                System.out.println("jadi luas alasnya =" + luasAlas);
                                System.out.println("=========================================");

                            } else {
                                break;
                            }
                            System.out.print("silahkan masukkan Luas sisi : ");
                            luasSisi = input.nextDouble();
                            System.out.print("silahkan masukkan tinggi : ");
                            tinggi = input.nextDouble();
                            LimasSegiEmpat lse = new LimasSegiEmpat(luasAlas, luasSisi, tinggi);
                            System.out.println("=================hasil===================");
                            System.out.println("Luas permukaan Limas adalah : " + lse.LuasPermukaan());
                            System.out.println("Volume Limas adalah : " + lse.Volume());
                            System.out.println("=========================================");
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        System.out.println("________________--BOLA--________________");
                        System.out.print("silahkan masukkan jari-jari tabung : ");
                        jarijari = input.nextDouble();
                        Bola bl = new Bola(jarijari);
                        System.out.println("=================hasil===================");
                        System.out.println("Luas Permukaan Bola adalah = " + bl.LuasPermukaan());
                        System.out.println("Volume Tabung adalah = " + bl.Volume());
                        System.out.println("=========================================");
                        break;
                    case 7:
                        System.out.println("________________--Prisma--________________");
                        System.out.println("Silahkan pilih jenis Prisma yang akan dihitung : ");
                        System.out.println("1. Prisma Segi Tiga\n2. Prisma Segi Empat\n3. Prisma Segi Lima\n4. Prisma Segi Enam");
                        System.out.print("masukkan pilihan : ");
                        pilihan = input.nextInt();
                        if (pilihan == 1) {
                            System.out.println("--Prisma Segi Tiga--");
                            Prisma pm = new Prisma();
                            System.out.print("Silahkan Masukkan panjang sisi 1 : ");
                            sisi1 = input.nextDouble();
                            System.out.print("Silahkan Masukkan panjang sisi 2 : ");
                            sisi2 = input.nextDouble();
                            System.out.print("Silahkan Masukkan panjang sisi 3 : ");
                            sisi3 = input.nextDouble();
                            kelilingAlas = pm.kelilingsegiTiga(sisi1, sisi2, sisi3);
                            System.out.println("=================hasil===================");
                            System.out.println("jadi, Keliling alas prisma : " + kelilingAlas);
                            System.out.println("=========================================");
                        } else if (pilihan == 2) {
                            System.out.println("--Prisma Segi Empat--");
                            Prisma pm = new Prisma();
                            System.out.print("Silahkan Masukkan panjang sisi 1 : ");
                            sisi1 = input.nextDouble();
                            System.out.print("Silahkan Masukkan panjang sisi 2 : ");
                            sisi2 = input.nextDouble();
                            System.out.print("Silahkan Masukkan panjang sisi 3 : ");
                            sisi3 = input.nextDouble();
                            System.out.print("Silahkan Masukkan panjang sisi 4 : ");
                            sisi4 = input.nextDouble();
                            kelilingAlas = pm.kelilingsegiEmpat(sisi1, sisi2, sisi3, sisi4);
                            System.out.println("=================hasil===================");
                            System.out.println("jadi, Keliling alas prisma : " + kelilingAlas);
                            System.out.println("=========================================");
                        } else if (pilihan == 3) {
                            System.out.println("--Prisma Segi Lima--");
                            Prisma pm = new Prisma();
                            System.out.print("Silahkan Masukkan panjang sisi 1 : ");
                            sisi1 = input.nextDouble();
                            System.out.print("Silahkan Masukkan panjang sisi 2 : ");
                            sisi2 = input.nextDouble();
                            System.out.print("Silahkan Masukkan panjang sisi 3 : ");
                            sisi3 = input.nextDouble();
                            System.out.print("Silahkan Masukkan panjang sisi 4 : ");
                            sisi4 = input.nextDouble();
                            System.out.print("Silahkan Masukkan panjang sisi 5 : ");
                            sisi5 = input.nextDouble();
                            kelilingAlas = pm.kelilingsegiLima(sisi1, sisi2, sisi3, sisi4, sisi5);
                            System.out.println("=================hasil===================");
                            System.out.println("jadi, Keliling alas prisma : " + kelilingAlas);
                            System.out.println("=========================================");
                        } else if (pilihan == 4) {
                            System.out.println("--Prisma Segi Enam--");
                            Prisma pm = new Prisma();
                            System.out.print("Silahkan Masukkan panjang sisi 1 : ");
                            sisi1 = input.nextDouble();
                            System.out.print("Silahkan Masukkan panjang sisi 2 : ");
                            sisi2 = input.nextDouble();
                            System.out.print("Silahkan Masukkan panjang sisi 3 : ");
                            sisi3 = input.nextDouble();
                            System.out.print("Silahkan Masukkan panjang sisi 4 : ");
                            sisi4 = input.nextDouble();
                            System.out.print("Silahkan Masukkan panjang sisi 5 : ");
                            sisi5 = input.nextDouble();
                            System.out.print("Silahkan Masukkan panjang sisi 6 : ");
                            sisi6 = input.nextDouble();
                            kelilingAlas = pm.kelilingsegiEnam(sisi1, sisi2, sisi3, sisi4, sisi5, sisi6);
                            System.out.println("=================hasil===================");
                            System.out.println("jadi, Keliling alas prisma : " + kelilingAlas);
                            System.out.println("=========================================");
                        } else {
                            break;
                        }
                        System.out.print("silahkan masukkan Luas Alas Prisma : ");
                        luasAlas = input.nextDouble();
                        System.out.print("silahkan masukkan tinggi Prisma : ");
                        tinggi = input.nextDouble();
                        Prisma prm = new Prisma(luasAlas, tinggi, kelilingAlas);
                        System.out.println("=================hasil===================");
                        System.out.println("Luas permukaan Prisma adalah : " + prm.LuasPermukaan());
                        System.out.println("Volume Prisma adalah : " + prm.Volume());
                        System.out.println("=========================================");
                        break;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Program menemukan Error!");
                System.out.println("Kesalahan Format Inputan");
            } catch (InputMismatchException ime) {
                System.out.println("Menemukan eror!");
            } catch (Exception e) {
                System.out.println("Tolong masukkan format data dengan benar!!");
            }
            System.out.println("Apakah Ingin Kembali ke Menu Awal?\n1.Ya\n2.Tidak");
            System.out.print("masukkan pilihan : ");
            stopper = input.nextInt();
            if (stopper == 1) {
                lanjut = true;
            } else if (stopper == 2) {
                System.exit(0);
            } else {
                lanjut = false;
            }
        } while (lanjut);
    }
}

