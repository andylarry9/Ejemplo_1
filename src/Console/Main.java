/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;

import java.util.Scanner;

/**
 *
 * @author harol
 */
public class Main {
    private static Scanner input;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        input = new Scanner(System.in);
        //mostrar datos a consola
        System.out.println("Hola Mundo!!");
        System.out.print("Como estás: ");
        System.out.println("Muy mal con la contaminación ambiental.");
        
        System.out.println(1200000000);
        System.out.println(12.5);        
        /*
            operadores aritmeticos: 
            + , - , * , / , %
        */
        System.out.println(2 + 3); //suma
        System.out.println(2 - 3); // resta
        System.out.println(2 * 3); //multiplicacion
        System.out.println(3 / 2); //division entera
        System.out.println(3 / 2.0); //division no entera
        System.out.println(3.0 / 2); //division no entera
        System.out.println(3.0 / 2.0); //division no entera
        System.out.println(3 % 2); //resto de la division entera
        
        //declaracion de variables
        int edad = 30;  //short, long
        float peso_kg = 70;
        float estatura = 1.70f;
        double saldo_CB = 100;
        String nombres_completos = "Armando Paredes del Castillo";
        char sexo = 'M'; //M-Masculino y F-Femenimo
        boolean si_empleado = false; //true o false
        
        mostrarDatosPersona(nombres_completos, edad, peso_kg, estatura, sexo, saldo_CB, si_empleado);
        
        //1. Declaracion de variables
            //entradas de datos
        double operando1, operando2;
            //salida de datos
        double suma;
        //2. Entrada de los datos
        System.out.print("Digite el primer operando: ");
        operando1 = input.nextDouble();
        System.out.print("Digite el segundo operando: ");
        operando2 = input.nextDouble();
        //3. Procesamiento de los datos
        suma = sumar(operando1, operando2);
        //4. Mostrar resultados
        System.out.println(operando1 + " + " + operando2 + " = " + suma);
        
        
    }//termina el bloque del método main
    
    //subprograma para mostrar los datos de una persona a consola
    public static void mostrarDatosPersona(String pNombres, int pEdad, float pPeso, float pEstatura, char pSexo, double pSaldoCB, boolean pSiEmpleado) 
    {
        System.out.println("Nombres completos: " + pNombres);
        System.out.println("Edad: " + pEdad);
        System.out.println("Peso: " + pPeso + " kg.");
        System.out.println("Estatura: " + pEstatura + " m.");
        System.out.println("Sexo: " + pSexo);
        System.out.println("Saldo Cuenta Bancaria: $" + pSaldoCB);
        if (pSiEmpleado == true)
            System.out.println("Si está empleado.");  
        else
            System.out.println("No está empleado.");
    }
    
    //subtarea de función sumar dos numeros y devolver el resultado
    public static double sumar(double pPrimerSumando, double pSegundoSumando)
    {
        double result_suma = pPrimerSumando + pSegundoSumando;
        return result_suma;
    }
    
}//fin de bloque de la clase Main
