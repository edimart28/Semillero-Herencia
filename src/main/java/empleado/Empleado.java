package empleado;

import persona.Persona;

public class Empleado extends Persona {



    private String id;

    public Empleado(String nombre, String apellido, String documento, String id) {
        super(nombre, apellido, documento);
        this.id = id;
    }



    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Rol: Empleado");
        System.out.println("id: "+id);

    }

}



