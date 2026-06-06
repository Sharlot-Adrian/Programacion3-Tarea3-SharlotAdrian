public class Usuario {
    
    private String nombre;
    private int edad;
    private String correoElectonico;
    private double salario;
    
    public Usuario(String nombre, int edad, String correoElectronico, double salario){
        setNombre(nombre);
        setEdad(edad);
        setCorreoElectonico(correoElectronico);
        setSalario(salario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreoElectonico() {
        return correoElectonico;
    }

    public void setCorreoElectonico(String correoElectonico) {
        this.correoElectonico = correoElectonico;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}
