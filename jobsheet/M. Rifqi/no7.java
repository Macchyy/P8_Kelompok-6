/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p8;

/**
 *
 * @author ASUS
 */
 interface CetakLaporan {
    void cetakA4();
    void cetakA3();
}

 interface TampilLaporan {
    void TampilWeb();
    void TampilMobile();
}

 interface Laporan extends CetakLaporan, TampilLaporan {
    void ga();
}

public class no7 implements Laporan {
    @Override
    public void cetakA4() {
        System.out.println("SAYA BUDI");
    }

    @Override
    public void cetakA3() {
        System.out.println("INI BAPAK BUDI3");
    }

    @Override
    public void TampilWeb() {
        System.out.println("INI IBU BUDI");
    }

    @Override
    public void TampilMobile() {
        System.out.println("INI KAKAK BUDI");
    }

    @Override
    public void ga() {
        System.out.println("INI ADEK BUDI");
    }
}

 class no7a extends NewClass {
    public static void main(String[] args) {
        no7 a = new no7();
        a.cetakA4();
        a.cetakA3();
        a.TampilWeb();
        a.TampilMobile();
        a.ga();
    }
}

