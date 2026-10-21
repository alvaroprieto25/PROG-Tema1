/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema.prog;

import java.io.File;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author apm25
 */
public class EjerciciosBucles {
    
    private EjerciciosBucles(){}
    
    public static void main(){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        //ejercicio3(sc, rand);
        ejercicio10(sc);
    }
    
    public static void ejercicio1(Scanner sc){
        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();
        
        // CONTROL DE ERRORES
        if(num <= 1){
            return;
        }
        
        for(int i = 2; i <= num; i++){
            if(i % 2 == 0){
                System.out.print(i < num-1 ? (i + ", ") : (i + "."));
            }
        }
    }
    
    public static void ejercicio2(Scanner sc){
        int suma = 0;
        
        while(suma <= 100){
            System.out.print("Introduce otro sumando: ");
            int sumando = sc.nextInt();
            
            suma += sumando;
        }
        
        System.out.println("Este es tu numero final: " + suma);
    }
      
    public static void ejercicio3(Scanner sc, Random r) {
        int aleatorio = r.nextInt(1,10);
        boolean acertado = false;
        
        while(!acertado){
            System.out.println("---------------------------");
            System.out.print("Adivina el numero: ");
            int intento = sc.nextInt();
            
            if(intento == aleatorio){
                System.out.println("Enhorabuena, es el numero correcto");
                acertado = true;
            } else if(intento > aleatorio){
                System.out.println("El numero buscado es menor");
            } else {
                System.out.println("El numero buscado es mayor");
            }
            System.out.println("---------------------------");
        }
    }
    
    public static void ejercicio4(Scanner sc){
        int resultado = 1;
        
        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();
        
        System.out.print("Introduce un exponente: ");
        int exp = sc.nextInt();
        
        for(int i = 0; i <= exp; i++){
            resultado = resultado * num;
        }
        
        System.out.println("El resultado: " + resultado);
    }
    
    public static void ejercicio6(Scanner sc){
        int pass;
        boolean acertado = false;
        
        for(int i = 1; i <= 3 && !acertado; i++){
            System.out.print("Introduce la contraseña: ");
            pass = sc.nextInt();
            
            if(pass != 1234){
                System.out.println("No es correcto!");
                System.out.println("Te quedan " + (3-i) + " intentos");
                if(i == 3){
                    System.out.println("Se acabo...");
                    System.out.println("Eliminando carpeta C:\\\\System\\\\...");
                }
            } else {
                System.out.println("Es correcto!");
                acertado = true;
            }
        }
    }
    
    public static void ejercicio9(Scanner sc){
        System.out.print("Introduce el numero de digitos a imprimir: ");
        int digitos = sc.nextInt();
        int next = 1, resultado = 0;
        System.out.print("0, ");
        for(int i = 0; i < digitos; i++){
            resultado = resultado + next;
            next = resultado - next;
            System.out.print(i != digitos-1 ? (resultado + ", ") : (resultado));
        }
    }
    
    public static void ejercicio10(Scanner sc){
        double saldo = 1000;
        int opcion;
        do {
            System.out.println("1. Consultar Saldo\n2. Igresar Dinero\n3. RetirarDinero\n4. Salir");
            System.out.print("Introduce la opcion(1,2,3,4): ");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Saldo actual " + saldo);
                    break;
                case 2:
                    System.out.print("Introduce la cantidad a ingresar: ");
                    double ingreso = sc.nextDouble();
                    if(ingreso > 0)
                        saldo += ingreso;
                    else
                        System.out.println("El ingreso debe tener un valor positivo!");
                    break;
                case 3:
                    System.out.print("Introduce la cantidad a retirar: ");
                    double retirada = sc.nextDouble();
                    if(retirada > 0 && retirada <= saldo)
                        saldo -= retirada;
                    else
                        System.out.println("No se puede retirar esa cantidad.");
                    break;
                case 4: 
                    System.out.println("Adios!");
                    break;
                default:   
                    System.out.println("Opcion no permitida.\nIntentalo de nuevo!");
            }
        } while(opcion != 4);
    }
}
