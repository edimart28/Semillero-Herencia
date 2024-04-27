package banco;

import cliente.ClienteA;
import persona.Persona;
import java.util.ArrayList;


public class Banco extends ClienteA {




     public Banco(String nombre, String apellido, String tipoId, String id) {
        super(nombre, apellido, tipoId, id);

    }

    private static ArrayList<Persona> listaClientes = new ArrayList<>();

    public static void registrarClientes(String nombre, String apellido, String tipoId, String id) {
        listaClientes.add(new Persona(nombre, apellido, tipoId, id));
    }

    public static String mostrarCliente() {
        String clientesRegistrados = "";

        for (Persona persona : listaClientes) {
            clientesRegistrados = clientesRegistrados + " " + persona.getNombre() + " " + persona.getApellido() + " " + persona.getTipoId() + " " + persona.getId() + "\n";

        }
        return clientesRegistrados;


    }


    }









































    /*public static Persona buscarId (String numId) {
        Persona cliente = null;
        int i = 0;
        while (i < listaClientes.size() && !listaClientes.get(i).getId().equals(numId)) {
            i++;
        }
        if ((i < listaClientes.size())) {
            cliente = listaClientes.get(i);
            System.out.println("Cliente ya registrado: " + listaClientes.get(i).getNombre() + " " + listaClientes.get(i).getApellido());
        } else {
            System.out.println("Cliente inexistente ");
        }
        return cliente;*/













