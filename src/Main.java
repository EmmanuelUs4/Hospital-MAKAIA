public class Main {
    public static void main(String[] args) {
        Usuario usuario1= new Usuario("Edgar","Ramírez", 1234567889, "edgarr@gmail.com", "Poliza");
        usuario1.imprimirDatos();

        Citas cita1=new Citas("Edgar","Ramírez", 1234567889, "edgarr@gmail.com", "Poliza","Medicina  General", "24/12/2023");
        cita1.imprimirCita();
        usuario1.getTipo();

    }
}

