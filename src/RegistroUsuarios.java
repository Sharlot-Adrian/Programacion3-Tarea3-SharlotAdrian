import java.util.InputMismatchException;
import java.util.Scanner;

public class RegistroUsuarios {

    Scanner scanner = new Scanner(System.in);

    public void validarUsuario(String nombre, int edad, String correo, double salario)
            throws NombreInvalidoException, EdadInvalidadException, SalarioInvalidoException, CorreoInvalidoException {

        if (nombre.isEmpty() || nombre.length() < 3)
            throw new NombreInvalidoException("El nombre debe contener al menos 3 caracteres.");
        if (edad < 18)
            throw new EdadInvalidadException("La edad debe ser mayor o igual a 18 años.");
        if (edad > 100)
            throw new EdadInvalidadException("La edad debe ser menor a 100 años.");
        if (!correo.contains("@") || !correo.contains("."))
            throw new CorreoInvalidoException("El correo electrónico no es válido. ");
        if (salario <= 0)
            throw new SalarioInvalidoException("El salario debe ser mayor que 0. ");
    }

    public void menuInteractivo(){
        int opcion = 0;

        do{
            System.out.println("=========================");
            System.out.println("   REGISTRO DE USUARIOS  ");
            System.out.println("=========================");
            System.out.println("1. Registrar usuario     ");    
            System.out.println("2. Salir                 ");
            System.out.println("\nDigite el numero de la opcion que desea seleccionar: ");
            
            try{
                opcion = scanner.nextInt();
                scanner.nextLine();
            }catch(InputMismatchException e){
                System.out.println("Error: Debe ingresar un número válido.");
                scanner.nextLine();
            }

            switch(opcion){
                case 1:
                    {
                        System.out.println("\n[REGISTRAR USUARIO] ");
                        System.out.println("Ingrese un nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.println("Ingrese la edad: ");
                        int edad = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Ingrese el correo electronico: ");
                        String correo = scanner.nextLine();

                        System.out.println("Ingrese el salario: ");
                        double salario = scanner.nextDouble();
                        scanner.nextLine();

                        try{
                            validarUsuario(nombre, edad, correo, salario);
                        } 
                        catch(NombreInvalidoException e){
                            System.out.println(e.getMessage());
                        }
                        catch(EdadInvalidadException e){
                            System.out.println(e.getMessage());
                        }
                        catch(CorreoInvalidoException e){
                            System.out.println(e.getMessage());
                        }
                        catch(SalarioInvalidoException e){
                            System.out.println(e.getMessage());
                        }
                        finally{
                            System.out.println("Proceso finalizado.");
                        }

                        break;
                    }
                case 2:{
                    System.out.println("Saliendo...");
                    break;
                }
                default:{
                    System.out.println("Esa opcion no es valida.");
                    break;
                }

            }

        }while(opcion !=2);

    }
}
