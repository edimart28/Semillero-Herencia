package persona;

public class Persona {

    private String nombre;
    private String apellido;
    private String tipoId;
    private String id;

    public Persona(String nombre, String apellido, String tipoId, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoId = tipoId;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;


    }

    public  void mostrarInfo(){

        System.out.println("nombre = "+ nombre);
        System.out.println("apellido = "+apellido);
        System.out.println("tipoId = "+tipoId);
        System.out.println("id = "+id);
    }
}
