package ejecucion;

import banco.Banco;
import cliente.ClienteA;
//import clienteB.ClienteB;
import menu.Menu;
import persona.Persona;

import javax.swing.*;


public class Ejecucion {

    public static void main(String[] args) {


        //Ejecucion menu
        /*Menu menu = new Menu();
        menu.gestionarCliente();*/



         //Ejecucion cliente
        Persona cliente1 = new ClienteA("Maria", "Perdomo", "Pasaporte", "414141");

        System.out.println("============");
        System.out.println("Cliente: ");
        cliente1.mostrarInfo();
        System.out.println("============");


        //Ejecucion banco
       /*System.out.println("========================================");
        System.out.println("******Cliente registrado con exito******");
        Banco.registrarClientes("Ramiro", "Guzman", "Cedula extranjeria", "121212");
        System.out.println(Banco.mostrarCliente());
        System.out.println("========================================");*/


    }


    }






