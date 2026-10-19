public class Servicio {
    private String nombre;
    private int puerto;
    private boolean activo;
    private int cantidadPeticiones;

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            System.out.println("La entrada no puede estar vacía.");

        }else {
            this.nombre = nombre;
        }
    }
    public void setPuerto(int puerto) {
        if (puerto > 0)
            this.puerto =  puerto;
    }
    public void iniciar(){
        activo = true;
    }
    public void detener(){
        activo = false;
    }
    public void registrarPeticiones(int cantidad){
        if (cantidad >= 0)
          cantidadPeticiones += cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadPeticiones() {
        return cantidadPeticiones;
    }

    public boolean isActivo() {
        return activo;
    }

    public int getPuerto() {
        return puerto;
    }
}
