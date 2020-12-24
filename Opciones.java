import java.util.InputMismatchException;
import java.util.Scanner;

public class Opciones {
    Scanner teclado = new Scanner(System.in);

    public void eleccion() {

        int opcion;

        while (true) {
            try {
                System.out.println("1. hacer algo");
                System.out.println("2. hacer otra cosa");
                opcion = teclado.nextInt();
                switch (opcion) {

                    case 1:
                        System.out.println("se hizo algo");
                        break;
                    case 2:
                        System.out.println("se hizo otra cosa");
                        break;
                    default:
                        System.out.println("chao jefe");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un número válido");
                continue;
            }


        }
    }
}


