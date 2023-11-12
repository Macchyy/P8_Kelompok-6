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
 interface TampilLaporan {
public void TampilWeb();
public void TampilMobile();
}
 interface CetakLaporan {void cetakA4();
public void cetakA3();
}
 class JavaApplication6 implements TampilLaporan,CetakLaporan {
@Override
public void TampilWeb() {
System.out.print("NAMA SAYA RIFQI ");
}
@Override
public void TampilMobile() {
System.out.print("UMUR 20 TAHUN ");
}
@Override
public void cetakA4() {
System.out.print("TINGGI BADAN 164CM");
}
@Override
public void cetakA3() {
System.out.print(" SALAM KENAL");
}
public static void main(String[] args) {
JavaApplication6 a = new
JavaApplication6();
a.TampilMobile();
a.TampilWeb();
a.cetakA3();
a.cetakA4();
}
}