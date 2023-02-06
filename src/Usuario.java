public class Usuario extends TipoUsuario{
    private String nombre;
    private String apellido;
    private int cedula;
    private String correoElectronico;
    private String tipoUsuario;




    public Usuario(String nombre, String apellido, int cedula, String correoElectronico, String tipoUsuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correoElectronico = correoElectronico;
        this.tipoUsuario=tipoUsuario;

    }


    public void imprimirDatos(){
        System.out.println("Nombre: " + this.nombre+" Apellido: "+this.apellido+" Cédula: "+this.cedula+" Correo: "+this.correoElectronico);
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getCedula() {
        return this.cedula;
    }

    public String getCorreoElectronico() {
        return this.correoElectronico;
    }


    public String getTipo(){
        String tipoUsuario1=tipoUsuario;
        if  (tipoUsuario == "EPS"){
            System.out.println("El valor a pagar es de: 30000.");
        } else if (tipoUsuario=="Poliza") {
            System.out.println("El valor a pagar es de: 40000.");

        } else if (tipoUsuario=="Particular"){
            System.out.println("El valor a pagar es de: 70000.");
        }
        else {
            System.out.println("No tiene asociación.");
        }
        return tipoUsuario1;

    }
}
