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
public abstract class no3 {
public abstract void ulang (int p);
}


 class no3a extends no3 {
@Override
public void ulang ( int p){
for (int i=1;i<=p;i++){
System.out.println("Perulangan ke : "+i);
}
}
public static void main(String[] args) {
Scanner a = new Scanner(System.in);
int p;
System.out.print("masukan jumlah perulangan :");
p=a.nextInt();
no3a b=new no3a();
b.ulang(p);
}
}
