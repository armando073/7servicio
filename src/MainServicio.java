public class MainServicio {
    static void main() {
        Servicio block1 = new Servicio();
        Servicio block2 = new Servicio();
        block1.setNombre("hernesto");
        block1.setPuerto(-8);
        block2.setPuerto(15);
        block2.setNombre("Armando");
        block1.registrarPeticiones(-5);
        block2.registrarPeticiones(3);
        block1.iniciar();
        block2.detener();
        System.out.println(" El nombre es: "+ block1.getNombre()+ " La cantidad de tu puerto es: " + block1.getPuerto()+ " El registro de peticiones es: "+ block1.getCantidadPeticiones());
        System.out.println("El servicio esta disponible ?"+ block1.isActivo());
        System.out.println("El servicio esta disponible ?"+ block2.isActivo());

    }
}
