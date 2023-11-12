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
public abstract class persegi {

}


 class hitung extends persegi {

public int luas (int panjang ,int lebar){
int luas,p,l;
p=panjang;
l=lebar;
luas =l*p;
System.out.print("jadi luas persegi ");
return luas;
}
public static void main(String[] args) {
Scanner a = new Scanner(System.in);
int p,l;
System.out.print("masukan panjang : ");
p=a.nextInt();
System.out.print("masukan lebar   : ");
l=a.nextInt();
hitung b=new hitung();
System.out.println(b.luas(p, l)+"cm");
}
}
