/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema.prog;

/**
 *
 * @author apm25
 */
public class EjerciciosClase {
    public static void main(){
        //ejercicio1();
        //ejercicio2();
        //ejercicio4();
        //ejercicio5();
        ejercicio6();
    }
    
    public static void ejercicio1() {
        int productoID;
        char codigo;
        float precio;
        int unidades;
        boolean rebajado;
        
        productoID = 1234;
        codigo ='C';
        precio = 12.50f;
        unidades = 12;
        rebajado = true;
        
        System.out.println("ID producto: " + productoID);
        System.out.println("codigo: " + codigo);
        System.out.println("precio: " + precio);
        System.out.println("unidades: " + unidades);
        System.out.println("rebajado: " + rebajado);
    }
    
    public static void ejercicio2(){
        final double IVA = 0.21;
        final double DESCUENTO_PROMO = 5.0;
        
        double articulo = 120.0;
        
        System.out.println("Articulo con decuento (sin IVA): " + (articulo-DESCUENTO_PROMO));
        System.out.println("Articulo con decuento e IVA: " + (articulo-DESCUENTO_PROMO)*(1+IVA));
    }
    
    public static void ejercicio3() {
        int primerNumero = 10;
        double precioFinal = 99.9;
        boolean esMayorEdad = true;
        final float PI_VALOR = 3.1416f;
        
        //Añadido casteo
        
        //Aqui se pierde info (precioFinal es double)
        int precioInt = (int)precioFinal;
        //Aqui no se pierde na (primerNumero es int)
        double primerNumeroDouble = (double)primerNumero;
    }
    
    public static void ejercicio4(){
        double precioExacto = 49.99;
        int soloEntera = (int)precioExacto;
        char letra = 'A';
        
        //Casteo a int y se pasa a ASCI
        System.out.println((int)letra);
    }
    
    public static void ejercicio5(){
        int segundos = 3725;
        
        int minutos = segundos/60;
        int segundosRestantes = segundos%60;
        
        int horas = minutos/60;
        int minutosRestantes = minutos%60;
        
        System.out.println(segundos + " segundos son " + horas + " horas con " + minutosRestantes + " minutos con " + segundosRestantes + " segundos.");
    }
    
    public static void ejercicio6(){
        int anio = 12346;
        boolean esBisiesto = ((anio%4 == 0 && anio%100 != 0) || anio%400 == 0);
        
        //Con condicional
        //En este condicional hay 3 condiciones
        //La primera: si el año es divisible entre 4 (o lo que es lo mismo que cuando se divide entre 4 el resto da 0).
        //La segunda: si al dividir el año entre 100 nos da un valor distinto a 0.
        //La tercera: Si el año al dividirlo entre 400 da resto 0.
        //Ojo a los condicionales y las puertas logicas
        // ((condicion1 && condicion2) || condicion3)
        if((anio%4 == 0 && anio%100 != 0) || anio%400 == 0){
            System.out.println("El any es de siesta");
        } else {
            System.out.println("El any no es de siesta");
        }
        
        System.out.println(esBisiesto ? "El any es de siesta" : "El any no es de siesta");
    }
}
