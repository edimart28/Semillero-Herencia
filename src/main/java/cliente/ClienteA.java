package cliente;

import persona.Persona;

import java.awt.*;
import java.util.ArrayList;

public class ClienteA extends Persona {

    int numeroProducto;


     public ClienteA(String nombre, String apellido, String tipoId, String id) {
        super(nombre, apellido, tipoId, id);
        this.numeroProducto= (int) (Math.random()*999999)+1;




    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("TipoDeCliente: Preferente");
        System.out.println("Es cliente: SI");
        System.out.println("numero de producto: "+ numeroProducto);
    }

}

