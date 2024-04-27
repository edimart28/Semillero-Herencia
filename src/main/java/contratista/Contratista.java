package contratista;

import persona.Persona;

public class Contratista extends Persona {
    private boolean tieneFirmaAutorizada;

    public Contratista(String nombre, String apellido, String documento, boolean tieneFirmaAutorizada) {
        super(nombre, apellido, documento);
        this.tieneFirmaAutorizada = tieneFirmaAutorizada;
    }


    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Rol: Contratista");
        System.out.println("Tiene Firma Autorizada: "+(tieneFirmaAutorizada ? "SI": "NO"));

    }
}
