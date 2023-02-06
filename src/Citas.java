public class Citas extends Usuario{
    private double valorBaseAPagar;
    private String especialidad;

    private String fecha;

    public Citas(String nombre, String apellido, int cedula, String correoElectronico, String tipoUsuario, String especialidad, String fecha) {
        super(nombre, apellido, cedula, correoElectronico, tipoUsuario);
        this.especialidad = especialidad;
        this.fecha= fecha;
    }

    public String imprimirCita(){
        String espiecialidad1=especialidad;
        if (especialidad=="Medicina General"){
        System.out.println("Usuario: "+this.getNombre()+" "+this.getApellido()+" Especialidad: Medicina General. La cita ha sido agendada  para: "+fecha ) ;
        }
        else if(especialidad=="Medicina Interna"){
            System.out.println("Usuario: "+this.getNombre()+" "+this.getApellido()+" Especialidad: Medicina Interna. La cita ha sido agendada  para: "+fecha) ;
        }else if (especialidad=="Medicina del Deporte"){
            System.out.println("Usuario: "+this.getNombre()+" "+this.getApellido()+" Especialidad: Medicina del Deporte. La cita ha sido agendada  para: "+fecha ) ;
        } else {
            System.out.println("No especifica. No se puede agendar cita sin este campo.");
        }
        return espiecialidad1;
    }


    public String getNombre() {
        return super.getNombre();
    }


    public String getApellido() {
        return super.getApellido();
    }

    @Override
    public int getCedula() {
        return super.getCedula();
    }

    @Override
    public String getCorreoElectronico() {
        return super.getCorreoElectronico();
    }



}
