/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

import java.util.Scanner;

/**
 *
 * @author ItsqmetEstudiantes
 */
public class Mavenproject5 {

    public static void main(String[] args) {
        //Calcular el area del triangulo y el area del circulo
        //TRIANGULO
        double base;
        double altura;
        double respuesta;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingresar base del triangulo:----> ");
        base = input.nextDouble();
        System.out.println("Ingresar la altura del triangulo:---> ");
        altura = input.nextDouble();

        respuesta = (base * altura) / 2;
        System.out.println("EL AREA DEL TRIANUGLO ES:  " + respuesta);
        
        
        //CALCULAR EL AREA DEL CIRCULO
       
        double radio;
        double area2;
        System.out.println("==============0==============");
        System.out.println("#######CALCULO DEL AREA DE UN CIRCULO#######");
        System.out.println("Ingrese el radio del circulo:---->>> ");
        radio = input.nextDouble();
        
        area2= (3.141592*(radio*radio));
        
        System.out.println("El radio del circulo es: " + area2);
        
    }
    
}
