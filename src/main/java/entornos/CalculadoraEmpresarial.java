/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornos;

/**
 *
 * @author apm25
 */
public class CalculadoraEmpresarial {
    public static void main(String args[]){
        double[] precios = {12.50, 10.66, 8.63};
        
        for(int i = 0; i < precios.length; i++){
            System.out.println("Precio sin IVA: " + precios[i]);
            System.out.println("Precio con IVA: " + precios[i]*1.21);
        }
    }
}
