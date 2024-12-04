import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        RegistroDeInvitados lista = new RegistroDeInvitados();

        int option;

        do {
            System.out.println("""
                    *********MENU*********
                    1) Agregar invitados ingresando su nombre.
                    2) Eliminar invitados ingresando su nombre.
                    3) Mostrar la lista actual de invitados.
                    4) Salir
                    """);
            option = Integer.parseInt(scan.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Ingrese el nombre del invitadoa agregar: ");
                    String nombreInvitado = scan.nextLine();
                    lista.agregarInvitado(nombreInvitado);
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del invitado a eliminar: ");
                    String invitadoEliminado = scan.nextLine();
                    lista.eliminarInvitado(invitadoEliminado);
                    break;

                case 3:
                    lista.mostrarInvitados();    
                break;

                case 4:
                    System.out.println("Estas saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (option != 4);
    }

}
