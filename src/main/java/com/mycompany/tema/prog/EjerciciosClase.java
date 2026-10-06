/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema.prog;

import java.util.Scanner;

/**
 *
 * @author apm25
 */
public class EjerciciosClase {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        //ejercicio1();
        //ejercicio2();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9(sc);
        //ejercicio10(sc);
        ejercicio11(sc);
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
        int anio = 1234;
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
    
    public static void ejercicio7(){
        String cadena = "%-15s | %5d | %8.2f %n";
        System.out.printf("%-15s | %5s | %8s %n", "Nombre", "Uni", "Precio");
        System.out.printf("----------------------------------- %n");
        System.out.printf(cadena, "Champu", 8, 12.5f);
        System.out.printf(cadena, "Jabon de manos", 3, 7.2f);
        System.out.printf(cadena, "C. hidratante", 7, 10.99f);
        System.out.printf(cadena, "Toalla", 1, 20.0f);
        System.out.printf("----------------------------------- %n");
    }
    
    public static void ejercicio8(){
        System.out.println("MENU DE OPCIONES:\n1. Archivo \"nuevo\"\n2. Ruta: C\\\\Archivos\\\\Java\n3. Salir");
    }
    
    public static void ejercicio9(Scanner sc){
        System.out.print("Edad del usuario: ");
        int edadUsuario = sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre del usuario: ");
        String nombreUsuario = sc.nextLine();
        
        System.out.println("Usuario: " + nombreUsuario + " Edad: " + edadUsuario);
        
    }
    
    public static void ejercicio10(Scanner sc){
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        System.out.print("Introduce tu salario: ");
        double salario = sc.nextDouble();
        
        if((edad < 25 && salario < 900f) || edad < 18){
            System.out.println("Se te concede la beca");
        } else {
            System.out.println("No se te concede la beca, burgues!");
        }
    }
    
    public static void ejercicio11(Scanner sc){
        System.out.print("Introduce tu nota: ");
        float nota = sc.nextFloat();
        
        switch((int)nota) {
            case 0, 1, 2, 3, 4:
                    System.out.println("Insuficiente");
                    break;
            case 5:
                   System.out.println("Suficiente");
                   break;
            case 6:
                    System.out.println("Bien");
                    break;
            case 7, 8:
                    System.out.println("Notable");
                    break;
            case 9, 10:
                    System.out.println("Sobresaliente");
                    break;
            default:
                    System.out.println("Fuera de rango");           
        }
    }
    
    public static void ejercicio12(Scanner sc){
        System.out.print("Introduce la temperatura: ");
        int temperatura = sc.nextInt();
        String estado = temperatura > 30 ? "calor" : "normal";
        System.out.println(estado);
    }
    
    public static void ejercicio13(Scanner sc){
        System.out.print("Introduce un numero del 1 al 7: ");
        int dia = sc.nextInt();
        switch(dia){
            case 1: 
                System.out.println("Lunes");
                break;
            case 2: 
                System.out.println("Martes");
                break;
            case 3: 
                System.out.println("Miercoles");
                break;
            case 4: 
                System.out.println("Jueves");
                break;
            case 5: 
                System.out.println("Viernes");
                break;
            case 6: 
                System.out.println("Sabado");
                System.out.println("Fin de semana");
                break;
            case 7: 
                System.out.println("Domingo");
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("Dia no valido");
        }
    }
    
    public static void ejercicio14(Scanner sc){
        System.out.print("Introduce un numero de mes (1 a 12): ");
        int mes = sc.nextInt();
        System.out.print("Introduce un numero de anio: ");
        int anio = sc.nextInt();
        boolean esBisiesto = ((anio%4 == 0 && anio%100 != 0) || anio%400 == 0);
        switch(mes){
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("El mes tiene 31 dias");
                break;
            case 4, 6, 9, 11:
                System.out.println("El mes tiene 30 dias");
                break;
            case 2:
                System.out.println(esBisiesto ? "El mes tiene 28 dias" : "El mes tiene 29 dias");
                break;
            default: 
                System.out.println("No es un mes, no te he dicho que debe ser entre 1 y 12?");
        }
    }
    
    
    public static void ejercicioClase(){
        
    }
}
