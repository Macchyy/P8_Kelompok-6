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
 interface TampilLaporann {
public void TampilWeb();

public void TampilMobile();
}
 interface CetakLaporann {
void cetakA4();
public void cetakA3();
}
public class no8 implements TampilLaporan,CetakLaporan {
@Override
public void TampilWeb() {
System.out.println("Agus");
}
@Override
public void TampilMobile() {
System.out.println("lapar");
}
@Override
public void cetakA4() {
System.out.println("buk");
}
@Override
public void cetakA3() {
System.out.println("agus mau makan");
}
public static void main(String[] args) {
no8 a = new no8();
a.TampilMobile();
a.TampilWeb();
a.cetakA3();
a.cetakA4();
no8 b = new no8();
b.TampilMobile();
b.TampilWeb();