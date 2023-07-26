/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prog02_ejerc1;

/**
 *
 * @author Yo
 */
public class PROG02_Ejerc1 {
    public enum sexo {V,M}
    public static void main(String[] args) {//Clase principal main.
        final int VALOR_MAX = 5000; //Valor constante con longitud int, 
        //short o int no son suficientes. 
        byte mes[] = {1,2,3,4,5,6,7,8,9,10,11,12};//Variable cadena tipo byte 
        //por tener un valor entre -128 y 127.
        boolean tieneCarnet = true; // Variable tipo booleana que se ejecuta
        //automática como false. Especificamos valor true. 
        String nombre = "David";//Variable tipo String al tratarse de texto.
        String apellido ="García";//Variable tipo String al tratarse de texto.
        int miliseg = (((((42*365)*24)*60)*60)*1000);//Variable tipo long ya que
        //su valor es inferior a  2,147,483,647. Por lo que no es necesario long.
        double cuenta = 123456.45; //Variable tipo double por ser decimal.
        int kms = 616550000;//Uso de int por ser menor que 2,147,483,647.
        sexo Sexo = sexo.V;//Especificamos el valor de la variable booleana sexo.
        //Visualización de las variables usando print
        System.out.print ("\n************************************************");
        System.out.print ("\nMODULO DE PROGRAMACIÓN TAREA 2");
        System.out.print ("\n************************************************");
        System.out.print ("\n El valor máximo es " + VALOR_MAX + ".");
        System.out.print ("\n El valor de la variable de si el empleado tiene carnet es " + tieneCarnet + ".");
        System.out.print ("\n El número del mes del año es " + mes[10] + ".");
        System.out.print ("\n El nombre y apellido es es " + nombre + " " + apellido + ".");
        System.out.print ("\n El sexo del empleado es " + Sexo + ".");
        System.out.print ("\n Han transcurrido " + miliseg + " milisegundos.");
        System.out.print ("\n El saldo de la cuenta es de " + cuenta + "€.");
        System.out.print ("\n Desde la Tierra hasta Jupiter hay " + kms + "km.");
        
    }
}
