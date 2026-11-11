/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */

public class Comercio021 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // 10,2 / 10.2

        String region;
        String nombre;
        String nombreComercio;
        String apellido;
        int edad;
        double sueldoBasico;
        int numeroProductos;

        double productividad;
        double coeficiente = 0.6;
        double bono = 0;

        double porcentajeSeguro = 8;
        double adicionalSeguro;

        double sueldoFinal;
        
        System.out.println("Ingrese el nombre del comercio por favor");
        nombreComercio = entrada.nextLine();

        System.out.println("Ingrese el nombre por favor");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese la region por favor");
        region = entrada.nextLine();

        System.out.println("Ingrese el apellido por favor");
        apellido = entrada.nextLine();

        System.out.println("Ingrese la edad por favor");
        edad = entrada.nextInt();

        System.out.println("Ingrese el sueldo básico por favor");
        sueldoBasico = entrada.nextDouble();

        System.out.println("Ingrese el número de productos vendidos "
                + "por favor");
        numeroProductos = entrada.nextInt();

        // calcular la productividad
        productividad = numeroProductos * coeficiente;

        if (productividad <= 30) {
            bono = 25; // $25
        } else {
            if (productividad > 30 && productividad < 80) {
                bono = 50;
            } else {
                if (productividad >= 80 && productividad < 200) {
                    bono = 100;
                } else {
                    if (productividad >=200 && productividad <= 500) {
                        bono = 200;
                    } else {
                        bono = 300;
                    }
                }
            }
        }
        if (region.equals("sierra")){
            porcentajeSeguro = 10; //10%
        }else{
            if(region.equals("costa")){
                porcentajeSeguro = 12; //12%
            }else{
            if(region.equals("oriente")){
                porcentajeSeguro = 15; //12%
            }else{
            if(region.equals("insular")){
                porcentajeSeguro = 30;
            }else{ 
            porcentajeSeguro = 8; //lo estamos dando porcenteje para que no salga error si son extranjeros 
                    }
                }
            }
        }    
            
        adicionalSeguro = (sueldoBasico * porcentajeSeguro) / 100;
        sueldoFinal = adicionalSeguro + bono + sueldoBasico;

        System.out.printf("Reporte de Empleado EL GRAN COMERCIO\n\n"
                +"nombre del comercio %s\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Edad: %d\n"
                + "Sueldo: $%.2f\n"
                + "Número de productos vendidos: %d\n"
                + "\tProductidad: %.2f\n"
                + "\tBono: $%.2f\n"
                + "Adicional del seguro: $%.2f\n\n"
                + "Sueldo final: $%.2f\n",
                nombreComercio,
                nombre,
                apellido,
                edad,
                sueldoBasico,
                numeroProductos,
                productividad,
                bono,
                adicionalSeguro,
                sueldoFinal);

    }

}
/*
deacuerdo a nueva normativa el porsentaje del seguro es valiable si el empleado 
es de la sierra el porcentaje del seguro es 10% costa 12% oriente 15% insular 
30% acoplar la solucion para considere la neuva normativa
*/