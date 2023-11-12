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
public abstract class abstrack {
public abstract void nama();
}

class nama extends abstrack {
    
@Override
public void nama() {
Scanner a=new Scanner(System.in);
System.out.print("MASUKKAN NAMA ANDA : ");
String k=a.nextLine();
System.out.println("NAMA SAYA ADALAH "+k);
}


public static void main(String[] args) {
nama a=new nama();
a.nama();
}
}