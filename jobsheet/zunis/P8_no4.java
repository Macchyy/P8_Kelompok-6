/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p8;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public abstract class no4 {
public abstract void pilih (int p);
}
 class no4a extends no4 {
@Override
public void pilih ( int p){
switch (p){
case 1:
System.out.println("selamat anda memilih Mobil");
break; 
case 2:
System.out.println("selamat anda memilih Motor");
break;
}
}
public static void main(String[] args) {
Scanner a = new Scanner(System.in);
int p;
System.out.println("1. Mobil ");
System.out.println("2. Rumah ");
System.out.print("masukan nomor pilihan ");
p=a.nextInt();
no4a b=new no4a();
b.pilih(p);
}
}