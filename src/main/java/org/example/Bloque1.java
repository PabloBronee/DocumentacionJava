package org.example;

//---Bloque 1: Estructuras Básicas y Flujo de Control en Java---
import java.util.Scanner;

public class Bloque1 {
    public static void main(String[] args) {
        // Crear el Scanner para entrada de datos
        Scanner sc = new Scanner(System.in);

        // Ingresar los datos, a modo de string
        System.out.println("Ingresa el dato A:");
        String datoAstr = sc.nextLine();
        System.out.println("Ingresa el dato B:");
        String datoBstr = sc.nextLine();

        //Convertir los datos de string en int para su uso
        int datoAint = Integer.parseInt(datoAstr);
        int datoBint = Integer.parseInt(datoBstr);

        //Trabajar con los datos ya convertidos
        int suma = datoAint + datoBint;
        int resta = datoAint - datoBint;
        int multiplicacion = datoAint * datoBint;

        //Imprimir los datos ya trabajados
        System.out.println("Ambos datos: A-" + datoAstr + " y B-" + datoBstr + " Se sumaran, restaran, y multiplicaran:\n");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + (datoAint * datoBint)); //Variamos la forma para recordar que hay mas, aunque puede usarse la anterior sin problemas

        //Convertirmos los resultados en un unico string, que llamaremos contrasenia
        String contrasenia = "" + suma + resta + multiplicacion;

        boolean confirmacion = false;

        System.out.println("Ingresa la contrasenia, se creo con los resultados de las operaciones previas en orden de aparicion.");

        while(!confirmacion){
            String contrasenia_ingresada = sc.nextLine();
            if (contrasenia_ingresada.equals(contrasenia)){
                System.out.println("Contrasenia correcta");
                confirmacion = true;
            }else{
                System.out.println("Contrasenia incorrecta. Intentalo denuevo");
            }
        }
    }
}
