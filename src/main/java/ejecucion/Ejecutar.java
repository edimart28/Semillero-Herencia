package ejecucion;

import contratista.Contratista;
import empleado.Empleado;
import persona.Persona;

public class Ejecutar {

    public static void main(String[] args) {


        Persona supervisor= new Empleado("Edinson", "Martinez", "CC", "123456");
        Persona Auxiliar= new Contratista("Pedro", "Romero", "NIT", true);


        System.out.println("+++++++++++");
        System.out.println("Persona 1: ");
        System.out.println("+++++++++++");
        supervisor.mostrarInfo();
        System.out.println("***********");
        System.out.println("Persona 2: ");
        System.out.println("***********");
        Auxiliar.mostrarInfo();





    }

}
