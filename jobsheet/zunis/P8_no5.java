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
public interface no5{
public void ga ();
}

class NewClass implements no5 {
@Override
public void ga(){
System.out.println("Multiinheritance");
}
public static void main(String[] args) {
NewClass a= new NewClass();
a.ga();
}
}
