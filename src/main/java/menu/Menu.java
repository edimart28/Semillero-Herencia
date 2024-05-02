package menu;

import banco.Banco;
import persona.Persona;

import javax.swing.*;
import java.util.Scanner;

import static banco.Banco.mostrarCliente;
import static banco.Banco.registrarClientes;

public class Menu {

    public static void gestionarCliente() {
    }

    Scanner scanner = new Scanner(System.in);

    {


        System.out.println("Seleccione 1 para creacion: ");
        int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("CREACION");
                    System.out.println("Digite nombre:");
                    String nombre = String.valueOf(scanner.nextLine());
                    System.out.println("Digite apellido:");
                    String apellido = String.valueOf(scanner.nextLine());
                    System.out.println("Digite tipo id:");
                    String tipoId = String.valueOf(scanner.nextLine());
                    System.out.println("Digite id:");
                    String id = String.valueOf(scanner.nextLine());

                    Banco banco = new Banco(nombre, apellido, tipoId, id);
                    System.out.println("Se creo exitosamente");
                    System.out.println("nombre: " + banco.getNombre());
                    System.out.println("apellido: " + banco.getApellido());
                    System.out.println("tipoId: " + banco.getTipoId());
                    System.out.println("id: " + banco.getId());
                    break;




            }

        }

    }















// while (opcion != 0) {



//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Opcion para consultar clientes por medio de scanner digitando las CC de cada case, se visualiza el nombre de cada cliente que esta en el respectivo case


/*public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("**** Consultar cliente por id ********");
        System.out.println("======================================");

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite numero de id: ");
        int cliente = Integer.parseInt(scanner.nextLine());
        int opcion = cliente;

        switch (opcion){
            case 414141:
                System.out.println("Cliente: Maria Perdomo\nEstado: Activo");
                break;
            case 474747:
                System.out.println("Cliente: Jose Sanchez\nEstado: Embargado");
                break;
            case 121212:
                System.out.println("Cliente: Ramiro Guzman\nEstado: Inactivo");
                break;
            default:
                System.out.println("Numero de id no es cliente");

        }
    }
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Opcion para crear cliente llamando desde clase persona

/*Persona persona = new Persona(nombre, apellido, tipoId, id);
                    System.out.println("Se creo exitosamente la persona");
                    System.out.println("nombre: " + persona.getNombre());
                    System.out.println("apellido: " + persona.getApellido());
                    System.out.println("tipoId: " + persona.getTipoId());
                    System.out.println("id: " + persona.getId());*/



//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Opcion para llamar el metodo mostrar cliente que se encuentra en clase Banco


 /* Banco.mostrarCliente();
        System.out.println(mostrarCliente());*/

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


//Opcion para imprimir las opciones y con el scanner nos permite seleccionar una de las 4 opciones que hay en cada case

/*System.out.println("=====================================");
        System.out.println("********** ¿Que desea hacer? ********");
        System.out.println("Opcion 1: crear cliente");
        System.out.println("Opcion 2: actualizar cliente");
        System.out.println("Opcion 3: consultar cliente por id");
        System.out.println("Opcion 4: consultar lista de clientes");
        System.out.println("=====================================");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccionar opcion: ");
        int opcion = Integer.parseInt(scanner.nextLine());
        //while (opcion !=0){
        switch (opcion) {
            case 1:
                System.out.println("Crear cliente");
                break;
            case 2:
                System.out.println("consultar cliente por id");
                break;
            case 3:
                System.out.println("consultar cliente por id");
                break;
            case 4:
                System.out.println("consultar lista de clientes");
                break;
            default:
                System.out.println("Ingrese una opcion valida");*/



//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------