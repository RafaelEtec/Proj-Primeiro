/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappteste;

/**
 *
 * @author rafae
 */
public class Test {
    static double valor1, valor2, resultado= 0;
    
public static void main (String args[]) {

    int num1, num2, resp=0;
    final double pi = 3.14;
    
    //resp = 0;
    num1= 10;
    num2 = 20;
    
    resp = num1 + num2;
    
    System.out.println("A soma é: "+resp);
    
    valor1=25;
    valor2=25;
    
    resultado = valor1 * valor2 * pi;
    
    
    System.out.println("A soma é: "+resultado);
}

}