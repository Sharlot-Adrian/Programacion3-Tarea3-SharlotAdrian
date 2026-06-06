import java.util.Scanner;

public class RegistroUsuarios {

    Scanner scanner = new Scanner(System.in);
    
    public void validarUsuario (String nombre, int edad, String correo, double salario) throws NombreInvalidoException, EdadInvalidadException, SalarioInvalidoException, CorreoInvalidoException{

        if (nombre.isEmpty() || nombre.length() < 3)
            throw new NombreInvalidoException("El nombre debe contener al menos 3 caracteres.");
        if (edad < 18 || edad > 100)
            throw new EdadInvalidadException("La edad debe ser mayor o igual a 18 años.");
        if (!correo.contains("@") && !correo.contains("."))
            throw new CorreoInvalidoException("El correo electrónico no es válido");
        if (salario <= 0)
            throw new SalarioInvalidoException("El salario debe ser mayor que 0");
    }

    public void menuInteractivo(){

        do{

        }while();

    }
}
